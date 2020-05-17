package typingsSlinky.activexLibreoffice.com_.sun.star.drawing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A {@link LineDash} defines a non-continuous line. */
@js.native
trait LineDash extends js.Object {
  /** This is the length of a single dash. */
  var DashLen: Double = js.native
  /** This is the number of dashes. */
  var Dashes: Double = js.native
  /** This is the distance between the dots. */
  var Distance: Double = js.native
  /** This is the length of a dot. */
  var DotLen: Double = js.native
  /** This is the number of dots in this {@link LineDash} . */
  var Dots: Double = js.native
  /** This sets the style of this {@link LineDash} . */
  var Style: DashStyle = js.native
}

object LineDash {
  @scala.inline
  def apply(DashLen: Double, Dashes: Double, Distance: Double, DotLen: Double, Dots: Double, Style: DashStyle): LineDash = {
    val __obj = js.Dynamic.literal(DashLen = DashLen.asInstanceOf[js.Any], Dashes = Dashes.asInstanceOf[js.Any], Distance = Distance.asInstanceOf[js.Any], DotLen = DotLen.asInstanceOf[js.Any], Dots = Dots.asInstanceOf[js.Any], Style = Style.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineDash]
  }
  @scala.inline
  implicit class LineDashOps[Self <: LineDash] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDashLen(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DashLen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDashes(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Dashes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDistance(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Distance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDotLen(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DotLen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDots(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Dots")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStyle(value: DashStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Style")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

