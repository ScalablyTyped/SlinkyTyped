package typingsSlinky.ionic.definitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.ionic.definitionsMod.BuildHookInput
  - typingsSlinky.ionic.definitionsMod.ServeBeforeHookInput
  - typingsSlinky.ionic.definitionsMod.ServeAfterHookInput
*/
trait HookInput extends js.Object

object HookInput {
  @scala.inline
  implicit def apply(value: BuildHookInput): HookInput = value.asInstanceOf[HookInput]
  @scala.inline
  implicit def apply(value: ServeAfterHookInput): HookInput = value.asInstanceOf[HookInput]
  @scala.inline
  implicit def apply(value: ServeBeforeHookInput): HookInput = value.asInstanceOf[HookInput]
}

