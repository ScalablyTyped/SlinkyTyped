package typingsSlinky.freedom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonRemoveEventListener extends js.Object {
  def removeEventListener(s: String, f: js.Function, b: Boolean): Unit = js.native
}

object AnonRemoveEventListener {
  @scala.inline
  def apply(removeEventListener: (String, js.Function, Boolean) => Unit): AnonRemoveEventListener = {
    val __obj = js.Dynamic.literal(removeEventListener = js.Any.fromFunction3(removeEventListener))
    __obj.asInstanceOf[AnonRemoveEventListener]
  }
  @scala.inline
  implicit class AnonRemoveEventListenerOps[Self <: AnonRemoveEventListener] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRemoveEventListener(value: (String, js.Function, Boolean) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeEventListener")(js.Any.fromFunction3(value))
        ret
    }
  }
  
}

