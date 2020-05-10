package typingsSlinky.bootstrapNotify

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.jquery.JQuery_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NotifyReturn extends js.Object {
  @JSName("$ele")
  var $ele: JQuery_[HTMLElement] = js.native
  def close(): Unit = js.native
  def update(command: String, update: js.Any): Unit = js.native
}

object NotifyReturn {
  @scala.inline
  def apply($ele: JQuery_[HTMLElement], close: () => Unit, update: (String, js.Any) => Unit): NotifyReturn = {
    val __obj = js.Dynamic.literal($ele = $ele.asInstanceOf[js.Any], close = js.Any.fromFunction0(close), update = js.Any.fromFunction2(update))
    __obj.asInstanceOf[NotifyReturn]
  }
  @scala.inline
  implicit class NotifyReturnOps[Self <: NotifyReturn] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with$ele(value: JQuery_[HTMLElement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$ele")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClose(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("close")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withUpdate(value: (String, js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

