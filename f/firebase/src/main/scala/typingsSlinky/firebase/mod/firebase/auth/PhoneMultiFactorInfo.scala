package typingsSlinky.firebase.mod.firebase.auth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The subclass of the MultiFactorInfo interface for phone number second factors.
  * The factorId of this second factor is
  * {@link firebase.auth.PhoneMultiFactorGenerator.FACTOR_ID}.
  */
@js.native
trait PhoneMultiFactorInfo extends MultiFactorInfo {
  
  /**
    * The phone number associated with the current second factor.
    */
  var phoneNumber: String = js.native
}
object PhoneMultiFactorInfo {
  
  @scala.inline
  def apply(enrollmentTime: String, factorId: String, phoneNumber: String, uid: String): PhoneMultiFactorInfo = {
    val __obj = js.Dynamic.literal(enrollmentTime = enrollmentTime.asInstanceOf[js.Any], factorId = factorId.asInstanceOf[js.Any], phoneNumber = phoneNumber.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhoneMultiFactorInfo]
  }
  
  @scala.inline
  implicit class PhoneMultiFactorInfoOps[Self <: PhoneMultiFactorInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setPhoneNumber(value: String): Self = this.set("phoneNumber", value.asInstanceOf[js.Any])
  }
}
