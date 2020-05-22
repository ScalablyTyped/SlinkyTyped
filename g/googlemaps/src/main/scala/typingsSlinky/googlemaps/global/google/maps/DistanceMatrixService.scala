package typingsSlinky.googlemaps.global.google.maps

import typingsSlinky.googlemaps.google.maps.DistanceMatrixRequest
import typingsSlinky.googlemaps.google.maps.DistanceMatrixResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("google.maps.DistanceMatrixService")
@js.native
class DistanceMatrixService ()
  extends typingsSlinky.googlemaps.google.maps.DistanceMatrixService {
  /* CompleteClass */
  override def getDistanceMatrix(
    request: DistanceMatrixRequest,
    callback: js.Function2[
      /* response */ DistanceMatrixResponse, 
      /* status */ typingsSlinky.googlemaps.google.maps.DistanceMatrixStatus, 
      Unit
    ]
  ): Unit = js.native
}

