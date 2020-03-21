package typingsSlinky.activexMsforms.MSForms.EventHelperTypes

import typingsSlinky.activexMsforms.MSForms.Control
import typingsSlinky.activexMsforms.MSForms.DataObject
import typingsSlinky.activexMsforms.MSForms.ReturnBoolean
import typingsSlinky.activexMsforms.MSForms.ReturnEffect
import typingsSlinky.activexMsforms.MSForms.fmDragState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MultiPageBeforeDragOverParameter extends js.Object {
  val Cancel: ReturnBoolean
  val Control: typingsSlinky.activexMsforms.MSForms.Control
  val Data: DataObject
  val Effect: ReturnEffect
  val Index: Double
  val Shift: Double
  val State: fmDragState
  val X: Double
  val Y: Double
}

object MultiPageBeforeDragOverParameter {
  @scala.inline
  def apply(
    Cancel: ReturnBoolean,
    Control: Control,
    Data: DataObject,
    Effect: ReturnEffect,
    Index: Double,
    Shift: Double,
    State: fmDragState,
    X: Double,
    Y: Double
  ): MultiPageBeforeDragOverParameter = {
    val __obj = js.Dynamic.literal(Cancel = Cancel.asInstanceOf[js.Any], Control = Control.asInstanceOf[js.Any], Data = Data.asInstanceOf[js.Any], Effect = Effect.asInstanceOf[js.Any], Index = Index.asInstanceOf[js.Any], Shift = Shift.asInstanceOf[js.Any], State = State.asInstanceOf[js.Any], X = X.asInstanceOf[js.Any], Y = Y.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MultiPageBeforeDragOverParameter]
  }
}

