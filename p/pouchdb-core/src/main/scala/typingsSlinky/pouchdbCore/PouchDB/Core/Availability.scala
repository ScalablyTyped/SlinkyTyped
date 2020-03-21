package typingsSlinky.pouchdbCore.PouchDB.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.pouchdbCore.pouchdbCoreStrings.available
  - typingsSlinky.pouchdbCore.pouchdbCoreStrings.compacted
  - typingsSlinky.pouchdbCore.pouchdbCoreStrings.`not compacted`
  - typingsSlinky.pouchdbCore.pouchdbCoreStrings.missing
*/
trait Availability extends js.Object

object Availability {
  @scala.inline
  def available: typingsSlinky.pouchdbCore.pouchdbCoreStrings.available = this.cast("available")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def compacted: typingsSlinky.pouchdbCore.pouchdbCoreStrings.compacted = this.cast("compacted")
  @scala.inline
  def missing: typingsSlinky.pouchdbCore.pouchdbCoreStrings.missing = this.cast("missing")
  @scala.inline
  def `not compacted`: typingsSlinky.pouchdbCore.pouchdbCoreStrings.`not compacted` = this.cast("not compacted")
}

