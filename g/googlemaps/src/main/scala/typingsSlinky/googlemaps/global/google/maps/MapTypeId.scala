package typingsSlinky.googlemaps.global.google.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Identifiers for common MapTypes. Specify these by value, or by using the
  * constant's name. For example, 'satellite' or
  * google.maps.MapTypeId.SATELLITE.
  */
@JSGlobal("google.maps.MapTypeId")
@js.native
object MapTypeId extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typingsSlinky.googlemaps.google.maps.MapTypeId with String] = js.native
  
  /* "hybrid" */ val HYBRID: typingsSlinky.googlemaps.google.maps.MapTypeId.HYBRID with String = js.native
  
  /* "roadmap" */ val ROADMAP: typingsSlinky.googlemaps.google.maps.MapTypeId.ROADMAP with String = js.native
  
  /* "satellite" */ val SATELLITE: typingsSlinky.googlemaps.google.maps.MapTypeId.SATELLITE with String = js.native
  
  /* "terrain" */ val TERRAIN: typingsSlinky.googlemaps.google.maps.MapTypeId.TERRAIN with String = js.native
}
