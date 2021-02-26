package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`avg-rating`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`num-comments`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`num-ratings`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`num-views`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.asc_
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.created
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.desc_
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.modified
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.owner
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.title
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.uploaded
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.username
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PortalQueryParams extends Accessor {
  
  /**
    * An array of categories stored within the item.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalQueryParams.html#categories)
    */
  var categories: js.Array[String | js.Array[String]] = js.native
  
  /**
    * Only relevant when querying for [PortalItems](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalQueryParams.html#extent)
    */
  var extent: Extent = js.native
  
  /**
    * The maximum number of results to be included in the [result](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalQueryResult.html#results) set response.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalQueryParams.html#num)
    */
  var num: Double = js.native
  
  /**
    * The query string used for the search.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalQueryParams.html#query)
    */
  var query: String = js.native
  
  /**
    * A comma-delimited list of fields to sort.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalQueryParams.html#sortField)
    */
  var sortField: title | uploaded | modified | username | created | typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`type` | owner | `avg-rating` | `num-ratings` | `num-comments` | `num-views` = js.native
  
  /**
    * The order in which to sort the results.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalQueryParams.html#sortOrder)
    */
  var sortOrder: asc_ | desc_ = js.native
  
  /**
    * The index of the first entry in the result set response.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalQueryParams.html#start)
    */
  var start: Double = js.native
}
