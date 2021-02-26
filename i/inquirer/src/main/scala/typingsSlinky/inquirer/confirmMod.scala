package typingsSlinky.inquirer

import typingsSlinky.inquirer.mod.Answers
import typingsSlinky.inquirer.mod.ConfirmQuestionOptions
import typingsSlinky.node.readlineMod.Interface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object confirmMod {
  
  /**
    * Represents a prompt which provides a message to confirm.
    *
    * @template TQuestion
    * The options for the question.
    */
  @JSImport("inquirer/lib/prompts/confirm", JSImport.Namespace)
  @js.native
  class ^[TQuestion /* <: Question */] protected () extends ConfirmPrompt[TQuestion] {
    /**
      * Initializes a new instance of the `ConfirmPrompt<T>` class.
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
    def this(questions: TQuestion, readLine: Interface, answers: Answers) = this()
  }
  
  /**
    * Represents a prompt which provides a message to confirm.
    *
    * @template TQuestion
    * The options for the question.
    */
  @js.native
  trait ConfirmPrompt[TQuestion /* <: Question */]
    extends typingsSlinky.inquirer.baseMod.^[TQuestion] {
    
    /**
      * Handles the `success`-event of the prompt.
      *
      * @param input
      * The input provided by the user.
      */
    /* protected */ def onEnd(input: String): Unit = js.native
    
    /**
      * Handles the `Keypress`-event of the prompt.
      */
    /* protected */ def onKeypress(): Unit = js.native
    
    /**
      * Renders the prompt.
      *
      * @param answer
      * The answer provided by the user.
      */
    /* protected */ def render(): this.type = js.native
    /* protected */ def render(answer: Boolean): this.type = js.native
  }
  
  /**
    * The question-options for the `ConfirmPrompt<T>`.
    */
  type Question = ConfirmQuestionOptions[Answers]
}
