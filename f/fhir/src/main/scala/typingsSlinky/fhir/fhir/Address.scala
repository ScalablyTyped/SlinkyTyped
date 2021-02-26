package typingsSlinky.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An address expressed using postal conventions (as opposed to GPS or other location definition formats)
  */
@js.native
trait Address extends Element {
  
  /**
    * Contains extended information for property 'city'.
    */
  var _city: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'country'.
    */
  var _country: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'district'.
    */
  var _district: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'line'.
    */
  var _line: js.UndefOr[js.Array[Element]] = js.native
  
  /**
    * Contains extended information for property 'postalCode'.
    */
  var _postalCode: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'state'.
    */
  var _state: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'text'.
    */
  var _text: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'type'.
    */
  var _type: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'use'.
    */
  var _use: js.UndefOr[Element] = js.native
  
  /**
    * Name of city, town etc.
    */
  var city: js.UndefOr[String] = js.native
  
  /**
    * Country (e.g. can be ISO 3166 2 or 3 letter code)
    */
  var country: js.UndefOr[String] = js.native
  
  /**
    * District name (aka county)
    */
  var district: js.UndefOr[String] = js.native
  
  /**
    * Street name, number, direction & P.O. Box etc.
    */
  var line: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Time period when address was/is in use
    */
  var period: js.UndefOr[Period] = js.native
  
  /**
    * Postal code for area
    */
  var postalCode: js.UndefOr[String] = js.native
  
  /**
    * Sub-unit of country (abbreviations ok)
    */
  var state: js.UndefOr[String] = js.native
  
  /**
    * Text representation of the address
    */
  var text: js.UndefOr[String] = js.native
  
  /**
    * postal | physical | both
    */
  var `type`: js.UndefOr[code] = js.native
  
  /**
    * home | work | temp | old - purpose of this address
    */
  var use: js.UndefOr[code] = js.native
}
object Address {
  
  @scala.inline
  def apply(): Address = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Address]
  }
  
  @scala.inline
  implicit class AddressMutableBuilder[Self <: Address] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCity(value: String): Self = StObject.set(x, "city", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCityUndefined: Self = StObject.set(x, "city", js.undefined)
    
    @scala.inline
    def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountryUndefined: Self = StObject.set(x, "country", js.undefined)
    
    @scala.inline
    def setDistrict(value: String): Self = StObject.set(x, "district", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDistrictUndefined: Self = StObject.set(x, "district", js.undefined)
    
    @scala.inline
    def setLine(value: js.Array[String]): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
    
    @scala.inline
    def setLineVarargs(value: String*): Self = StObject.set(x, "line", js.Array(value :_*))
    
    @scala.inline
    def setPeriod(value: Period): Self = StObject.set(x, "period", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPeriodUndefined: Self = StObject.set(x, "period", js.undefined)
    
    @scala.inline
    def setPostalCode(value: String): Self = StObject.set(x, "postalCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPostalCodeUndefined: Self = StObject.set(x, "postalCode", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    @scala.inline
    def setType(value: code): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setUse(value: code): Self = StObject.set(x, "use", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseUndefined: Self = StObject.set(x, "use", js.undefined)
    
    @scala.inline
    def set_city(value: Element): Self = StObject.set(x, "_city", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_cityUndefined: Self = StObject.set(x, "_city", js.undefined)
    
    @scala.inline
    def set_country(value: Element): Self = StObject.set(x, "_country", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_countryUndefined: Self = StObject.set(x, "_country", js.undefined)
    
    @scala.inline
    def set_district(value: Element): Self = StObject.set(x, "_district", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_districtUndefined: Self = StObject.set(x, "_district", js.undefined)
    
    @scala.inline
    def set_line(value: js.Array[Element]): Self = StObject.set(x, "_line", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_lineUndefined: Self = StObject.set(x, "_line", js.undefined)
    
    @scala.inline
    def set_lineVarargs(value: Element*): Self = StObject.set(x, "_line", js.Array(value :_*))
    
    @scala.inline
    def set_postalCode(value: Element): Self = StObject.set(x, "_postalCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_postalCodeUndefined: Self = StObject.set(x, "_postalCode", js.undefined)
    
    @scala.inline
    def set_state(value: Element): Self = StObject.set(x, "_state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_stateUndefined: Self = StObject.set(x, "_state", js.undefined)
    
    @scala.inline
    def set_text(value: Element): Self = StObject.set(x, "_text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_textUndefined: Self = StObject.set(x, "_text", js.undefined)
    
    @scala.inline
    def set_type(value: Element): Self = StObject.set(x, "_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_typeUndefined: Self = StObject.set(x, "_type", js.undefined)
    
    @scala.inline
    def set_use(value: Element): Self = StObject.set(x, "_use", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_useUndefined: Self = StObject.set(x, "_use", js.undefined)
  }
}
