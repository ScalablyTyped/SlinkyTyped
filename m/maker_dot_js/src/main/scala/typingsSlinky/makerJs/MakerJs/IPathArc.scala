package typingsSlinky.makerJs.MakerJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An arc path.
  *
  * Examples:
  * ```
  * var arc: IPathArc = { type: 'arc', origin: [0, 0], radius: 7, startAngle: 0, endAngle: 45 };   //typescript
  * var arc = { type: 'arc', origin: [0, 0], radius: 7, startAngle: 0, endAngle: 45 };   //javascript
  * ```
  */
@js.native
trait IPathArc extends IPathCircle {
  /**
    * The angle (in degrees) to end drawing the arc, in polar (counter-clockwise) direction. May be less than start angle if it past 360.
    */
  var endAngle: Double = js.native
  /**
    * The angle (in degrees) to begin drawing the arc, in polar (counter-clockwise) direction.
    */
  var startAngle: Double = js.native
}

object IPathArc {
  @scala.inline
  def apply(endAngle: Double, origin: IPoint, radius: Double, startAngle: Double, `type`: String): IPathArc = {
    val __obj = js.Dynamic.literal(endAngle = endAngle.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any], radius = radius.asInstanceOf[js.Any], startAngle = startAngle.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPathArc]
  }
  @scala.inline
  implicit class IPathArcOps[Self <: IPathArc] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEndAngle(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endAngle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartAngle(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startAngle")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

