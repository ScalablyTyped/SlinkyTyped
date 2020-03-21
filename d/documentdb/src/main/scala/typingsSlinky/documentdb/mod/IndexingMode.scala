package typingsSlinky.documentdb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.documentdb.documentdbStrings.Consistent
  - typingsSlinky.documentdb.documentdbStrings.Lazy
*/
trait IndexingMode extends js.Object

object IndexingMode {
  @scala.inline
  def Consistent: typingsSlinky.documentdb.documentdbStrings.Consistent = this.cast("Consistent")
  @scala.inline
  def Lazy: typingsSlinky.documentdb.documentdbStrings.Lazy = this.cast("Lazy")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

