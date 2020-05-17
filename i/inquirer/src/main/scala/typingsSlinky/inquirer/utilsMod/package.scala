package typingsSlinky.inquirer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object utilsMod {
  /**
    * Represents a property-name of any question-type.
    */
  type QuestionProperty = typingsSlinky.inquirer.mod.KeyUnion[
    typingsSlinky.inquirer.mod.UnionToIntersection[typingsSlinky.inquirer.mod.DistinctQuestion[typingsSlinky.inquirer.mod.Answers]]
  ]
}
