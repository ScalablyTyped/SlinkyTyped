package typingsSlinky.inquirer.inquirerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ui {
  import typingsSlinky.inquirer.Anon_ChoicesDefault
  import typingsSlinky.inquirer.inquirerMod.Answers
  import typingsSlinky.inquirer.inquirerMod.DistinctQuestion

  /**
    * Represents a fetched answer.
    *
    * @template T
    * The type of the answers.
    */
  type FetchedQuestion[T /* <: Answers */] = DistinctQuestion[T] with Anon_ChoicesDefault[T]
}
