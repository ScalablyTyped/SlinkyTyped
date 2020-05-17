package typingsSlinky.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SVGPathSegCurvetoQuadraticRel extends js.Object {
  @JSName("MSHTML.SVGPathSegCurvetoQuadraticRel_typekey")
  var MSHTMLDotSVGPathSegCurvetoQuadraticRel_typekey: SVGPathSegCurvetoQuadraticRel = js.native
  var pathSegType: Double = js.native
  val pathSegTypeAsLetter: String = js.native
  var x: Double = js.native
  var x1: Double = js.native
  var y: Double = js.native
  var y1: Double = js.native
}

object SVGPathSegCurvetoQuadraticRel {
  @scala.inline
  def apply(
    MSHTMLDotSVGPathSegCurvetoQuadraticRel_typekey: SVGPathSegCurvetoQuadraticRel,
    pathSegType: Double,
    pathSegTypeAsLetter: String,
    x: Double,
    x1: Double,
    y: Double,
    y1: Double
  ): SVGPathSegCurvetoQuadraticRel = {
    val __obj = js.Dynamic.literal(pathSegType = pathSegType.asInstanceOf[js.Any], pathSegTypeAsLetter = pathSegTypeAsLetter.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], x1 = x1.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], y1 = y1.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.SVGPathSegCurvetoQuadraticRel_typekey")(MSHTMLDotSVGPathSegCurvetoQuadraticRel_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGPathSegCurvetoQuadraticRel]
  }
  @scala.inline
  implicit class SVGPathSegCurvetoQuadraticRelOps[Self <: SVGPathSegCurvetoQuadraticRel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMSHTMLDotSVGPathSegCurvetoQuadraticRel_typekey(value: SVGPathSegCurvetoQuadraticRel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MSHTML.SVGPathSegCurvetoQuadraticRel_typekey")(value.asInstanceOf[js.Any])
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
    def withX1(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withY1(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y1")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

