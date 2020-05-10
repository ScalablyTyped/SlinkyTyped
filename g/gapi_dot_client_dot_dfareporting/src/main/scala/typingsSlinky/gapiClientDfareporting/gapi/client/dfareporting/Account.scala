package typingsSlinky.gapiClientDfareporting.gapi.client.dfareporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Account extends js.Object {
  /** Account permissions assigned to this account. */
  var accountPermissionIds: js.UndefOr[js.Array[String]] = js.native
  /** Profile for this account. This is a read-only field that can be left blank. */
  var accountProfile: js.UndefOr[String] = js.native
  /** Whether this account is active. */
  var active: js.UndefOr[Boolean] = js.native
  /** Maximum number of active ads allowed for this account. */
  var activeAdsLimitTier: js.UndefOr[String] = js.native
  /** Whether to serve creatives with Active View tags. If disabled, viewability data will not be available for any impressions. */
  var activeViewOptOut: js.UndefOr[Boolean] = js.native
  /** User role permissions available to the user roles of this account. */
  var availablePermissionIds: js.UndefOr[js.Array[String]] = js.native
  /** ID of the country associated with this account. */
  var countryId: js.UndefOr[String] = js.native
  /**
    * ID of currency associated with this account. This is a required field.
    * Acceptable values are:
    * - "1" for USD
    * - "2" for GBP
    * - "3" for ESP
    * - "4" for SEK
    * - "5" for CAD
    * - "6" for JPY
    * - "7" for DEM
    * - "8" for AUD
    * - "9" for FRF
    * - "10" for ITL
    * - "11" for DKK
    * - "12" for NOK
    * - "13" for FIM
    * - "14" for ZAR
    * - "15" for IEP
    * - "16" for NLG
    * - "17" for EUR
    * - "18" for KRW
    * - "19" for TWD
    * - "20" for SGD
    * - "21" for CNY
    * - "22" for HKD
    * - "23" for NZD
    * - "24" for MYR
    * - "25" for BRL
    * - "26" for PTE
    * - "27" for MXP
    * - "28" for CLP
    * - "29" for TRY
    * - "30" for ARS
    * - "31" for PEN
    * - "32" for ILS
    * - "33" for CHF
    * - "34" for VEF
    * - "35" for COP
    * - "36" for GTQ
    * - "37" for PLN
    * - "39" for INR
    * - "40" for THB
    * - "41" for IDR
    * - "42" for CZK
    * - "43" for RON
    * - "44" for HUF
    * - "45" for RUB
    * - "46" for AED
    * - "47" for BGN
    * - "48" for HRK
    * - "49" for MXN
    */
  var currencyId: js.UndefOr[String] = js.native
  /** Default placement dimensions for this account. */
  var defaultCreativeSizeId: js.UndefOr[String] = js.native
  /** Description of this account. */
  var description: js.UndefOr[String] = js.native
  /** ID of this account. This is a read-only, auto-generated field. */
  var id: js.UndefOr[String] = js.native
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#account". */
  var kind: js.UndefOr[String] = js.native
  /**
    * Locale of this account.
    * Acceptable values are:
    * - "cs" (Czech)
    * - "de" (German)
    * - "en" (English)
    * - "en-GB" (English United Kingdom)
    * - "es" (Spanish)
    * - "fr" (French)
    * - "it" (Italian)
    * - "ja" (Japanese)
    * - "ko" (Korean)
    * - "pl" (Polish)
    * - "pt-BR" (Portuguese Brazil)
    * - "ru" (Russian)
    * - "sv" (Swedish)
    * - "tr" (Turkish)
    * - "zh-CN" (Chinese Simplified)
    * - "zh-TW" (Chinese Traditional)
    */
  var locale: js.UndefOr[String] = js.native
  /** Maximum image size allowed for this account, in kilobytes. Value must be greater than or equal to 1. */
  var maximumImageSize: js.UndefOr[String] = js.native
  /** Name of this account. This is a required field, and must be less than 128 characters long and be globally unique. */
  var name: js.UndefOr[String] = js.native
  /** Whether campaigns created in this account will be enabled for Nielsen OCR reach ratings by default. */
  var nielsenOcrEnabled: js.UndefOr[Boolean] = js.native
  /** Reporting configuration of this account. */
  var reportsConfiguration: js.UndefOr[ReportsConfiguration] = js.native
  /** Share Path to Conversion reports with Twitter. */
  var shareReportsWithTwitter: js.UndefOr[Boolean] = js.native
  /** File size limit in kilobytes of Rich Media teaser creatives. Acceptable values are 1 to 10240, inclusive. */
  var teaserSizeLimit: js.UndefOr[String] = js.native
}

object Account {
  @scala.inline
  def apply(): Account = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Account]
  }
  @scala.inline
  implicit class AccountOps[Self <: Account] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccountPermissionIds(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accountPermissionIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccountPermissionIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accountPermissionIds")(js.undefined)
        ret
    }
    @scala.inline
    def withAccountProfile(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accountProfile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccountProfile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accountProfile")(js.undefined)
        ret
    }
    @scala.inline
    def withActive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("active")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("active")(js.undefined)
        ret
    }
    @scala.inline
    def withActiveAdsLimitTier(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeAdsLimitTier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActiveAdsLimitTier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeAdsLimitTier")(js.undefined)
        ret
    }
    @scala.inline
    def withActiveViewOptOut(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeViewOptOut")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActiveViewOptOut: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeViewOptOut")(js.undefined)
        ret
    }
    @scala.inline
    def withAvailablePermissionIds(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("availablePermissionIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAvailablePermissionIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("availablePermissionIds")(js.undefined)
        ret
    }
    @scala.inline
    def withCountryId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("countryId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCountryId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("countryId")(js.undefined)
        ret
    }
    @scala.inline
    def withCurrencyId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currencyId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrencyId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currencyId")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultCreativeSizeId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultCreativeSizeId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultCreativeSizeId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultCreativeSizeId")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
    @scala.inline
    def withLocale(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(js.undefined)
        ret
    }
    @scala.inline
    def withMaximumImageSize(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximumImageSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaximumImageSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximumImageSize")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withNielsenOcrEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nielsenOcrEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNielsenOcrEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nielsenOcrEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withReportsConfiguration(value: ReportsConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reportsConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReportsConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reportsConfiguration")(js.undefined)
        ret
    }
    @scala.inline
    def withShareReportsWithTwitter(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shareReportsWithTwitter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShareReportsWithTwitter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shareReportsWithTwitter")(js.undefined)
        ret
    }
    @scala.inline
    def withTeaserSizeLimit(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("teaserSizeLimit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTeaserSizeLimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("teaserSizeLimit")(js.undefined)
        ret
    }
  }
  
}

