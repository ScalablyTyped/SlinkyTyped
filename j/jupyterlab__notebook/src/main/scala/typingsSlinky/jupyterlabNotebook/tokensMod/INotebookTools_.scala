package typingsSlinky.jupyterlabNotebook.tokensMod

import typingsSlinky.jupyterlabCells.mod.Cell
import typingsSlinky.jupyterlabNotebook.notebooktoolsMod.NotebookTools.IAddOptions
import typingsSlinky.jupyterlabNotebook.panelMod.NotebookPanel
import typingsSlinky.phosphorWidgets.mod.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait INotebookTools_ extends Widget {
  var activeCell: Cell | Null = js.native
  var activeNotebookPanel: NotebookPanel | Null = js.native
  var selectedCells: js.Array[Cell] = js.native
  def addItem(options: IAddOptions): Unit = js.native
}

