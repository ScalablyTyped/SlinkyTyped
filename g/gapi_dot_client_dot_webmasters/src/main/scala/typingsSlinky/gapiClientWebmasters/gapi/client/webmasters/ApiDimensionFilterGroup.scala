package typingsSlinky.gapiClientWebmasters.gapi.client.webmasters

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApiDimensionFilterGroup extends js.Object {
  var filters: js.UndefOr[js.Array[ApiDimensionFilter]] = js.native
  var groupType: js.UndefOr[String] = js.native
}

object ApiDimensionFilterGroup {
  @scala.inline
  def apply(): ApiDimensionFilterGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApiDimensionFilterGroup]
  }
  @scala.inline
  implicit class ApiDimensionFilterGroupOps[Self <: ApiDimensionFilterGroup] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFilters(value: js.Array[ApiDimensionFilter]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filters")(js.undefined)
        ret
    }
    @scala.inline
    def withGroupType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupType")(js.undefined)
        ret
    }
  }
  
}

