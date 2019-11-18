package typingsSlinky.googlemaps.google.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TravelMode extends js.Object

@JSGlobal("google.maps.TravelMode")
@js.native
object TravelMode extends js.Object {
  @js.native
  sealed trait BICYCLING extends TravelMode
  
  @js.native
  sealed trait DRIVING extends TravelMode
  
  @js.native
  sealed trait TRANSIT extends TravelMode
  
  @js.native
  sealed trait TWO_WHEELER extends TravelMode
  
  @js.native
  sealed trait WALKING extends TravelMode
  
  /* "BICYCLING" */ val BICYCLING: typingsSlinky.googlemaps.google.maps.TravelMode.BICYCLING with String = js.native
  /* "DRIVING" */ val DRIVING: typingsSlinky.googlemaps.google.maps.TravelMode.DRIVING with String = js.native
  /* "TRANSIT" */ val TRANSIT: typingsSlinky.googlemaps.google.maps.TravelMode.TRANSIT with String = js.native
  /* "TWO_WHEELER" */ val TWO_WHEELER: typingsSlinky.googlemaps.google.maps.TravelMode.TWO_WHEELER with String = js.native
  /* "WALKING" */ val WALKING: typingsSlinky.googlemaps.google.maps.TravelMode.WALKING with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[TravelMode with String] = js.native
}

