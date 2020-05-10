package typingsSlinky.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchAvailablePhoneNumbersResponse extends js.Object {
  /**
    * List of phone numbers, in E.164 format.
    */
  var E164PhoneNumbers: js.UndefOr[E164PhoneNumberList] = js.native
}

object SearchAvailablePhoneNumbersResponse {
  @scala.inline
  def apply(): SearchAvailablePhoneNumbersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchAvailablePhoneNumbersResponse]
  }
  @scala.inline
  implicit class SearchAvailablePhoneNumbersResponseOps[Self <: SearchAvailablePhoneNumbersResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withE164PhoneNumbers(value: E164PhoneNumberList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("E164PhoneNumbers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutE164PhoneNumbers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("E164PhoneNumbers")(js.undefined)
        ret
    }
  }
  
}

