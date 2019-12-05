package typingsSlinky.documentdb.documentdbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.documentdb.documentdbStrings.None
  - typings.documentdb.documentdbStrings.Read
  - typings.documentdb.documentdbStrings.All
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

