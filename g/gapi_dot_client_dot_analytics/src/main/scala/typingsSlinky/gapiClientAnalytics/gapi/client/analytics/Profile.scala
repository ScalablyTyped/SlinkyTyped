package typingsSlinky.gapiClientAnalytics.gapi.client.analytics

import typingsSlinky.gapiClientAnalytics.AnonEffective
import typingsSlinky.gapiClientAnalytics.AnonHref
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Profile extends js.Object {
  /** Account ID to which this view (profile) belongs. */
  var accountId: js.UndefOr[String] = js.native
  /** Indicates whether bot filtering is enabled for this view (profile). */
  var botFilteringEnabled: js.UndefOr[Boolean] = js.native
  /** Child link for this view (profile). Points to the list of goals for this view (profile). */
  var childLink: js.UndefOr[AnonHref] = js.native
  /** Time this view (profile) was created. */
  var created: js.UndefOr[String] = js.native
  /**
    * The currency type associated with this view (profile), defaults to USD. The supported values are:
    * USD, JPY, EUR, GBP, AUD, KRW, BRL, CNY, DKK, RUB, SEK, NOK, PLN, TRY, TWD, HKD, THB, IDR, ARS, MXN, VND, PHP, INR, CHF, CAD, CZK, NZD, HUF, BGN, LTL,
    * ZAR, UAH, AED, BOB, CLP, COP, EGP, HRK, ILS, MAD, MYR, PEN, PKR, RON, RSD, SAR, SGD, VEF, LVL
    */
  var currency: js.UndefOr[String] = js.native
  /** Default page for this view (profile). */
  var defaultPage: js.UndefOr[String] = js.native
  /** Indicates whether ecommerce tracking is enabled for this view (profile). */
  var eCommerceTracking: js.UndefOr[Boolean] = js.native
  /** Indicates whether enhanced ecommerce tracking is enabled for this view (profile). This property can only be enabled if ecommerce tracking is enabled. */
  var enhancedECommerceTracking: js.UndefOr[Boolean] = js.native
  /** The query parameters that are excluded from this view (profile). */
  var excludeQueryParameters: js.UndefOr[String] = js.native
  /** View (Profile) ID. */
  var id: js.UndefOr[String] = js.native
  /** Internal ID for the web property to which this view (profile) belongs. */
  var internalWebPropertyId: js.UndefOr[String] = js.native
  /** Resource type for Analytics view (profile). */
  var kind: js.UndefOr[String] = js.native
  /** Name of this view (profile). */
  var name: js.UndefOr[String] = js.native
  /** Parent link for this view (profile). Points to the web property to which this view (profile) belongs. */
  var parentLink: js.UndefOr[AnonHref] = js.native
  /** Permissions the user has for this view (profile). */
  var permissions: js.UndefOr[AnonEffective] = js.native
  /** Link for this view (profile). */
  var selfLink: js.UndefOr[String] = js.native
  /** Site search category parameters for this view (profile). */
  var siteSearchCategoryParameters: js.UndefOr[String] = js.native
  /** The site search query parameters for this view (profile). */
  var siteSearchQueryParameters: js.UndefOr[String] = js.native
  /** Indicates whether this view (profile) is starred or not. */
  var starred: js.UndefOr[Boolean] = js.native
  /** Whether or not Analytics will strip search category parameters from the URLs in your reports. */
  var stripSiteSearchCategoryParameters: js.UndefOr[Boolean] = js.native
  /** Whether or not Analytics will strip search query parameters from the URLs in your reports. */
  var stripSiteSearchQueryParameters: js.UndefOr[Boolean] = js.native
  /** Time zone for which this view (profile) has been configured. Time zones are identified by strings from the TZ database. */
  var timezone: js.UndefOr[String] = js.native
  /** View (Profile) type. Supported types: WEB or APP. */
  var `type`: js.UndefOr[String] = js.native
  /** Time this view (profile) was last modified. */
  var updated: js.UndefOr[String] = js.native
  /** Web property ID of the form UA-XXXXX-YY to which this view (profile) belongs. */
  var webPropertyId: js.UndefOr[String] = js.native
  /** Website URL for this view (profile). */
  var websiteUrl: js.UndefOr[String] = js.native
}

object Profile {
  @scala.inline
  def apply(): Profile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Profile]
  }
  @scala.inline
  implicit class ProfileOps[Self <: Profile] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccountId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accountId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccountId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accountId")(js.undefined)
        ret
    }
    @scala.inline
    def withBotFilteringEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("botFilteringEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBotFilteringEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("botFilteringEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withChildLink(value: AnonHref): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childLink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChildLink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childLink")(js.undefined)
        ret
    }
    @scala.inline
    def withCreated(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("created")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("created")(js.undefined)
        ret
    }
    @scala.inline
    def withCurrency(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currency")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrency: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currency")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultPage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultPage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultPage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultPage")(js.undefined)
        ret
    }
    @scala.inline
    def withECommerceTracking(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eCommerceTracking")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutECommerceTracking: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eCommerceTracking")(js.undefined)
        ret
    }
    @scala.inline
    def withEnhancedECommerceTracking(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enhancedECommerceTracking")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnhancedECommerceTracking: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enhancedECommerceTracking")(js.undefined)
        ret
    }
    @scala.inline
    def withExcludeQueryParameters(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludeQueryParameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExcludeQueryParameters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludeQueryParameters")(js.undefined)
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
    def withInternalWebPropertyId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("internalWebPropertyId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInternalWebPropertyId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("internalWebPropertyId")(js.undefined)
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
    def withParentLink(value: AnonHref): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentLink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParentLink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentLink")(js.undefined)
        ret
    }
    @scala.inline
    def withPermissions(value: AnonEffective): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("permissions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPermissions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("permissions")(js.undefined)
        ret
    }
    @scala.inline
    def withSelfLink(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selfLink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelfLink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selfLink")(js.undefined)
        ret
    }
    @scala.inline
    def withSiteSearchCategoryParameters(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("siteSearchCategoryParameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSiteSearchCategoryParameters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("siteSearchCategoryParameters")(js.undefined)
        ret
    }
    @scala.inline
    def withSiteSearchQueryParameters(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("siteSearchQueryParameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSiteSearchQueryParameters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("siteSearchQueryParameters")(js.undefined)
        ret
    }
    @scala.inline
    def withStarred(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("starred")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStarred: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("starred")(js.undefined)
        ret
    }
    @scala.inline
    def withStripSiteSearchCategoryParameters(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stripSiteSearchCategoryParameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStripSiteSearchCategoryParameters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stripSiteSearchCategoryParameters")(js.undefined)
        ret
    }
    @scala.inline
    def withStripSiteSearchQueryParameters(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stripSiteSearchQueryParameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStripSiteSearchQueryParameters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stripSiteSearchQueryParameters")(js.undefined)
        ret
    }
    @scala.inline
    def withTimezone(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timezone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimezone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timezone")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdated(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updated")(js.undefined)
        ret
    }
    @scala.inline
    def withWebPropertyId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webPropertyId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWebPropertyId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webPropertyId")(js.undefined)
        ret
    }
    @scala.inline
    def withWebsiteUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("websiteUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWebsiteUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("websiteUrl")(js.undefined)
        ret
    }
  }
  
}

