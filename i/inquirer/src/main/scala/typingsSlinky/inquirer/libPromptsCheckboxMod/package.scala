package typingsSlinky.inquirer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libPromptsCheckboxMod {
  import typingsSlinky.inquirer.inquirerMod.Answers
  import typingsSlinky.inquirer.inquirerMod.CheckboxQuestionOptions

  /**
    * The question-options for the `ChoicePrompt<T>`.
    */
  type Question = CheckboxQuestionOptions[Answers]
}
