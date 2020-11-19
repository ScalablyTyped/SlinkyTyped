package typingsSlinky.googlemaps.global.google.maps

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.HTMLDivElement
import org.scalajs.dom.raw.HTMLInputElement
import typingsSlinky.googlemaps.google.maps.places.AutocompleteOptions
import typingsSlinky.googlemaps.google.maps.places.SearchBoxOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("google.maps.places")
@js.native
object places extends js.Object {
  
  @js.native
  class Autocomplete protected ()
    extends typingsSlinky.googlemaps.google.maps.places.Autocomplete {
    def this(inputField: HTMLInputElement) = this()
    def this(inputField: HTMLInputElement, opts: AutocompleteOptions) = this()
  }
  
  @js.native
  class AutocompleteService ()
    extends typingsSlinky.googlemaps.google.maps.places.AutocompleteService
  
  @js.native
  class AutocompleteSessionToken ()
    extends typingsSlinky.googlemaps.google.maps.places.AutocompleteSessionToken
  
  @js.native
  class PlacesService protected ()
    extends typingsSlinky.googlemaps.google.maps.places.PlacesService {
    def this(attrContainer: typingsSlinky.googlemaps.google.maps.Map[Element]) = this()
    def this(attrContainer: HTMLDivElement) = this()
  }
  
  @js.native
  object PlacesServiceStatus extends js.Object {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsSlinky.googlemaps.google.maps.places.PlacesServiceStatus with String] = js.native
    
    /* "INVALID_REQUEST" */ val INVALID_REQUEST: typingsSlinky.googlemaps.google.maps.places.PlacesServiceStatus.INVALID_REQUEST with String = js.native
    
    /* "NOT_FOUND" */ val NOT_FOUND: typingsSlinky.googlemaps.google.maps.places.PlacesServiceStatus.NOT_FOUND with String = js.native
    
    /* "OK" */ val OK: typingsSlinky.googlemaps.google.maps.places.PlacesServiceStatus.OK with String = js.native
    
    /* "OVER_QUERY_LIMIT" */ val OVER_QUERY_LIMIT: typingsSlinky.googlemaps.google.maps.places.PlacesServiceStatus.OVER_QUERY_LIMIT with String = js.native
    
    /* "REQUEST_DENIED" */ val REQUEST_DENIED: typingsSlinky.googlemaps.google.maps.places.PlacesServiceStatus.REQUEST_DENIED with String = js.native
    
    /* "UNKNOWN_ERROR" */ val UNKNOWN_ERROR: typingsSlinky.googlemaps.google.maps.places.PlacesServiceStatus.UNKNOWN_ERROR with String = js.native
    
    /* "ZERO_RESULTS" */ val ZERO_RESULTS: typingsSlinky.googlemaps.google.maps.places.PlacesServiceStatus.ZERO_RESULTS with String = js.native
  }
  
  @js.native
  object RankBy extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.googlemaps.google.maps.places.RankBy with Double] = js.native
    
    /* 1 */ val DISTANCE: typingsSlinky.googlemaps.google.maps.places.RankBy.DISTANCE with Double = js.native
    
    /* 0 */ val PROMINENCE: typingsSlinky.googlemaps.google.maps.places.RankBy.PROMINENCE with Double = js.native
  }
  
  @js.native
  class SearchBox protected ()
    extends typingsSlinky.googlemaps.google.maps.places.SearchBox {
    def this(inputField: HTMLInputElement) = this()
    def this(inputField: HTMLInputElement, opts: SearchBoxOptions) = this()
  }
}
