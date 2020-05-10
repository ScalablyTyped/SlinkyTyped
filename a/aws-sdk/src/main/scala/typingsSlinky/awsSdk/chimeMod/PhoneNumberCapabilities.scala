package typingsSlinky.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PhoneNumberCapabilities extends js.Object {
  /**
    * Allows or denies inbound calling for the specified phone number.
    */
  var InboundCall: js.UndefOr[NullableBoolean] = js.native
  /**
    * Allows or denies inbound MMS messaging for the specified phone number.
    */
  var InboundMMS: js.UndefOr[NullableBoolean] = js.native
  /**
    * Allows or denies inbound SMS messaging for the specified phone number.
    */
  var InboundSMS: js.UndefOr[NullableBoolean] = js.native
  /**
    * Allows or denies outbound calling for the specified phone number.
    */
  var OutboundCall: js.UndefOr[NullableBoolean] = js.native
  /**
    * Allows or denies outbound MMS messaging for the specified phone number.
    */
  var OutboundMMS: js.UndefOr[NullableBoolean] = js.native
  /**
    * Allows or denies outbound SMS messaging for the specified phone number.
    */
  var OutboundSMS: js.UndefOr[NullableBoolean] = js.native
}

object PhoneNumberCapabilities {
  @scala.inline
  def apply(): PhoneNumberCapabilities = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PhoneNumberCapabilities]
  }
  @scala.inline
  implicit class PhoneNumberCapabilitiesOps[Self <: PhoneNumberCapabilities] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInboundCall(value: NullableBoolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InboundCall")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInboundCall: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InboundCall")(js.undefined)
        ret
    }
    @scala.inline
    def withInboundMMS(value: NullableBoolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InboundMMS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInboundMMS: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InboundMMS")(js.undefined)
        ret
    }
    @scala.inline
    def withInboundSMS(value: NullableBoolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InboundSMS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInboundSMS: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InboundSMS")(js.undefined)
        ret
    }
    @scala.inline
    def withOutboundCall(value: NullableBoolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OutboundCall")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutboundCall: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OutboundCall")(js.undefined)
        ret
    }
    @scala.inline
    def withOutboundMMS(value: NullableBoolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OutboundMMS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutboundMMS: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OutboundMMS")(js.undefined)
        ret
    }
    @scala.inline
    def withOutboundSMS(value: NullableBoolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OutboundSMS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutboundSMS: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OutboundSMS")(js.undefined)
        ret
    }
  }
  
}

