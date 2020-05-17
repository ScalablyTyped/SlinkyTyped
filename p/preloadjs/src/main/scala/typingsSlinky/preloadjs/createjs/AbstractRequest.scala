package typingsSlinky.preloadjs.createjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AbstractRequest extends js.Object {
  def cancel(): Unit = js.native
  def destroy(): Unit = js.native
  def load(): Unit = js.native
}

object AbstractRequest {
  @scala.inline
  def apply(cancel: () => Unit, destroy: () => Unit, load: () => Unit): AbstractRequest = {
    val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction0(cancel), destroy = js.Any.fromFunction0(destroy), load = js.Any.fromFunction0(load))
    __obj.asInstanceOf[AbstractRequest]
  }
  @scala.inline
  implicit class AbstractRequestOps[Self <: AbstractRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCancel(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancel")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDestroy(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroy")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withLoad(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("load")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

