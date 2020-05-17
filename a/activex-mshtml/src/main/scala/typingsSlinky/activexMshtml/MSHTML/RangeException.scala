package typingsSlinky.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RangeException extends js.Object {
  @JSName("MSHTML.RangeException_typekey")
  var MSHTMLDotRangeException_typekey: RangeException = js.native
  var code: Double = js.native
  val message: String = js.native
}

object RangeException {
  @scala.inline
  def apply(MSHTMLDotRangeException_typekey: RangeException, code: Double, message: String): RangeException = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.RangeException_typekey")(MSHTMLDotRangeException_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[RangeException]
  }
  @scala.inline
  implicit class RangeExceptionOps[Self <: RangeException] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMSHTMLDotRangeException_typekey(value: RangeException): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MSHTML.RangeException_typekey")(value.asInstanceOf[js.Any])
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

