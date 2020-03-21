package typingsSlinky.fsTreeDiff.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.fsTreeDiff.fsTreeDiffStrings.unlink
  - typingsSlinky.fsTreeDiff.fsTreeDiffStrings.rmdir
  - typingsSlinky.fsTreeDiff.fsTreeDiffStrings.mkdir
  - typingsSlinky.fsTreeDiff.fsTreeDiffStrings.create
  - typingsSlinky.fsTreeDiff.fsTreeDiffStrings.change
*/
trait ChangeType extends js.Object

object ChangeType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def change: typingsSlinky.fsTreeDiff.fsTreeDiffStrings.change = this.cast("change")
  @scala.inline
  def create: typingsSlinky.fsTreeDiff.fsTreeDiffStrings.create = this.cast("create")
  @scala.inline
  def mkdir: typingsSlinky.fsTreeDiff.fsTreeDiffStrings.mkdir = this.cast("mkdir")
  @scala.inline
  def rmdir: typingsSlinky.fsTreeDiff.fsTreeDiffStrings.rmdir = this.cast("rmdir")
  @scala.inline
  def unlink: typingsSlinky.fsTreeDiff.fsTreeDiffStrings.unlink = this.cast("unlink")
}

