package typingsSlinky.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventException extends js.Object {
  @JSName("MSHTML.EventException_typekey")
  var MSHTMLDotEventException_typekey: EventException = js.native
}

object EventException {
  @scala.inline
  def apply(MSHTMLDotEventException_typekey: EventException): EventException = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("MSHTML.EventException_typekey")(MSHTMLDotEventException_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventException]
  }
  @scala.inline
  implicit class EventExceptionOps[Self <: EventException] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMSHTMLDotEventException_typekey(value: EventException): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MSHTML.EventException_typekey")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

