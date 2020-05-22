package typingsSlinky.googlemaps.global.google.maps

import typingsSlinky.googlemaps.google.maps.GeocoderRequest
import typingsSlinky.googlemaps.google.maps.GeocoderResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/***** Services *****/
@JSGlobal("google.maps.Geocoder")
@js.native
class Geocoder ()
  extends typingsSlinky.googlemaps.google.maps.Geocoder {
  /* CompleteClass */
  override def geocode(
    request: GeocoderRequest,
    callback: js.Function2[
      /* results */ js.Array[GeocoderResult], 
      /* status */ typingsSlinky.googlemaps.google.maps.GeocoderStatus, 
      Unit
    ]
  ): Unit = js.native
}

