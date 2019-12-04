package typingsSlinky.inquirer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libPromptsListMod {
  import typingsSlinky.inquirer.inquirerMod.Answers
  import typingsSlinky.inquirer.inquirerMod.ListQuestionOptions

  /**
    * The question-options for the `ListPrompt<T>`.
    */
  type Question = ListQuestionOptions[Answers]
}
