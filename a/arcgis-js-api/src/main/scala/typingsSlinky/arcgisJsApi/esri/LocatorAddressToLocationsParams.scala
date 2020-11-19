package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.std.Object
import typingsSlinky.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LocatorAddressToLocationsParams extends Object {
  
  /**
    * The address argument is data object that contains properties representing the various address fields accepted by the corresponding geocode service. These fields are listed in the addressFields property of the associated geocode service resource. For example, if the *addressFields* of a geocode service resource includes fields with the following names: Street, City, State and Zone, then the address argument is of the form:
    * ```js
    * {
    *   Street: "1234 W Main St",
    *   City: "Small Town",
    *   State: "WA",
    *   Zone: "99027"
    * }
    * ```
    *
    * Locators published using ArcGIS 10 or later support a single line address field, which
    * can be specified using the following syntax where field_name is the name of the single
    * line address field. You can find this name by viewing the help or services directory for
    * your locator services. Common values are *SingleLine* and *SingleLineFieldName*:
    *
    * ```js
    * var address = { "field_name": "380 New York St, Redlands, CA 92373" };
    * ```
    * The Services Directory can be used to find out the required and optional address fields
    * and the correct names for the input name fields. If you are using the World Geocoding Service
    * visit the ArcGIS Online Geocoding Service help for more details on the World Geocoder.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-Locator.html#addressToLocations)
    */
  var address: js.Any = js.native
  
  /**
    * Limit result to one or more categories. For example, "Populated Place" or "Scandinavian Food". Only applies to the World Geocode Service. See [Category filtering (World Geocoding Service)](https://developers.arcgis.com/rest/geocode/api-reference/geocoding-category-filtering.htm#ESRI_SECTION1_502B3FE2028145D7B189C25B1A00E17B) for more information.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-Locator.html#addressToLocations)
    */
  var categories: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Limit result to a specific country. For example, "US" for United States or "SE" for Sweden. Only applies to the World Geocode Service. See Geocode coverage (World Geocoding Service) for more information.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-Locator.html#addressToLocations)
    */
  var countryCode: js.UndefOr[String] = js.native
  
  /**
    * Allows the results of single geocode transactions to be persisted.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-Locator.html#addressToLocations)
    */
  var forStorage: js.UndefOr[Boolean] = js.native
  
  /**
    * Used to weight returned results for a specified area.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-Locator.html#addressToLocations)
    */
  var location: js.UndefOr[Point] = js.native
  
  /**
    * Define the type of location, either `"street"` or `"rooftop"`, of the point returned from the [World Geocoding Service](https://developers.arcgis.com/rest/geocode/api-reference/geocoding-category-filtering.htm).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-Locator.html#addressToLocations)
    */
  var locationType: js.UndefOr[String] = js.native
  
  /**
    * A `suggestLocations` result ID (magicKey). Used to query for a specific results information.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-Locator.html#addressToLocations)
    */
  var magicKey: js.UndefOr[String] = js.native
  
  /**
    * Maximum results to return from the query.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-Locator.html#addressToLocations)
    */
  var maxLocations: js.UndefOr[Double] = js.native
  
  /**
    * The list of fields included in the returned result set. This list is a comma delimited list of field names. If you specify the shape field in the list of return fields, it is ignored. For non-intersection addresses you can specify the candidate fields as defined in the geocode service. For intersection addresses you can specify the intersection candidate fields.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-Locator.html#addressToLocations)
    */
  var outFields: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Defines the extent within which the geocode server will search. Requires ArcGIS Server version 10.1 or greater.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-Locator.html#addressToLocations)
    */
  var searchExtent: js.UndefOr[Extent] = js.native
}
object LocatorAddressToLocationsParams {
  
  @scala.inline
  def apply(
    address: js.Any,
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): LocatorAddressToLocationsParams = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[LocatorAddressToLocationsParams]
  }
  
  @scala.inline
  implicit class LocatorAddressToLocationsParamsOps[Self <: LocatorAddressToLocationsParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAddress(value: js.Any): Self = this.set("address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCategoriesVarargs(value: String*): Self = this.set("categories", js.Array(value :_*))
    
    @scala.inline
    def setCategories(value: js.Array[String]): Self = this.set("categories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCategories: Self = this.set("categories", js.undefined)
    
    @scala.inline
    def setCountryCode(value: String): Self = this.set("countryCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCountryCode: Self = this.set("countryCode", js.undefined)
    
    @scala.inline
    def setForStorage(value: Boolean): Self = this.set("forStorage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForStorage: Self = this.set("forStorage", js.undefined)
    
    @scala.inline
    def setLocation(value: Point): Self = this.set("location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    
    @scala.inline
    def setLocationType(value: String): Self = this.set("locationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocationType: Self = this.set("locationType", js.undefined)
    
    @scala.inline
    def setMagicKey(value: String): Self = this.set("magicKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMagicKey: Self = this.set("magicKey", js.undefined)
    
    @scala.inline
    def setMaxLocations(value: Double): Self = this.set("maxLocations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxLocations: Self = this.set("maxLocations", js.undefined)
    
    @scala.inline
    def setOutFieldsVarargs(value: String*): Self = this.set("outFields", js.Array(value :_*))
    
    @scala.inline
    def setOutFields(value: js.Array[String]): Self = this.set("outFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutFields: Self = this.set("outFields", js.undefined)
    
    @scala.inline
    def setSearchExtent(value: Extent): Self = this.set("searchExtent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSearchExtent: Self = this.set("searchExtent", js.undefined)
  }
}
