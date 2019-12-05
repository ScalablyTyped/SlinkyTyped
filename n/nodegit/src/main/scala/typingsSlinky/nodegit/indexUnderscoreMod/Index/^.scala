package typingsSlinky.nodegit.indexUnderscoreMod.Index

import typingsSlinky.nodegit.indexDashEntryMod.IndexEntry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit/index_", "Index")
@js.native
object ^ extends js.Object {
  def entryIsConflict(entry: IndexEntry): Boolean = js.native
  def entryStage(entry: IndexEntry): Double = js.native
  def open(indexPath: String): js.Promise[typingsSlinky.nodegit.indexUnderscoreMod.Index] = js.native
}

