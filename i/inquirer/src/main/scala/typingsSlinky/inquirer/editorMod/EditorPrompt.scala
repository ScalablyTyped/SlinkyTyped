package typingsSlinky.inquirer.editorMod

import typingsSlinky.inquirer.mod.prompts.FailedPromptStateData
import typingsSlinky.inquirer.mod.prompts.SuccessfulPromptStateData
import typingsSlinky.rxjs.mod.Subject
import typingsSlinky.rxjs.mod.Subscription
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a prompt which provides a text-editor.
  *
  * @template TQuestion
  * The options for the question.
  */
@js.native
trait EditorPrompt[TQuestion /* <: Question */]
  extends typingsSlinky.inquirer.baseMod.^[TQuestion] {
  
  /**
    * Gets or sets the initial text.
    */
  var currentText: String = js.native
  
  /**
    * Resolves the value of the prompt.
    */
  /* protected */ def done(value: js.Any): Unit = js.native
  
  /**
    * Gets or sets an object for subscribing to the editor-result.
    */
  var editorResult: Subject[String] = js.native
  
  /**
    * Closes the external editor.
    *
    * @param error
    * Either the error which occurred while executing the external editor or `null`.
    *
    * @param result
    * The result of the editor.
    */
  /* protected */ def endExternalEditor(error: js.Error, result: String): Unit = js.native
  
  /**
    * Gets or sets a subscription to the `line`-event.
    */
  var lineSubscription: Subscription = js.native
  
  /**
    * Handles the `success`-event of the prompt.
    *
    * @param eventArgs
    * An object which contains event-data.
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
    * Renders the prompt.
    *
    * @param error
    * The error to render.
    */
  /* protected */ def render(): Unit = js.native
  /* protected */ def render(error: String): Unit = js.native
  
  /**
    * Launches the default text-editor of the system.
    */
  /* protected */ def startExternalEditor(): Unit = js.native
}
