package typingsSlinky.inquirer.utilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Unpacks a question-property.
  */
/* Rewritten from type alias, can be one of: 
  - T
  - js.Any
*/
trait UnpackQuestionProperty[T] extends js.Object

object UnpackQuestionProperty {
  @scala.inline
  implicit def apply[T](value: js.Any): UnpackQuestionProperty[T] = value.asInstanceOf[UnpackQuestionProperty[T]]
  @scala.inline
  implicit def apply[T](value: T): UnpackQuestionProperty[T] = value.asInstanceOf[UnpackQuestionProperty[T]]
}

