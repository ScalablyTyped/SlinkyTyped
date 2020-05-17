package typingsSlinky.inquirer.mod

import typingsSlinky.rxjs.mod.Observable_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a collection of questions.
  *
  * @template T
  * The type of the answers.
  */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.inquirer.mod.DistinctQuestion[T]
  - js.Array[typingsSlinky.inquirer.mod.DistinctQuestion[T]]
  - typingsSlinky.rxjs.mod.Observable_[typingsSlinky.inquirer.mod.DistinctQuestion[T]]
*/
trait QuestionCollection[T /* <: Answers */] extends js.Object

object QuestionCollection {
  @scala.inline
  implicit def apply[T](value: js.Array[DistinctQuestion[T]]): QuestionCollection[T] = value.asInstanceOf[QuestionCollection[T]]
  @scala.inline
  implicit def apply[T](value: DistinctQuestion[T]): QuestionCollection[T] = value.asInstanceOf[QuestionCollection[T]]
  @scala.inline
  implicit def apply[T](value: Observable_[DistinctQuestion[T]]): QuestionCollection[T] = value.asInstanceOf[QuestionCollection[T]]
}

