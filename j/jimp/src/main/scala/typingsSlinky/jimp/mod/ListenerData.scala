package typingsSlinky.jimp.mod

import typingsSlinky.jimp.jimpStrings.`before-change`
import typingsSlinky.jimp.jimpStrings.changed
import typingsSlinky.jimp.jimpStrings.clone
import typingsSlinky.jimp.jimpStrings.constructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.jimp.AnonEventName[T]
  - typingsSlinky.jimp.AnonDictkey[T]
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

