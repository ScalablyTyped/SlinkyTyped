package typingsSlinky.inquirer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object numberMod {
  /**
    * Provides a prompt which allows the user to type a number as answer.
    *
    * @template TQuestion
    * The options for the question.
    */
  type NumberPrompt[TQuestion /* <: typingsSlinky.inquirer.numberMod.Question */] = typingsSlinky.inquirer.inputMod.^[TQuestion]
  /**
    * The question for the `NumberPrompt<T>`.
    */
  type Question = typingsSlinky.inquirer.mod.NumberQuestionOptions[typingsSlinky.inquirer.mod.Answers]
}
