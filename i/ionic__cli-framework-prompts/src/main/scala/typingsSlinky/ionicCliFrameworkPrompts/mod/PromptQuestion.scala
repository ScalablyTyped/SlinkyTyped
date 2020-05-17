package typingsSlinky.ionicCliFrameworkPrompts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.ionicCliFrameworkPrompts.mod.PromptQuestionConfirm
  - typingsSlinky.ionicCliFrameworkPrompts.mod.PromptQuestionCheckbox
  - typingsSlinky.ionicCliFrameworkPrompts.mod.PromptQuestionOther
*/
trait PromptQuestion extends js.Object

object PromptQuestion {
  @scala.inline
  implicit def apply(value: PromptQuestionCheckbox): PromptQuestion = value.asInstanceOf[PromptQuestion]
  @scala.inline
  implicit def apply(value: PromptQuestionConfirm): PromptQuestion = value.asInstanceOf[PromptQuestion]
  @scala.inline
  implicit def apply(value: PromptQuestionOther): PromptQuestion = value.asInstanceOf[PromptQuestion]
}

