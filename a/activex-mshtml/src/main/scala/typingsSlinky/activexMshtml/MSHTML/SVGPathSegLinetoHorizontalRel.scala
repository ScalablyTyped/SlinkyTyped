package typingsSlinky.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SVGPathSegLinetoHorizontalRel extends js.Object {
  @JSName("MSHTML.SVGPathSegLinetoHorizontalRel_typekey")
  var MSHTMLDotSVGPathSegLinetoHorizontalRel_typekey: SVGPathSegLinetoHorizontalRel = js.native
  var pathSegType: Double = js.native
  val pathSegTypeAsLetter: String = js.native
  var x: Double = js.native
}

object SVGPathSegLinetoHorizontalRel {
  @scala.inline
  def apply(
    MSHTMLDotSVGPathSegLinetoHorizontalRel_typekey: SVGPathSegLinetoHorizontalRel,
    pathSegType: Double,
    pathSegTypeAsLetter: String,
    x: Double
  ): SVGPathSegLinetoHorizontalRel = {
    val __obj = js.Dynamic.literal(pathSegType = pathSegType.asInstanceOf[js.Any], pathSegTypeAsLetter = pathSegTypeAsLetter.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.SVGPathSegLinetoHorizontalRel_typekey")(MSHTMLDotSVGPathSegLinetoHorizontalRel_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGPathSegLinetoHorizontalRel]
  }
  @scala.inline
  implicit class SVGPathSegLinetoHorizontalRelOps[Self <: SVGPathSegLinetoHorizontalRel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMSHTMLDotSVGPathSegLinetoHorizontalRel_typekey(value: SVGPathSegLinetoHorizontalRel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MSHTML.SVGPathSegLinetoHorizontalRel_typekey")(value.asInstanceOf[js.Any])
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

