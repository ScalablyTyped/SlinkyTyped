package typingsSlinky.gapiClientDlp.gapi.client.dlp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GooglePrivacyDlpV2beta1CharacterMaskConfig extends js.Object {
  /**
    * When masking a string, items in this list will be skipped when replacing.
    * For example, if your string is 555-555-5555 and you ask us to skip `-` and
    * mask 5 chars with &#42; we would produce &#42;&#42;&#42;-&#42;55-5555.
    */
  var charactersToIgnore: js.UndefOr[js.Array[GooglePrivacyDlpV2beta1CharsToIgnore]] = js.native
  /**
    * Character to mask the sensitive values&mdash;for example, "&#42;" for an
    * alphabetic string such as name, or "0" for a numeric string such as ZIP
    * code or credit card number. String must have length 1. If not supplied, we
    * will default to "&#42;" for strings, 0 for digits.
    */
  var maskingCharacter: js.UndefOr[String] = js.native
  /**
    * Number of characters to mask. If not set, all matching chars will be
    * masked. Skipped characters do not count towards this tally.
    */
  var numberToMask: js.UndefOr[Double] = js.native
  /**
    * Mask characters in reverse order. For example, if `masking_character` is
    * '0', number_to_mask is 14, and `reverse_order` is false, then
    * 1234-5678-9012-3456 -> 00000000000000-3456
    * If `masking_character` is '&#42;', `number_to_mask` is 3, and `reverse_order`
    * is true, then 12345 -> 12&#42;&#42;&#42;
    */
  var reverseOrder: js.UndefOr[Boolean] = js.native
}

object GooglePrivacyDlpV2beta1CharacterMaskConfig {
  @scala.inline
  def apply(): GooglePrivacyDlpV2beta1CharacterMaskConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2beta1CharacterMaskConfig]
  }
  @scala.inline
  implicit class GooglePrivacyDlpV2beta1CharacterMaskConfigOps[Self <: GooglePrivacyDlpV2beta1CharacterMaskConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCharactersToIgnore(value: js.Array[GooglePrivacyDlpV2beta1CharsToIgnore]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("charactersToIgnore")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCharactersToIgnore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("charactersToIgnore")(js.undefined)
        ret
    }
    @scala.inline
    def withMaskingCharacter(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maskingCharacter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaskingCharacter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maskingCharacter")(js.undefined)
        ret
    }
    @scala.inline
    def withNumberToMask(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberToMask")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumberToMask: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberToMask")(js.undefined)
        ret
    }
    @scala.inline
    def withReverseOrder(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reverseOrder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReverseOrder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reverseOrder")(js.undefined)
        ret
    }
  }
  
}

