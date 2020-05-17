package typingsSlinky.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SVGPathSegLinetoVerticalRel extends js.Object {
  @JSName("MSHTML.SVGPathSegLinetoVerticalRel_typekey")
  var MSHTMLDotSVGPathSegLinetoVerticalRel_typekey: SVGPathSegLinetoVerticalRel = js.native
  var pathSegType: Double = js.native
  val pathSegTypeAsLetter: String = js.native
  var y: Double = js.native
}

object SVGPathSegLinetoVerticalRel {
  @scala.inline
  def apply(
    MSHTMLDotSVGPathSegLinetoVerticalRel_typekey: SVGPathSegLinetoVerticalRel,
    pathSegType: Double,
    pathSegTypeAsLetter: String,
    y: Double
  ): SVGPathSegLinetoVerticalRel = {
    val __obj = js.Dynamic.literal(pathSegType = pathSegType.asInstanceOf[js.Any], pathSegTypeAsLetter = pathSegTypeAsLetter.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.SVGPathSegLinetoVerticalRel_typekey")(MSHTMLDotSVGPathSegLinetoVerticalRel_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGPathSegLinetoVerticalRel]
  }
  @scala.inline
  implicit class SVGPathSegLinetoVerticalRelOps[Self <: SVGPathSegLinetoVerticalRel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMSHTMLDotSVGPathSegLinetoVerticalRel_typekey(value: SVGPathSegLinetoVerticalRel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MSHTML.SVGPathSegLinetoVerticalRel_typekey")(value.asInstanceOf[js.Any])
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
    def withY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

