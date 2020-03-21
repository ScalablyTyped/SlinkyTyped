package typingsSlinky.documentdb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.documentdb.documentdbStrings.Hash
  - typingsSlinky.documentdb.documentdbStrings.Range
  - typingsSlinky.documentdb.documentdbStrings.Spatial
*/
trait IndexKind extends js.Object

object IndexKind {
  @scala.inline
  def Hash: typingsSlinky.documentdb.documentdbStrings.Hash = this.cast("Hash")
  @scala.inline
  def Range: typingsSlinky.documentdb.documentdbStrings.Range = this.cast("Range")
  @scala.inline
  def Spatial: typingsSlinky.documentdb.documentdbStrings.Spatial = this.cast("Spatial")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

