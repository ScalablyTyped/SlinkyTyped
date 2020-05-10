package typingsSlinky.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OrderedPhoneNumber extends js.Object {
  /**
    * The phone number, in E.164 format.
    */
  var E164PhoneNumber: js.UndefOr[typingsSlinky.awsSdk.chimeMod.E164PhoneNumber] = js.native
  /**
    * The phone number status.
    */
  var Status: js.UndefOr[OrderedPhoneNumberStatus] = js.native
}

object OrderedPhoneNumber {
  @scala.inline
  def apply(): OrderedPhoneNumber = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrderedPhoneNumber]
  }
  @scala.inline
  implicit class OrderedPhoneNumberOps[Self <: OrderedPhoneNumber] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withE164PhoneNumber(value: E164PhoneNumber): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("E164PhoneNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutE164PhoneNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("E164PhoneNumber")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: OrderedPhoneNumberStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(js.undefined)
        ret
    }
  }
  
}

