package typingsSlinky.gapiClientQpxexpress.gapi.client.qpxexpress

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LegInfo extends js.Object {
  /** The aircraft (or bus, ferry, railcar, etc) travelling between the two points of this leg. */
  var aircraft: js.UndefOr[String] = js.native
  /** The scheduled time of arrival at the destination of the leg, local to the point of arrival. */
  var arrivalTime: js.UndefOr[String] = js.native
  /** Whether you have to change planes following this leg. Only applies to the next leg. */
  var changePlane: js.UndefOr[Boolean] = js.native
  /** Duration of a connection following this leg, in minutes. */
  var connectionDuration: js.UndefOr[Double] = js.native
  /** The scheduled departure time of the leg, local to the point of departure. */
  var departureTime: js.UndefOr[String] = js.native
  /** The leg destination as a city and airport. */
  var destination: js.UndefOr[String] = js.native
  /** The terminal the flight is scheduled to arrive at. */
  var destinationTerminal: js.UndefOr[String] = js.native
  /** The scheduled travelling time from the origin to the destination. */
  var duration: js.UndefOr[Double] = js.native
  /** An identifier that uniquely identifies this leg in the solution. */
  var id: js.UndefOr[String] = js.native
  /**
    * Identifies this as a leg object. A leg is the smallest unit of travel, in the case of a flight a takeoff immediately followed by a landing at two set
    * points on a particular carrier with a particular flight number. Value: the fixed string qpxexpress#legInfo.
    */
  var kind: js.UndefOr[String] = js.native
  /** A simple, general description of the meal(s) served on the flight, for example: "Hot meal". */
  var meal: js.UndefOr[String] = js.native
  /** The number of miles in this leg. */
  var mileage: js.UndefOr[Double] = js.native
  /** In percent, the published on time performance on this leg. */
  var onTimePerformance: js.UndefOr[Double] = js.native
  /**
    * Department of Transportation disclosure information on the actual operator of a flight in a code share. (A code share refers to a marketing agreement
    * between two carriers, where one carrier will list in its schedules (and take bookings for) flights that are actually operated by another carrier.)
    */
  var operatingDisclosure: js.UndefOr[String] = js.native
  /** The leg origin as a city and airport. */
  var origin: js.UndefOr[String] = js.native
  /** The terminal the flight is scheduled to depart from. */
  var originTerminal: js.UndefOr[String] = js.native
  /** Whether passenger information must be furnished to the United States Transportation Security Administration (TSA) prior to departure. */
  var secure: js.UndefOr[Boolean] = js.native
}

object LegInfo {
  @scala.inline
  def apply(): LegInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LegInfo]
  }
  @scala.inline
  implicit class LegInfoOps[Self <: LegInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAircraft(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aircraft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAircraft: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aircraft")(js.undefined)
        ret
    }
    @scala.inline
    def withArrivalTime(value: String): Self = {
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
    def withChangePlane(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changePlane")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChangePlane: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changePlane")(js.undefined)
        ret
    }
    @scala.inline
    def withConnectionDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectionDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnectionDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectionDuration")(js.undefined)
        ret
    }
    @scala.inline
    def withDepartureTime(value: String): Self = {
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
    def withDestination(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destination")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDestination: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destination")(js.undefined)
        ret
    }
    @scala.inline
    def withDestinationTerminal(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destinationTerminal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDestinationTerminal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destinationTerminal")(js.undefined)
        ret
    }
    @scala.inline
    def withDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
    @scala.inline
    def withMeal(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("meal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMeal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("meal")(js.undefined)
        ret
    }
    @scala.inline
    def withMileage(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mileage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMileage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mileage")(js.undefined)
        ret
    }
    @scala.inline
    def withOnTimePerformance(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTimePerformance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnTimePerformance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTimePerformance")(js.undefined)
        ret
    }
    @scala.inline
    def withOperatingDisclosure(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operatingDisclosure")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOperatingDisclosure: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operatingDisclosure")(js.undefined)
        ret
    }
    @scala.inline
    def withOrigin(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("origin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrigin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("origin")(js.undefined)
        ret
    }
    @scala.inline
    def withOriginTerminal(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originTerminal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOriginTerminal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originTerminal")(js.undefined)
        ret
    }
    @scala.inline
    def withSecure(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secure")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecure: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secure")(js.undefined)
        ret
    }
  }
  
}

