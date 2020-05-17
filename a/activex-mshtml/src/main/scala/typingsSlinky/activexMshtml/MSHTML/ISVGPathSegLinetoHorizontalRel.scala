package typingsSlinky.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISVGPathSegLinetoHorizontalRel extends js.Object {
  @JSName("MSHTML.ISVGPathSegLinetoHorizontalRel_typekey")
  var MSHTMLDotISVGPathSegLinetoHorizontalRel_typekey: ISVGPathSegLinetoHorizontalRel = js.native
  var x: Double = js.native
}

object ISVGPathSegLinetoHorizontalRel {
  @scala.inline
  def apply(MSHTMLDotISVGPathSegLinetoHorizontalRel_typekey: ISVGPathSegLinetoHorizontalRel, x: Double): ISVGPathSegLinetoHorizontalRel = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.ISVGPathSegLinetoHorizontalRel_typekey")(MSHTMLDotISVGPathSegLinetoHorizontalRel_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISVGPathSegLinetoHorizontalRel]
  }
  @scala.inline
  implicit class ISVGPathSegLinetoHorizontalRelOps[Self <: ISVGPathSegLinetoHorizontalRel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMSHTMLDotISVGPathSegLinetoHorizontalRel_typekey(value: ISVGPathSegLinetoHorizontalRel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MSHTML.ISVGPathSegLinetoHorizontalRel_typekey")(value.asInstanceOf[js.Any])
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

