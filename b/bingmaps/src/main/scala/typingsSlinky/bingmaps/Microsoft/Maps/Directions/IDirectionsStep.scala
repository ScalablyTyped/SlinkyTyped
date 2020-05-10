package typingsSlinky.bingmaps.Microsoft.Maps.Directions

import typingsSlinky.bingmaps.Microsoft.Maps.Location
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDirectionsStep extends js.Object {
  /** The child direction items for this directions step. */
  var childItineraryItems: js.Array[IDirectionsStep] = js.native
  /** The location of the start of the direction. */
  var coordinate: Location = js.native
  /** The total distance of the step in the unit specified in the distanceUnit property of the DirectionsRequestOptions. */
  var distance: String = js.native
  /** The total time, in seconds, of the direction step. */
  var durationInSeconds: Double = js.native
  /** The HTML formatted route instruction associated with the step. */
  var formattedText: String = js.native
  /** A boolean indicating whether the maneuver image is a road shield image. */
  var isImageRoadShield: Boolean = js.native
  /** The type of maneuver being performed. */
  var maneuver: String = js.native
  /** An array of strings, where each string is a hint to help determine when to move to the next direction step. Not all direction steps have hints. */
  var postIntersectionHints: js.Array[String] = js.native
  /** An array of strings, where each string is a hint to help determine when you have arrived at this direction step. Not all direction steps have hints. */
  var preIntersectionHints: js.Array[String] = js.native
  /** The name of the transit stop where this step originates. */
  var startStopName: String = js.native
  /** The transit line associated with this step. */
  var transitLine: ITransitLine = js.native
  /** The URL of the image to use for transit direction steps. */
  var transitStepIcon: String = js.native
  /** The ID of the transit stop. */
  var transitStopId: String = js.native
  /** The name of the transit line end. */
  var transitTerminus: String = js.native
  /** An array of route warnings associated with this step. */
  var warnings: js.Array[IDirectionsStepWarning] = js.native
}

object IDirectionsStep {
  @scala.inline
  def apply(
    childItineraryItems: js.Array[IDirectionsStep],
    coordinate: Location,
    distance: String,
    durationInSeconds: Double,
    formattedText: String,
    isImageRoadShield: Boolean,
    maneuver: String,
    postIntersectionHints: js.Array[String],
    preIntersectionHints: js.Array[String],
    startStopName: String,
    transitLine: ITransitLine,
    transitStepIcon: String,
    transitStopId: String,
    transitTerminus: String,
    warnings: js.Array[IDirectionsStepWarning]
  ): IDirectionsStep = {
    val __obj = js.Dynamic.literal(childItineraryItems = childItineraryItems.asInstanceOf[js.Any], coordinate = coordinate.asInstanceOf[js.Any], distance = distance.asInstanceOf[js.Any], durationInSeconds = durationInSeconds.asInstanceOf[js.Any], formattedText = formattedText.asInstanceOf[js.Any], isImageRoadShield = isImageRoadShield.asInstanceOf[js.Any], maneuver = maneuver.asInstanceOf[js.Any], postIntersectionHints = postIntersectionHints.asInstanceOf[js.Any], preIntersectionHints = preIntersectionHints.asInstanceOf[js.Any], startStopName = startStopName.asInstanceOf[js.Any], transitLine = transitLine.asInstanceOf[js.Any], transitStepIcon = transitStepIcon.asInstanceOf[js.Any], transitStopId = transitStopId.asInstanceOf[js.Any], transitTerminus = transitTerminus.asInstanceOf[js.Any], warnings = warnings.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDirectionsStep]
  }
  @scala.inline
  implicit class IDirectionsStepOps[Self <: IDirectionsStep] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChildItineraryItems(value: js.Array[IDirectionsStep]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childItineraryItems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCoordinate(value: Location): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coordinate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDistance(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("distance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDurationInSeconds(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("durationInSeconds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFormattedText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formattedText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsImageRoadShield(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isImageRoadShield")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withManeuver(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maneuver")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPostIntersectionHints(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postIntersectionHints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPreIntersectionHints(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preIntersectionHints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartStopName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startStopName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransitLine(value: ITransitLine): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitLine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransitStepIcon(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitStepIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransitStopId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitStopId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransitTerminus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitTerminus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWarnings(value: js.Array[IDirectionsStepWarning]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("warnings")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

