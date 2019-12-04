package typingsSlinky.inquirer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libPromptsNumberMod {
  import typingsSlinky.inquirer.inquirerMod.Answers
  import typingsSlinky.inquirer.inquirerMod.NumberQuestionOptions

  /**
    * Provides a prompt which allows the user to type a number as answer.
    *
    * @template TQuestion
    * The options for the question.
    */
  type NumberPrompt[TQuestion /* <: Question */] = typingsSlinky.inquirer.libPromptsInputMod.^[TQuestion]
  /**
    * The question for the `NumberPrompt<T>`.
    */
  type Question = NumberQuestionOptions[Answers]
}
