package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.female
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.male
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.other
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.unknownFutureValue
*/
trait EducationGender extends js.Object

object EducationGender {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def female: typingsSlinky.microsoftGraph.microsoftGraphStrings.female = this.cast("female")
  @scala.inline
  def male: typingsSlinky.microsoftGraph.microsoftGraphStrings.male = this.cast("male")
  @scala.inline
  def other: typingsSlinky.microsoftGraph.microsoftGraphStrings.other = this.cast("other")
  @scala.inline
  def unknownFutureValue: typingsSlinky.microsoftGraph.microsoftGraphStrings.unknownFutureValue = this.cast("unknownFutureValue")
}

