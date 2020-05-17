package typingsSlinky.chrome.chrome.privacy

import typingsSlinky.chrome.chrome.types.ChromeSetting
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Services extends js.Object {
  var alternateErrorPagesEnabled: ChromeSetting = js.native
  /** @since Chrome 70. */
  var autofillAddressEnabled: ChromeSetting = js.native
  /** @since Chrome 70. */
  var autofillCreditCardEnabled: ChromeSetting = js.native
  /** @deprecated since Chrome 70. Please use privacy.services.autofillAddressEnabled and privacy.services.autofillCreditCardEnabled. */
  var autofillEnabled: ChromeSetting = js.native
  /** @since Chrome 42. */
  var hotwordSearchEnabled: ChromeSetting = js.native
  var instantEnabled: ChromeSetting = js.native
  /** @since Chrome 38. */
  var passwordSavingEnabled: ChromeSetting = js.native
  var safeBrowsingEnabled: ChromeSetting = js.native
  /** @since Chrome 42. */
  var safeBrowsingExtendedReportingEnabled: ChromeSetting = js.native
  var searchSuggestEnabled: ChromeSetting = js.native
  /** since Chrome 20. */
  var spellingServiceEnabled: ChromeSetting = js.native
  var translationServiceEnabled: ChromeSetting = js.native
}

object Services {
  @scala.inline
  def apply(
    alternateErrorPagesEnabled: ChromeSetting,
    autofillAddressEnabled: ChromeSetting,
    autofillCreditCardEnabled: ChromeSetting,
    autofillEnabled: ChromeSetting,
    hotwordSearchEnabled: ChromeSetting,
    instantEnabled: ChromeSetting,
    passwordSavingEnabled: ChromeSetting,
    safeBrowsingEnabled: ChromeSetting,
    safeBrowsingExtendedReportingEnabled: ChromeSetting,
    searchSuggestEnabled: ChromeSetting,
    spellingServiceEnabled: ChromeSetting,
    translationServiceEnabled: ChromeSetting
  ): Services = {
    val __obj = js.Dynamic.literal(alternateErrorPagesEnabled = alternateErrorPagesEnabled.asInstanceOf[js.Any], autofillAddressEnabled = autofillAddressEnabled.asInstanceOf[js.Any], autofillCreditCardEnabled = autofillCreditCardEnabled.asInstanceOf[js.Any], autofillEnabled = autofillEnabled.asInstanceOf[js.Any], hotwordSearchEnabled = hotwordSearchEnabled.asInstanceOf[js.Any], instantEnabled = instantEnabled.asInstanceOf[js.Any], passwordSavingEnabled = passwordSavingEnabled.asInstanceOf[js.Any], safeBrowsingEnabled = safeBrowsingEnabled.asInstanceOf[js.Any], safeBrowsingExtendedReportingEnabled = safeBrowsingExtendedReportingEnabled.asInstanceOf[js.Any], searchSuggestEnabled = searchSuggestEnabled.asInstanceOf[js.Any], spellingServiceEnabled = spellingServiceEnabled.asInstanceOf[js.Any], translationServiceEnabled = translationServiceEnabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[Services]
  }
  @scala.inline
  implicit class ServicesOps[Self <: Services] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlternateErrorPagesEnabled(value: ChromeSetting): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alternateErrorPagesEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAutofillAddressEnabled(value: ChromeSetting): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autofillAddressEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAutofillCreditCardEnabled(value: ChromeSetting): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autofillCreditCardEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAutofillEnabled(value: ChromeSetting): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autofillEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHotwordSearchEnabled(value: ChromeSetting): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hotwordSearchEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInstantEnabled(value: ChromeSetting): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instantEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPasswordSavingEnabled(value: ChromeSetting): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passwordSavingEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSafeBrowsingEnabled(value: ChromeSetting): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("safeBrowsingEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSafeBrowsingExtendedReportingEnabled(value: ChromeSetting): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("safeBrowsingExtendedReportingEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSearchSuggestEnabled(value: ChromeSetting): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchSuggestEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpellingServiceEnabled(value: ChromeSetting): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spellingServiceEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTranslationServiceEnabled(value: ChromeSetting): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("translationServiceEnabled")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

