package typingsSlinky.fridaGum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.fridaGum.PortableInvocationContext
  - typingsSlinky.fridaGum.WindowsInvocationContext
  - typingsSlinky.fridaGum.UnixInvocationContext
*/
trait InvocationContext extends js.Object

object InvocationContext {
  @scala.inline
  implicit def apply(value: PortableInvocationContext): InvocationContext = value.asInstanceOf[InvocationContext]
  @scala.inline
  implicit def apply(value: UnixInvocationContext): InvocationContext = value.asInstanceOf[InvocationContext]
  @scala.inline
  implicit def apply(value: WindowsInvocationContext): InvocationContext = value.asInstanceOf[InvocationContext]
}

