package typingsSlinky.inquirer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libPromptsConfirmMod {
  import typingsSlinky.inquirer.inquirerMod.Answers
  import typingsSlinky.inquirer.inquirerMod.ConfirmQuestionOptions

  /**
    * The question-options for the `ConfirmPrompt<T>`.
    */
  type Question = ConfirmQuestionOptions[Answers]
}
