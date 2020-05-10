package typingsSlinky.gapiClientSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteDimensionGroupResponse extends js.Object {
  /** All groups of a dimension after deleting a group from that dimension. */
  var dimensionGroups: js.UndefOr[js.Array[DimensionGroup]] = js.native
}

object DeleteDimensionGroupResponse {
  @scala.inline
  def apply(): DeleteDimensionGroupResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteDimensionGroupResponse]
  }
  @scala.inline
  implicit class DeleteDimensionGroupResponseOps[Self <: DeleteDimensionGroupResponse] (val x: Self) extends AnyVal {
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

