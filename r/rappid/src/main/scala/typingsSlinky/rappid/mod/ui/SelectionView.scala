package typingsSlinky.rappid.mod.ui

import typingsSlinky.backbone.mod.Collection
import typingsSlinky.backbone.mod.Model
import typingsSlinky.backbone.mod.ModelSetOptions
import typingsSlinky.jointjs.mod.dia.Cell
import typingsSlinky.jointjs.mod.dia.CellView
import typingsSlinky.jointjs.mod.dia.Paper
import typingsSlinky.rappid.anon.Graph
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rappid", "ui.SelectionView")
@js.native
class SelectionView protected ()
  extends Model[js.Any, ModelSetOptions] {
  def this(opt: Graph) = this()
  var graph: typingsSlinky.jointjs.mod.dia.Graph = js.native
  var model: Collection[Cell] = js.native
  var paper: Paper = js.native
  def addHandle(handle: Handle): Unit = js.native
  def cancelSelection(): Unit = js.native
  def changeHandle(name: String, handle: Handle): Unit = js.native
  def createSelectionBox(cellView: CellView): Unit = js.native
  def destroySelectionBox(cellView: CellView): Unit = js.native
  def removeHandle(name: String): Unit = js.native
  def startSelecting(evt: js.Any): Unit = js.native
}

