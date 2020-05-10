package typingsSlinky.googleAppsScript.GoogleAppsScript.Sheets.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddDimensionGroupResponse extends js.Object {
  var dimensionGroups: js.UndefOr[js.Array[DimensionGroup]] = js.native
}

object AddDimensionGroupResponse {
  @scala.inline
  def apply(): AddDimensionGroupResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddDimensionGroupResponse]
  }
  @scala.inline
  implicit class AddDimensionGroupResponseOps[Self <: AddDimensionGroupResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDimensionGroups(value: js.Array[DimensionGroup]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dimensionGroups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDimensionGroups: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dimensionGroups")(js.undefined)
        ret
    }
  }
  
}

