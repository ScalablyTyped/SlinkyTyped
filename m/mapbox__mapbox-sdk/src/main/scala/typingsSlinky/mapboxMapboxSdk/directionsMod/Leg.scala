package typingsSlinky.mapboxMapboxSdk.directionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Leg extends js.Object {
  /**
    * An annotations object that contains additional details about each line segment along the route geometry.
    * Each entry in an annotations field corresponds to a coordinate along the route geometry.
    */
  var annotation: js.Array[DirectionsAnnotation] = js.native
  /**
    * Number indicating the distance traveled in meters
    */
  var distance: Double = js.native
  /**
    * Number indicating the estimated travel time in seconds
    */
  var duration: Double = js.native
  /**
    * Depending on the steps parameter, either an Array of RouteStep objects (true, default) or an empty array (false)
    */
  var steps: js.Array[Step] = js.native
  /**
    * Depending on the summary parameter, either a String summarizing the route (true, default) or an empty String (false)
    */
  var summary: String = js.native
  var weight: Double = js.native
}

object Leg {
  @scala.inline
  def apply(
    annotation: js.Array[DirectionsAnnotation],
    distance: Double,
    duration: Double,
    steps: js.Array[Step],
    summary: String,
    weight: Double
  ): Leg = {
    val __obj = js.Dynamic.literal(annotation = annotation.asInstanceOf[js.Any], distance = distance.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], steps = steps.asInstanceOf[js.Any], summary = summary.asInstanceOf[js.Any], weight = weight.asInstanceOf[js.Any])
    __obj.asInstanceOf[Leg]
  }
  @scala.inline
  implicit class LegOps[Self <: Leg] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnnotation(value: js.Array[DirectionsAnnotation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("annotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDistance(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("distance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSteps(value: js.Array[Step]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("steps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSummary(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("summary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weight")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

