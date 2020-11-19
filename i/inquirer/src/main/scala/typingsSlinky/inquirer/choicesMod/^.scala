package typingsSlinky.inquirer.choicesMod

import typingsSlinky.inquirer.mod.Answers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A collection of multiple `Choice`-objects.
  *
  * @template T
  * The type of the answers.
  */
@JSImport("inquirer/lib/objects/choices", JSImport.Namespace)
@js.native
class ^[T /* <: Answers */] protected () extends Choices[T] {
  /**
    * Initializes a new instance of the `Choices` class.
    *
    * @param choices
    * The choices to add to the collection.
    *
    * @param answers
    * The `answers`-object.
    */
  def this(choices: js.Array[DistinctChoice[T]], answers: T) = this()
}
