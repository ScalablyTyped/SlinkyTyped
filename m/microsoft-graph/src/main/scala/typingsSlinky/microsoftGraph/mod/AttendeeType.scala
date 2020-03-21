package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.required
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.optional
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.resource
*/
trait AttendeeType extends js.Object

object AttendeeType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def optional: typingsSlinky.microsoftGraph.microsoftGraphStrings.optional = this.cast("optional")
  @scala.inline
  def required: typingsSlinky.microsoftGraph.microsoftGraphStrings.required = this.cast("required")
  @scala.inline
  def resource: typingsSlinky.microsoftGraph.microsoftGraphStrings.resource = this.cast("resource")
}

