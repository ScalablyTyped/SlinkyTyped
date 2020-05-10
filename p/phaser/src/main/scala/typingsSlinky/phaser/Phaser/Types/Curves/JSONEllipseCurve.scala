package typingsSlinky.phaser.Phaser.Types.Curves

import typingsSlinky.phaser.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JSONEllipseCurve extends js.Object {
  /**
    * Sets if the the ellipse rotation is clockwise (true) or anti-clockwise (false)
    */
  var clockwise: Boolean = js.native
  /**
    * The end angle of the ellipse, in degrees.
    */
  var endAngle: integer = js.native
  /**
    * The rotation of ellipse, in degrees.
    */
  var rotation: integer = js.native
  /**
    * The start angle of the ellipse, in degrees.
    */
  var startAngle: integer = js.native
  /**
    * The of the curve.
    */
  var `type`: String = js.native
  /**
    * The x coordinate of the ellipse.
    */
  var x: Double = js.native
  /**
    * The horizontal radius of ellipse.
    */
  var xRadius: Double = js.native
  /**
    * The y coordinate of the ellipse.
    */
  var y: Double = js.native
  /**
    * The vertical radius of ellipse.
    */
  var yRadius: Double = js.native
}

object JSONEllipseCurve {
  @scala.inline
  def apply(
    clockwise: Boolean,
    endAngle: integer,
    rotation: integer,
    startAngle: integer,
    `type`: String,
    x: Double,
    xRadius: Double,
    y: Double,
    yRadius: Double
  ): JSONEllipseCurve = {
    val __obj = js.Dynamic.literal(clockwise = clockwise.asInstanceOf[js.Any], endAngle = endAngle.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any], startAngle = startAngle.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], xRadius = xRadius.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], yRadius = yRadius.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSONEllipseCurve]
  }
  @scala.inline
  implicit class JSONEllipseCurveOps[Self <: JSONEllipseCurve] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClockwise(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clockwise")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEndAngle(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endAngle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRotation(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartAngle(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startAngle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withXRadius(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xRadius")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withYRadius(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yRadius")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

