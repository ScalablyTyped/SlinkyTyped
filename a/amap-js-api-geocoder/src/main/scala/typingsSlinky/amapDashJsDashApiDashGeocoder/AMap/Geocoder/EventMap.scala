package typingsSlinky.amapDashJsDashApiDashGeocoder.AMap.Geocoder

import typingsSlinky.amapDashJsDashApi.AMap.Event
import typingsSlinky.amapDashJsDashApiDashGeocoder.Anon_Info
import typingsSlinky.amapDashJsDashApiDashGeocoder.amapDashJsDashApiDashGeocoderStrings.complete
import typingsSlinky.amapDashJsDashApiDashGeocoder.amapDashJsDashApiDashGeocoderStrings.error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventMap extends js.Object {
  var complete: Event[
    typingsSlinky.amapDashJsDashApiDashGeocoder.amapDashJsDashApiDashGeocoderStrings.complete, 
    GeocodeResult | js.Object | ReGeocodeResult | BatchReGeocodeResult
  ]
  var error: Event[
    typingsSlinky.amapDashJsDashApiDashGeocoder.amapDashJsDashApiDashGeocoderStrings.error, 
    Anon_Info
  ]
}

object EventMap {
  @scala.inline
  def apply(
    complete: Event[complete, GeocodeResult | js.Object | ReGeocodeResult | BatchReGeocodeResult],
    error: Event[error, Anon_Info]
  ): EventMap = {
    val __obj = js.Dynamic.literal(complete = complete.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[EventMap]
  }
}

