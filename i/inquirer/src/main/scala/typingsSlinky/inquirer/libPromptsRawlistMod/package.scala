package typingsSlinky.inquirer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libPromptsRawlistMod {
  import typingsSlinky.inquirer.inquirerMod.Answers
  import typingsSlinky.inquirer.inquirerMod.RawListQuestionOptions

  /**
    * The question for the `RawListPrompt<T>`.
    */
  type Question = RawListQuestionOptions[Answers]
}
