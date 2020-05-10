package typingsSlinky.actionsOnGoogle.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleActionsOrdersV3PhoneNumber extends js.Object {
  /**
    * Phone number in E.164 format, as defined in International
    * Telecommunication Union (ITU) Recommendation E.164.
    * wiki link: https://en.wikipedia.org/wiki/E.164
    */
  var e164PhoneNumber: js.UndefOr[String] = js.native
  /**
    * Extension is not standardized in ITU recommendations, except for being
    * defined as a series of numbers with a maximum length of 40 digits. It is
    * defined as a string here to accommodate for the possible use of a leading
    * zero in the extension (organizations have complete freedom to do so, as
    * there is no standard defined). Other than digits, some other dialling
    * characters such as \",\" (indicating a wait) may be stored here.
    * For example, in xxx-xxx-xxxx ext. 123, \"123\" is the extension.
    */
  var extension: js.UndefOr[String] = js.native
  /**
    * The carrier selection code that is preferred when calling this phone number
    * domestically. This also includes codes that need to be dialed in some
    * countries when calling from landlines to mobiles or vice versa. For
    * example, in Columbia, a \"3\" needs to be dialed before the phone number
    * itself when calling from a mobile phone to a domestic landline phone and
    * vice versa. https://en.wikipedia.org/wiki/Telephone_numbers_in_Colombia
    * https://en.wikipedia.org/wiki/Brazilian_Carrier_Selection_Code
    *
    * Note this is the \"preferred\" code, which means other codes may work as
    * well.
    */
  var preferredDomesticCarrierCode: js.UndefOr[String] = js.native
}

object GoogleActionsOrdersV3PhoneNumber {
  @scala.inline
  def apply(): GoogleActionsOrdersV3PhoneNumber = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsOrdersV3PhoneNumber]
  }
  @scala.inline
  implicit class GoogleActionsOrdersV3PhoneNumberOps[Self <: GoogleActionsOrdersV3PhoneNumber] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withE164PhoneNumber(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("e164PhoneNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutE164PhoneNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("e164PhoneNumber")(js.undefined)
        ret
    }
    @scala.inline
    def withExtension(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extension")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtension: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extension")(js.undefined)
        ret
    }
    @scala.inline
    def withPreferredDomesticCarrierCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preferredDomesticCarrierCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreferredDomesticCarrierCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preferredDomesticCarrierCode")(js.undefined)
        ret
    }
  }
  
}

