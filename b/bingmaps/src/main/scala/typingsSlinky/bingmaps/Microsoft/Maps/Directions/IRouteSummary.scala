package typingsSlinky.bingmaps.Microsoft.Maps.Directions

import typingsSlinky.bingmaps.Microsoft.Maps.Location
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IRouteSummary extends js.Object {
  /** The total travel distance of the route */
  var distance: Double = js.native
  /** The cost of the route. This property is only returned if the routeMode of the IDirectionsRequestOptions is set to transit and the map culture is set to ja-jp. */
  var monetaryCost: Double = js.native
  /** The location of the northeast corner of bounding box that defines the best map view of the route. */
  var northEast: Location = js.native
  /** The location of the southwest corner of bounding box that defines the best map view of the route. */
  var southWest: Location = js.native
  /** The total travel time, in seconds, for the route. */
  var time: Double = js.native
  /**
    * The total travel time, in seconds, taking into account traffic delays, for the route.
    * This property is 0 if the avoidTraffic property of the IDirectionsRequestOptions is set to false.
    */
  var timeWithTraffic: Double = js.native
}

object IRouteSummary {
  @scala.inline
  def apply(
    distance: Double,
    monetaryCost: Double,
    northEast: Location,
    southWest: Location,
    time: Double,
    timeWithTraffic: Double
  ): IRouteSummary = {
    val __obj = js.Dynamic.literal(distance = distance.asInstanceOf[js.Any], monetaryCost = monetaryCost.asInstanceOf[js.Any], northEast = northEast.asInstanceOf[js.Any], southWest = southWest.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], timeWithTraffic = timeWithTraffic.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRouteSummary]
  }
  @scala.inline
  implicit class IRouteSummaryOps[Self <: IRouteSummary] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDistance(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("distance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMonetaryCost(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("monetaryCost")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNorthEast(value: Location): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("northEast")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSouthWest(value: Location): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("southWest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("time")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimeWithTraffic(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeWithTraffic")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

