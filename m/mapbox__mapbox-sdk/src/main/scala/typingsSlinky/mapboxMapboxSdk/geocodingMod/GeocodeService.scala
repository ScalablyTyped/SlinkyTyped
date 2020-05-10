package typingsSlinky.mapboxMapboxSdk.geocodingMod

import typingsSlinky.mapboxMapboxSdk.mapiRequestMod.MapiRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GeocodeService extends js.Object {
  def forwardGeocode(request: GeocodeRequest): MapiRequest = js.native
  def reverseGeocode(request: GeocodeRequest): MapiRequest = js.native
}

object GeocodeService {
  @scala.inline
  def apply(forwardGeocode: GeocodeRequest => MapiRequest, reverseGeocode: GeocodeRequest => MapiRequest): GeocodeService = {
    val __obj = js.Dynamic.literal(forwardGeocode = js.Any.fromFunction1(forwardGeocode), reverseGeocode = js.Any.fromFunction1(reverseGeocode))
    __obj.asInstanceOf[GeocodeService]
  }
  @scala.inline
  implicit class GeocodeServiceOps[Self <: GeocodeService] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withForwardGeocode(value: GeocodeRequest => MapiRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forwardGeocode")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withReverseGeocode(value: GeocodeRequest => MapiRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reverseGeocode")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

