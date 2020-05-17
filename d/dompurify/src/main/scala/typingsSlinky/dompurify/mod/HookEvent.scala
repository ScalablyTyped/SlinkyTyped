package typingsSlinky.dompurify.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.dompurify.mod.SanitizeElementHookEvent
  - typingsSlinky.dompurify.mod.SanitizeAttributeHookEvent
  - scala.Null
*/
trait HookEvent extends js.Object

object HookEvent {
  @scala.inline
  implicit def apply(value: Null): HookEvent = value.asInstanceOf[HookEvent]
  @scala.inline
  implicit def apply(value: SanitizeAttributeHookEvent): HookEvent = value.asInstanceOf[HookEvent]
  @scala.inline
  implicit def apply(value: SanitizeElementHookEvent): HookEvent = value.asInstanceOf[HookEvent]
}

