package typingsSlinky.googlemaps.global.google.maps

import typingsSlinky.googlemaps.google.maps.ElevationResult
import typingsSlinky.googlemaps.google.maps.LocationElevationRequest
import typingsSlinky.googlemaps.google.maps.PathElevationRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("google.maps.ElevationService")
@js.native
class ElevationService ()
  extends typingsSlinky.googlemaps.google.maps.ElevationService {
  /* CompleteClass */
  override def getElevationAlongPath(
    request: PathElevationRequest,
    callback: js.Function2[
      /* results */ js.Array[ElevationResult], 
      /* status */ typingsSlinky.googlemaps.google.maps.ElevationStatus, 
      Unit
    ]
  ): Unit = js.native
  /* CompleteClass */
  override def getElevationForLocations(
    request: LocationElevationRequest,
    callback: js.Function2[
      /* results */ js.Array[ElevationResult], 
      /* status */ typingsSlinky.googlemaps.google.maps.ElevationStatus, 
      Unit
    ]
  ): Unit = js.native
}

