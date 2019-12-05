package typingsSlinky.jsforce.bulkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.jsforce.jsforceStrings.insert
  - typings.jsforce.jsforceStrings.update
  - typings.jsforce.jsforceStrings.upsert
  - typings.jsforce.jsforceStrings.delete
  - typings.jsforce.jsforceStrings.hardDelete
*/
trait BulkLoadOperation extends js.Object

object BulkLoadOperation {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def delete: typingsSlinky.jsforce.jsforceStrings.delete = this.cast("delete")
  @scala.inline
  def hardDelete: typingsSlinky.jsforce.jsforceStrings.hardDelete = this.cast("hardDelete")
  @scala.inline
  def insert: typingsSlinky.jsforce.jsforceStrings.insert = this.cast("insert")
  @scala.inline
  def update: typingsSlinky.jsforce.jsforceStrings.update = this.cast("update")
  @scala.inline
  def upsert: typingsSlinky.jsforce.jsforceStrings.upsert = this.cast("upsert")
}

