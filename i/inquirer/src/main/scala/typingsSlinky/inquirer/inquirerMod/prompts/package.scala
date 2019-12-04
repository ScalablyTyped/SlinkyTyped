package typingsSlinky.inquirer.inquirerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object prompts {
  import typingsSlinky.inquirer.Anon_Choices
  import typingsSlinky.inquirer.inquirerMod.Answers
  import typingsSlinky.inquirer.inquirerMod.LiteralUnion
  import typingsSlinky.inquirer.inquirerMod.Question
  import typingsSlinky.inquirer.inquirerStrings.answered
  import typingsSlinky.inquirer.inquirerStrings.done
  import typingsSlinky.inquirer.inquirerStrings.idle
  import typingsSlinky.inquirer.inquirerStrings.loading
  import typingsSlinky.inquirer.inquirerStrings.pending
  import typingsSlinky.std.Record

  /**
    * Provides a set of prompt-constructors.
    */
  type PromptCollection = Record[String, PromptConstructor]
  /**
    * Provides a base for and prompt-options.
    *
    * @template T
    * The type of the answers.
    */
  type PromptOptions[T /* <: Question[Answers] */] = T with Anon_Choices
  /**
    * Represents the state of a prompt.
    */
  type PromptState = LiteralUnion[pending | idle | loading | answered | done, String]
}
