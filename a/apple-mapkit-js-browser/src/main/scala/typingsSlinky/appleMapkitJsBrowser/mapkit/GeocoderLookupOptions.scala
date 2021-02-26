package typingsSlinky.appleMapkitJsBrowser.mapkit

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options that constrain geocoder lookup results to a specific area or set a
  * language for results.
  */
@js.native
trait GeocoderLookupOptions extends StObject {
  
  /**
    * Coordinates used to constrain the lookup results.
    */
  var coordinate: js.UndefOr[Coordinate] = js.native
  
  /**
    * The language in which to display the lookup results.
    */
  var language: js.UndefOr[String] = js.native
  
  /**
    * A list of countries in which to constrain the lookup results.
    */
  var limitToCountries: js.UndefOr[String] = js.native
  
  /**
    * A region in which to constrain lookup results.
    */
  var region: js.UndefOr[CoordinateRegion] = js.native
}
object GeocoderLookupOptions {
  
  @scala.inline
  def apply(): GeocoderLookupOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GeocoderLookupOptions]
  }
  
  @scala.inline
  implicit class GeocoderLookupOptionsMutableBuilder[Self <: GeocoderLookupOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCoordinate(value: Coordinate): Self = StObject.set(x, "coordinate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCoordinateUndefined: Self = StObject.set(x, "coordinate", js.undefined)
    
    @scala.inline
    def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    @scala.inline
    def setLimitToCountries(value: String): Self = StObject.set(x, "limitToCountries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitToCountriesUndefined: Self = StObject.set(x, "limitToCountries", js.undefined)
    
    @scala.inline
    def setRegion(value: CoordinateRegion): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
  }
}
