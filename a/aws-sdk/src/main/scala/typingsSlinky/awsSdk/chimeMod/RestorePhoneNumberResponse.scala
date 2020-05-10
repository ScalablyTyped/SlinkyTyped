package typingsSlinky.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RestorePhoneNumberResponse extends js.Object {
  /**
    * The phone number details.
    */
  var PhoneNumber: js.UndefOr[typingsSlinky.awsSdk.chimeMod.PhoneNumber] = js.native
}

object RestorePhoneNumberResponse {
  @scala.inline
  def apply(): RestorePhoneNumberResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RestorePhoneNumberResponse]
  }
  @scala.inline
  implicit class RestorePhoneNumberResponseOps[Self <: RestorePhoneNumberResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPhoneNumber(value: PhoneNumber): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PhoneNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPhoneNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PhoneNumber")(js.undefined)
        ret
    }
  }
  
}

