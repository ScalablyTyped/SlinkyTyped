package typingsSlinky.googlemaps.google.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TransitMode extends js.Object

@JSGlobal("google.maps.TransitMode")
@js.native
object TransitMode extends js.Object {
  @js.native
  sealed trait BUS extends TransitMode
  
  @js.native
  sealed trait RAIL extends TransitMode
  
  @js.native
  sealed trait SUBWAY extends TransitMode
  
  @js.native
  sealed trait TRAIN extends TransitMode
  
  @js.native
  sealed trait TRAM extends TransitMode
  
  /* "BUS" */ val BUS: typingsSlinky.googlemaps.google.maps.TransitMode.BUS with String = js.native
  /* "RAIL" */ val RAIL: typingsSlinky.googlemaps.google.maps.TransitMode.RAIL with String = js.native
  /* "SUBWAY" */ val SUBWAY: typingsSlinky.googlemaps.google.maps.TransitMode.SUBWAY with String = js.native
  /* "TRAIN" */ val TRAIN: typingsSlinky.googlemaps.google.maps.TransitMode.TRAIN with String = js.native
  /* "TRAM" */ val TRAM: typingsSlinky.googlemaps.google.maps.TransitMode.TRAM with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[TransitMode with String] = js.native
}

