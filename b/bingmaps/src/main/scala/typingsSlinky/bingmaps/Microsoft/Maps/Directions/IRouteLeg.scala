package typingsSlinky.bingmaps.Microsoft.Maps.Directions

import typingsSlinky.bingmaps.Microsoft.Maps.Location
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IRouteLeg extends js.Object {
  /** The end time of the route leg. This property only applies when the routeMode of the DirectionsRequestOptions is set to transit. */
  var endTime: js.Date = js.native
  /** The location of the last waypoint of this leg. */
  var endWaypointLocation: Location = js.native
  /** The directions steps associated with this route leg. */
  var itineraryItems: js.Array[IDirectionsStep] = js.native
  /** The index of the route to which this route leg belongs. */
  var originalRouteIndex: Double = js.native
  /** The start time of the route leg. This property only applies when the routeMode of the DirectionsRequestOptions is set to transit. */
  var startTime: js.Date = js.native
  /** The location of the first waypoint of this route leg. */
  var startWaypointLocation: Location = js.native
  /** The sub legs of this route leg. A sub leg of a route is the part of the route between a stop point and a via point or between two via points.*/
  var subLegs: js.Array[IRouteSubLeg] = js.native
  /** The summary which describes this route leg. */
  var summary: IRouteSummary = js.native
}

object IRouteLeg {
  @scala.inline
  def apply(
    endTime: js.Date,
    endWaypointLocation: Location,
    itineraryItems: js.Array[IDirectionsStep],
    originalRouteIndex: Double,
    startTime: js.Date,
    startWaypointLocation: Location,
    subLegs: js.Array[IRouteSubLeg],
    summary: IRouteSummary
  ): IRouteLeg = {
    val __obj = js.Dynamic.literal(endTime = endTime.asInstanceOf[js.Any], endWaypointLocation = endWaypointLocation.asInstanceOf[js.Any], itineraryItems = itineraryItems.asInstanceOf[js.Any], originalRouteIndex = originalRouteIndex.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any], startWaypointLocation = startWaypointLocation.asInstanceOf[js.Any], subLegs = subLegs.asInstanceOf[js.Any], summary = summary.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRouteLeg]
  }
  @scala.inline
  implicit class IRouteLegOps[Self <: IRouteLeg] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEndTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEndWaypointLocation(value: Location): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endWaypointLocation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItineraryItems(value: js.Array[IDirectionsStep]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itineraryItems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOriginalRouteIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originalRouteIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartWaypointLocation(value: Location): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startWaypointLocation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubLegs(value: js.Array[IRouteSubLeg]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subLegs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSummary(value: IRouteSummary): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("summary")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

