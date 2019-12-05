package typingsSlinky.documentdb.documentdbMod

import typingsSlinky.documentdb.documentdbStrings.all_
import typingsSlinky.documentdb.documentdbStrings.create_
import typingsSlinky.documentdb.documentdbStrings.delete_
import typingsSlinky.documentdb.documentdbStrings.replace_
import typingsSlinky.documentdb.documentdbStrings.update_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.documentdb.documentdbStrings.All
  - typings.documentdb.documentdbStrings.Create
  - typings.documentdb.documentdbStrings.Update
  - typings.documentdb.documentdbStrings.Delete
  - typings.documentdb.documentdbStrings.Replace
  - typings.documentdb.documentdbStrings.all_
  - typings.documentdb.documentdbStrings.create_
  - typings.documentdb.documentdbStrings.update_
  - typings.documentdb.documentdbStrings.delete_
  - typings.documentdb.documentdbStrings.replace_
*/
trait TriggerOperation extends js.Object

object TriggerOperation {
  @scala.inline
  def All: typingsSlinky.documentdb.documentdbStrings.All = this.cast("All")
  @scala.inline
  def Create: typingsSlinky.documentdb.documentdbStrings.Create = this.cast("Create")
  @scala.inline
  def Delete: typingsSlinky.documentdb.documentdbStrings.Delete = this.cast("Delete")
  @scala.inline
  def Replace: typingsSlinky.documentdb.documentdbStrings.Replace = this.cast("Replace")
  @scala.inline
  def Update: typingsSlinky.documentdb.documentdbStrings.Update = this.cast("Update")
  @scala.inline
  def all: all_ = this.cast("all")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def create: create_ = this.cast("create")
  @scala.inline
  def delete: delete_ = this.cast("delete")
  @scala.inline
  def replace: replace_ = this.cast("replace")
  @scala.inline
  def update: update_ = this.cast("update")
}

