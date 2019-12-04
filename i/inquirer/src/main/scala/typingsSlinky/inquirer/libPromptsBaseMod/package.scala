package typingsSlinky.inquirer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libPromptsBaseMod {
  import typingsSlinky.inquirer.inquirerMod.Answers

  /**
    * The question-options for the `Prompt<T>`.
    */
  type Question = typingsSlinky.inquirer.inquirerMod.Question[Answers]
}
