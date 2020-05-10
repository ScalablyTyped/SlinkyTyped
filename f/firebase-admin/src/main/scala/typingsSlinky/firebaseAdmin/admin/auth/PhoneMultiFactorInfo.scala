package typingsSlinky.firebaseAdmin.admin.auth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface representing a phone specific user enrolled second factor.
  */
@js.native
trait PhoneMultiFactorInfo extends MultiFactorInfo {
  /**
    * The phone number associated with a phone second factor.
    */
  var phoneNumber: String = js.native
}

object PhoneMultiFactorInfo {
  @scala.inline
  def apply(factorId: String, phoneNumber: String, toJSON: () => js.Object, uid: String): PhoneMultiFactorInfo = {
    val __obj = js.Dynamic.literal(factorId = factorId.asInstanceOf[js.Any], phoneNumber = phoneNumber.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), uid = uid.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhoneMultiFactorInfo]
  }
  @scala.inline
  implicit class PhoneMultiFactorInfoOps[Self <: PhoneMultiFactorInfo] (val x: Self) extends AnyVal {
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
  }
  
}

