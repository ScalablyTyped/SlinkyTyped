package typingsSlinky.maximMazurokGapiClientAnalytics.gapi.client.analytics

import typingsSlinky.maximMazurokGapiClientAnalytics.anon.Effective
import typingsSlinky.maximMazurokGapiClientAnalytics.anon.Href
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Profile extends StObject {
  
  /** Account ID to which this view (profile) belongs. */
  var accountId: js.UndefOr[String] = js.native
  
  /** Indicates whether bot filtering is enabled for this view (profile). */
  var botFilteringEnabled: js.UndefOr[Boolean] = js.native
  
  /** Child link for this view (profile). Points to the list of goals for this view (profile). */
  var childLink: js.UndefOr[Href] = js.native
  
  /** Time this view (profile) was created. */
  var created: js.UndefOr[String] = js.native
  
  /**
    * The currency type associated with this view (profile), defaults to USD. The supported values are:
    * USD, JPY, EUR, GBP, AUD, KRW, BRL, CNY, DKK, RUB, SEK, NOK, PLN, TRY, TWD, HKD, THB, IDR, ARS, MXN, VND, PHP, INR, CHF, CAD, CZK, NZD, HUF, BGN, LTL, ZAR, UAH, AED, BOB, CLP, COP,
    * EGP, HRK, ILS, MAD, MYR, PEN, PKR, RON, RSD, SAR, SGD, VEF, LVL
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
  var parentLink: js.UndefOr[Href] = js.native
  
  /** Permissions the user has for this view (profile). */
  var permissions: js.UndefOr[Effective] = js.native
  
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
  implicit class ProfileMutableBuilder[Self <: Profile] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    @scala.inline
    def setBotFilteringEnabled(value: Boolean): Self = StObject.set(x, "botFilteringEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBotFilteringEnabledUndefined: Self = StObject.set(x, "botFilteringEnabled", js.undefined)
    
    @scala.inline
    def setChildLink(value: Href): Self = StObject.set(x, "childLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildLinkUndefined: Self = StObject.set(x, "childLink", js.undefined)
    
    @scala.inline
    def setCreated(value: String): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedUndefined: Self = StObject.set(x, "created", js.undefined)
    
    @scala.inline
    def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrencyUndefined: Self = StObject.set(x, "currency", js.undefined)
    
    @scala.inline
    def setDefaultPage(value: String): Self = StObject.set(x, "defaultPage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultPageUndefined: Self = StObject.set(x, "defaultPage", js.undefined)
    
    @scala.inline
    def setECommerceTracking(value: Boolean): Self = StObject.set(x, "eCommerceTracking", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setECommerceTrackingUndefined: Self = StObject.set(x, "eCommerceTracking", js.undefined)
    
    @scala.inline
    def setEnhancedECommerceTracking(value: Boolean): Self = StObject.set(x, "enhancedECommerceTracking", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnhancedECommerceTrackingUndefined: Self = StObject.set(x, "enhancedECommerceTracking", js.undefined)
    
    @scala.inline
    def setExcludeQueryParameters(value: String): Self = StObject.set(x, "excludeQueryParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcludeQueryParametersUndefined: Self = StObject.set(x, "excludeQueryParameters", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setInternalWebPropertyId(value: String): Self = StObject.set(x, "internalWebPropertyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInternalWebPropertyIdUndefined: Self = StObject.set(x, "internalWebPropertyId", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setParentLink(value: Href): Self = StObject.set(x, "parentLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentLinkUndefined: Self = StObject.set(x, "parentLink", js.undefined)
    
    @scala.inline
    def setPermissions(value: Effective): Self = StObject.set(x, "permissions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPermissionsUndefined: Self = StObject.set(x, "permissions", js.undefined)
    
    @scala.inline
    def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelfLinkUndefined: Self = StObject.set(x, "selfLink", js.undefined)
    
    @scala.inline
    def setSiteSearchCategoryParameters(value: String): Self = StObject.set(x, "siteSearchCategoryParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSiteSearchCategoryParametersUndefined: Self = StObject.set(x, "siteSearchCategoryParameters", js.undefined)
    
    @scala.inline
    def setSiteSearchQueryParameters(value: String): Self = StObject.set(x, "siteSearchQueryParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSiteSearchQueryParametersUndefined: Self = StObject.set(x, "siteSearchQueryParameters", js.undefined)
    
    @scala.inline
    def setStarred(value: Boolean): Self = StObject.set(x, "starred", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStarredUndefined: Self = StObject.set(x, "starred", js.undefined)
    
    @scala.inline
    def setStripSiteSearchCategoryParameters(value: Boolean): Self = StObject.set(x, "stripSiteSearchCategoryParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStripSiteSearchCategoryParametersUndefined: Self = StObject.set(x, "stripSiteSearchCategoryParameters", js.undefined)
    
    @scala.inline
    def setStripSiteSearchQueryParameters(value: Boolean): Self = StObject.set(x, "stripSiteSearchQueryParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStripSiteSearchQueryParametersUndefined: Self = StObject.set(x, "stripSiteSearchQueryParameters", js.undefined)
    
    @scala.inline
    def setTimezone(value: String): Self = StObject.set(x, "timezone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimezoneUndefined: Self = StObject.set(x, "timezone", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setUpdated(value: String): Self = StObject.set(x, "updated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdatedUndefined: Self = StObject.set(x, "updated", js.undefined)
    
    @scala.inline
    def setWebPropertyId(value: String): Self = StObject.set(x, "webPropertyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebPropertyIdUndefined: Self = StObject.set(x, "webPropertyId", js.undefined)
    
    @scala.inline
    def setWebsiteUrl(value: String): Self = StObject.set(x, "websiteUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebsiteUrlUndefined: Self = StObject.set(x, "websiteUrl", js.undefined)
  }
}
