package typingsSlinky.inquirer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object choicesMod {
  /**
    * Represents a property-name of any choice-type.
    *
    * @template T
    * The type of the answers.
    */
  type ChoiceProperty[T] = typingsSlinky.inquirer.mod.KeyUnion[
    typingsSlinky.inquirer.mod.UnionToIntersection[typingsSlinky.inquirer.choicesMod.RealChoice[T]]
  ]
  /**
    * Represents a valid choice for the `Choices` class.
    *
    * @template T
    * The type of the answers.
    */
  type DistinctChoice[T] = /* import warning: importer.ImportType#apply Failed type conversion: inquirer.inquirer.BaseChoiceMap<T>[keyof inquirer.inquirer.BaseChoiceMap<T>] */ js.Any
  /**
    * Represents a valid real choice for the `Choices` class.
    *
    * @template T
    * The type of the answers.
    */
  type RealChoice[T] = typingsSlinky.std.Exclude[
    typingsSlinky.inquirer.choicesMod.DistinctChoice[T], 
    typingsSlinky.inquirer.AnonType
  ]
}
