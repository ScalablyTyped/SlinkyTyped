package typingsSlinky.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISVGPathSegCurvetoQuadraticRel extends js.Object {
  @JSName("MSHTML.ISVGPathSegCurvetoQuadraticRel_typekey")
  var MSHTMLDotISVGPathSegCurvetoQuadraticRel_typekey: ISVGPathSegCurvetoQuadraticRel = js.native
  var x: Double = js.native
  var x1: Double = js.native
  var y: Double = js.native
  var y1: Double = js.native
}

object ISVGPathSegCurvetoQuadraticRel {
  @scala.inline
  def apply(
    MSHTMLDotISVGPathSegCurvetoQuadraticRel_typekey: ISVGPathSegCurvetoQuadraticRel,
    x: Double,
    x1: Double,
    y: Double,
    y1: Double
  ): ISVGPathSegCurvetoQuadraticRel = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], x1 = x1.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], y1 = y1.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.ISVGPathSegCurvetoQuadraticRel_typekey")(MSHTMLDotISVGPathSegCurvetoQuadraticRel_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISVGPathSegCurvetoQuadraticRel]
  }
  @scala.inline
  implicit class ISVGPathSegCurvetoQuadraticRelOps[Self <: ISVGPathSegCurvetoQuadraticRel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMSHTMLDotISVGPathSegCurvetoQuadraticRel_typekey(value: ISVGPathSegCurvetoQuadraticRel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MSHTML.ISVGPathSegCurvetoQuadraticRel_typekey")(value.asInstanceOf[js.Any])
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

