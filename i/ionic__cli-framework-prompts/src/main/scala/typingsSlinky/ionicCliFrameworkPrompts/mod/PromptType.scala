package typingsSlinky.ionicCliFrameworkPrompts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.ionicCliFrameworkPrompts.mod.PromptTypeConfirm
  - typingsSlinky.ionicCliFrameworkPrompts.mod.PromptTypeCheckbox
  - typingsSlinky.ionicCliFrameworkPrompts.mod.PromptTypeOther
*/
trait PromptType extends js.Object

object PromptType {
  @scala.inline
  implicit def apply(value: PromptTypeCheckbox): PromptType = value.asInstanceOf[PromptType]
  @scala.inline
  implicit def apply(value: PromptTypeConfirm): PromptType = value.asInstanceOf[PromptType]
  @scala.inline
  implicit def apply(value: PromptTypeOther): PromptType = value.asInstanceOf[PromptType]
}

