package typingsSlinky.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RestorePhoneNumberRequest extends js.Object {
  /**
    * The phone number.
    */
  var PhoneNumberId: NonEmptyString = js.native
}

object RestorePhoneNumberRequest {
  @scala.inline
  def apply(PhoneNumberId: NonEmptyString): RestorePhoneNumberRequest = {
    val __obj = js.Dynamic.literal(PhoneNumberId = PhoneNumberId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RestorePhoneNumberRequest]
  }
  @scala.inline
  implicit class RestorePhoneNumberRequestOps[Self <: RestorePhoneNumberRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPhoneNumberId(value: NonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PhoneNumberId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

