package typingsSlinky.googlemaps.google.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransitOptions extends js.Object {
  var arrivalTime: js.UndefOr[js.Date] = js.native
  var departureTime: js.UndefOr[js.Date] = js.native
  var modes: js.UndefOr[js.Array[TransitMode]] = js.native
  var routingPreference: js.UndefOr[TransitRoutePreference] = js.native
}

object TransitOptions {
  @scala.inline
  def apply(): TransitOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransitOptions]
  }
  @scala.inline
  implicit class TransitOptionsOps[Self <: TransitOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArrivalTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrivalTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArrivalTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrivalTime")(js.undefined)
        ret
    }
    @scala.inline
    def withDepartureTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("departureTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDepartureTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("departureTime")(js.undefined)
        ret
    }
    @scala.inline
    def withModes(value: js.Array[TransitMode]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modes")(js.undefined)
        ret
    }
    @scala.inline
    def withRoutingPreference(value: TransitRoutePreference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("routingPreference")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoutingPreference: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("routingPreference")(js.undefined)
        ret
    }
  }
  
}

