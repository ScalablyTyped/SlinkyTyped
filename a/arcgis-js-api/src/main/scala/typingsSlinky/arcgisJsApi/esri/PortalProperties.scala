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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PortalProperties extends LoadableProperties {
  /**
    * The access level of the organization. When public, anonymous users can access the organization. When private, access is restricted to only members of the organization.
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
    * Possible Value | Description
    * ---------------|------------
    * anonymous | An error will be returned when a secure resource is requested.
    * auto | The user will be signed in when a secure resource is requested.
    * immediate | The user will be signed in when the Portal is loaded.
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#authMode)
    *
    * @default auto
    */
  var authMode: js.UndefOr[anonymous | auto | immediate] = js.native
  /**
    * Array of trusted servers to send credentials to when making Cross-Origin Resource Sharing (CORS) requests to access services secured with web-tier authentication.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#authorizedCrossOriginDomains)
    */
  var authorizedCrossOriginDomains: js.UndefOr[js.Array[String]] = js.native
  /**
    * The query that defines the basemaps that should be displayed in the [BasemapGallery](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BasemapGallery.html) when [useVectorBasemaps](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#useVectorBasemaps) is not true. The [fetchBasemaps()](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#fetchBasemaps) method does this automatically.
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
    * When `true`, the organization's public items, groups and users are included in search queries. When `false`, no public items outside of the organization are included. However, public items which are part of the organization are included.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#canSearchPublic)
    *
    * @default true
    */
  var canSearchPublic: js.UndefOr[Boolean] = js.native
  /**
    * The Bing key can be shared to the public and is returned as part of a portal's description call (`/sharing/rest/portals/<orgid>`). This requires the access of the portal to be set to public. The canShareBingPublic property is not returned publicly but only shown to users within the organization.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#canShareBingPublic)
    *
    * @default false
    */
  var canShareBingPublic: js.UndefOr[Boolean] = js.native
  /**
    * When `true`, members of the organization can share resources outside the organization.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#canSharePublic)
    *
    * @default false
    */
  var canSharePublic: js.UndefOr[Boolean] = js.native
  /**
    * Indicates whether to allow an organization with an enterprise IDP configured to be able to turn on or off the ArcGIS sign in.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#canSignInArcGIS)
    *
    * @default false
    */
  var canSignInArcGIS: js.UndefOr[Boolean] = js.native
  /**
    * Indicates whether to allow an organization with an enterprise IDP configured to be able to turn on or off the enterprise sign in.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#canSignInIDP)
    *
    * @default false
    */
  var canSignInIDP: js.UndefOr[Boolean] = js.native
  /**
    * The query that identifies the group containing the color sets used for rendering in the map viewer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#colorSetsGroupQuery)
    */
  var colorSetsGroupQuery: js.UndefOr[String] = js.native
  /**
    * Indicates whether to allow the organization to disable commenting. When commentsEnabled is false, comments are hidden and not removed. numComments are set to zero for all items in the organization. Calls to add a comment and view comments will fail. If the organization re-enables comments, the comments display and numComments are restored.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#commentsEnabled)
    *
    * @default false
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
    * The default basemap to use for the portal. Used in the map viewer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#defaultBasemap)
    */
  var defaultBasemap: js.UndefOr[BasemapProperties] = js.native
  /**
    * The default extent to use for the portal. Used in the map viewer. The extent will be in the default basemap's spatial reference.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#defaultExtent)
    */
  var defaultExtent: js.UndefOr[ExtentProperties] = js.native
  /**
    * The default vector basemap to use for the portal. Used in the map viewer.
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
    *
    * @default null
    */
  var eueiEnabled: js.UndefOr[Boolean] = js.native
  /**
    * The featured groups for the portal. Returns an array of objects that provide access to the owner and title for each featured group. Each item in this array has the following specification:
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#featuredGroups)
    */
  var featuredGroups: js.UndefOr[js.Array[PortalFeaturedGroups]] = js.native
  /**
    * The query that defines the featured group. If null, then the most viewed items in the organization will be the featured items.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#featuredItemsGroupQuery)
    */
  var featuredItemsGroupQuery: js.UndefOr[String] = js.native
  /**
    * The query that identifies the group containing features items for the gallery. Set a Group ID or, if null, then the most viewed items in your organization are displayed in the gallery.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#galleryTemplatesGroupQuery)
    */
  var galleryTemplatesGroupQuery: js.UndefOr[String] = js.native
  /**
    * Indicates whether the organization has content categories.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#hasCategorySchema)
    *
    * @default false
    */
  var hasCategorySchema: js.UndefOr[Boolean] = js.native
  /**
    * Helper services provided by the portal. This is useful in instances where helper services are needed but may not be available using the given helper methods [createClosestFacilityTask](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#createClosestFacilityTask), [createElevationLayers](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#createElevationLayers), [createGeometryService](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#createGeometryService), [createPrintTask](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#createPrintTask), [createRouteTask](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#createRouteTask), and [createServiceAreaTask](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#createServiceAreaTask).  For additional information about helper services, see the [about utility services](https://enterprise.arcgis.com/en/portal/latest/administer/windows/about-utility-services.htm) topic from the ArcGIS Server documentation.
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
    * The number of featured items that can be displayed on the home page. The max is 100. Accepts integers only.
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
    * The id of the organization that owns this portal. If `null` then this is the default portal for anonymous and non-organizational users.
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
    * Indicates if the portal is in read-only mode. When `true`, content cannot be created, modified, or deleted on the Portal.
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
    * The maximum validity in minutes of tokens issued for users of the organization. -1 is the default and is a special value that indicates infinite timeout or permanent tokens. For tokens granted using OAuth 2.0 authorization grant, it represents the maximum validity of refresh tokens. For access tokens, the maximum validity is the lower of two weeks or this value.
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
    * Properties specific to the organization, for example the "contact us" link. If the organization is public, the properties are visible to the anonymous user.
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
    * The JSON used to create the property values when the `Portal` is loaded. Although most commonly used properties are exposed on the `Portal` class directly, this provides access to all information returned by the portal. This property is useful if working in an application built using an older version of the API which requires access to portal properties from a more recent version.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#sourceJSON)
    */
  var sourceJSON: js.UndefOr[js.Any] = js.native
  /**
    * Indicates whether hosted services are supported.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#supportsHostedServices)
    *
    * @default false
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
    * Sets the units of measure for the organization's users. The user default is derived from the organization's [region](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#region).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#units)
    */
  var units: js.UndefOr[english | metric] = js.native
  /**
    * The URL to the portal instance. Setting the location of the portal instance via [esriConfig.portalUrl](https://developers.arcgis.com/javascript/latest/api-reference/esri-config.html#portalUrl) should be used in favor of setting it directly on this property.  If using an on-premise portal, the syntax should look similar to: `https://www.example.com/arcgis`
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#url)
    *
    * @default {@link module:esri/config#portalUrl esriConfig.portalUrl}
    */
  var url: js.UndefOr[String] = js.native
  /**
    * The prefix selected by the organization's administrator to be used with the customBaseURL.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#urlKey)
    */
  var urlKey: js.UndefOr[String] = js.native
  /**
    * When `true`, only simple where clauses that are compliant with SQL92 can be used when querying layers and tables. The recommended security setting is true.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#useStandardizedQuery)
    */
  var useStandardizedQuery: js.UndefOr[Boolean] = js.native
  /**
    * When `true`, the organization has opted in to use the vector tile basemaps, and (a) [vectorBasemapGalleryGroupQuery](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#vectorBasemapGalleryGroupQuery) should be used instead of [basemapGalleryGroupQuery](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#basemapGalleryGroupQuery), while (b) [defaultVectorBasemap](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#defaultVectorBasemap) should be used instead of [defaultBasemap](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#defaultBasemap). The [fetchBasemaps()](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#fetchBasemaps) method automatically uses vectorBasemapGalleryGroupQuery.
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
    * The query that defines the vector tiles basemaps that should be displayed in the [BasemapGallery](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BasemapGallery.html) when [useVectorBasemaps](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#useVectorBasemaps) is true. The [fetchBasemaps()](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#fetchBasemaps) method does this automatically.
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
  implicit class PortalPropertiesOps[Self <: PortalProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccess(value: public | `private`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("access")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccess: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("access")(js.undefined)
        ret
    }
    @scala.inline
    def withAllSSL(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allSSL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllSSL: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allSSL")(js.undefined)
        ret
    }
    @scala.inline
    def withAuthMode(value: anonymous | auto | immediate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authMode")(js.undefined)
        ret
    }
    @scala.inline
    def withAuthorizedCrossOriginDomains(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authorizedCrossOriginDomains")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthorizedCrossOriginDomains: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authorizedCrossOriginDomains")(js.undefined)
        ret
    }
    @scala.inline
    def withBasemapGalleryGroupQuery(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("basemapGalleryGroupQuery")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBasemapGalleryGroupQuery: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("basemapGalleryGroupQuery")(js.undefined)
        ret
    }
    @scala.inline
    def withBingKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bingKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBingKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bingKey")(js.undefined)
        ret
    }
    @scala.inline
    def withCanListApps(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canListApps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCanListApps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canListApps")(js.undefined)
        ret
    }
    @scala.inline
    def withCanListData(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canListData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCanListData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canListData")(js.undefined)
        ret
    }
    @scala.inline
    def withCanListPreProvisionedItems(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canListPreProvisionedItems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCanListPreProvisionedItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canListPreProvisionedItems")(js.undefined)
        ret
    }
    @scala.inline
    def withCanProvisionDirectPurchase(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canProvisionDirectPurchase")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCanProvisionDirectPurchase: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canProvisionDirectPurchase")(js.undefined)
        ret
    }
    @scala.inline
    def withCanSearchPublic(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canSearchPublic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCanSearchPublic: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canSearchPublic")(js.undefined)
        ret
    }
    @scala.inline
    def withCanShareBingPublic(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canShareBingPublic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCanShareBingPublic: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canShareBingPublic")(js.undefined)
        ret
    }
    @scala.inline
    def withCanSharePublic(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canSharePublic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCanSharePublic: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canSharePublic")(js.undefined)
        ret
    }
    @scala.inline
    def withCanSignInArcGIS(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canSignInArcGIS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCanSignInArcGIS: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canSignInArcGIS")(js.undefined)
        ret
    }
    @scala.inline
    def withCanSignInIDP(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canSignInIDP")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCanSignInIDP: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canSignInIDP")(js.undefined)
        ret
    }
    @scala.inline
    def withColorSetsGroupQuery(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorSetsGroupQuery")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColorSetsGroupQuery: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorSetsGroupQuery")(js.undefined)
        ret
    }
    @scala.inline
    def withCommentsEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commentsEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCommentsEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commentsEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withCreatedDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("created")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreated(value: DateProperties): Self = {
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
    def withCulture(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("culture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCulture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("culture")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomBaseUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customBaseUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomBaseUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customBaseUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultBasemap(value: BasemapProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultBasemap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultBasemap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultBasemap")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultExtent(value: ExtentProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultExtent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultExtent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultExtent")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultVectorBasemap(value: BasemapProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultVectorBasemap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultVectorBasemap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultVectorBasemap")(js.undefined)
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
    def withEueiEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eueiEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEueiEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eueiEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withFeaturedGroups(value: js.Array[PortalFeaturedGroups]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("featuredGroups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFeaturedGroups: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("featuredGroups")(js.undefined)
        ret
    }
    @scala.inline
    def withFeaturedItemsGroupQuery(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("featuredItemsGroupQuery")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFeaturedItemsGroupQuery: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("featuredItemsGroupQuery")(js.undefined)
        ret
    }
    @scala.inline
    def withGalleryTemplatesGroupQuery(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("galleryTemplatesGroupQuery")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGalleryTemplatesGroupQuery: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("galleryTemplatesGroupQuery")(js.undefined)
        ret
    }
    @scala.inline
    def withHasCategorySchema(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasCategorySchema")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHasCategorySchema: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasCategorySchema")(js.undefined)
        ret
    }
    @scala.inline
    def withHelperServices(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("helperServices")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHelperServices: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("helperServices")(js.undefined)
        ret
    }
    @scala.inline
    def withHomePageFeaturedContent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("homePageFeaturedContent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHomePageFeaturedContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("homePageFeaturedContent")(js.undefined)
        ret
    }
    @scala.inline
    def withHomePageFeaturedContentCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("homePageFeaturedContentCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHomePageFeaturedContentCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("homePageFeaturedContentCount")(js.undefined)
        ret
    }
    @scala.inline
    def withHttpPort(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("httpPort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHttpPort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("httpPort")(js.undefined)
        ret
    }
    @scala.inline
    def withHttpsPort(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("httpsPort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHttpsPort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("httpsPort")(js.undefined)
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
    def withIpCntryCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ipCntryCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIpCntryCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ipCntryCode")(js.undefined)
        ret
    }
    @scala.inline
    def withIsPortal(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isPortal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsPortal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isPortal")(js.undefined)
        ret
    }
    @scala.inline
    def withIsReadOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isReadOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsReadOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isReadOnly")(js.undefined)
        ret
    }
    @scala.inline
    def withLayerTemplatesGroupQuery(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layerTemplatesGroupQuery")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLayerTemplatesGroupQuery: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layerTemplatesGroupQuery")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxTokenExpirationMinutes(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxTokenExpirationMinutes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxTokenExpirationMinutes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxTokenExpirationMinutes")(js.undefined)
        ret
    }
    @scala.inline
    def withModifiedDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modified")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModified(value: DateProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modified")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModified: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modified")(js.undefined)
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
    def withPortalHostname(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("portalHostname")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPortalHostname: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("portalHostname")(js.undefined)
        ret
    }
    @scala.inline
    def withPortalMode(value: multitenant | singletenant): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("portalMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPortalMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("portalMode")(js.undefined)
        ret
    }
    @scala.inline
    def withPortalProperties(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("portalProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPortalProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("portalProperties")(js.undefined)
        ret
    }
    @scala.inline
    def withRegion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("region")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("region")(js.undefined)
        ret
    }
    @scala.inline
    def withRotatorPanels(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotatorPanels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRotatorPanels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotatorPanels")(js.undefined)
        ret
    }
    @scala.inline
    def withShowHomePageDescription(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showHomePageDescription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowHomePageDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showHomePageDescription")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceJSON(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceJSON")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceJSON: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceJSON")(js.undefined)
        ret
    }
    @scala.inline
    def withSupportsHostedServices(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportsHostedServices")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSupportsHostedServices: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportsHostedServices")(js.undefined)
        ret
    }
    @scala.inline
    def withSymbolSetsGroupQuery(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("symbolSetsGroupQuery")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSymbolSetsGroupQuery: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("symbolSetsGroupQuery")(js.undefined)
        ret
    }
    @scala.inline
    def withTemplatesGroupQuery(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("templatesGroupQuery")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTemplatesGroupQuery: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("templatesGroupQuery")(js.undefined)
        ret
    }
    @scala.inline
    def withUnits(value: english | metric): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("units")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnits: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("units")(js.undefined)
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
    @scala.inline
    def withUrlKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("urlKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrlKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("urlKey")(js.undefined)
        ret
    }
    @scala.inline
    def withUseStandardizedQuery(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useStandardizedQuery")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseStandardizedQuery: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useStandardizedQuery")(js.undefined)
        ret
    }
    @scala.inline
    def withUseVectorBasemaps(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useVectorBasemaps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseVectorBasemaps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useVectorBasemaps")(js.undefined)
        ret
    }
    @scala.inline
    def withUser(value: PortalUserProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUser: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user")(js.undefined)
        ret
    }
    @scala.inline
    def withVectorBasemapGalleryGroupQuery(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vectorBasemapGalleryGroupQuery")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVectorBasemapGalleryGroupQuery: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vectorBasemapGalleryGroupQuery")(js.undefined)
        ret
    }
  }
  
}

