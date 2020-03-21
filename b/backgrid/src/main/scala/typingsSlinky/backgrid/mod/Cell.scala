package typingsSlinky.backgrid.mod

import typingsSlinky.backbone.mod.Model
import typingsSlinky.backbone.mod.View
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("backgrid", "Cell")
@js.native
class Cell () extends View[Model] {
  var editor: InputCellEditor = js.native
  var formatter: CellFormatter = js.native
  def enterEditMode(): js.Any = js.native
  def exitEditMode(): js.Any = js.native
  def renderError(): js.Any = js.native
}

