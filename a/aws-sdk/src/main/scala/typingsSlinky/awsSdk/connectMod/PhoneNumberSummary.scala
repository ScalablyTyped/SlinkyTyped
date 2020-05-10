package typingsSlinky.awsSdk.connectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PhoneNumberSummary extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the phone number.
    */
  var Arn: js.UndefOr[ARN] = js.native
  /**
    * The identifier of the phone number.
    */
  var Id: js.UndefOr[PhoneNumberId] = js.native
  /**
    * The phone number.
    */
  var PhoneNumber: js.UndefOr[typingsSlinky.awsSdk.connectMod.PhoneNumber] = js.native
  /**
    * The ISO country code.
    */
  var PhoneNumberCountryCode: js.UndefOr[typingsSlinky.awsSdk.connectMod.PhoneNumberCountryCode] = js.native
  /**
    * The type of phone number.
    */
  var PhoneNumberType: js.UndefOr[typingsSlinky.awsSdk.connectMod.PhoneNumberType] = js.native
}

object PhoneNumberSummary {
  @scala.inline
  def apply(): PhoneNumberSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PhoneNumberSummary]
  }
  @scala.inline
  implicit class PhoneNumberSummaryOps[Self <: PhoneNumberSummary] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArn(value: ARN): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Arn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Arn")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: PhoneNumberId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Id")(js.undefined)
        ret
    }
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
    @scala.inline
    def withPhoneNumberCountryCode(value: PhoneNumberCountryCode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PhoneNumberCountryCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPhoneNumberCountryCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PhoneNumberCountryCode")(js.undefined)
        ret
    }
    @scala.inline
    def withPhoneNumberType(value: PhoneNumberType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PhoneNumberType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPhoneNumberType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PhoneNumberType")(js.undefined)
        ret
    }
  }
  
}

