package typingsSlinky.rxLite.Rx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DOMEventTarget extends js.Object {
  def addEventListener(`type`: String, listener: js.Function1[/* e */ js.Any, _], useCapture: Boolean): Unit = js.native
  def removeEventListener(`type`: String, listener: js.Function1[/* e */ js.Any, _], useCapture: Boolean): Unit = js.native
}

object DOMEventTarget {
  @scala.inline
  def apply(
    addEventListener: (String, js.Function1[/* e */ js.Any, _], Boolean) => Unit,
    removeEventListener: (String, js.Function1[/* e */ js.Any, _], Boolean) => Unit
  ): DOMEventTarget = {
    val __obj = js.Dynamic.literal(addEventListener = js.Any.fromFunction3(addEventListener), removeEventListener = js.Any.fromFunction3(removeEventListener))
    __obj.asInstanceOf[DOMEventTarget]
  }
  @scala.inline
  implicit class DOMEventTargetOps[Self <: DOMEventTarget] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddEventListener(value: (String, js.Function1[/* e */ js.Any, _], Boolean) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addEventListener")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withRemoveEventListener(value: (String, js.Function1[/* e */ js.Any, _], Boolean) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeEventListener")(js.Any.fromFunction3(value))
        ret
    }
  }
  
}

