package typingsSlinky.googlemaps.google.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransitOptions extends js.Object {
  var arrivalTime: js.UndefOr[js.Date] = js.undefined
  var departureTime: js.UndefOr[js.Date] = js.undefined
  var modes: js.UndefOr[js.Array[TransitMode]] = js.undefined
  var routingPreference: js.UndefOr[TransitRoutePreference] = js.undefined
}

object TransitOptions {
  @scala.inline
  def apply(
    arrivalTime: js.Date = null,
    departureTime: js.Date = null,
    modes: js.Array[TransitMode] = null,
    routingPreference: TransitRoutePreference = null
  ): TransitOptions = {
    val __obj = js.Dynamic.literal()
    if (arrivalTime != null) __obj.updateDynamic("arrivalTime")(arrivalTime.asInstanceOf[js.Any])
    if (departureTime != null) __obj.updateDynamic("departureTime")(departureTime.asInstanceOf[js.Any])
    if (modes != null) __obj.updateDynamic("modes")(modes.asInstanceOf[js.Any])
    if (routingPreference != null) __obj.updateDynamic("routingPreference")(routingPreference.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransitOptions]
  }
}

