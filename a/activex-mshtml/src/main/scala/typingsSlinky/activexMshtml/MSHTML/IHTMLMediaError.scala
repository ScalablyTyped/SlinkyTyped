package typingsSlinky.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IHTMLMediaError extends js.Object {
  @JSName("MSHTML.IHTMLMediaError_typekey")
  var MSHTMLDotIHTMLMediaError_typekey: IHTMLMediaError = js.native
  val code: Double = js.native
}

object IHTMLMediaError {
  @scala.inline
  def apply(MSHTMLDotIHTMLMediaError_typekey: IHTMLMediaError, code: Double): IHTMLMediaError = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.IHTMLMediaError_typekey")(MSHTMLDotIHTMLMediaError_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[IHTMLMediaError]
  }
  @scala.inline
  implicit class IHTMLMediaErrorOps[Self <: IHTMLMediaError] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMSHTMLDotIHTMLMediaError_typekey(value: IHTMLMediaError): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MSHTML.IHTMLMediaError_typekey")(value.asInstanceOf[js.Any])
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

