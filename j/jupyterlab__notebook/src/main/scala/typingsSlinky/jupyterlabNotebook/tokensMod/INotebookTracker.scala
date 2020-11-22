package typingsSlinky.jupyterlabNotebook.tokensMod

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.jupyterlabApputils.widgettrackerMod.IWidgetTracker
import typingsSlinky.jupyterlabCells.mod.Cell
import typingsSlinky.jupyterlabNotebook.panelMod.NotebookPanel
import typingsSlinky.luminoCoreutils.mod.Token
import typingsSlinky.luminoSignaling.mod.ISignal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait INotebookTracker extends IWidgetTracker[NotebookPanel] {
  
  /**
    * The currently focused cell.
    *
    * #### Notes
    * If there is no cell with the focus, then this value is `null`.
    */
  val activeCell: Cell | Null = js.native
  
  /**
    * A signal emitted when the current active cell changes.
    *
    * #### Notes
    * If there is no cell with the focus, then `null` will be emitted.
    */
  val activeCellChanged: ISignal[this.type, Cell | Null] = js.native
  
  /**
    * A signal emitted when the selection state changes.
    */
  val selectionChanged: ISignal[this.type, Unit] = js.native
}
@JSImport("@jupyterlab/notebook/lib/tokens", "INotebookTracker")
@js.native
object INotebookTracker extends TopLevel[Token[INotebookTracker]]
