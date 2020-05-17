package typingsSlinky.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DOMException extends js.Object {
  @JSName("MSHTML.DOMException_typekey")
  var MSHTMLDotDOMException_typekey: DOMException = js.native
  var code: Double = js.native
  val message: String = js.native
}

object DOMException {
  @scala.inline
  def apply(MSHTMLDotDOMException_typekey: DOMException, code: Double, message: String): DOMException = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.DOMException_typekey")(MSHTMLDotDOMException_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[DOMException]
  }
  @scala.inline
  implicit class DOMExceptionOps[Self <: DOMException] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMSHTMLDotDOMException_typekey(value: DOMException): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MSHTML.DOMException_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCode(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("code")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

