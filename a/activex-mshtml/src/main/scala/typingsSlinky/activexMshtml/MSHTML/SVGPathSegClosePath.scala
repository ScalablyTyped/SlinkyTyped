package typingsSlinky.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SVGPathSegClosePath extends js.Object {
  @JSName("MSHTML.SVGPathSegClosePath_typekey")
  var MSHTMLDotSVGPathSegClosePath_typekey: SVGPathSegClosePath = js.native
  var pathSegType: Double = js.native
  val pathSegTypeAsLetter: String = js.native
}

object SVGPathSegClosePath {
  @scala.inline
  def apply(
    MSHTMLDotSVGPathSegClosePath_typekey: SVGPathSegClosePath,
    pathSegType: Double,
    pathSegTypeAsLetter: String
  ): SVGPathSegClosePath = {
    val __obj = js.Dynamic.literal(pathSegType = pathSegType.asInstanceOf[js.Any], pathSegTypeAsLetter = pathSegTypeAsLetter.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.SVGPathSegClosePath_typekey")(MSHTMLDotSVGPathSegClosePath_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGPathSegClosePath]
  }
  @scala.inline
  implicit class SVGPathSegClosePathOps[Self <: SVGPathSegClosePath] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMSHTMLDotSVGPathSegClosePath_typekey(value: SVGPathSegClosePath): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MSHTML.SVGPathSegClosePath_typekey")(value.asInstanceOf[js.Any])
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
  }
  
}

