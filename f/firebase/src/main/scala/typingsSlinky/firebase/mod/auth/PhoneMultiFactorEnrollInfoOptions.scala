package typingsSlinky.firebase.mod.auth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The phone info options for multi-factor enrollment. Phone number and
  * multi-factor session are required.
  */
@js.native
trait PhoneMultiFactorEnrollInfoOptions extends PhoneInfoOptions {
  var phoneNumber: String = js.native
  var session: MultiFactorSession = js.native
}

object PhoneMultiFactorEnrollInfoOptions {
  @scala.inline
  def apply(phoneNumber: String, session: MultiFactorSession): PhoneMultiFactorEnrollInfoOptions = {
    val __obj = js.Dynamic.literal(phoneNumber = phoneNumber.asInstanceOf[js.Any], session = session.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhoneMultiFactorEnrollInfoOptions]
  }
  @scala.inline
  implicit class PhoneMultiFactorEnrollInfoOptionsOps[Self <: PhoneMultiFactorEnrollInfoOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPhoneNumber(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("phoneNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSession(value: MultiFactorSession): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("session")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

