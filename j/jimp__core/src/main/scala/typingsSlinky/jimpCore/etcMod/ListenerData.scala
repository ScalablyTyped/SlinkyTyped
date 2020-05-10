package typingsSlinky.jimpCore.etcMod

import typingsSlinky.jimpCore.jimpCoreStrings.`before-change`
import typingsSlinky.jimpCore.jimpCoreStrings.changed
import typingsSlinky.jimpCore.jimpCoreStrings.clone
import typingsSlinky.jimpCore.jimpCoreStrings.constructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.jimpCore.AnonEventName[T]
  - typingsSlinky.jimpCore.AnonDictkey[T]
*/
trait ListenerData[T /* <: ListenableName */] extends js.Object

object ListenerData {
  @scala.inline
  def AnonEventName[T](eventName: T, methodName: clone | ChangeName | constructor): ListenerData[T] = {
    val __obj = js.Dynamic.literal(eventName = eventName.asInstanceOf[js.Any], methodName = methodName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListenerData[T]]
  }
  @scala.inline
  def AnonDictkey[T](eventName: `before-change` | changed, methodName: T): ListenerData[T] = {
    val __obj = js.Dynamic.literal(eventName = eventName.asInstanceOf[js.Any], methodName = methodName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListenerData[T]]
  }
}

