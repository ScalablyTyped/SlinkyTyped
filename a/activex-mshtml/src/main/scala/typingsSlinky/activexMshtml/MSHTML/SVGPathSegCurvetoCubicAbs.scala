package typingsSlinky.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SVGPathSegCurvetoCubicAbs extends js.Object {
  @JSName("MSHTML.SVGPathSegCurvetoCubicAbs_typekey")
  var MSHTMLDotSVGPathSegCurvetoCubicAbs_typekey: SVGPathSegCurvetoCubicAbs = js.native
  var pathSegType: Double = js.native
  val pathSegTypeAsLetter: String = js.native
  var x: Double = js.native
  var x1: Double = js.native
  var x2: Double = js.native
  var y: Double = js.native
  var y1: Double = js.native
  var y2: Double = js.native
}

object SVGPathSegCurvetoCubicAbs {
  @scala.inline
  def apply(
    MSHTMLDotSVGPathSegCurvetoCubicAbs_typekey: SVGPathSegCurvetoCubicAbs,
    pathSegType: Double,
    pathSegTypeAsLetter: String,
    x: Double,
    x1: Double,
    x2: Double,
    y: Double,
    y1: Double,
    y2: Double
  ): SVGPathSegCurvetoCubicAbs = {
    val __obj = js.Dynamic.literal(pathSegType = pathSegType.asInstanceOf[js.Any], pathSegTypeAsLetter = pathSegTypeAsLetter.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], x1 = x1.asInstanceOf[js.Any], x2 = x2.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], y1 = y1.asInstanceOf[js.Any], y2 = y2.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.SVGPathSegCurvetoCubicAbs_typekey")(MSHTMLDotSVGPathSegCurvetoCubicAbs_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGPathSegCurvetoCubicAbs]
  }
  @scala.inline
  implicit class SVGPathSegCurvetoCubicAbsOps[Self <: SVGPathSegCurvetoCubicAbs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMSHTMLDotSVGPathSegCurvetoCubicAbs_typekey(value: SVGPathSegCurvetoCubicAbs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MSHTML.SVGPathSegCurvetoCubicAbs_typekey")(value.asInstanceOf[js.Any])
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
    def withY1(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y1")(value.asInstanceOf[js.Any])
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

