package typingsSlinky.inquirer

import typingsSlinky.inquirer.mod.Answers
import typingsSlinky.inquirer.mod.ListQuestionOptions
import typingsSlinky.node.readlineMod.Interface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object listMod {
  
  /**
    * Represents a prompt which provides a list to choose an answer from.
    *
    * @template TQuestion
    * The options for the question.
    */
  @JSImport("inquirer/lib/prompts/list", JSImport.Namespace)
  @js.native
  class ^[TQuestion /* <: Question */] protected () extends ListPrompt[TQuestion] {
    /**
      * Initializes a new instance of the `ListPrompt<T>` class.
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
    * Represents a prompt which provides a list to choose an answer from.
    *
    * @template TQuestion
    * The options for the question.
    */
  @js.native
  trait ListPrompt[TQuestion /* <: Question */]
    extends typingsSlinky.inquirer.baseMod.^[TQuestion] {
    
    /**
      * Resolves the value of the prompt.
      */
    /* protected */ def done(value: js.Any): Unit = js.native
    
    /**
      * Gets or sets a value indicating whether the prompt has been rendered the first time.
      */
    var firstRender: Boolean = js.native
    
    /**
      * Gets the current value of the prompt.
      */
    /* protected */ def getCurrentValue(): js.Any = js.native
    
    /**
      * Handles the `downKey`-event.
      */
    /* protected */ def onDownKey(): Unit = js.native
    
    /**
      * Handles the `numberKey`-event.
      *
      * @param input
      * The number that has been pressed.
      */
    /* protected */ def onNumberKey(input: Double): Unit = js.native
    
    /**
      * Handles the `success`-event of the prompt.
      *
      * @param value
      * The value of the prompt.
      */
    /* protected */ def onSubmit(value: js.Any): Unit = js.native
    
    /**
      * Handles the `upKey`-event.
      */
    /* protected */ def onUpKey(): Unit = js.native
    
    /**
      * Gets or sets an object for paginating the content.
      */
    var paginator: typingsSlinky.inquirer.paginatorMod.^ = js.native
    
    /**
      * Renders the prompt.
      */
    /* protected */ def render(): Unit = js.native
    
    /**
      * The index of the selected choice.
      */
    var selected: Double = js.native
  }
  
  /**
    * The question-options for the `ListPrompt<T>`.
    */
  type Question = ListQuestionOptions[Answers]
}
