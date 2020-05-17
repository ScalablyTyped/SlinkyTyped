package typingsSlinky.googlemaps.google.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ElevationService extends js.Object {
  def getElevationAlongPath(
    request: PathElevationRequest,
    callback: js.Function2[/* results */ js.Array[ElevationResult], /* status */ ElevationStatus, Unit]
  ): Unit = js.native
  def getElevationForLocations(
    request: LocationElevationRequest,
    callback: js.Function2[/* results */ js.Array[ElevationResult], /* status */ ElevationStatus, Unit]
  ): Unit = js.native
}

object ElevationService {
  @scala.inline
  def apply(
    getElevationAlongPath: (PathElevationRequest, js.Function2[/* results */ js.Array[ElevationResult], /* status */ ElevationStatus, Unit]) => Unit,
    getElevationForLocations: (LocationElevationRequest, js.Function2[/* results */ js.Array[ElevationResult], /* status */ ElevationStatus, Unit]) => Unit
  ): ElevationService = {
    val __obj = js.Dynamic.literal(getElevationAlongPath = js.Any.fromFunction2(getElevationAlongPath), getElevationForLocations = js.Any.fromFunction2(getElevationForLocations))
    __obj.asInstanceOf[ElevationService]
  }
  @scala.inline
  implicit class ElevationServiceOps[Self <: ElevationService] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetElevationAlongPath(
      value: (PathElevationRequest, js.Function2[/* results */ js.Array[ElevationResult], /* status */ ElevationStatus, Unit]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getElevationAlongPath")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGetElevationForLocations(
      value: (LocationElevationRequest, js.Function2[/* results */ js.Array[ElevationResult], /* status */ ElevationStatus, Unit]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getElevationForLocations")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

