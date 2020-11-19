package typingsSlinky.inquirer.rawlistMod

import typingsSlinky.inquirer.mod.Answers
import typingsSlinky.node.readlineMod.Interface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a prompt which provides a list to choose an answer from.
  *
  * @template TQuestion
  * The options for the question.
  */
@JSImport("inquirer/lib/prompts/rawlist", JSImport.Namespace)
@js.native
class ^[TQuestion /* <: Question */] protected () extends RawListPrompt[TQuestion] {
  /**
    * Initializes a new instance of the `RawListPrompt<T>` class.
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
