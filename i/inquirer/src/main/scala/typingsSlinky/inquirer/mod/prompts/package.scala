package typingsSlinky.inquirer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object prompts {
  
  /**
    * Provides a set of prompt-constructors.
    */
  type PromptCollection = typingsSlinky.std.Record[java.lang.String, typingsSlinky.inquirer.mod.prompts.PromptConstructor]
  
  /**
    * Provides a base for and prompt-options.
    *
    * @template T
    * The type of the answers.
    */
  type PromptOptions[T /* <: typingsSlinky.inquirer.mod.Question[typingsSlinky.inquirer.mod.Answers] */] = T with typingsSlinky.inquirer.anon.Choices
  
  /**
    * Represents the state of a prompt.
    */
  type PromptState = typingsSlinky.inquirer.mod.LiteralUnion[
    typingsSlinky.inquirer.inquirerStrings.pending | typingsSlinky.inquirer.inquirerStrings.idle | typingsSlinky.inquirer.inquirerStrings.loading | typingsSlinky.inquirer.inquirerStrings.answered | typingsSlinky.inquirer.inquirerStrings.done, 
    java.lang.String
  ]
}
