package typingsSlinky.jimpCore

import typingsSlinky.jimpCore.etcMod.ChangeName
import typingsSlinky.jimpCore.etcMod.ListenableName
import typingsSlinky.jimpCore.etcMod.ListenerData
import typingsSlinky.jimpCore.jimpCoreStrings.clone
import typingsSlinky.jimpCore.jimpCoreStrings.constructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonEventName[T /* <: ListenableName */] extends ListenerData[T] {
  var eventName: T = js.native
  var methodName: clone | ChangeName | constructor = js.native
}

object AnonEventName {
  @scala.inline
  def apply[T](eventName: T, methodName: clone | ChangeName | constructor): AnonEventName[T] = {
    val __obj = js.Dynamic.literal(eventName = eventName.asInstanceOf[js.Any], methodName = methodName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEventName[T]]
  }
  @scala.inline
  implicit class AnonEventNameOps[Self[t] <: AnonEventName[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withEventName(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMethodName(value: clone | ChangeName | constructor): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("methodName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

