package typingsSlinky.mapboxMapboxSdk.directionsMod

import typingsSlinky.mapboxMapboxSdk.mapiRequestMod.MapiRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DirectionsService extends js.Object {
  def getDirections(request: DirectionsRequest): MapiRequest = js.native
}

object DirectionsService {
  @scala.inline
  def apply(getDirections: DirectionsRequest => MapiRequest): DirectionsService = {
    val __obj = js.Dynamic.literal(getDirections = js.Any.fromFunction1(getDirections))
    __obj.asInstanceOf[DirectionsService]
  }
  @scala.inline
  implicit class DirectionsServiceOps[Self <: DirectionsService] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetDirections(value: DirectionsRequest => MapiRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDirections")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

