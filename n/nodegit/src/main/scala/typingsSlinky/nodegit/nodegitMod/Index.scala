package typingsSlinky.nodegit.nodegitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit", "Index")
@js.native
class Index ()
  extends typingsSlinky.nodegit.indexUnderscoreMod.Index

/* static members */
@JSImport("nodegit", "Index")
@js.native
object Index extends js.Object {
  def entryIsConflict(entry: typingsSlinky.nodegit.indexDashEntryMod.IndexEntry): Boolean = js.native
  def entryStage(entry: typingsSlinky.nodegit.indexDashEntryMod.IndexEntry): Double = js.native
  def open(indexPath: String): js.Promise[typingsSlinky.nodegit.indexUnderscoreMod.Index] = js.native
}

