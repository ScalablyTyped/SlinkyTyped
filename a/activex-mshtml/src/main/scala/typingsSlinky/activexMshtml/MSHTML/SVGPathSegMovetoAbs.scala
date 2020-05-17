package typingsSlinky.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SVGPathSegMovetoAbs extends js.Object {
  @JSName("MSHTML.SVGPathSegMovetoAbs_typekey")
  var MSHTMLDotSVGPathSegMovetoAbs_typekey: SVGPathSegMovetoAbs = js.native
  var pathSegType: Double = js.native
  val pathSegTypeAsLetter: String = js.native
  var x: Double = js.native
  var y: Double = js.native
}

object SVGPathSegMovetoAbs {
  @scala.inline
  def apply(
    MSHTMLDotSVGPathSegMovetoAbs_typekey: SVGPathSegMovetoAbs,
    pathSegType: Double,
    pathSegTypeAsLetter: String,
    x: Double,
    y: Double
  ): SVGPathSegMovetoAbs = {
    val __obj = js.Dynamic.literal(pathSegType = pathSegType.asInstanceOf[js.Any], pathSegTypeAsLetter = pathSegTypeAsLetter.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.SVGPathSegMovetoAbs_typekey")(MSHTMLDotSVGPathSegMovetoAbs_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGPathSegMovetoAbs]
  }
  @scala.inline
  implicit class SVGPathSegMovetoAbsOps[Self <: SVGPathSegMovetoAbs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMSHTMLDotSVGPathSegMovetoAbs_typekey(value: SVGPathSegMovetoAbs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MSHTML.SVGPathSegMovetoAbs_typekey")(value.asInstanceOf[js.Any])
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

