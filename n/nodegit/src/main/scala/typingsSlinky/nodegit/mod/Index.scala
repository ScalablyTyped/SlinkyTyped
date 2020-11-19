package typingsSlinky.nodegit.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("nodegit", "Index")
@js.native
class Index ()
  extends typingsSlinky.nodegit.indexMod.Index
/* static members */
@JSImport("nodegit", "Index")
@js.native
object Index extends js.Object {
  
  def entryIsConflict(entry: typingsSlinky.nodegit.indexEntryMod.IndexEntry): Boolean = js.native
  
  def entryStage(entry: typingsSlinky.nodegit.indexEntryMod.IndexEntry): Double = js.native
  
  def open(indexPath: String): js.Promise[typingsSlinky.nodegit.indexMod.Index] = js.native
}
