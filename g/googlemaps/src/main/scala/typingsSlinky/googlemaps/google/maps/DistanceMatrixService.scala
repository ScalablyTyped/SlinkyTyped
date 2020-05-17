package typingsSlinky.googlemaps.google.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DistanceMatrixService extends js.Object {
  def getDistanceMatrix(
    request: DistanceMatrixRequest,
    callback: js.Function2[/* response */ DistanceMatrixResponse, /* status */ DistanceMatrixStatus, Unit]
  ): Unit = js.native
}

object DistanceMatrixService {
  @scala.inline
  def apply(
    getDistanceMatrix: (DistanceMatrixRequest, js.Function2[/* response */ DistanceMatrixResponse, /* status */ DistanceMatrixStatus, Unit]) => Unit
  ): DistanceMatrixService = {
    val __obj = js.Dynamic.literal(getDistanceMatrix = js.Any.fromFunction2(getDistanceMatrix))
    __obj.asInstanceOf[DistanceMatrixService]
  }
  @scala.inline
  implicit class DistanceMatrixServiceOps[Self <: DistanceMatrixService] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetDistanceMatrix(
      value: (DistanceMatrixRequest, js.Function2[/* response */ DistanceMatrixResponse, /* status */ DistanceMatrixStatus, Unit]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDistanceMatrix")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

