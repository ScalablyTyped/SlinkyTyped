package typingsSlinky.googlemaps.google.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DistanceMatrixRequest extends js.Object {
  var avoidFerries: js.UndefOr[Boolean] = js.native
  var avoidHighways: js.UndefOr[Boolean] = js.native
  var avoidTolls: js.UndefOr[Boolean] = js.native
  var destinations: js.UndefOr[js.Array[LatLng | LatLngLiteral | Place | String]] = js.native
  var drivingOptions: js.UndefOr[DrivingOptions] = js.native
  var durationInTraffic: js.UndefOr[Boolean] = js.native
  var origins: js.UndefOr[js.Array[LatLng | LatLngLiteral | Place | String]] = js.native
  var region: js.UndefOr[String] = js.native
  var transitOptions: js.UndefOr[TransitOptions] = js.native
  var travelMode: js.UndefOr[TravelMode] = js.native
  var unitSystem: js.UndefOr[UnitSystem] = js.native
}

object DistanceMatrixRequest {
  @scala.inline
  def apply(): DistanceMatrixRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DistanceMatrixRequest]
  }
  @scala.inline
  implicit class DistanceMatrixRequestOps[Self <: DistanceMatrixRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAvoidFerries(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("avoidFerries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAvoidFerries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("avoidFerries")(js.undefined)
        ret
    }
    @scala.inline
    def withAvoidHighways(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("avoidHighways")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAvoidHighways: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("avoidHighways")(js.undefined)
        ret
    }
    @scala.inline
    def withAvoidTolls(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("avoidTolls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAvoidTolls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("avoidTolls")(js.undefined)
        ret
    }
    @scala.inline
    def withDestinations(value: js.Array[LatLng | LatLngLiteral | Place | String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destinations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDestinations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destinations")(js.undefined)
        ret
    }
    @scala.inline
    def withDrivingOptions(value: DrivingOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drivingOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDrivingOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drivingOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withDurationInTraffic(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("durationInTraffic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDurationInTraffic: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("durationInTraffic")(js.undefined)
        ret
    }
    @scala.inline
    def withOrigins(value: js.Array[LatLng | LatLngLiteral | Place | String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("origins")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrigins: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("origins")(js.undefined)
        ret
    }
    @scala.inline
    def withRegion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("region")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("region")(js.undefined)
        ret
    }
    @scala.inline
    def withTransitOptions(value: TransitOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransitOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withTravelMode(value: TravelMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("travelMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTravelMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("travelMode")(js.undefined)
        ret
    }
    @scala.inline
    def withUnitSystem(value: UnitSystem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unitSystem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnitSystem: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unitSystem")(js.undefined)
        ret
    }
  }
  
}

