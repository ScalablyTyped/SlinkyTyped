package typingsSlinky.inquirer.mod

import typingsSlinky.inquirer.anon.Ui
import typingsSlinky.inquirer.mod.prompts.PromptCollection
import typingsSlinky.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides the functionality to prompt questions to the user.
  */
@js.native
trait PromptModule extends PromptModuleBase {
  
  /**
    * Prompts the questions to the user.
    */
  def apply[T](questions: QuestionCollection[T]): js.Promise[T] with Ui = js.native
  def apply[T](questions: QuestionCollection[T], initialAnswers: Partial[T]): js.Promise[T] with Ui = js.native
  
  /**
    * The prompts of the prompt-module.
    */
  var prompts: PromptCollection = js.native
}
