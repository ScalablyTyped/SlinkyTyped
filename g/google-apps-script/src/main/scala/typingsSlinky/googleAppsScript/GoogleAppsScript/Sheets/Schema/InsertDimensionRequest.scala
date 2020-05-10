package typingsSlinky.googleAppsScript.GoogleAppsScript.Sheets.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InsertDimensionRequest extends js.Object {
  var inheritFromBefore: js.UndefOr[Boolean] = js.native
  var range: js.UndefOr[DimensionRange] = js.native
}

object InsertDimensionRequest {
  @scala.inline
  def apply(): InsertDimensionRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InsertDimensionRequest]
  }
  @scala.inline
  implicit class InsertDimensionRequestOps[Self <: InsertDimensionRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInheritFromBefore(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inheritFromBefore")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInheritFromBefore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inheritFromBefore")(js.undefined)
        ret
    }
    @scala.inline
    def withRange(value: DimensionRange): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("range")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("range")(js.undefined)
        ret
    }
  }
  
}

