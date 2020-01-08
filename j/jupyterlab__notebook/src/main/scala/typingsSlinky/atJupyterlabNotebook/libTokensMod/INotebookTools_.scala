package typingsSlinky.atJupyterlabNotebook.libTokensMod

import typingsSlinky.atJupyterlabCells.atJupyterlabCellsMod.Cell
import typingsSlinky.atJupyterlabNotebook.libNotebooktoolsMod.NotebookTools.IAddOptions
import typingsSlinky.atJupyterlabNotebook.libPanelMod.NotebookPanel
import typingsSlinky.atPhosphorWidgets.atPhosphorWidgetsMod.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSName("INotebookTools")
@js.native
trait INotebookTools_ extends Widget {
  var activeCell: Cell | Null = js.native
  var activeNotebookPanel: NotebookPanel | Null = js.native
  var selectedCells: js.Array[Cell] = js.native
  def addItem(options: IAddOptions): Unit = js.native
}

