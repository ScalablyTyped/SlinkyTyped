package typingsSlinky.inquirer.numberMod

import typingsSlinky.inquirer.mod.Answers
import typingsSlinky.node.readlineMod.Interface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides a prompt which allows the user to type a number as answer.
  *
  * @template TQuestion
  * The options for the question.
  */
@JSImport("inquirer/lib/prompts/number", JSImport.Namespace)
@js.native
class ^[TQuestion /* <: Question */] protected ()
  extends typingsSlinky.inquirer.inputMod.^[TQuestion] {
  /**
    * Initializes a new instance of the `NumberPrompt<T>` class.
    *
    * @param question
    * The question to prompt the user to answer.
    *
    * @param readLine
    * An object for performing read from and write to the console.
    *
    * @param answers
    * The answer-object.
    */
  def this(question: TQuestion, readLine: Interface, answers: Answers) = this()
}

