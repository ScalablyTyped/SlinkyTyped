package typingsSlinky.ecol.collectionEventMod.CollectionEvent

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.ecol.ecolStrings.insert
  - typingsSlinky.ecol.ecolStrings.erase
  - typingsSlinky.ecol.ecolStrings.refresh
*/
trait Type extends js.Object

object Type {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def erase: typingsSlinky.ecol.ecolStrings.erase = this.cast("erase")
  @scala.inline
  def insert: typingsSlinky.ecol.ecolStrings.insert = this.cast("insert")
  @scala.inline
  def refresh: typingsSlinky.ecol.ecolStrings.refresh = this.cast("refresh")
}

