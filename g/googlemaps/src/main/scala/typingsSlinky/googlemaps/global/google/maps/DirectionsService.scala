package typingsSlinky.googlemaps.global.google.maps

import typingsSlinky.googlemaps.google.maps.DirectionsRequest
import typingsSlinky.googlemaps.google.maps.DirectionsResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("google.maps.DirectionsService")
@js.native
class DirectionsService ()
  extends typingsSlinky.googlemaps.google.maps.DirectionsService {
  /* CompleteClass */
  override def route(
    request: DirectionsRequest,
    callback: js.Function2[
      /* result */ DirectionsResult, 
      /* status */ typingsSlinky.googlemaps.google.maps.DirectionsStatus, 
      Unit
    ]
  ): Unit = js.native
}

