package typingsSlinky.inquirer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libPromptsPasswordMod {
  import typingsSlinky.inquirer.inquirerMod.Answers
  import typingsSlinky.inquirer.inquirerMod.PasswordQuestionOptions

  /**
    * The question for the `PasswordPrompt<T>`.
    */
  type Question = PasswordQuestionOptions[Answers]
}
