package typingsSlinky.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SVGPathSegCurvetoQuadraticSmoothAbs extends js.Object {
  @JSName("MSHTML.SVGPathSegCurvetoQuadraticSmoothAbs_typekey")
  var MSHTMLDotSVGPathSegCurvetoQuadraticSmoothAbs_typekey: SVGPathSegCurvetoQuadraticSmoothAbs = js.native
  var pathSegType: Double = js.native
  val pathSegTypeAsLetter: String = js.native
  var x: Double = js.native
  var y: Double = js.native
}

object SVGPathSegCurvetoQuadraticSmoothAbs {
  @scala.inline
  def apply(
    MSHTMLDotSVGPathSegCurvetoQuadraticSmoothAbs_typekey: SVGPathSegCurvetoQuadraticSmoothAbs,
    pathSegType: Double,
    pathSegTypeAsLetter: String,
    x: Double,
    y: Double
  ): SVGPathSegCurvetoQuadraticSmoothAbs = {
    val __obj = js.Dynamic.literal(pathSegType = pathSegType.asInstanceOf[js.Any], pathSegTypeAsLetter = pathSegTypeAsLetter.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.SVGPathSegCurvetoQuadraticSmoothAbs_typekey")(MSHTMLDotSVGPathSegCurvetoQuadraticSmoothAbs_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGPathSegCurvetoQuadraticSmoothAbs]
  }
  @scala.inline
  implicit class SVGPathSegCurvetoQuadraticSmoothAbsOps[Self <: SVGPathSegCurvetoQuadraticSmoothAbs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMSHTMLDotSVGPathSegCurvetoQuadraticSmoothAbs_typekey(value: SVGPathSegCurvetoQuadraticSmoothAbs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MSHTML.SVGPathSegCurvetoQuadraticSmoothAbs_typekey")(value.asInstanceOf[js.Any])
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

