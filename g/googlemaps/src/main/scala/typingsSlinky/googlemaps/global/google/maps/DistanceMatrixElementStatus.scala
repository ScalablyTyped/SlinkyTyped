package typingsSlinky.googlemaps.global.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The element-level status about a particular origin-destination pairing returned by the
  * {@link DistanceMatrixService} upon completion of a distance matrix request.
  * @see {@link https://developers.google.com/maps/documentation/javascript/reference/distance-matrix#DistanceMatrixElementStatus Maps JavaScript API}
  */
@JSGlobal("google.maps.DistanceMatrixElementStatus")
@js.native
object DistanceMatrixElementStatus extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typingsSlinky.googlemaps.google.maps.DistanceMatrixElementStatus with String] = js.native
  
  /* "NOT_FOUND" */ val NOT_FOUND: typingsSlinky.googlemaps.google.maps.DistanceMatrixElementStatus.NOT_FOUND with String = js.native
  
  /* "OK" */ val OK: typingsSlinky.googlemaps.google.maps.DistanceMatrixElementStatus.OK with String = js.native
  
  /* "ZERO_RESULTS" */ val ZERO_RESULTS: typingsSlinky.googlemaps.google.maps.DistanceMatrixElementStatus.ZERO_RESULTS with String = js.native
}
