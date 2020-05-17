package typingsSlinky.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Arc2 extends js.Object {
  /**
    * Defines the angle of the arc (from mid point to end point).
    */
  var angle: Angle = js.native
  /**
    * Defines the center point of the arc.
    */
  var centerPoint: Vector2 = js.native
  /** Defines the end point of the arc */
  var endPoint: Vector2 = js.native
  /** Defines the mid point of the arc */
  var midPoint: Vector2 = js.native
  /**
    * Defines the orientation of the arc (clock wise/counter clock wise).
    */
  var orientation: Orientation = js.native
  /**
    * Defines the radius of the arc.
    */
  var radius: Double = js.native
  /**
    * Defines the start angle of the arc (from start point to middle point).
    */
  var startAngle: Angle = js.native
  /** Defines the start point of the arc */
  var startPoint: Vector2 = js.native
}

object Arc2 {
  @scala.inline
  def apply(
    angle: Angle,
    centerPoint: Vector2,
    endPoint: Vector2,
    midPoint: Vector2,
    orientation: Orientation,
    radius: Double,
    startAngle: Angle,
    startPoint: Vector2
  ): Arc2 = {
    val __obj = js.Dynamic.literal(angle = angle.asInstanceOf[js.Any], centerPoint = centerPoint.asInstanceOf[js.Any], endPoint = endPoint.asInstanceOf[js.Any], midPoint = midPoint.asInstanceOf[js.Any], orientation = orientation.asInstanceOf[js.Any], radius = radius.asInstanceOf[js.Any], startAngle = startAngle.asInstanceOf[js.Any], startPoint = startPoint.asInstanceOf[js.Any])
    __obj.asInstanceOf[Arc2]
  }
  @scala.inline
  implicit class Arc2Ops[Self <: Arc2] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAngle(value: Angle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("angle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCenterPoint(value: Vector2): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("centerPoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEndPoint(value: Vector2): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endPoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMidPoint(value: Vector2): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("midPoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOrientation(value: Orientation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orientation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRadius(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radius")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartAngle(value: Angle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startAngle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartPoint(value: Vector2): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startPoint")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

