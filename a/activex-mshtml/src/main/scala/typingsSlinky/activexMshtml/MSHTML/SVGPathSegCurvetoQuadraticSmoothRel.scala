package typingsSlinky.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SVGPathSegCurvetoQuadraticSmoothRel extends js.Object {
  @JSName("MSHTML.SVGPathSegCurvetoQuadraticSmoothRel_typekey")
  var MSHTMLDotSVGPathSegCurvetoQuadraticSmoothRel_typekey: SVGPathSegCurvetoQuadraticSmoothRel = js.native
  var pathSegType: Double = js.native
  val pathSegTypeAsLetter: String = js.native
  var x: Double = js.native
  var y: Double = js.native
}

object SVGPathSegCurvetoQuadraticSmoothRel {
  @scala.inline
  def apply(
    MSHTMLDotSVGPathSegCurvetoQuadraticSmoothRel_typekey: SVGPathSegCurvetoQuadraticSmoothRel,
    pathSegType: Double,
    pathSegTypeAsLetter: String,
    x: Double,
    y: Double
  ): SVGPathSegCurvetoQuadraticSmoothRel = {
    val __obj = js.Dynamic.literal(pathSegType = pathSegType.asInstanceOf[js.Any], pathSegTypeAsLetter = pathSegTypeAsLetter.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.SVGPathSegCurvetoQuadraticSmoothRel_typekey")(MSHTMLDotSVGPathSegCurvetoQuadraticSmoothRel_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGPathSegCurvetoQuadraticSmoothRel]
  }
  @scala.inline
  implicit class SVGPathSegCurvetoQuadraticSmoothRelOps[Self <: SVGPathSegCurvetoQuadraticSmoothRel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMSHTMLDotSVGPathSegCurvetoQuadraticSmoothRel_typekey(value: SVGPathSegCurvetoQuadraticSmoothRel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MSHTML.SVGPathSegCurvetoQuadraticSmoothRel_typekey")(value.asInstanceOf[js.Any])
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

