package typingsSlinky.rxjs.fromEventMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NodeCompatibleEventEmitter
  extends EventTargetLike[js.Any] {
  def addListener(eventName: String, handler: NodeEventHandler): Unit | js.Object = js.native
  def removeListener(eventName: String, handler: NodeEventHandler): Unit | js.Object = js.native
}

object NodeCompatibleEventEmitter {
  @scala.inline
  def apply(
    addListener: (String, NodeEventHandler) => Unit | js.Object,
    removeListener: (String, NodeEventHandler) => Unit | js.Object
  ): NodeCompatibleEventEmitter = {
    val __obj = js.Dynamic.literal(addListener = js.Any.fromFunction2(addListener), removeListener = js.Any.fromFunction2(removeListener))
    __obj.asInstanceOf[NodeCompatibleEventEmitter]
  }
  @scala.inline
  implicit class NodeCompatibleEventEmitterOps[Self <: NodeCompatibleEventEmitter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddListener(value: (String, NodeEventHandler) => Unit | js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addListener")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withRemoveListener(value: (String, NodeEventHandler) => Unit | js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeListener")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

