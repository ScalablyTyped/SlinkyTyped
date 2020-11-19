package typingsSlinky.ionicCliFrameworkPrompts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.ionicCliFrameworkPrompts.mod.PromptQuestionConfirm
  - typingsSlinky.ionicCliFrameworkPrompts.mod.PromptQuestionCheckbox
  - typingsSlinky.ionicCliFrameworkPrompts.mod.PromptQuestionOther
*/
trait PromptQuestion extends js.Object
object PromptQuestion {
  
  @scala.inline
  def PromptQuestionConfirm(message: String, `type`: PromptTypeConfirm): PromptQuestion = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PromptQuestion]
  }
  
  @scala.inline
  def PromptQuestionCheckbox(message: String, `type`: PromptTypeCheckbox): PromptQuestion = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PromptQuestion]
  }
  
  @scala.inline
  def PromptQuestionOther(message: String, `type`: PromptTypeOther): PromptQuestion = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PromptQuestion]
  }
}
