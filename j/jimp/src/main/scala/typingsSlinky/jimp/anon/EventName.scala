package typingsSlinky.jimp.anon

import typingsSlinky.jimp.jimpStrings.clone
import typingsSlinky.jimp.jimpStrings.constructor
import typingsSlinky.jimp.mod.ChangeName
import typingsSlinky.jimp.mod.ListenableName
import typingsSlinky.jimp.mod.ListenerData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventName[T /* <: ListenableName */] extends ListenerData[T] {
  
  var eventName: T = js.native
  
  var methodName: clone | ChangeName | constructor = js.native
}
object EventName {
  
  @scala.inline
  def apply[T /* <: ListenableName */](eventName: T, methodName: clone | ChangeName | constructor): EventName[T] = {
    val __obj = js.Dynamic.literal(eventName = eventName.asInstanceOf[js.Any], methodName = methodName.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventName[T]]
  }
  
  @scala.inline
  implicit class EventNameOps[Self <: EventName[_], T /* <: ListenableName */] (val x: Self with EventName[T]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setEventName(value: T): Self = this.set("eventName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethodName(value: clone | ChangeName | constructor): Self = this.set("methodName", value.asInstanceOf[js.Any])
  }
}
