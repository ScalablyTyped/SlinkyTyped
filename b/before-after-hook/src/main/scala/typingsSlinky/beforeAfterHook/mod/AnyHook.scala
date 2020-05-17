package typingsSlinky.beforeAfterHook.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.beforeAfterHook.mod.BeforeHook[O]
  - typingsSlinky.beforeAfterHook.mod.ErrorHook[O, E]
  - typingsSlinky.beforeAfterHook.mod.AfterHook[O, R]
  - typingsSlinky.beforeAfterHook.mod.WrapHook[O, R]
*/
trait AnyHook[O, R, E] extends js.Object

object AnyHook {
  @scala.inline
  implicit def apply[O, R, E](value: (AfterHook[O, R]) | (ErrorHook[O, E]) | (WrapHook[O, R])): AnyHook[O, R, E] = value.asInstanceOf[AnyHook[O, R, E]]
  @scala.inline
  implicit def apply[O, R, E](value: BeforeHook[O]): AnyHook[O, R, E] = value.asInstanceOf[AnyHook[O, R, E]]
}

