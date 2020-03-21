package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.deviceDefault
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.alphanumeric
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.numeric
*/
trait RequiredPasswordType extends js.Object

object RequiredPasswordType {
  @scala.inline
  def alphanumeric: typingsSlinky.microsoftGraph.microsoftGraphStrings.alphanumeric = this.cast("alphanumeric")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def deviceDefault: typingsSlinky.microsoftGraph.microsoftGraphStrings.deviceDefault = this.cast("deviceDefault")
  @scala.inline
  def numeric: typingsSlinky.microsoftGraph.microsoftGraphStrings.numeric = this.cast("numeric")
}

