package typingsSlinky.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISVGPathSegCurvetoCubicSmoothAbs extends js.Object {
  @JSName("MSHTML.ISVGPathSegCurvetoCubicSmoothAbs_typekey")
  var MSHTMLDotISVGPathSegCurvetoCubicSmoothAbs_typekey: ISVGPathSegCurvetoCubicSmoothAbs = js.native
  var x: Double = js.native
  var x2: Double = js.native
  var y: Double = js.native
  var y2: Double = js.native
}

object ISVGPathSegCurvetoCubicSmoothAbs {
  @scala.inline
  def apply(
    MSHTMLDotISVGPathSegCurvetoCubicSmoothAbs_typekey: ISVGPathSegCurvetoCubicSmoothAbs,
    x: Double,
    x2: Double,
    y: Double,
    y2: Double
  ): ISVGPathSegCurvetoCubicSmoothAbs = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], x2 = x2.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], y2 = y2.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.ISVGPathSegCurvetoCubicSmoothAbs_typekey")(MSHTMLDotISVGPathSegCurvetoCubicSmoothAbs_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISVGPathSegCurvetoCubicSmoothAbs]
  }
  @scala.inline
  implicit class ISVGPathSegCurvetoCubicSmoothAbsOps[Self <: ISVGPathSegCurvetoCubicSmoothAbs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMSHTMLDotISVGPathSegCurvetoCubicSmoothAbs_typekey(value: ISVGPathSegCurvetoCubicSmoothAbs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MSHTML.ISVGPathSegCurvetoCubicSmoothAbs_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withX2(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withY2(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y2")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

