package typingsSlinky.googleapis.jobsV2Mod.jobsV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Input only.  Parameters needed for commute search.
  */
@js.native
trait SchemaCommutePreference extends js.Object {
  /**
    * Optional. If `true`, jobs without street level addresses may also be
    * returned. For city level addresses, the city center is used. For state
    * and coarser level addresses, text matching is used. If this field is set
    * to `false` or is not specified, only jobs that include street level
    * addresses will be returned by commute search.
    */
  var allowNonStreetLevelAddress: js.UndefOr[Boolean] = js.native
  /**
    * Optional.  The departure hour to use to calculate traffic impact. Accepts
    * an integer between 0 and 23, representing the hour in the time zone of
    * the start_location. Must not be present if road_traffic is specified.
    */
  var departureHourLocal: js.UndefOr[Double] = js.native
  /**
    * Required.  The method of transportation for which to calculate the
    * commute time.
    */
  var method: js.UndefOr[String] = js.native
  /**
    * Optional.  Specifies the traffic density to use when calculating commute
    * time. Must not be present if departure_hour_local is specified.
    */
  var roadTraffic: js.UndefOr[String] = js.native
  /**
    * Required.  The latitude and longitude of the location from which to
    * calculate the commute time.
    */
  var startLocation: js.UndefOr[SchemaLatLng] = js.native
  /**
    * Required.  The maximum travel time in seconds. The maximum allowed value
    * is `3600s` (one hour). Format is `123s`.
    */
  var travelTime: js.UndefOr[String] = js.native
}

object SchemaCommutePreference {
  @scala.inline
  def apply(): SchemaCommutePreference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCommutePreference]
  }
  @scala.inline
  implicit class SchemaCommutePreferenceOps[Self <: SchemaCommutePreference] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowNonStreetLevelAddress(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowNonStreetLevelAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowNonStreetLevelAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowNonStreetLevelAddress")(js.undefined)
        ret
    }
    @scala.inline
    def withDepartureHourLocal(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("departureHourLocal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDepartureHourLocal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("departureHourLocal")(js.undefined)
        ret
    }
    @scala.inline
    def withMethod(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("method")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMethod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("method")(js.undefined)
        ret
    }
    @scala.inline
    def withRoadTraffic(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roadTraffic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoadTraffic: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roadTraffic")(js.undefined)
        ret
    }
    @scala.inline
    def withStartLocation(value: SchemaLatLng): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startLocation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startLocation")(js.undefined)
        ret
    }
    @scala.inline
    def withTravelTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("travelTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTravelTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("travelTime")(js.undefined)
        ret
    }
  }
  
}

