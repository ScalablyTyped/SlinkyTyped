package typingsSlinky.arcgisJsApi.esri

import org.scalajs.dom.raw.Blob
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`array-buffer`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`null`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`private`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.admin
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.blob
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.document
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.json
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.org_
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.public
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.shared
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.text
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.update
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.xml
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PortalItem
  extends Accessor
     with Loadable
     with JSONSupport {
  
  /**
    * Indicates the level of access to this item: `private`, `shared`, `org`, or `public`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html#access)
    */
  var access: `private` | shared | org_ | public = js.native
  
  /**
    * Information on the source of the item and its copyright status.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html#accessInformation)
    */
  var accessInformation: String = js.native
  
  /**
    * Adds a rating to an accessible item.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html#addRating)
    */
  def addRating(rating: Double): js.Promise[PortalRating] = js.native
  def addRating(rating: PortalRating): js.Promise[PortalRating] = js.native
  
  /**
    * Adds a new [resource](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItemResource.html) to the portal item.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html#addResource)
    */
  def addResource(resource: PortalItemResource, content: Blob): js.Promise[_] = js.native
  def addResource(resource: PortalItemResource, content: Blob, options: PortalItemAddResourceOptions): js.Promise[_] = js.native
  
  /**
    * Contains an array of objects containing proxy information for premium platform services.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html#applicationProxies)
    */
  val applicationProxies: js.Array[PortalItemApplicationProxies] = js.native
  
  /**
    * Average rating.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html#avgRating)
    */
  var avgRating: Double = js.native
  
  /**
    * An array of organization categories that are set on the item.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html#categories)
    */
  var categories: js.Array[String] = js.native
  
  /**
    * The date the item was created.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html#created)
    */
  var created: js.Date = js.native
  
  /**
    * The item's locale information (language and country).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html#culture)
    */
  var culture: String = js.native
  
  /**
    * Deletes a rating for the specified item.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html#deleteRating)
    */
  def deleteRating(): js.Promise[_] = js.native
  
  /**
    * The detailed description of the item.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html#description)
    */
  var description: String = js.native
  
  /**
    * The geographic extent, or bounding rectangle, of the item.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html#extent)
    */
  var extent: Extent = js.native
  
  /**
    * Requests a PortalItem in the format specified in `responseType`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html#fetchData)
    */
  def fetchData(): js.Promise[_] = js.native
  def fetchData(responseType: js.UndefOr[scala.Nothing], options: PortalItemFetchDataOptions): js.Promise[_] = js.native
  @JSName("fetchData")
  def fetchData_arraybuffer(responseType: `array-buffer`): js.Promise[_] = js.native
  @JSName("fetchData")
  def fetchData_arraybuffer(responseType: `array-buffer`, options: PortalItemFetchDataOptions): js.Promise[_] = js.native
  @JSName("fetchData")
  def fetchData_blob(responseType: blob): js.Promise[_] = js.native
  @JSName("fetchData")
  def fetchData_blob(responseType: blob, options: PortalItemFetchDataOptions): js.Promise[_] = js.native
  @JSName("fetchData")
  def fetchData_document(responseType: document): js.Promise[_] = js.native
  @JSName("fetchData")
  def fetchData_document(responseType: document, options: PortalItemFetchDataOptions): js.Promise[_] = js.native
  @JSName("fetchData")
  def fetchData_json(responseType: json): js.Promise[_] = js.native
  @JSName("fetchData")
  def fetchData_json(responseType: json, options: PortalItemFetchDataOptions): js.Promise[_] = js.native
  @JSName("fetchData")
  def fetchData_text(responseType: text): js.Promise[_] = js.native
  @JSName("fetchData")
  def fetchData_text(responseType: text, options: PortalItemFetchDataOptions): js.Promise[_] = js.native
  @JSName("fetchData")
  def fetchData_xml(responseType: xml): js.Promise[_] = js.native
  @JSName("fetchData")
  def fetchData_xml(responseType: xml, options: PortalItemFetchDataOptions): js.Promise[_] = js.native
  
  /**
    * Returns the rating (if any) given to the item.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html#fetchRating)
    */
  def fetchRating(): js.Promise[PortalRating] = js.native
  def fetchRating(options: PortalItemFetchRatingOptions): js.Promise[PortalRating] = js.native
  
  /**
    * Gets all the related items of a certain relationship type for the portal item.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html#fetchRelatedItems)
    */
  def fetchRelatedItems(params: PortalItemFetchRelatedItemsParams): js.Promise[js.Array[PortalItem]] = js.native
  def fetchRelatedItems(params: PortalItemFetchRelatedItemsParams, options: PortalItemFetchRelatedItemsOptions): js.Promise[js.Array[PortalItem]] = js.native
  
  /**
    * Retrieves references to all the [portal item resources](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItemResource.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html#fetchResources)
    */
  def fetchResources(): FetchResourcesResult = js.native
  def fetchResources(params: js.UndefOr[scala.Nothing], options: PortalItemFetchResourcesOptions): FetchResourcesResult = js.native
  def fetchResources(params: FetchResourcesParams): FetchResourcesResult = js.native
  def fetchResources(params: FetchResourcesParams, options: PortalItemFetchResourcesOptions): FetchResourcesResult = js.native
  
  /**
    * Get the URL to the thumbnail image for the item.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html#getThumbnailUrl)
    */
  def getThumbnailUrl(): String = js.native
  def getThumbnailUrl(width: Double): String = js.native
  
  /**
    * An array of group categories set on the item.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html#groupCategories)
    */
  var groupCategories: js.Array[String] = js.native
  
  /**
    * The unique id for the item.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html#id)
    */
  var id: String = js.native
  
  /**
    * Indicates whether a layer can be created from this item using [Layer.fromPortalItem()](esri-layers-Layer.html#fromPortalItem).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html#isLayer)
    */
  val isLayer: Boolean = js.native
  
  /**
    * Indicates whether an item can be updated and deleted.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html#itemControl)
    */
  val itemControl: admin | update | `null` = js.native
  
  /**
    * The URL to the item.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html#itemUrl)
    */
  val itemUrl: String = js.native
  
  /**
    * Information on license or restrictions related to the item.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html#licenseInfo)
    */
  var licenseInfo: String = js.native
  
  /**
    * Indicates whether the item's resources have loaded from the portal.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html#loaded)
    */
  val loaded: Boolean = js.native
  
  /**
    * The date the item was last modified.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html#modified)
    */
  var modified: js.Date = js.native
  
  /**
    * The name of the item.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html#name)
    */
  var name: String = js.native
  
  /**
    * Number of comments on the item.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html#numComments)
    */
  var numComments: Double = js.native
  
  /**
    * Number of ratings on the item.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html#numRatings)
    */
  var numRatings: Double = js.native
  
  /**
    * Number of views on the item.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html#numViews)
    */
  var numViews: Double = js.native
  
  /**
    * The username of the user who owns this item.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html#owner)
    */
  var owner: String = js.native
  
  /**
    * The ID of the folder in which the owner has stored the item.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html#ownerFolder)
    */
  var ownerFolder: String = js.native
  
  /**
    * The portal that contains the item.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html#portal)
    */
  var portal: Portal = js.native
  
  /**
    * Removes all the [resources](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItemResource.html) from the portal item.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html#removeAllResources)
    */
  def removeAllResources(): js.Promise[_] = js.native
  def removeAllResources(options: PortalItemRemoveAllResourcesOptions): js.Promise[_] = js.native
  
  /**
    * Removes a [resource](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItemResource.html) from the portal item.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html#removeResource)
    */
  def removeResource(resource: PortalItemResource): js.Promise[_] = js.native
  def removeResource(resource: PortalItemResource, options: PortalItemRemoveResourceOptions): js.Promise[_] = js.native
  
  /**
    * An array of string URLs.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html#screenshots)
    */
  var screenshots: js.Array[String] = js.native
  
  /**
    * The size of the item (in bytes).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html#size)
    */
  var size: Double = js.native
  
  /**
    * A summary description of the item.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html#snippet)
    */
  var snippet: String = js.native
  
  /**
    * The JSON used to create the property values when the `PortalItem` is loaded.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html#sourceJSON)
    */
  var sourceJSON: js.Any = js.native
  
  /**
    * User defined tags that describe the item.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html#tags)
    */
  var tags: js.Array[String] = js.native
  
  /**
    * The URL to the thumbnail used for the item.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html#thumbnailUrl)
    */
  val thumbnailUrl: String = js.native
  
  /**
    * The title for the item.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html#title)
    */
  var title: String = js.native
  
  /**
    * The GIS content type of this item.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html#type)
    */
  var `type`: String = js.native
  
  /**
    * Type keywords that describe the type of content of this item.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html#typeKeywords)
    */
  var typeKeywords: js.Array[String] = js.native
  
  /**
    * Updates the item's properties to the portal, and optionally its data.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html#update)
    */
  def update(): js.Promise[PortalItem] = js.native
  def update(params: PortalItemUpdateParams): js.Promise[PortalItem] = js.native
  
  /**
    * Updates the item's thumbnail on the portal.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html#updateThumbnail)
    */
  def updateThumbnail(params: PortalItemUpdateThumbnailParams): js.Promise[PortalItem] = js.native
  
  /**
    * The service URL of this item.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html#url)
    */
  var url: String = js.native
}
