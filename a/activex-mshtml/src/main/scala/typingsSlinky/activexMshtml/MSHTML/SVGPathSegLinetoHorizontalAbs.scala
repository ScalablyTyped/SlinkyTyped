package typingsSlinky.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SVGPathSegLinetoHorizontalAbs extends js.Object {
  @JSName("MSHTML.SVGPathSegLinetoHorizontalAbs_typekey")
  var MSHTMLDotSVGPathSegLinetoHorizontalAbs_typekey: SVGPathSegLinetoHorizontalAbs = js.native
  var pathSegType: Double = js.native
  val pathSegTypeAsLetter: String = js.native
  var x: Double = js.native
}

object SVGPathSegLinetoHorizontalAbs {
  @scala.inline
  def apply(
    MSHTMLDotSVGPathSegLinetoHorizontalAbs_typekey: SVGPathSegLinetoHorizontalAbs,
    pathSegType: Double,
    pathSegTypeAsLetter: String,
    x: Double
  ): SVGPathSegLinetoHorizontalAbs = {
    val __obj = js.Dynamic.literal(pathSegType = pathSegType.asInstanceOf[js.Any], pathSegTypeAsLetter = pathSegTypeAsLetter.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.SVGPathSegLinetoHorizontalAbs_typekey")(MSHTMLDotSVGPathSegLinetoHorizontalAbs_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGPathSegLinetoHorizontalAbs]
  }
  @scala.inline
  implicit class SVGPathSegLinetoHorizontalAbsOps[Self <: SVGPathSegLinetoHorizontalAbs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMSHTMLDotSVGPathSegLinetoHorizontalAbs_typekey(value: SVGPathSegLinetoHorizontalAbs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MSHTML.SVGPathSegLinetoHorizontalAbs_typekey")(value.asInstanceOf[js.Any])
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
  }
  
}

