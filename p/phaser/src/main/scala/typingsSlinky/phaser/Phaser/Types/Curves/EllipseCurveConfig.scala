package typingsSlinky.phaser.Phaser.Types.Curves

import typingsSlinky.phaser.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EllipseCurveConfig extends js.Object {
  /**
    * Sets if the the ellipse rotation is clockwise (true) or anti-clockwise (false)
    */
  var clockwise: js.UndefOr[Boolean] = js.native
  /**
    * The end angle of the ellipse, in degrees.
    */
  var endAngle: js.UndefOr[integer] = js.native
  /**
    * The rotation of the ellipse, in degrees.
    */
  var rotation: js.UndefOr[integer] = js.native
  /**
    * The start angle of the ellipse, in degrees.
    */
  var startAngle: js.UndefOr[integer] = js.native
  /**
    * The x coordinate of the ellipse.
    */
  var x: js.UndefOr[Double] = js.native
  /**
    * The horizontal radius of the ellipse.
    */
  var xRadius: js.UndefOr[Double] = js.native
  /**
    * The y coordinate of the ellipse.
    */
  var y: js.UndefOr[Double] = js.native
  /**
    * The vertical radius of the ellipse.
    */
  var yRadius: js.UndefOr[Double] = js.native
}

object EllipseCurveConfig {
  @scala.inline
  def apply(): EllipseCurveConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EllipseCurveConfig]
  }
  @scala.inline
  implicit class EllipseCurveConfigOps[Self <: EllipseCurveConfig] (val x: Self) extends AnyVal {
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
    def withoutClockwise: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clockwise")(js.undefined)
        ret
    }
    @scala.inline
    def withEndAngle(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endAngle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndAngle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endAngle")(js.undefined)
        ret
    }
    @scala.inline
    def withRotation(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRotation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotation")(js.undefined)
        ret
    }
    @scala.inline
    def withStartAngle(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startAngle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartAngle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startAngle")(js.undefined)
        ret
    }
    @scala.inline
    def withX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x")(js.undefined)
        ret
    }
    @scala.inline
    def withXRadius(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xRadius")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXRadius: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xRadius")(js.undefined)
        ret
    }
    @scala.inline
    def withY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y")(js.undefined)
        ret
    }
    @scala.inline
    def withYRadius(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yRadius")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYRadius: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yRadius")(js.undefined)
        ret
    }
  }
  
}

