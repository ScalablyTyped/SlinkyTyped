package typingsSlinky.googleapis.v31Mod.dfareportingV31

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains properties of a Campaign Manager account.
  */
@js.native
trait SchemaAccount extends js.Object {
  /**
    * Account permissions assigned to this account.
    */
  var accountPermissionIds: js.UndefOr[js.Array[String]] = js.native
  /**
    * Profile for this account. This is a read-only field that can be left
    * blank.
    */
  var accountProfile: js.UndefOr[String] = js.native
  /**
    * Whether this account is active.
    */
  var active: js.UndefOr[Boolean] = js.native
  /**
    * Maximum number of active ads allowed for this account.
    */
  var activeAdsLimitTier: js.UndefOr[String] = js.native
  /**
    * Whether to serve creatives with Active View tags. If disabled,
    * viewability data will not be available for any impressions.
    */
  var activeViewOptOut: js.UndefOr[Boolean] = js.native
  /**
    * User role permissions available to the user roles of this account.
    */
  var availablePermissionIds: js.UndefOr[js.Array[String]] = js.native
  /**
    * ID of the country associated with this account.
    */
  var countryId: js.UndefOr[String] = js.native
  /**
    * ID of currency associated with this account. This is a required field.
    * Acceptable values are:  - &quot;1&quot; for USD  - &quot;2&quot; for GBP
    * - &quot;3&quot; for ESP  - &quot;4&quot; for SEK  - &quot;5&quot; for CAD
    * - &quot;6&quot; for JPY  - &quot;7&quot; for DEM  - &quot;8&quot; for AUD
    * - &quot;9&quot; for FRF  - &quot;10&quot; for ITL  - &quot;11&quot; for
    * DKK  - &quot;12&quot; for NOK  - &quot;13&quot; for FIM  - &quot;14&quot;
    * for ZAR  - &quot;15&quot; for IEP  - &quot;16&quot; for NLG  -
    * &quot;17&quot; for EUR  - &quot;18&quot; for KRW  - &quot;19&quot; for
    * TWD  - &quot;20&quot; for SGD  - &quot;21&quot; for CNY  - &quot;22&quot;
    * for HKD  - &quot;23&quot; for NZD  - &quot;24&quot; for MYR  -
    * &quot;25&quot; for BRL  - &quot;26&quot; for PTE  - &quot;27&quot; for
    * MXP  - &quot;28&quot; for CLP  - &quot;29&quot; for TRY  - &quot;30&quot;
    * for ARS  - &quot;31&quot; for PEN  - &quot;32&quot; for ILS  -
    * &quot;33&quot; for CHF  - &quot;34&quot; for VEF  - &quot;35&quot; for
    * COP  - &quot;36&quot; for GTQ  - &quot;37&quot; for PLN  - &quot;39&quot;
    * for INR  - &quot;40&quot; for THB  - &quot;41&quot; for IDR  -
    * &quot;42&quot; for CZK  - &quot;43&quot; for RON  - &quot;44&quot; for
    * HUF  - &quot;45&quot; for RUB  - &quot;46&quot; for AED  - &quot;47&quot;
    * for BGN  - &quot;48&quot; for HRK  - &quot;49&quot; for MXN  -
    * &quot;50&quot; for NGN
    */
  var currencyId: js.UndefOr[String] = js.native
  /**
    * Default placement dimensions for this account.
    */
  var defaultCreativeSizeId: js.UndefOr[String] = js.native
  /**
    * Description of this account.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * ID of this account. This is a read-only, auto-generated field.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#account&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Locale of this account. Acceptable values are:  - &quot;cs&quot; (Czech)
    * - &quot;de&quot; (German)  - &quot;en&quot; (English)  -
    * &quot;en-GB&quot; (English United Kingdom)  - &quot;es&quot; (Spanish)  -
    * &quot;fr&quot; (French)  - &quot;it&quot; (Italian)  - &quot;ja&quot;
    * (Japanese)  - &quot;ko&quot; (Korean)  - &quot;pl&quot; (Polish)  -
    * &quot;pt-BR&quot; (Portuguese Brazil)  - &quot;ru&quot; (Russian)  -
    * &quot;sv&quot; (Swedish)  - &quot;tr&quot; (Turkish)  - &quot;zh-CN&quot;
    * (Chinese Simplified)  - &quot;zh-TW&quot; (Chinese Traditional)
    */
  var locale: js.UndefOr[String] = js.native
  /**
    * Maximum image size allowed for this account, in kilobytes. Value must be
    * greater than or equal to 1.
    */
  var maximumImageSize: js.UndefOr[String] = js.native
  /**
    * Name of this account. This is a required field, and must be less than 128
    * characters long and be globally unique.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Whether campaigns created in this account will be enabled for Nielsen OCR
    * reach ratings by default.
    */
  var nielsenOcrEnabled: js.UndefOr[Boolean] = js.native
  /**
    * Reporting configuration of this account.
    */
  var reportsConfiguration: js.UndefOr[SchemaReportsConfiguration] = js.native
  /**
    * Share Path to Conversion reports with Twitter.
    */
  var shareReportsWithTwitter: js.UndefOr[Boolean] = js.native
  /**
    * File size limit in kilobytes of Rich Media teaser creatives. Acceptable
    * values are 1 to 10240, inclusive.
    */
  var teaserSizeLimit: js.UndefOr[String] = js.native
}

object SchemaAccount {
  @scala.inline
  def apply(): SchemaAccount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAccount]
  }
  @scala.inline
  implicit class SchemaAccountOps[Self <: SchemaAccount] (val x: Self) extends AnyVal {
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
    def withReportsConfiguration(value: SchemaReportsConfiguration): Self = {
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

