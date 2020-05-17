package typingsSlinky.inquirer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a dynamic property for a question.
  */
/* Rewritten from type alias, can be one of: 
  - T
  - js.Function1[/ * answers * / TAnswers, T]
*/
trait DynamicQuestionProperty[T, TAnswers /* <: Answers */] extends js.Object

object DynamicQuestionProperty {
  @scala.inline
  implicit def apply[T, TAnswers](value: js.Function1[/* answers */ TAnswers, T]): DynamicQuestionProperty[T, TAnswers] = value.asInstanceOf[DynamicQuestionProperty[T, TAnswers]]
  @scala.inline
  implicit def apply[T, TAnswers](value: T): DynamicQuestionProperty[T, TAnswers] = value.asInstanceOf[DynamicQuestionProperty[T, TAnswers]]
}

