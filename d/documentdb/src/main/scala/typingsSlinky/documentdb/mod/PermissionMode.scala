package typingsSlinky.documentdb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.documentdb.documentdbStrings.None
  - typingsSlinky.documentdb.documentdbStrings.Read
  - typingsSlinky.documentdb.documentdbStrings.All
*/
trait PermissionMode extends js.Object

object PermissionMode {
  @scala.inline
  def All: typingsSlinky.documentdb.documentdbStrings.All = this.cast("All")
  @scala.inline
  def None: typingsSlinky.documentdb.documentdbStrings.None = this.cast("None")
  @scala.inline
  def Read: typingsSlinky.documentdb.documentdbStrings.Read = this.cast("Read")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

