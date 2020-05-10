package typingsSlinky.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PSTNDialIn extends js.Object {
  /**
    * The zip code.
    */
  var CountryCode: typingsSlinky.awsSdk.alexaforbusinessMod.CountryCode = js.native
  /**
    * The delay duration before Alexa enters the conference ID with dual-tone multi-frequency (DTMF). Each number on the dial pad corresponds to a DTMF tone, which is how we send data over the telephone network.
    */
  var OneClickIdDelay: typingsSlinky.awsSdk.alexaforbusinessMod.OneClickIdDelay = js.native
  /**
    * The delay duration before Alexa enters the conference pin with dual-tone multi-frequency (DTMF). Each number on the dial pad corresponds to a DTMF tone, which is how we send data over the telephone network.
    */
  var OneClickPinDelay: typingsSlinky.awsSdk.alexaforbusinessMod.OneClickPinDelay = js.native
  /**
    * The phone number to call to join the conference.
    */
  var PhoneNumber: OutboundPhoneNumber = js.native
}

object PSTNDialIn {
  @scala.inline
  def apply(
    CountryCode: CountryCode,
    OneClickIdDelay: OneClickIdDelay,
    OneClickPinDelay: OneClickPinDelay,
    PhoneNumber: OutboundPhoneNumber
  ): PSTNDialIn = {
    val __obj = js.Dynamic.literal(CountryCode = CountryCode.asInstanceOf[js.Any], OneClickIdDelay = OneClickIdDelay.asInstanceOf[js.Any], OneClickPinDelay = OneClickPinDelay.asInstanceOf[js.Any], PhoneNumber = PhoneNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[PSTNDialIn]
  }
  @scala.inline
  implicit class PSTNDialInOps[Self <: PSTNDialIn] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCountryCode(value: CountryCode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CountryCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOneClickIdDelay(value: OneClickIdDelay): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OneClickIdDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOneClickPinDelay(value: OneClickPinDelay): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OneClickPinDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPhoneNumber(value: OutboundPhoneNumber): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PhoneNumber")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

