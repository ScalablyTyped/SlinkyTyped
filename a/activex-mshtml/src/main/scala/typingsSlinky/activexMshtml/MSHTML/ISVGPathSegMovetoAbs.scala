package typingsSlinky.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISVGPathSegMovetoAbs extends js.Object {
  @JSName("MSHTML.ISVGPathSegMovetoAbs_typekey")
  var MSHTMLDotISVGPathSegMovetoAbs_typekey: ISVGPathSegMovetoAbs = js.native
  var x: Double = js.native
  var y: Double = js.native
}

object ISVGPathSegMovetoAbs {
  @scala.inline
  def apply(MSHTMLDotISVGPathSegMovetoAbs_typekey: ISVGPathSegMovetoAbs, x: Double, y: Double): ISVGPathSegMovetoAbs = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.ISVGPathSegMovetoAbs_typekey")(MSHTMLDotISVGPathSegMovetoAbs_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISVGPathSegMovetoAbs]
  }
  @scala.inline
  implicit class ISVGPathSegMovetoAbsOps[Self <: ISVGPathSegMovetoAbs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMSHTMLDotISVGPathSegMovetoAbs_typekey(value: ISVGPathSegMovetoAbs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MSHTML.ISVGPathSegMovetoAbs_typekey")(value.asInstanceOf[js.Any])
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

