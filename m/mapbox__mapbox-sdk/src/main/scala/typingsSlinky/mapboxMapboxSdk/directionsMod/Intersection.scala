package typingsSlinky.mapboxMapboxSdk.directionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Intersection extends js.Object {
  /**
    * A list of bearing values (for example [0,90,180,270]) that are available at the intersection.
    * The bearings describe all available roads at the intersection.
    */
  var bearings: js.Array[Double] = js.native
  /**
    * An array of strings signifying the classes of the road exiting the intersection.
    */
  var classes: js.UndefOr[js.Array[DirectionsClass]] = js.native
  /**
    * A list of entry flags, corresponding in a 1:1 relationship to the bearings.
    * A value of true indicates that the respective road could be entered on a valid route.
    * false indicates that the turn onto the respective road would violate a restriction.
    */
  var entry: js.Array[Boolean] = js.native
  /**
    * Index into bearings/entry array. Used to calculate the bearing before the turn. Namely, the clockwise angle from true
    * north to the direction of travel before the maneuver/passing the intersection. To get the bearing in the direction of driving,
    * the bearing has to be rotated by a value of 180. The value is not supplied for departure maneuvers.
    */
  var in: js.UndefOr[Double] = js.native
  /**
    * Array of Lane objects that represent the available turn lanes at the intersection.
    * If no lane information is available for an intersection, the lanes property will not be present.
    */
  var lanes: js.Array[Lane] = js.native
  /**
    * A [longitude, latitude] pair describing the location of the turn.
    */
  var location: js.Array[Double] = js.native
  /**
    * Index into the bearings/entry array. Used to extract the bearing after the turn. Namely, The clockwise angle from true north to
    * the direction of travel after the maneuver/passing the intersection.
    * The value is not supplied for arrive maneuvers.
    */
  var out: js.UndefOr[Double] = js.native
}

object Intersection {
  @scala.inline
  def apply(
    bearings: js.Array[Double],
    entry: js.Array[Boolean],
    lanes: js.Array[Lane],
    location: js.Array[Double]
  ): Intersection = {
    val __obj = js.Dynamic.literal(bearings = bearings.asInstanceOf[js.Any], entry = entry.asInstanceOf[js.Any], lanes = lanes.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any])
    __obj.asInstanceOf[Intersection]
  }
  @scala.inline
  implicit class IntersectionOps[Self <: Intersection] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBearings(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bearings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEntry(value: js.Array[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entry")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLanes(value: js.Array[Lane]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lanes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLocation(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClasses(value: js.Array[DirectionsClass]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClasses: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classes")(js.undefined)
        ret
    }
    @scala.inline
    def withIn(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("in")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("in")(js.undefined)
        ret
    }
    @scala.inline
    def withOut(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("out")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOut: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("out")(js.undefined)
        ret
    }
  }
  
}

