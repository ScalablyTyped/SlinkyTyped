package typingsSlinky.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISVGPathSegLinetoRel extends js.Object {
  @JSName("MSHTML.ISVGPathSegLinetoRel_typekey")
  var MSHTMLDotISVGPathSegLinetoRel_typekey: ISVGPathSegLinetoRel = js.native
  var x: Double = js.native
  var y: Double = js.native
}

object ISVGPathSegLinetoRel {
  @scala.inline
  def apply(MSHTMLDotISVGPathSegLinetoRel_typekey: ISVGPathSegLinetoRel, x: Double, y: Double): ISVGPathSegLinetoRel = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.ISVGPathSegLinetoRel_typekey")(MSHTMLDotISVGPathSegLinetoRel_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISVGPathSegLinetoRel]
  }
  @scala.inline
  implicit class ISVGPathSegLinetoRelOps[Self <: ISVGPathSegLinetoRel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMSHTMLDotISVGPathSegLinetoRel_typekey(value: ISVGPathSegLinetoRel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MSHTML.ISVGPathSegLinetoRel_typekey")(value.asInstanceOf[js.Any])
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

