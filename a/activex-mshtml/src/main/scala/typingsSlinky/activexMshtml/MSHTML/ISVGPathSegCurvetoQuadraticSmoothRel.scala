package typingsSlinky.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISVGPathSegCurvetoQuadraticSmoothRel extends js.Object {
  @JSName("MSHTML.ISVGPathSegCurvetoQuadraticSmoothRel_typekey")
  var MSHTMLDotISVGPathSegCurvetoQuadraticSmoothRel_typekey: ISVGPathSegCurvetoQuadraticSmoothRel = js.native
  var x: Double = js.native
  var y: Double = js.native
}

object ISVGPathSegCurvetoQuadraticSmoothRel {
  @scala.inline
  def apply(
    MSHTMLDotISVGPathSegCurvetoQuadraticSmoothRel_typekey: ISVGPathSegCurvetoQuadraticSmoothRel,
    x: Double,
    y: Double
  ): ISVGPathSegCurvetoQuadraticSmoothRel = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.ISVGPathSegCurvetoQuadraticSmoothRel_typekey")(MSHTMLDotISVGPathSegCurvetoQuadraticSmoothRel_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISVGPathSegCurvetoQuadraticSmoothRel]
  }
  @scala.inline
  implicit class ISVGPathSegCurvetoQuadraticSmoothRelOps[Self <: ISVGPathSegCurvetoQuadraticSmoothRel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMSHTMLDotISVGPathSegCurvetoQuadraticSmoothRel_typekey(value: ISVGPathSegCurvetoQuadraticSmoothRel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MSHTML.ISVGPathSegCurvetoQuadraticSmoothRel_typekey")(value.asInstanceOf[js.Any])
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

