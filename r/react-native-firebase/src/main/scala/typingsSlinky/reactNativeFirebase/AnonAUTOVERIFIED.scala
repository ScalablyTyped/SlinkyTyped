package typingsSlinky.reactNativeFirebase

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAUTOVERIFIED extends js.Object {
  var AUTO_VERIFIED: String = js.native
  var AUTO_VERIFY_TIMEOUT: String = js.native
  var CODE_SENT: String = js.native
  var ERROR: String = js.native
}

object AnonAUTOVERIFIED {
  @scala.inline
  def apply(AUTO_VERIFIED: String, AUTO_VERIFY_TIMEOUT: String, CODE_SENT: String, ERROR: String): AnonAUTOVERIFIED = {
    val __obj = js.Dynamic.literal(AUTO_VERIFIED = AUTO_VERIFIED.asInstanceOf[js.Any], AUTO_VERIFY_TIMEOUT = AUTO_VERIFY_TIMEOUT.asInstanceOf[js.Any], CODE_SENT = CODE_SENT.asInstanceOf[js.Any], ERROR = ERROR.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAUTOVERIFIED]
  }
  @scala.inline
  implicit class AnonAUTOVERIFIEDOps[Self <: AnonAUTOVERIFIED] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAUTO_VERIFIED(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AUTO_VERIFIED")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAUTO_VERIFY_TIMEOUT(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AUTO_VERIFY_TIMEOUT")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCODE_SENT(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CODE_SENT")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withERROR(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ERROR")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

