package typingsSlinky.googleMaps.mod

import typingsSlinky.googleMaps.googleMapsStrings.alt_ids
import typingsSlinky.googleMaps.googleMapsStrings.formatted_address
import typingsSlinky.googleMaps.googleMapsStrings.geometry
import typingsSlinky.googleMaps.googleMapsStrings.icon
import typingsSlinky.googleMaps.googleMapsStrings.name
import typingsSlinky.googleMaps.googleMapsStrings.opening_hours
import typingsSlinky.googleMaps.googleMapsStrings.permanently_closed
import typingsSlinky.googleMaps.googleMapsStrings.phonenumber
import typingsSlinky.googleMaps.googleMapsStrings.photos
import typingsSlinky.googleMaps.googleMapsStrings.place_id
import typingsSlinky.googleMaps.googleMapsStrings.plus_code
import typingsSlinky.googleMaps.googleMapsStrings.price_level
import typingsSlinky.googleMaps.googleMapsStrings.rating
import typingsSlinky.googleMaps.googleMapsStrings.scope
import typingsSlinky.googleMaps.googleMapsStrings.textquery
import typingsSlinky.googleMaps.googleMapsStrings.types
import typingsSlinky.googleMaps.googleMapsStrings.vicinity
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FindPlaceRequest extends StObject {
  
  /**
    * The fields specifying the types of place data to return.
    *
    * **Note:** If you omit the fields parameter from a Find Place request, only the place_id for the result will be returned.
    */
  var fields: js.UndefOr[
    js.Array[
      icon | geometry | plus_code | name | opening_hours | photos | place_id | scope | alt_ids | price_level | rating | types | vicinity | formatted_address | permanently_closed
    ]
  ] = js.native
  
  /** The text input specifying which place to search for (for example, a name, address, or phone number). */
  var input: String = js.native
  
  /** The type of input. This can be one of either `textquery` or `phonenumber`. */
  var inputtype: textquery | phonenumber = js.native
  
  /**
    * The language code, indicating in which language the results should be returned, if possible.
    * Searches are also biased to the selected language; results in the selected language may be given a higher ranking
    */
  var language: js.UndefOr[Language] = js.native
  
  /**
    * Prefer results in a specified area, by specifying either a radius plus lat/lng, or two lat/lng pairs representing
    * the points of a rectangle. If this parameter is not specified, the API uses IP address biasing by default.
    */
  var locationbias: js.UndefOr[String] = js.native
}
object FindPlaceRequest {
  
  @scala.inline
  def apply(input: String, inputtype: textquery | phonenumber): FindPlaceRequest = {
    val __obj = js.Dynamic.literal(input = input.asInstanceOf[js.Any], inputtype = inputtype.asInstanceOf[js.Any])
    __obj.asInstanceOf[FindPlaceRequest]
  }
  
  @scala.inline
  implicit class FindPlaceRequestMutableBuilder[Self <: FindPlaceRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFields(
      value: js.Array[
          icon | geometry | plus_code | name | opening_hours | photos | place_id | scope | alt_ids | price_level | rating | types | vicinity | formatted_address | permanently_closed
        ]
    ): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    @scala.inline
    def setFieldsVarargs(
      value: (icon | geometry | plus_code | name | opening_hours | photos | place_id | scope | alt_ids | price_level | rating | types | vicinity | formatted_address | permanently_closed)*
    ): Self = StObject.set(x, "fields", js.Array(value :_*))
    
    @scala.inline
    def setInput(value: String): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputtype(value: textquery | phonenumber): Self = StObject.set(x, "inputtype", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguage(value: Language): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    @scala.inline
    def setLocationbias(value: String): Self = StObject.set(x, "locationbias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationbiasUndefined: Self = StObject.set(x, "locationbias", js.undefined)
  }
}
