package typingsSlinky.amapJsApiGeocoder.AMap.Geocoder

import typingsSlinky.amapJsApi.AMap.Event_
import typingsSlinky.amapJsApiGeocoder.amapJsApiGeocoderStrings.complete
import typingsSlinky.amapJsApiGeocoder.amapJsApiGeocoderStrings.error
import typingsSlinky.amapJsApiGeocoder.anon.Info
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventMap extends js.Object {
  var complete: Event_[
    typingsSlinky.amapJsApiGeocoder.amapJsApiGeocoderStrings.complete, 
    GeocodeResult | js.Object | ReGeocodeResult | BatchReGeocodeResult
  ] = js.native
  var error: Event_[typingsSlinky.amapJsApiGeocoder.amapJsApiGeocoderStrings.error, Info] = js.native
}

object EventMap {
  @scala.inline
  def apply(
    complete: Event_[complete, GeocodeResult | js.Object | ReGeocodeResult | BatchReGeocodeResult],
    error: Event_[error, Info]
  ): EventMap = {
    val __obj = js.Dynamic.literal(complete = complete.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventMap]
  }
  @scala.inline
  implicit class EventMapOps[Self <: EventMap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComplete(value: Event_[complete, GeocodeResult | js.Object | ReGeocodeResult | BatchReGeocodeResult]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("complete")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withError(value: Event_[error, Info]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

