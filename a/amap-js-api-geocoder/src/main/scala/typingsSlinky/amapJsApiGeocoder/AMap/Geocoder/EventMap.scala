package typingsSlinky.amapJsApiGeocoder.AMap.Geocoder

import typingsSlinky.amapJsApi.AMap.Event_
import typingsSlinky.amapJsApiGeocoder.AnonInfo
import typingsSlinky.amapJsApiGeocoder.amapJsApiGeocoderStrings.complete
import typingsSlinky.amapJsApiGeocoder.amapJsApiGeocoderStrings.error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventMap extends js.Object {
  var complete: Event_[
    typingsSlinky.amapJsApiGeocoder.amapJsApiGeocoderStrings.complete, 
    GeocodeResult | js.Object | ReGeocodeResult | BatchReGeocodeResult
  ]
  var error: Event_[typingsSlinky.amapJsApiGeocoder.amapJsApiGeocoderStrings.error, AnonInfo]
}

object EventMap {
  @scala.inline
  def apply(
    complete: Event_[complete, GeocodeResult | js.Object | ReGeocodeResult | BatchReGeocodeResult],
    error: Event_[error, AnonInfo]
  ): EventMap = {
    val __obj = js.Dynamic.literal(complete = complete.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[EventMap]
  }
}

