package typingsSlinky.activexDashMsforms.MSForms.EventHelperTypes

import typingsSlinky.activexDashMsforms.MSForms.Control
import typingsSlinky.activexDashMsforms.MSForms.DataObject
import typingsSlinky.activexDashMsforms.MSForms.ReturnBoolean
import typingsSlinky.activexDashMsforms.MSForms.ReturnEffect
import typingsSlinky.activexDashMsforms.MSForms.fmDragState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MultiPage_BeforeDragOver_Parameter extends js.Object {
  val Cancel: ReturnBoolean
  val Control: typingsSlinky.activexDashMsforms.MSForms.Control
  val Data: DataObject
  val Effect: ReturnEffect
  val Index: Double
  val Shift: Double
  val State: fmDragState
  val X: Double
  val Y: Double
}

object MultiPage_BeforeDragOver_Parameter {
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
  ): MultiPage_BeforeDragOver_Parameter = {
    val __obj = js.Dynamic.literal(Cancel = Cancel.asInstanceOf[js.Any], Control = Control.asInstanceOf[js.Any], Data = Data.asInstanceOf[js.Any], Effect = Effect.asInstanceOf[js.Any], Index = Index.asInstanceOf[js.Any], Shift = Shift.asInstanceOf[js.Any], State = State.asInstanceOf[js.Any], X = X.asInstanceOf[js.Any], Y = Y.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MultiPage_BeforeDragOver_Parameter]
  }
}

