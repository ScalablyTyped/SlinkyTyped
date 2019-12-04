package typingsSlinky.inquirer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libPromptsInputMod {
  import typingsSlinky.inquirer.inquirerMod.Answers
  import typingsSlinky.inquirer.inquirerMod.InputQuestionOptions

  /**
    * The question-options for the `InputPrompt<T>`.
    */
  type Question = InputQuestionOptions[Answers]
}
