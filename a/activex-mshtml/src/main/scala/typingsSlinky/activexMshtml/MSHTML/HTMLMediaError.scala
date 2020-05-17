package typingsSlinky.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HTMLMediaError extends js.Object {
  @JSName("MSHTML.HTMLMediaError_typekey")
  var MSHTMLDotHTMLMediaError_typekey: HTMLMediaError = js.native
  val code: Double = js.native
}

object HTMLMediaError {
  @scala.inline
  def apply(MSHTMLDotHTMLMediaError_typekey: HTMLMediaError, code: Double): HTMLMediaError = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.HTMLMediaError_typekey")(MSHTMLDotHTMLMediaError_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTMLMediaError]
  }
  @scala.inline
  implicit class HTMLMediaErrorOps[Self <: HTMLMediaError] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMSHTMLDotHTMLMediaError_typekey(value: HTMLMediaError): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MSHTML.HTMLMediaError_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCode(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("code")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

