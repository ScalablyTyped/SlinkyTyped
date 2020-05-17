package typingsSlinky.fridaGum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Callbacks to invoke synchronously before and after a function call.
  */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.fridaGum.ScriptInvocationListenerCallbacks
  - typingsSlinky.fridaGum.NativeInvocationListenerCallbacks
*/
trait InvocationListenerCallbacks extends js.Object

object InvocationListenerCallbacks {
  @scala.inline
  implicit def apply(value: NativeInvocationListenerCallbacks): InvocationListenerCallbacks = value.asInstanceOf[InvocationListenerCallbacks]
  @scala.inline
  implicit def apply(value: ScriptInvocationListenerCallbacks): InvocationListenerCallbacks = value.asInstanceOf[InvocationListenerCallbacks]
}

