package typingsSlinky.googleapis.v3p1beta1Mod.jobsV3p1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Input only.  Parameters needed for commute search.
  */
@js.native
trait SchemaCommuteFilter extends js.Object {
  /**
    * Optional. If `true`, jobs without street level addresses may also be
    * returned. For city level addresses, the city center is used. For state
    * and coarser level addresses, text matching is used. If this field is set
    * to `false` or is not specified, only jobs that include street level
    * addresses will be returned by commute search.
    */
  var allowImpreciseAddresses: js.UndefOr[Boolean] = js.native
  /**
    * Required.  The method of transportation for which to calculate the
    * commute time.
    */
  var commuteMethod: js.UndefOr[String] = js.native
  /**
    * Optional.  The departure time used to calculate traffic impact,
    * represented as google.type.TimeOfDay in local time zone.  Currently
    * traffic model is restricted to hour level resolution.
    */
  var departureTime: js.UndefOr[SchemaTimeOfDay] = js.native
  /**
    * Optional.  Specifies the traffic density to use when calculating commute
    * time.
    */
  var roadTraffic: js.UndefOr[String] = js.native
  /**
    * Required.  The latitude and longitude of the location from which to
    * calculate the commute time.
    */
  var startCoordinates: js.UndefOr[SchemaLatLng] = js.native
  /**
    * Required.  The maximum travel time in seconds. The maximum allowed value
    * is `3600s` (one hour). Format is `123s`.
    */
  var travelDuration: js.UndefOr[String] = js.native
}

object SchemaCommuteFilter {
  @scala.inline
  def apply(): SchemaCommuteFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCommuteFilter]
  }
  @scala.inline
  implicit class SchemaCommuteFilterOps[Self <: SchemaCommuteFilter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowImpreciseAddresses(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowImpreciseAddresses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowImpreciseAddresses: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowImpreciseAddresses")(js.undefined)
        ret
    }
    @scala.inline
    def withCommuteMethod(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commuteMethod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCommuteMethod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commuteMethod")(js.undefined)
        ret
    }
    @scala.inline
    def withDepartureTime(value: SchemaTimeOfDay): Self = {
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
    def withStartCoordinates(value: SchemaLatLng): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startCoordinates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartCoordinates: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startCoordinates")(js.undefined)
        ret
    }
    @scala.inline
    def withTravelDuration(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("travelDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTravelDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("travelDuration")(js.undefined)
        ret
    }
  }
  
}

