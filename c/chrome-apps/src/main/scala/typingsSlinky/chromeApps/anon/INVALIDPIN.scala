package typingsSlinky.chromeApps.anon

import typingsSlinky.chromeApps.chromeAppsStrings.INVALID_PIN
import typingsSlinky.chromeApps.chromeAppsStrings.INVALID_PUK
import typingsSlinky.chromeApps.chromeAppsStrings.MAX_ATTEMPTS_EXCEEDED
import typingsSlinky.chromeApps.chromeAppsStrings.UNKNOWN_ERROR
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait INVALIDPIN extends js.Object {
  var INVALID_PIN: typingsSlinky.chromeApps.chromeAppsStrings.INVALID_PIN = js.native
  var INVALID_PUK: typingsSlinky.chromeApps.chromeAppsStrings.INVALID_PUK = js.native
  var MAX_ATTEMPTS_EXCEEDED: typingsSlinky.chromeApps.chromeAppsStrings.MAX_ATTEMPTS_EXCEEDED = js.native
  var UNKNOWN_ERROR: typingsSlinky.chromeApps.chromeAppsStrings.UNKNOWN_ERROR = js.native
}

object INVALIDPIN {
  @scala.inline
  def apply(
    INVALID_PIN: INVALID_PIN,
    INVALID_PUK: INVALID_PUK,
    MAX_ATTEMPTS_EXCEEDED: MAX_ATTEMPTS_EXCEEDED,
    UNKNOWN_ERROR: UNKNOWN_ERROR
  ): INVALIDPIN = {
    val __obj = js.Dynamic.literal(INVALID_PIN = INVALID_PIN.asInstanceOf[js.Any], INVALID_PUK = INVALID_PUK.asInstanceOf[js.Any], MAX_ATTEMPTS_EXCEEDED = MAX_ATTEMPTS_EXCEEDED.asInstanceOf[js.Any], UNKNOWN_ERROR = UNKNOWN_ERROR.asInstanceOf[js.Any])
    __obj.asInstanceOf[INVALIDPIN]
  }
  @scala.inline
  implicit class INVALIDPINOps[Self <: INVALIDPIN] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withINVALID_PIN(value: INVALID_PIN): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("INVALID_PIN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withINVALID_PUK(value: INVALID_PUK): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("INVALID_PUK")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMAX_ATTEMPTS_EXCEEDED(value: MAX_ATTEMPTS_EXCEEDED): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MAX_ATTEMPTS_EXCEEDED")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUNKNOWN_ERROR(value: UNKNOWN_ERROR): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UNKNOWN_ERROR")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

