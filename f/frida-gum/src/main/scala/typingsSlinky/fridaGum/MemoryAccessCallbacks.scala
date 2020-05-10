package typingsSlinky.fridaGum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Callbacks to be notified synchronously on memory access.
  */
@js.native
trait MemoryAccessCallbacks extends js.Object {
  def onAccess(details: MemoryAccessDetails): Unit = js.native
}

object MemoryAccessCallbacks {
  @scala.inline
  def apply(onAccess: MemoryAccessDetails => Unit): MemoryAccessCallbacks = {
    val __obj = js.Dynamic.literal(onAccess = js.Any.fromFunction1(onAccess))
    __obj.asInstanceOf[MemoryAccessCallbacks]
  }
  @scala.inline
  implicit class MemoryAccessCallbacksOps[Self <: MemoryAccessCallbacks] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnAccess(value: MemoryAccessDetails => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAccess")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

