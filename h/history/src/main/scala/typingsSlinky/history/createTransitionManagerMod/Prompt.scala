package typingsSlinky.history.createTransitionManagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.history.createTransitionManagerMod.PromptFunction[S]
  - scala.Boolean
*/
trait Prompt[S] extends js.Object

object Prompt {
  @scala.inline
  implicit def apply[S](value: Boolean): Prompt[S] = value.asInstanceOf[Prompt[S]]
  @scala.inline
  implicit def apply[S](value: PromptFunction[S]): Prompt[S] = value.asInstanceOf[Prompt[S]]
}

