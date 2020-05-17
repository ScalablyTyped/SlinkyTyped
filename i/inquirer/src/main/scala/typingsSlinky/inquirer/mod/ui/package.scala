package typingsSlinky.inquirer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ui {
  /**
    * Represents a fetched answer.
    *
    * @template T
    * The type of the answers.
    */
  type FetchedQuestion[T /* <: typingsSlinky.inquirer.mod.Answers */] = typingsSlinky.inquirer.mod.DistinctQuestion[T] with typingsSlinky.inquirer.anon.Default[T]
}
