package typingsSlinky.googleAppsScript.GoogleAppsScript.Sheets.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateDimensionGroupRequest extends js.Object {
  var dimensionGroup: js.UndefOr[DimensionGroup] = js.native
  var fields: js.UndefOr[String] = js.native
}

object UpdateDimensionGroupRequest {
  @scala.inline
  def apply(): UpdateDimensionGroupRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateDimensionGroupRequest]
  }
  @scala.inline
  implicit class UpdateDimensionGroupRequestOps[Self <: UpdateDimensionGroupRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDimensionGroup(value: DimensionGroup): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dimensionGroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDimensionGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dimensionGroup")(js.undefined)
        ret
    }
    @scala.inline
    def withFields(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFields: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fields")(js.undefined)
        ret
    }
  }
  
}

