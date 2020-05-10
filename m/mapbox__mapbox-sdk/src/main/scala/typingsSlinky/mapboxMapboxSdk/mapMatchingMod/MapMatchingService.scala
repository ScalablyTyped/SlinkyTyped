package typingsSlinky.mapboxMapboxSdk.mapMatchingMod

import typingsSlinky.mapboxMapboxSdk.mapiRequestMod.MapiRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MapMatchingService extends js.Object {
  def getMatching(request: MapMatchingRequest): MapiRequest = js.native
}

object MapMatchingService {
  @scala.inline
  def apply(getMatching: MapMatchingRequest => MapiRequest): MapMatchingService = {
    val __obj = js.Dynamic.literal(getMatching = js.Any.fromFunction1(getMatching))
    __obj.asInstanceOf[MapMatchingService]
  }
  @scala.inline
  implicit class MapMatchingServiceOps[Self <: MapMatchingService] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetMatching(value: MapMatchingRequest => MapiRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMatching")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

