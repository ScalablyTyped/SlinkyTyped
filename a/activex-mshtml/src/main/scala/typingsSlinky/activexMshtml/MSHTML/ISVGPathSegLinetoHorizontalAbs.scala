package typingsSlinky.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISVGPathSegLinetoHorizontalAbs extends js.Object {
  @JSName("MSHTML.ISVGPathSegLinetoHorizontalAbs_typekey")
  var MSHTMLDotISVGPathSegLinetoHorizontalAbs_typekey: ISVGPathSegLinetoHorizontalAbs = js.native
  var x: Double = js.native
}

object ISVGPathSegLinetoHorizontalAbs {
  @scala.inline
  def apply(MSHTMLDotISVGPathSegLinetoHorizontalAbs_typekey: ISVGPathSegLinetoHorizontalAbs, x: Double): ISVGPathSegLinetoHorizontalAbs = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.ISVGPathSegLinetoHorizontalAbs_typekey")(MSHTMLDotISVGPathSegLinetoHorizontalAbs_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISVGPathSegLinetoHorizontalAbs]
  }
  @scala.inline
  implicit class ISVGPathSegLinetoHorizontalAbsOps[Self <: ISVGPathSegLinetoHorizontalAbs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMSHTMLDotISVGPathSegLinetoHorizontalAbs_typekey(value: ISVGPathSegLinetoHorizontalAbs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MSHTML.ISVGPathSegLinetoHorizontalAbs_typekey")(value.asInstanceOf[js.Any])
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

