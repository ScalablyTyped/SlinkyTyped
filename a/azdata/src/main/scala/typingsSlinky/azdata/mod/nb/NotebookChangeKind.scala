package typingsSlinky.azdata.mod.nb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait NotebookChangeKind extends StObject
@JSImport("azdata", "nb.NotebookChangeKind")
@js.native
object NotebookChangeKind extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[NotebookChangeKind with Double] = js.native
  
  @js.native
  sealed trait CellExecuted extends NotebookChangeKind
  /* 3 */ val CellExecuted: typingsSlinky.azdata.mod.nb.NotebookChangeKind.CellExecuted with Double = js.native
  
  @js.native
  sealed trait ContentUpdated extends NotebookChangeKind
  /* 0 */ val ContentUpdated: typingsSlinky.azdata.mod.nb.NotebookChangeKind.ContentUpdated with Double = js.native
  
  @js.native
  sealed trait MetadataUpdated extends NotebookChangeKind
  /* 1 */ val MetadataUpdated: typingsSlinky.azdata.mod.nb.NotebookChangeKind.MetadataUpdated with Double = js.native
  
  @js.native
  sealed trait Save extends NotebookChangeKind
  /* 2 */ val Save: typingsSlinky.azdata.mod.nb.NotebookChangeKind.Save with Double = js.native
}
