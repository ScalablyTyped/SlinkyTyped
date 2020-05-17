package typingsSlinky.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IEventTarget extends js.Object {
  @JSName("MSHTML.IEventTarget_typekey")
  var MSHTMLDotIEventTarget_typekey: IEventTarget = js.native
  def addEventListener(`type`: String, listener: js.Any, useCapture: Boolean): Unit = js.native
  def dispatchEvent(evt: IDOMEvent): Boolean = js.native
  def removeEventListener(`type`: String, listener: js.Any, useCapture: Boolean): Unit = js.native
}

object IEventTarget {
  @scala.inline
  def apply(
    MSHTMLDotIEventTarget_typekey: IEventTarget,
    addEventListener: (String, js.Any, Boolean) => Unit,
    dispatchEvent: IDOMEvent => Boolean,
    removeEventListener: (String, js.Any, Boolean) => Unit
  ): IEventTarget = {
    val __obj = js.Dynamic.literal(addEventListener = js.Any.fromFunction3(addEventListener), dispatchEvent = js.Any.fromFunction1(dispatchEvent), removeEventListener = js.Any.fromFunction3(removeEventListener))
    __obj.updateDynamic("MSHTML.IEventTarget_typekey")(MSHTMLDotIEventTarget_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEventTarget]
  }
  @scala.inline
  implicit class IEventTargetOps[Self <: IEventTarget] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMSHTMLDotIEventTarget_typekey(value: IEventTarget): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MSHTML.IEventTarget_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAddEventListener(value: (String, js.Any, Boolean) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addEventListener")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withDispatchEvent(value: IDOMEvent => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dispatchEvent")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRemoveEventListener(value: (String, js.Any, Boolean) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeEventListener")(js.Any.fromFunction3(value))
        ret
    }
  }
  
}

