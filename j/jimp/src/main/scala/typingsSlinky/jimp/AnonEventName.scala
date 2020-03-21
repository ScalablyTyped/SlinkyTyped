package typingsSlinky.jimp

import typingsSlinky.jimp.jimpStrings.clone
import typingsSlinky.jimp.jimpStrings.constructor
import typingsSlinky.jimp.mod.ChangeName
import typingsSlinky.jimp.mod.ListenableName
import typingsSlinky.jimp.mod.ListenerData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEventName[T /* <: ListenableName */] extends ListenerData[T] {
  var eventName: T
  var methodName: clone | ChangeName | constructor
}

object AnonEventName {
  @scala.inline
  def apply[T /* <: ListenableName */](eventName: T, methodName: clone | ChangeName | constructor): AnonEventName[T] = {
    val __obj = js.Dynamic.literal(eventName = eventName.asInstanceOf[js.Any], methodName = methodName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonEventName[T]]
  }
}

