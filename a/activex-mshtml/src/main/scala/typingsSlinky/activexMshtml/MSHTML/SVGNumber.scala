package typingsSlinky.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SVGNumber extends js.Object {
  @JSName("MSHTML.SVGNumber_typekey")
  var MSHTMLDotSVGNumber_typekey: SVGNumber = js.native
  var value: Double = js.native
}

object SVGNumber {
  @scala.inline
  def apply(MSHTMLDotSVGNumber_typekey: SVGNumber, value: Double): SVGNumber = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.SVGNumber_typekey")(MSHTMLDotSVGNumber_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGNumber]
  }
  @scala.inline
  implicit class SVGNumberOps[Self <: SVGNumber] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMSHTMLDotSVGNumber_typekey(value: SVGNumber): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MSHTML.SVGNumber_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

