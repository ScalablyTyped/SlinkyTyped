package typingsSlinky.ionicCliFrameworkPrompts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.ionicCliFrameworkPrompts.mod.PromptValueConfirm
  - typingsSlinky.ionicCliFrameworkPrompts.mod.PromptValueCheckbox
  - typingsSlinky.ionicCliFrameworkPrompts.mod.PromptValueOther
*/
trait PromptValue extends js.Object

object PromptValue {
  @scala.inline
  implicit def apply(value: PromptValueCheckbox): PromptValue = value.asInstanceOf[PromptValue]
  @scala.inline
  implicit def apply(value: PromptValueConfirm): PromptValue = value.asInstanceOf[PromptValue]
  @scala.inline
  implicit def apply(value: PromptValueOther): PromptValue = value.asInstanceOf[PromptValue]
}

