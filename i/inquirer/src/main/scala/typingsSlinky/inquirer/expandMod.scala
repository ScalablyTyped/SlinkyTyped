package typingsSlinky.inquirer

import typingsSlinky.inquirer.mod.Answers
import typingsSlinky.inquirer.mod.ExpandQuestionOptions
import typingsSlinky.inquirer.mod.prompts.FailedPromptStateData
import typingsSlinky.inquirer.mod.prompts.SuccessfulPromptStateData
import typingsSlinky.node.readlineMod.Interface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object expandMod {
  
  /**
    * Represents a prompt which forces the user to make a choice by typing a specific key.
    *
    * @template TQuestion
    * The options for the question.
    */
  @JSImport("inquirer/lib/prompts/expand", JSImport.Namespace)
  @js.native
  class ^[TQuestion /* <: Question */] protected () extends ExpandPrompt[TQuestion] {
    /**
      * Initializes a new instance of the `ExpandPrompt<T>` class.
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
    * Represents a prompt which forces the user to make a choice by typing a specific key.
    *
    * @template TQuestion
    * The options for the question.
    */
  @js.native
  trait ExpandPrompt[TQuestion /* <: Question */]
    extends typingsSlinky.inquirer.baseMod.^[TQuestion] {
    
    /**
      * Gets or sets the answer of the prompt.
      */
    var answer: String = js.native
    
    /**
      * Resolves the value of the prompt.
      */
    /* protected */ def done(value: js.Any): Unit = js.native
    
    /**
      * Generates the string-representation of the choices.
      *
      * @param choices
      * The choices to generate the string-representation for.
      *
      * @param defaultChoice
      * The value of the default choice.
      *
      * @returns
      * The string-representations of the choices.
      */
    @JSName("generateChoicesString")
    /* protected */ def generateChoicesString_choices(
      choices: /* import warning: importer.ImportType#apply Failed type conversion: inquirer.inquirer.prompts.PromptOptions<TQuestion>['choices'] */ js.Any,
      defaultChoice: js.Any
    ): String = js.native
    
    /**
      * Generates the string-representation of the choices.
      *
      * @deprecated
      *
      * @returns
      * The string-representations of the choices.
      */
    /* protected */ def getChoices(): String = js.native
    
    /**
      * Determines the current value of the prompt.
      *
      * @param input
      * The input provided by the user.
      *
      * @returns
      * The current value of the prompt.
      */
    /* protected */ def getCurrentValue(input: String): js.Any = js.native
    
    /**
      * Gets the promise of the keypress-eventhandler.
      */
    var keypressObs: js.Promise[Unit] = js.native
    
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
    /* protected */ def onKeypress(): Unit = js.native
    
    /**
      * Handles the `success`-event of the prompt.
      *
      * @param eventArgs
      * An object which contains event-data.
      */
    /* protected */ def onSubmit(eventArgs: SuccessfulPromptStateData[_]): Unit = js.native
    
    /**
      * Gets or sets an object for paginating the content.
      */
    var paginator: typingsSlinky.inquirer.paginatorMod.^ = js.native
    
    /**
      * Gets or sets the default key.
      */
    var rawDefault: String = js.native
    
    /**
      * Renders the prompt to the screen.
      *
      * @param error
      * The error to render.
      *
      * @param hint
      * The hint to render.
      */
    /* protected */ def render(): Unit = js.native
    /* protected */ def render(error: js.UndefOr[scala.Nothing], hint: String): Unit = js.native
    /* protected */ def render(error: String): Unit = js.native
    /* protected */ def render(error: String, hint: String): Unit = js.native
    
    /**
      * Renders the choices.
      *
      * @param choices
      * The choices to render.
      *
      * @param pointer
      * The value of the choice to select.
      */
    @JSName("renderChoices")
    /* protected */ def renderChoices_choices(
      choices: /* import warning: importer.ImportType#apply Failed type conversion: inquirer.inquirer.prompts.PromptOptions<TQuestion>['choices'] */ js.Any,
      pointer: String
    ): String = js.native
    
    /**
      * Gets or sets the currently selected key.
      */
    var selectedKey: String = js.native
    
    /**
      * Validates the integrity of the choices.
      *
      * @param choices
      * The choices to validate.
      */
    @JSName("validateChoices")
    /* protected */ def validateChoices_choices(
      choices: /* import warning: importer.ImportType#apply Failed type conversion: inquirer.inquirer.prompts.PromptOptions<TQuestion>['choices'] */ js.Any
    ): Unit = js.native
  }
  
  /**
    * The question-options for the `ExpandPrompt<T>`.
    */
  type Question = ExpandQuestionOptions[Answers]
}
