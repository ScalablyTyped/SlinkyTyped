package typingsSlinky.nodegit.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("nodegit", "Index")
@js.native
class Index ()
  extends typingsSlinky.nodegit.indexMod.Index
/* static members */
object Index {
  
  @JSImport("nodegit", "Index.entryIsConflict")
  @js.native
  def entryIsConflict(entry: typingsSlinky.nodegit.indexEntryMod.IndexEntry): Boolean = js.native
  
  @JSImport("nodegit", "Index.entryStage")
  @js.native
  def entryStage(entry: typingsSlinky.nodegit.indexEntryMod.IndexEntry): Double = js.native
  
  @JSImport("nodegit", "Index.open")
  @js.native
  def open(indexPath: String): js.Promise[typingsSlinky.nodegit.indexMod.Index] = js.native
}
