package typingsSlinky.googleDriveRealtimeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonSHIFTAFTERDELETE extends js.Object {
  var SHIFT_AFTER_DELETE: String = js.native
  var SHIFT_BEFORE_DELETE: String = js.native
  var SHIFT_TO_INVALID: String = js.native
}

object AnonSHIFTAFTERDELETE {
  @scala.inline
  def apply(SHIFT_AFTER_DELETE: String, SHIFT_BEFORE_DELETE: String, SHIFT_TO_INVALID: String): AnonSHIFTAFTERDELETE = {
    val __obj = js.Dynamic.literal(SHIFT_AFTER_DELETE = SHIFT_AFTER_DELETE.asInstanceOf[js.Any], SHIFT_BEFORE_DELETE = SHIFT_BEFORE_DELETE.asInstanceOf[js.Any], SHIFT_TO_INVALID = SHIFT_TO_INVALID.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSHIFTAFTERDELETE]
  }
  @scala.inline
  implicit class AnonSHIFTAFTERDELETEOps[Self <: AnonSHIFTAFTERDELETE] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSHIFT_AFTER_DELETE(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SHIFT_AFTER_DELETE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSHIFT_BEFORE_DELETE(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SHIFT_BEFORE_DELETE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSHIFT_TO_INVALID(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SHIFT_TO_INVALID")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

