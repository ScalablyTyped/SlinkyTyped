package typingsSlinky.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SVGPathSegArcAbs extends js.Object {
  @JSName("MSHTML.SVGPathSegArcAbs_typekey")
  var MSHTMLDotSVGPathSegArcAbs_typekey: SVGPathSegArcAbs = js.native
  var angle: Double = js.native
  var largeArcFlag: Boolean = js.native
  var pathSegType: Double = js.native
  val pathSegTypeAsLetter: String = js.native
  var r1: Double = js.native
  var r2: Double = js.native
  var sweepFlag: Boolean = js.native
  var x: Double = js.native
  var y: Double = js.native
}

object SVGPathSegArcAbs {
  @scala.inline
  def apply(
    MSHTMLDotSVGPathSegArcAbs_typekey: SVGPathSegArcAbs,
    angle: Double,
    largeArcFlag: Boolean,
    pathSegType: Double,
    pathSegTypeAsLetter: String,
    r1: Double,
    r2: Double,
    sweepFlag: Boolean,
    x: Double,
    y: Double
  ): SVGPathSegArcAbs = {
    val __obj = js.Dynamic.literal(angle = angle.asInstanceOf[js.Any], largeArcFlag = largeArcFlag.asInstanceOf[js.Any], pathSegType = pathSegType.asInstanceOf[js.Any], pathSegTypeAsLetter = pathSegTypeAsLetter.asInstanceOf[js.Any], r1 = r1.asInstanceOf[js.Any], r2 = r2.asInstanceOf[js.Any], sweepFlag = sweepFlag.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.SVGPathSegArcAbs_typekey")(MSHTMLDotSVGPathSegArcAbs_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGPathSegArcAbs]
  }
  @scala.inline
  implicit class SVGPathSegArcAbsOps[Self <: SVGPathSegArcAbs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMSHTMLDotSVGPathSegArcAbs_typekey(value: SVGPathSegArcAbs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MSHTML.SVGPathSegArcAbs_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAngle(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("angle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLargeArcFlag(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("largeArcFlag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPathSegType(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pathSegType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPathSegTypeAsLetter(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pathSegTypeAsLetter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withR1(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("r1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withR2(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("r2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSweepFlag(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sweepFlag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

