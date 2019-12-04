package typingsSlinky.inquirer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libPromptsExpandMod {
  import typingsSlinky.inquirer.inquirerMod.Answers
  import typingsSlinky.inquirer.inquirerMod.ExpandQuestionOptions

  /**
    * The question-options for the `ExpandPrompt<T>`.
    */
  type Question = ExpandQuestionOptions[Answers]
}
