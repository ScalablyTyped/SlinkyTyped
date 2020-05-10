package typingsSlinky.nextgenEvents.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Listeners extends js.Object {
  var error: js.Array[Func] = js.native
  var interrupt: js.Array[Func] = js.native
  var newListener: js.Array[Func] = js.native
  var removeListener: js.Array[Func] = js.native
}

object Listeners {
  @scala.inline
  def apply(
    error: js.Array[Func],
    interrupt: js.Array[Func],
    newListener: js.Array[Func],
    removeListener: js.Array[Func]
  ): Listeners = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], interrupt = interrupt.asInstanceOf[js.Any], newListener = newListener.asInstanceOf[js.Any], removeListener = removeListener.asInstanceOf[js.Any])
    __obj.asInstanceOf[Listeners]
  }
  @scala.inline
  implicit class ListenersOps[Self <: Listeners] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withError(value: js.Array[Func]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInterrupt(value: js.Array[Func]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interrupt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNewListener(value: js.Array[Func]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newListener")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemoveListener(value: js.Array[Func]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeListener")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

