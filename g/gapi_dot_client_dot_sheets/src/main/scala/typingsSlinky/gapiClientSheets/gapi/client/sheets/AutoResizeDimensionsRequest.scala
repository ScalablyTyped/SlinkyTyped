package typingsSlinky.gapiClientSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AutoResizeDimensionsRequest extends js.Object {
  /** The dimensions to automatically resize. */
  var dimensions: js.UndefOr[DimensionRange] = js.native
}

object AutoResizeDimensionsRequest {
  @scala.inline
  def apply(): AutoResizeDimensionsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoResizeDimensionsRequest]
  }
  @scala.inline
  implicit class AutoResizeDimensionsRequestOps[Self <: AutoResizeDimensionsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDimensions(value: DimensionRange): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dimensions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDimensions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dimensions")(js.undefined)
        ret
    }
  }
  
}

