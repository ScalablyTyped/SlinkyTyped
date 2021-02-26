package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.std.Object
import typingsSlinky.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LocatorAddressesToLocationsParams extends Object {
  
  /**
    * The input addresses in the format supported by the geocode service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-Locator.html#addressesToLocations)
    */
  var addresses: js.Array[_] = js.native
  
  /**
    * Limit result to one or more categories.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-Locator.html#addressesToLocations)
    */
  var categories: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Limits the results to only search in the country provided.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-Locator.html#addressesToLocations)
    */
  var countryCode: js.UndefOr[String] = js.native
  
  /**
    * Define the type of location, either `"street"` or `"rooftop"`, of the point returned from the [World Geocoding Service](https://developers.arcgis.com/rest/geocode/api-reference/geocoding-category-filtering.htm).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-Locator.html#addressesToLocations)
    */
  var locationType: js.UndefOr[String] = js.native
}
object LocatorAddressesToLocationsParams {
  
  @scala.inline
  def apply(
    addresses: js.Array[_],
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): LocatorAddressesToLocationsParams = {
    val __obj = js.Dynamic.literal(addresses = addresses.asInstanceOf[js.Any], constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[LocatorAddressesToLocationsParams]
  }
  
  @scala.inline
  implicit class LocatorAddressesToLocationsParamsMutableBuilder[Self <: LocatorAddressesToLocationsParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddresses(value: js.Array[_]): Self = StObject.set(x, "addresses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddressesVarargs(value: js.Any*): Self = StObject.set(x, "addresses", js.Array(value :_*))
    
    @scala.inline
    def setCategories(value: js.Array[String]): Self = StObject.set(x, "categories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCategoriesUndefined: Self = StObject.set(x, "categories", js.undefined)
    
    @scala.inline
    def setCategoriesVarargs(value: String*): Self = StObject.set(x, "categories", js.Array(value :_*))
    
    @scala.inline
    def setCountryCode(value: String): Self = StObject.set(x, "countryCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountryCodeUndefined: Self = StObject.set(x, "countryCode", js.undefined)
    
    @scala.inline
    def setLocationType(value: String): Self = StObject.set(x, "locationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationTypeUndefined: Self = StObject.set(x, "locationType", js.undefined)
  }
}
