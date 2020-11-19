package typingsSlinky.ionicCliFrameworkPrompts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type Inquirer = typingsSlinky.inquirer.mod.Inquirer
  
  type PromptType = typingsSlinky.ionicCliFrameworkPrompts.mod.PromptTypeConfirm | typingsSlinky.ionicCliFrameworkPrompts.mod.PromptTypeCheckbox | typingsSlinky.ionicCliFrameworkPrompts.mod.PromptTypeOther
  
  type PromptTypeCheckbox = typingsSlinky.ionicCliFrameworkPrompts.ionicCliFrameworkPromptsStrings.checkbox
  
  type PromptTypeConfirm = typingsSlinky.ionicCliFrameworkPrompts.ionicCliFrameworkPromptsStrings.confirm
  
  type PromptValue = typingsSlinky.ionicCliFrameworkPrompts.mod.PromptValueConfirm | typingsSlinky.ionicCliFrameworkPrompts.mod.PromptValueCheckbox | typingsSlinky.ionicCliFrameworkPrompts.mod.PromptValueOther
  
  type PromptValueCheckbox = js.Array[java.lang.String]
  
  type PromptValueConfirm = scala.Boolean
  
  type PromptValueOther = java.lang.String
  
  type Question = typingsSlinky.inquirer.mod.Question[typingsSlinky.inquirer.mod.Answers]
  
  type Separator = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_inquirer.objects.Separator */ js.Any
}
