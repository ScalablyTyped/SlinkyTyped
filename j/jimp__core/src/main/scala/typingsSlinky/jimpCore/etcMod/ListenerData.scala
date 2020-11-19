package typingsSlinky.jimpCore.etcMod

import typingsSlinky.jimpCore.jimpCoreStrings.`before-change`
import typingsSlinky.jimpCore.jimpCoreStrings.changed
import typingsSlinky.jimpCore.jimpCoreStrings.clone
import typingsSlinky.jimpCore.jimpCoreStrings.constructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.jimpCore.anon.EventName[T]
  - typingsSlinky.jimpCore.anon.Dictkey[T]
*/
trait ListenerData[T /* <: ListenableName */] extends js.Object
object ListenerData {
  
  @scala.inline
  def EventName[T /* <: ListenableName */](eventName: T, methodName: clone | ChangeName | constructor): ListenerData[T] = {
    val __obj = js.Dynamic.literal(eventName = eventName.asInstanceOf[js.Any], methodName = methodName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListenerData[T]]
  }
  
  @scala.inline
  def Dictkey[T /* <: ListenableName */](eventName: `before-change` | changed, methodName: T): ListenerData[T] = {
    val __obj = js.Dynamic.literal(eventName = eventName.asInstanceOf[js.Any], methodName = methodName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListenerData[T]]
  }
}
