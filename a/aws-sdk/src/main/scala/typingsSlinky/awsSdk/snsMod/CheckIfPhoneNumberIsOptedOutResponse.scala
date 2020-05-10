package typingsSlinky.awsSdk.snsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CheckIfPhoneNumberIsOptedOutResponse extends js.Object {
  /**
    * Indicates whether the phone number is opted out:    true – The phone number is opted out, meaning you cannot publish SMS messages to it.    false – The phone number is opted in, meaning you can publish SMS messages to it.  
    */
  var isOptedOut: js.UndefOr[Boolean] = js.native
}

object CheckIfPhoneNumberIsOptedOutResponse {
  @scala.inline
  def apply(): CheckIfPhoneNumberIsOptedOutResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CheckIfPhoneNumberIsOptedOutResponse]
  }
  @scala.inline
  implicit class CheckIfPhoneNumberIsOptedOutResponseOps[Self <: CheckIfPhoneNumberIsOptedOutResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsOptedOut(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isOptedOut")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsOptedOut: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isOptedOut")(js.undefined)
        ret
    }
  }
  
}

