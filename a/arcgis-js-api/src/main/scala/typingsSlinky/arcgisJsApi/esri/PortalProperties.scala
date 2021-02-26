package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`private`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.anonymous
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.auto
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.english
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.immediate
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.metric
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.multitenant
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.public
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.singletenant
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PortalProperties extends LoadableProperties {
  
  /**
    * The access level of the organization.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#access)
    */
  var access: js.UndefOr[public | `private`] = js.native
  
  /**
    * When `true`, access to the organization's Portal resources must occur over SSL.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#allSSL)
    */
  var allSSL: js.UndefOr[Boolean] = js.native
  
  /**
    * The authentication mode for handling authentication when the user attempts to access a secure resource.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#authMode)
    */
  var authMode: js.UndefOr[anonymous | auto | immediate] = js.native
  
  /**
    * Array of trusted servers to send credentials to when making Cross-Origin Resource Sharing (CORS) requests to access services secured with web-tier authentication.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#authorizedCrossOriginDomains)
    */
  var authorizedCrossOriginDomains: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * The query that defines the basemaps that should be displayed in the [BasemapGallery](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BasemapGallery.html) when [useVectorBasemaps](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#useVectorBasemaps) is not true.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#basemapGalleryGroupQuery)
    */
  var basemapGalleryGroupQuery: js.UndefOr[String] = js.native
  
  /**
    * The Bing key to use for web maps using Bing Maps.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#bingKey)
    */
  var bingKey: js.UndefOr[String] = js.native
  
  /**
    * Indicates whether an organization can list applications in the marketplace.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#canListApps)
    */
  var canListApps: js.UndefOr[Boolean] = js.native
  
  /**
    * Indicates whether an organization can list data services in the marketplace.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#canListData)
    */
  var canListData: js.UndefOr[Boolean] = js.native
  
  /**
    * Indicates whether an organization can list pre-provisioned items in the marketplace.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#canListPreProvisionedItems)
    */
  var canListPreProvisionedItems: js.UndefOr[Boolean] = js.native
  
  /**
    * Indicates whether an organization can provision direct purchases in the marketplace without customer request.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#canProvisionDirectPurchase)
    */
  var canProvisionDirectPurchase: js.UndefOr[Boolean] = js.native
  
  /**
    * When `true`, the organization's public items, groups and users are included in search queries.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#canSearchPublic)
    */
  var canSearchPublic: js.UndefOr[Boolean] = js.native
  
  /**
    * The Bing key can be shared to the public and is returned as part of a portal's description call (`/sharing/rest/portals/<orgid>`).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#canShareBingPublic)
    */
  var canShareBingPublic: js.UndefOr[Boolean] = js.native
  
  /**
    * When `true`, members of the organization can share resources outside the organization.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#canSharePublic)
    */
  var canSharePublic: js.UndefOr[Boolean] = js.native
  
  /**
    * Indicates whether to allow an organization with an enterprise IDP configured to be able to turn on or off the ArcGIS sign in.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#canSignInArcGIS)
    */
  var canSignInArcGIS: js.UndefOr[Boolean] = js.native
  
  /**
    * Indicates whether to allow an organization with an enterprise IDP configured to be able to turn on or off the enterprise sign in.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#canSignInIDP)
    */
  var canSignInIDP: js.UndefOr[Boolean] = js.native
  
  /**
    * The query that identifies the group containing the color sets used for rendering in the map viewer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#colorSetsGroupQuery)
    */
  var colorSetsGroupQuery: js.UndefOr[String] = js.native
  
  /**
    * Indicates whether to allow the organization to disable commenting.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#commentsEnabled)
    */
  var commentsEnabled: js.UndefOr[Boolean] = js.native
  
  /**
    * Date the organization was created.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#created)
    */
  var created: js.UndefOr[DateProperties] = js.native
  
  /**
    * The default locale (language and country) information.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#culture)
    */
  var culture: js.UndefOr[String] = js.native
  
  /**
    * The custom base URL for the portal.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#customBaseUrl)
    */
  var customBaseUrl: js.UndefOr[String] = js.native
  
  /**
    * The default basemap to use for the portal.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#defaultBasemap)
    */
  var defaultBasemap: js.UndefOr[BasemapProperties] = js.native
  
  /**
    * The default extent to use for the portal.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#defaultExtent)
    */
  var defaultExtent: js.UndefOr[ExtentProperties] = js.native
  
  /**
    * The default vector basemap to use for the portal.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#defaultVectorBasemap)
    */
  var defaultVectorBasemap: js.UndefOr[BasemapProperties] = js.native
  
  /**
    * A description of the organization/portal.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#description)
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * Boolean value indicating whether to opt-in to the [Esri User Experience Improvement (EUEI) program](https://doc.arcgis.com/en/arcgis-online/reference/faq.htm#ESRI_QUESTIONANSWER_AED97F28DCD84F7682623C2FA9E5CE49).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#eueiEnabled)
    */
  var eueiEnabled: js.UndefOr[Boolean] = js.native
  
  /**
    * The featured groups for the portal.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#featuredGroups)
    */
  var featuredGroups: js.UndefOr[js.Array[PortalFeaturedGroups]] = js.native
  
  /**
    * The query that defines the featured group.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#featuredItemsGroupQuery)
    */
  var featuredItemsGroupQuery: js.UndefOr[String] = js.native
  
  /**
    * The query that identifies the group containing features items for the gallery.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#galleryTemplatesGroupQuery)
    */
  var galleryTemplatesGroupQuery: js.UndefOr[String] = js.native
  
  /**
    * Indicates whether the organization has content categories.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#hasCategorySchema)
    */
  var hasCategorySchema: js.UndefOr[Boolean] = js.native
  
  /**
    * Helper services provided by the portal.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#helperServices)
    */
  var helperServices: js.UndefOr[js.Any] = js.native
  
  /**
    * The group that contains featured content to be displayed on the home page.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#homePageFeaturedContent)
    */
  var homePageFeaturedContent: js.UndefOr[String] = js.native
  
  /**
    * The number of featured items that can be displayed on the home page.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#homePageFeaturedContentCount)
    */
  var homePageFeaturedContentCount: js.UndefOr[Double] = js.native
  
  /**
    * The port used by the portal for HTTP communication.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#httpPort)
    */
  var httpPort: js.UndefOr[Double] = js.native
  
  /**
    * The port used by the portal for HTTPS communication.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#httpsPort)
    */
  var httpsPort: js.UndefOr[Double] = js.native
  
  /**
    * The id of the organization that owns this portal.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#id)
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * The country code of the calling IP (ArcGIS Online only).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#ipCntryCode)
    */
  var ipCntryCode: js.UndefOr[String] = js.native
  
  /**
    * Indicates if the portal is on-premises.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#isPortal)
    */
  var isPortal: js.UndefOr[Boolean] = js.native
  
  /**
    * Indicates if the portal is in read-only mode.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#isReadOnly)
    */
  var isReadOnly: js.UndefOr[Boolean] = js.native
  
  /**
    * The query that identifies the group containing editing templates.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#layerTemplatesGroupQuery)
    */
  var layerTemplatesGroupQuery: js.UndefOr[String] = js.native
  
  /**
    * The maximum validity in minutes of tokens issued for users of the organization.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#maxTokenExpirationMinutes)
    */
  var maxTokenExpirationMinutes: js.UndefOr[Double] = js.native
  
  /**
    * Date the organization was last modified.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#modified)
    */
  var modified: js.UndefOr[DateProperties] = js.native
  
  /**
    * Name of the organization.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#name)
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * URL of the portal host.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#portalHostname)
    */
  var portalHostname: js.UndefOr[String] = js.native
  
  /**
    * The portal mode.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#portalMode)
    */
  var portalMode: js.UndefOr[multitenant | singletenant] = js.native
  
  /**
    * Properties specific to the organization, for example the "contact us" link.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#portalProperties)
    */
  var portalProperties: js.UndefOr[js.Any] = js.native
  
  /**
    * The region for the organization.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#region)
    */
  var region: js.UndefOr[String] = js.native
  
  /**
    * Custom HTML for the home page.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#rotatorPanels)
    */
  var rotatorPanels: js.UndefOr[js.Array[_]] = js.native
  
  /**
    * Indicates whether the description of your organization displays on the home page.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#showHomePageDescription)
    */
  var showHomePageDescription: js.UndefOr[Boolean] = js.native
  
  /**
    * The JSON used to create the property values when the `Portal` is loaded.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#sourceJSON)
    */
  var sourceJSON: js.UndefOr[js.Any] = js.native
  
  /**
    * Indicates whether hosted services are supported.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#supportsHostedServices)
    */
  var supportsHostedServices: js.UndefOr[Boolean] = js.native
  
  /**
    * The query that defines the symbols sets.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#symbolSetsGroupQuery)
    */
  var symbolSetsGroupQuery: js.UndefOr[String] = js.native
  
  /**
    * The query that defines the collection of templates that will appear in the template gallery.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#templatesGroupQuery)
    */
  var templatesGroupQuery: js.UndefOr[String] = js.native
  
  /**
    * Sets the units of measure for the organization's users.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#units)
    */
  var units: js.UndefOr[english | metric] = js.native
  
  /**
    * The URL to the portal instance.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#url)
    */
  var url: js.UndefOr[String] = js.native
  
  /**
    * The prefix selected by the organization's administrator to be used with the customBaseURL.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#urlKey)
    */
  var urlKey: js.UndefOr[String] = js.native
  
  /**
    * When `true`, only simple where clauses that are compliant with SQL92 can be used when querying layers and tables.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#useStandardizedQuery)
    */
  var useStandardizedQuery: js.UndefOr[Boolean] = js.native
  
  /**
    * When `true`, the organization has opted in to use the vector tile basemaps, and (a) [vectorBasemapGalleryGroupQuery](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#vectorBasemapGalleryGroupQuery) should be used instead of [basemapGalleryGroupQuery](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#basemapGalleryGroupQuery), while (b) [defaultVectorBasemap](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#defaultVectorBasemap) should be used instead of [defaultBasemap](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#defaultBasemap).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#useVectorBasemaps)
    */
  var useVectorBasemaps: js.UndefOr[Boolean] = js.native
  
  /**
    * Information representing a registered user of the portal.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#user)
    */
  var user: js.UndefOr[PortalUserProperties] = js.native
  
  /**
    * The query that defines the vector tiles basemaps that should be displayed in the [BasemapGallery](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BasemapGallery.html) when [useVectorBasemaps](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#useVectorBasemaps) is true.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#vectorBasemapGalleryGroupQuery)
    */
  var vectorBasemapGalleryGroupQuery: js.UndefOr[String] = js.native
}
object PortalProperties {
  
  @scala.inline
  def apply(): PortalProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PortalProperties]
  }
  
  @scala.inline
  implicit class PortalPropertiesMutableBuilder[Self <: PortalProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccess(value: public | `private`): Self = StObject.set(x, "access", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessUndefined: Self = StObject.set(x, "access", js.undefined)
    
    @scala.inline
    def setAllSSL(value: Boolean): Self = StObject.set(x, "allSSL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllSSLUndefined: Self = StObject.set(x, "allSSL", js.undefined)
    
    @scala.inline
    def setAuthMode(value: anonymous | auto | immediate): Self = StObject.set(x, "authMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthModeUndefined: Self = StObject.set(x, "authMode", js.undefined)
    
    @scala.inline
    def setAuthorizedCrossOriginDomains(value: js.Array[String]): Self = StObject.set(x, "authorizedCrossOriginDomains", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthorizedCrossOriginDomainsUndefined: Self = StObject.set(x, "authorizedCrossOriginDomains", js.undefined)
    
    @scala.inline
    def setAuthorizedCrossOriginDomainsVarargs(value: String*): Self = StObject.set(x, "authorizedCrossOriginDomains", js.Array(value :_*))
    
    @scala.inline
    def setBasemapGalleryGroupQuery(value: String): Self = StObject.set(x, "basemapGalleryGroupQuery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBasemapGalleryGroupQueryUndefined: Self = StObject.set(x, "basemapGalleryGroupQuery", js.undefined)
    
    @scala.inline
    def setBingKey(value: String): Self = StObject.set(x, "bingKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBingKeyUndefined: Self = StObject.set(x, "bingKey", js.undefined)
    
    @scala.inline
    def setCanListApps(value: Boolean): Self = StObject.set(x, "canListApps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanListAppsUndefined: Self = StObject.set(x, "canListApps", js.undefined)
    
    @scala.inline
    def setCanListData(value: Boolean): Self = StObject.set(x, "canListData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanListDataUndefined: Self = StObject.set(x, "canListData", js.undefined)
    
    @scala.inline
    def setCanListPreProvisionedItems(value: Boolean): Self = StObject.set(x, "canListPreProvisionedItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanListPreProvisionedItemsUndefined: Self = StObject.set(x, "canListPreProvisionedItems", js.undefined)
    
    @scala.inline
    def setCanProvisionDirectPurchase(value: Boolean): Self = StObject.set(x, "canProvisionDirectPurchase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanProvisionDirectPurchaseUndefined: Self = StObject.set(x, "canProvisionDirectPurchase", js.undefined)
    
    @scala.inline
    def setCanSearchPublic(value: Boolean): Self = StObject.set(x, "canSearchPublic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanSearchPublicUndefined: Self = StObject.set(x, "canSearchPublic", js.undefined)
    
    @scala.inline
    def setCanShareBingPublic(value: Boolean): Self = StObject.set(x, "canShareBingPublic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanShareBingPublicUndefined: Self = StObject.set(x, "canShareBingPublic", js.undefined)
    
    @scala.inline
    def setCanSharePublic(value: Boolean): Self = StObject.set(x, "canSharePublic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanSharePublicUndefined: Self = StObject.set(x, "canSharePublic", js.undefined)
    
    @scala.inline
    def setCanSignInArcGIS(value: Boolean): Self = StObject.set(x, "canSignInArcGIS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanSignInArcGISUndefined: Self = StObject.set(x, "canSignInArcGIS", js.undefined)
    
    @scala.inline
    def setCanSignInIDP(value: Boolean): Self = StObject.set(x, "canSignInIDP", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanSignInIDPUndefined: Self = StObject.set(x, "canSignInIDP", js.undefined)
    
    @scala.inline
    def setColorSetsGroupQuery(value: String): Self = StObject.set(x, "colorSetsGroupQuery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorSetsGroupQueryUndefined: Self = StObject.set(x, "colorSetsGroupQuery", js.undefined)
    
    @scala.inline
    def setCommentsEnabled(value: Boolean): Self = StObject.set(x, "commentsEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommentsEnabledUndefined: Self = StObject.set(x, "commentsEnabled", js.undefined)
    
    @scala.inline
    def setCreated(value: DateProperties): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedDate(value: js.Date): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedUndefined: Self = StObject.set(x, "created", js.undefined)
    
    @scala.inline
    def setCulture(value: String): Self = StObject.set(x, "culture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCultureUndefined: Self = StObject.set(x, "culture", js.undefined)
    
    @scala.inline
    def setCustomBaseUrl(value: String): Self = StObject.set(x, "customBaseUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomBaseUrlUndefined: Self = StObject.set(x, "customBaseUrl", js.undefined)
    
    @scala.inline
    def setDefaultBasemap(value: BasemapProperties): Self = StObject.set(x, "defaultBasemap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultBasemapUndefined: Self = StObject.set(x, "defaultBasemap", js.undefined)
    
    @scala.inline
    def setDefaultExtent(value: ExtentProperties): Self = StObject.set(x, "defaultExtent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultExtentUndefined: Self = StObject.set(x, "defaultExtent", js.undefined)
    
    @scala.inline
    def setDefaultVectorBasemap(value: BasemapProperties): Self = StObject.set(x, "defaultVectorBasemap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultVectorBasemapUndefined: Self = StObject.set(x, "defaultVectorBasemap", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setEueiEnabled(value: Boolean): Self = StObject.set(x, "eueiEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEueiEnabledUndefined: Self = StObject.set(x, "eueiEnabled", js.undefined)
    
    @scala.inline
    def setFeaturedGroups(value: js.Array[PortalFeaturedGroups]): Self = StObject.set(x, "featuredGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeaturedGroupsUndefined: Self = StObject.set(x, "featuredGroups", js.undefined)
    
    @scala.inline
    def setFeaturedGroupsVarargs(value: PortalFeaturedGroups*): Self = StObject.set(x, "featuredGroups", js.Array(value :_*))
    
    @scala.inline
    def setFeaturedItemsGroupQuery(value: String): Self = StObject.set(x, "featuredItemsGroupQuery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeaturedItemsGroupQueryUndefined: Self = StObject.set(x, "featuredItemsGroupQuery", js.undefined)
    
    @scala.inline
    def setGalleryTemplatesGroupQuery(value: String): Self = StObject.set(x, "galleryTemplatesGroupQuery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGalleryTemplatesGroupQueryUndefined: Self = StObject.set(x, "galleryTemplatesGroupQuery", js.undefined)
    
    @scala.inline
    def setHasCategorySchema(value: Boolean): Self = StObject.set(x, "hasCategorySchema", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasCategorySchemaUndefined: Self = StObject.set(x, "hasCategorySchema", js.undefined)
    
    @scala.inline
    def setHelperServices(value: js.Any): Self = StObject.set(x, "helperServices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHelperServicesUndefined: Self = StObject.set(x, "helperServices", js.undefined)
    
    @scala.inline
    def setHomePageFeaturedContent(value: String): Self = StObject.set(x, "homePageFeaturedContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHomePageFeaturedContentCount(value: Double): Self = StObject.set(x, "homePageFeaturedContentCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHomePageFeaturedContentCountUndefined: Self = StObject.set(x, "homePageFeaturedContentCount", js.undefined)
    
    @scala.inline
    def setHomePageFeaturedContentUndefined: Self = StObject.set(x, "homePageFeaturedContent", js.undefined)
    
    @scala.inline
    def setHttpPort(value: Double): Self = StObject.set(x, "httpPort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHttpPortUndefined: Self = StObject.set(x, "httpPort", js.undefined)
    
    @scala.inline
    def setHttpsPort(value: Double): Self = StObject.set(x, "httpsPort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHttpsPortUndefined: Self = StObject.set(x, "httpsPort", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setIpCntryCode(value: String): Self = StObject.set(x, "ipCntryCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIpCntryCodeUndefined: Self = StObject.set(x, "ipCntryCode", js.undefined)
    
    @scala.inline
    def setIsPortal(value: Boolean): Self = StObject.set(x, "isPortal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsPortalUndefined: Self = StObject.set(x, "isPortal", js.undefined)
    
    @scala.inline
    def setIsReadOnly(value: Boolean): Self = StObject.set(x, "isReadOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsReadOnlyUndefined: Self = StObject.set(x, "isReadOnly", js.undefined)
    
    @scala.inline
    def setLayerTemplatesGroupQuery(value: String): Self = StObject.set(x, "layerTemplatesGroupQuery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayerTemplatesGroupQueryUndefined: Self = StObject.set(x, "layerTemplatesGroupQuery", js.undefined)
    
    @scala.inline
    def setMaxTokenExpirationMinutes(value: Double): Self = StObject.set(x, "maxTokenExpirationMinutes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxTokenExpirationMinutesUndefined: Self = StObject.set(x, "maxTokenExpirationMinutes", js.undefined)
    
    @scala.inline
    def setModified(value: DateProperties): Self = StObject.set(x, "modified", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModifiedDate(value: js.Date): Self = StObject.set(x, "modified", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModifiedUndefined: Self = StObject.set(x, "modified", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setPortalHostname(value: String): Self = StObject.set(x, "portalHostname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortalHostnameUndefined: Self = StObject.set(x, "portalHostname", js.undefined)
    
    @scala.inline
    def setPortalMode(value: multitenant | singletenant): Self = StObject.set(x, "portalMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortalModeUndefined: Self = StObject.set(x, "portalMode", js.undefined)
    
    @scala.inline
    def setPortalProperties(value: js.Any): Self = StObject.set(x, "portalProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortalPropertiesUndefined: Self = StObject.set(x, "portalProperties", js.undefined)
    
    @scala.inline
    def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
    
    @scala.inline
    def setRotatorPanels(value: js.Array[_]): Self = StObject.set(x, "rotatorPanels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRotatorPanelsUndefined: Self = StObject.set(x, "rotatorPanels", js.undefined)
    
    @scala.inline
    def setRotatorPanelsVarargs(value: js.Any*): Self = StObject.set(x, "rotatorPanels", js.Array(value :_*))
    
    @scala.inline
    def setShowHomePageDescription(value: Boolean): Self = StObject.set(x, "showHomePageDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowHomePageDescriptionUndefined: Self = StObject.set(x, "showHomePageDescription", js.undefined)
    
    @scala.inline
    def setSourceJSON(value: js.Any): Self = StObject.set(x, "sourceJSON", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceJSONUndefined: Self = StObject.set(x, "sourceJSON", js.undefined)
    
    @scala.inline
    def setSupportsHostedServices(value: Boolean): Self = StObject.set(x, "supportsHostedServices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportsHostedServicesUndefined: Self = StObject.set(x, "supportsHostedServices", js.undefined)
    
    @scala.inline
    def setSymbolSetsGroupQuery(value: String): Self = StObject.set(x, "symbolSetsGroupQuery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSymbolSetsGroupQueryUndefined: Self = StObject.set(x, "symbolSetsGroupQuery", js.undefined)
    
    @scala.inline
    def setTemplatesGroupQuery(value: String): Self = StObject.set(x, "templatesGroupQuery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplatesGroupQueryUndefined: Self = StObject.set(x, "templatesGroupQuery", js.undefined)
    
    @scala.inline
    def setUnits(value: english | metric): Self = StObject.set(x, "units", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnitsUndefined: Self = StObject.set(x, "units", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlKey(value: String): Self = StObject.set(x, "urlKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlKeyUndefined: Self = StObject.set(x, "urlKey", js.undefined)
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    @scala.inline
    def setUseStandardizedQuery(value: Boolean): Self = StObject.set(x, "useStandardizedQuery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseStandardizedQueryUndefined: Self = StObject.set(x, "useStandardizedQuery", js.undefined)
    
    @scala.inline
    def setUseVectorBasemaps(value: Boolean): Self = StObject.set(x, "useVectorBasemaps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseVectorBasemapsUndefined: Self = StObject.set(x, "useVectorBasemaps", js.undefined)
    
    @scala.inline
    def setUser(value: PortalUserProperties): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
    
    @scala.inline
    def setVectorBasemapGalleryGroupQuery(value: String): Self = StObject.set(x, "vectorBasemapGalleryGroupQuery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVectorBasemapGalleryGroupQueryUndefined: Self = StObject.set(x, "vectorBasemapGalleryGroupQuery", js.undefined)
  }
}
