package typingsSlinky.inquirer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libPromptsEditorMod {
  import typingsSlinky.inquirer.inquirerMod.Answers
  import typingsSlinky.inquirer.inquirerMod.EditorQuestionOptions

  /**
    * The question-options for the `EditorPrompt<T>`.
    */
  type Question = EditorQuestionOptions[Answers]
}
