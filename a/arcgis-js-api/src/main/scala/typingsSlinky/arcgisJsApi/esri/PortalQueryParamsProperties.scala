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
trait PortalQueryParamsProperties extends StObject {
  
  /**
    * An array of categories stored within the item.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalQueryParams.html#categories)
    */
  var categories: js.UndefOr[js.Array[String | js.Array[String]]] = js.native
  
  /**
    * Only relevant when querying for [PortalItems](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalQueryParams.html#extent)
    */
  var extent: js.UndefOr[ExtentProperties] = js.native
  
  /**
    * The maximum number of results to be included in the [result](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalQueryResult.html#results) set response.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalQueryParams.html#num)
    */
  var num: js.UndefOr[Double] = js.native
  
  /**
    * The query string used for the search.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalQueryParams.html#query)
    */
  var query: js.UndefOr[String] = js.native
  
  /**
    * A comma-delimited list of fields to sort.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalQueryParams.html#sortField)
    */
  var sortField: js.UndefOr[
    title | uploaded | modified | username | created | typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`type` | owner | `avg-rating` | `num-ratings` | `num-comments` | `num-views`
  ] = js.native
  
  /**
    * The order in which to sort the results.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalQueryParams.html#sortOrder)
    */
  var sortOrder: js.UndefOr[asc_ | desc_] = js.native
  
  /**
    * The index of the first entry in the result set response.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalQueryParams.html#start)
    */
  var start: js.UndefOr[Double] = js.native
}
object PortalQueryParamsProperties {
  
  @scala.inline
  def apply(): PortalQueryParamsProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PortalQueryParamsProperties]
  }
  
  @scala.inline
  implicit class PortalQueryParamsPropertiesMutableBuilder[Self <: PortalQueryParamsProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCategories(value: js.Array[String | js.Array[String]]): Self = StObject.set(x, "categories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCategoriesUndefined: Self = StObject.set(x, "categories", js.undefined)
    
    @scala.inline
    def setCategoriesVarargs(value: (String | js.Array[String])*): Self = StObject.set(x, "categories", js.Array(value :_*))
    
    @scala.inline
    def setExtent(value: ExtentProperties): Self = StObject.set(x, "extent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtentUndefined: Self = StObject.set(x, "extent", js.undefined)
    
    @scala.inline
    def setNum(value: Double): Self = StObject.set(x, "num", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumUndefined: Self = StObject.set(x, "num", js.undefined)
    
    @scala.inline
    def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
    
    @scala.inline
    def setSortField(
      value: title | uploaded | modified | username | created | typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`type` | owner | `avg-rating` | `num-ratings` | `num-comments` | `num-views`
    ): Self = StObject.set(x, "sortField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortFieldUndefined: Self = StObject.set(x, "sortField", js.undefined)
    
    @scala.inline
    def setSortOrder(value: asc_ | desc_): Self = StObject.set(x, "sortOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortOrderUndefined: Self = StObject.set(x, "sortOrder", js.undefined)
    
    @scala.inline
    def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
  }
}
