package typingsSlinky.gapiClientDfareporting.gapi.client.dfareporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DirectorySite extends js.Object {
  /** Whether this directory site is active. */
  var active: js.UndefOr[Boolean] = js.native
  /** Directory site contacts. */
  var contactAssignments: js.UndefOr[js.Array[DirectorySiteContactAssignment]] = js.native
  /** Country ID of this directory site. This is a read-only field. */
  var countryId: js.UndefOr[String] = js.native
  /**
    * Currency ID of this directory site. This is a read-only field.
    * Possible values are:
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
  /** Description of this directory site. This is a read-only field. */
  var description: js.UndefOr[String] = js.native
  /** ID of this directory site. This is a read-only, auto-generated field. */
  var id: js.UndefOr[String] = js.native
  /** Dimension value for the ID of this directory site. This is a read-only, auto-generated field. */
  var idDimensionValue: js.UndefOr[DimensionValue] = js.native
  /**
    * Tag types for regular placements.
    *
    * Acceptable values are:
    * - "STANDARD"
    * - "IFRAME_JAVASCRIPT_INPAGE"
    * - "INTERNAL_REDIRECT_INPAGE"
    * - "JAVASCRIPT_INPAGE"
    */
  var inpageTagFormats: js.UndefOr[js.Array[String]] = js.native
  /**
    * Tag types for interstitial placements.
    *
    * Acceptable values are:
    * - "IFRAME_JAVASCRIPT_INTERSTITIAL"
    * - "INTERNAL_REDIRECT_INTERSTITIAL"
    * - "JAVASCRIPT_INTERSTITIAL"
    */
  var interstitialTagFormats: js.UndefOr[js.Array[String]] = js.native
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#directorySite". */
  var kind: js.UndefOr[String] = js.native
  /** Name of this directory site. */
  var name: js.UndefOr[String] = js.native
  /** Parent directory site ID. */
  var parentId: js.UndefOr[String] = js.native
  /** Directory site settings. */
  var settings: js.UndefOr[DirectorySiteSettings] = js.native
  /** URL of this directory site. */
  var url: js.UndefOr[String] = js.native
}

object DirectorySite {
  @scala.inline
  def apply(): DirectorySite = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DirectorySite]
  }
  @scala.inline
  implicit class DirectorySiteOps[Self <: DirectorySite] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withContactAssignments(value: js.Array[DirectorySiteContactAssignment]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contactAssignments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContactAssignments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contactAssignments")(js.undefined)
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
    def withIdDimensionValue(value: DimensionValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("idDimensionValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIdDimensionValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("idDimensionValue")(js.undefined)
        ret
    }
    @scala.inline
    def withInpageTagFormats(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inpageTagFormats")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInpageTagFormats: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inpageTagFormats")(js.undefined)
        ret
    }
    @scala.inline
    def withInterstitialTagFormats(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interstitialTagFormats")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInterstitialTagFormats: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interstitialTagFormats")(js.undefined)
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
    def withParentId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParentId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentId")(js.undefined)
        ret
    }
    @scala.inline
    def withSettings(value: DirectorySiteSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("settings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("settings")(js.undefined)
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(js.undefined)
        ret
    }
  }
  
}

