package typingsSlinky.activexMsforms.MSForms.EventHelperTypes

import typingsSlinky.activexMsforms.MSForms.DataObject
import typingsSlinky.activexMsforms.MSForms.ReturnBoolean
import typingsSlinky.activexMsforms.MSForms.ReturnEffect
import typingsSlinky.activexMsforms.MSForms.fmDragState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabStripBeforeDragOverParameter extends js.Object {
  val Cancel: ReturnBoolean
  val Data: DataObject
  val DragState: fmDragState
  val Effect: ReturnEffect
  val Index: Double
  val Shift: Double
  val X: Double
  val Y: Double
}

object TabStripBeforeDragOverParameter {
  @scala.inline
  def apply(
    Cancel: ReturnBoolean,
    Data: DataObject,
    DragState: fmDragState,
    Effect: ReturnEffect,
    Index: Double,
    Shift: Double,
    X: Double,
    Y: Double
  ): TabStripBeforeDragOverParameter = {
    val __obj = js.Dynamic.literal(Cancel = Cancel.asInstanceOf[js.Any], Data = Data.asInstanceOf[js.Any], DragState = DragState.asInstanceOf[js.Any], Effect = Effect.asInstanceOf[js.Any], Index = Index.asInstanceOf[js.Any], Shift = Shift.asInstanceOf[js.Any], X = X.asInstanceOf[js.Any], Y = Y.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TabStripBeforeDragOverParameter]
  }
}

