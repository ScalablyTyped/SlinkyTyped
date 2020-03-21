package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.created
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.updated
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.deleted
*/
trait ChangeType extends js.Object

object ChangeType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def created: typingsSlinky.microsoftGraph.microsoftGraphStrings.created = this.cast("created")
  @scala.inline
  def deleted: typingsSlinky.microsoftGraph.microsoftGraphStrings.deleted = this.cast("deleted")
  @scala.inline
  def updated: typingsSlinky.microsoftGraph.microsoftGraphStrings.updated = this.cast("updated")
}

