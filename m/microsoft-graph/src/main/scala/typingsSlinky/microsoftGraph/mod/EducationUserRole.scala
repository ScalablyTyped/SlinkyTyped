package typingsSlinky.microsoftGraph.mod

import typingsSlinky.microsoftGraph.microsoftGraphStrings.none_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.student
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.teacher
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.none_
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.unknownFutureValue
*/
trait EducationUserRole extends js.Object

object EducationUserRole {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def none: none_ = this.cast("none")
  @scala.inline
  def student: typingsSlinky.microsoftGraph.microsoftGraphStrings.student = this.cast("student")
  @scala.inline
  def teacher: typingsSlinky.microsoftGraph.microsoftGraphStrings.teacher = this.cast("teacher")
  @scala.inline
  def unknownFutureValue: typingsSlinky.microsoftGraph.microsoftGraphStrings.unknownFutureValue = this.cast("unknownFutureValue")
}

