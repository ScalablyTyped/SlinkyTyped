package typingsSlinky.googleapis.webmastersV3Mod.webmastersV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaApiDimensionFilterGroup extends js.Object {
  var filters: js.UndefOr[js.Array[SchemaApiDimensionFilter]] = js.native
  var groupType: js.UndefOr[String] = js.native
}

object SchemaApiDimensionFilterGroup {
  @scala.inline
  def apply(): SchemaApiDimensionFilterGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaApiDimensionFilterGroup]
  }
  @scala.inline
  implicit class SchemaApiDimensionFilterGroupOps[Self <: SchemaApiDimensionFilterGroup] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFilters(value: js.Array[SchemaApiDimensionFilter]): Self = {
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

