package typingsSlinky.handsontable.handsontableMod.Handsontable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object plugins {
  import typingsSlinky.handsontable.handsontableMod.Handsontable.plugins.UndoRedoAction.Change
  import typingsSlinky.handsontable.handsontableMod.Handsontable.plugins.UndoRedoAction.Filter
  import typingsSlinky.handsontable.handsontableMod.Handsontable.plugins.UndoRedoAction.InsertCol
  import typingsSlinky.handsontable.handsontableMod.Handsontable.plugins.UndoRedoAction.InsertRow
  import typingsSlinky.handsontable.handsontableMod.Handsontable.plugins.UndoRedoAction.RemoveCol
  import typingsSlinky.handsontable.handsontableMod.Handsontable.plugins.UndoRedoAction.RemoveRow

  type CellReference = BaseCell
  type Parser = js.Object
  type UndoRedoAction = Change | InsertRow | RemoveRow | InsertCol | RemoveCol | Filter
}
