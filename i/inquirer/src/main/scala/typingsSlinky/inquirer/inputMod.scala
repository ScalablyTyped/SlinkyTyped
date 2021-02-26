package typingsSlinky.inquirer

import typingsSlinky.inquirer.mod.Answers
import typingsSlinky.inquirer.mod.InputQuestionOptions
import typingsSlinky.inquirer.mod.prompts.FailedPromptStateData
import typingsSlinky.inquirer.mod.prompts.SuccessfulPromptStateData
import typingsSlinky.node.readlineMod.Interface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object inputMod {
  
  /**
    * Represents a prompt which allows the user to type an answer.
    *
    * @template TQuestion
    * The options for the question.
    */
  @JSImport("inquirer/lib/prompts/input", JSImport.Namespace)
  @js.native
  class ^[TQuestion /* <: Question */] protected () extends InputPrompt[TQuestion] {
    /**
      * Initializes a new instance of the `InputPrompt<T>` class.
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
  
  /**
    * Represents a prompt which allows the user to type an answer.
    *
    * @template TQuestion
    * The options for the question.
    */
  @js.native
  trait InputPrompt[TQuestion /* <: Question */]
    extends typingsSlinky.inquirer.baseMod.^[TQuestion] {
    
    /**
      * The answer to this prompt.
      */
    var answer: js.Any = js.native
    
    /**
      * Resolves the value of the prompt.
      */
    /* protected */ def done(value: js.Any): Unit = js.native
    
    /**
      * Filters the specified `input`.
      *
      * @param input
      * The input to filter.
      *
      * @returns
      * The filtered input.
      */
    /* protected */ def filterInput(input: String): String = js.native
    
    /**
      * Handles the `success`-event of the prompt.
      *
      * @param eventArgs
      * An object which contains eventr-data.
      */
    /* protected */ def onEnd(eventArgs: SuccessfulPromptStateData[_]): Unit = js.native
    
    /**
      * Handles the `error`-event of the prompt.
      *
      * @param eventArgs
      * An object which contains event-data.
      */
    /* protected */ def onError(eventArgs: FailedPromptStateData): Unit = js.native
    
    /**
      * Handles the `keypress`-event of the prompt.
      */
    /* protected */ def onKeyPress(): Unit = js.native
    
    /**
      * Renders the prompt.
      *
      * @param error
      * The error to render.
      */
    /* protected */ def render(): Unit = js.native
    /* protected */ def render(error: String): Unit = js.native
  }
  
  /**
    * The question-options for the `InputPrompt<T>`.
    */
  type Question = InputQuestionOptions[Answers]
}
