package typingsSlinky.activexMsforms.MSForms.EventHelperTypes

import typingsSlinky.activexMsforms.MSForms.Control
import typingsSlinky.activexMsforms.MSForms.DataObject
import typingsSlinky.activexMsforms.MSForms.ReturnBoolean
import typingsSlinky.activexMsforms.MSForms.ReturnEffect
import typingsSlinky.activexMsforms.MSForms.fmAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MultiPageBeforeDropOrPasteParameter extends js.Object {
  val Action: fmAction
  val Cancel: ReturnBoolean
  val Control: typingsSlinky.activexMsforms.MSForms.Control
  val Data: DataObject
  val Effect: ReturnEffect
  val Index: Double
  val Shift: Double
  val X: Double
  val Y: Double
}

object MultiPageBeforeDropOrPasteParameter {
  @scala.inline
  def apply(
    Action: fmAction,
    Cancel: ReturnBoolean,
    Control: Control,
    Data: DataObject,
    Effect: ReturnEffect,
    Index: Double,
    Shift: Double,
    X: Double,
    Y: Double
  ): MultiPageBeforeDropOrPasteParameter = {
    val __obj = js.Dynamic.literal(Action = Action.asInstanceOf[js.Any], Cancel = Cancel.asInstanceOf[js.Any], Control = Control.asInstanceOf[js.Any], Data = Data.asInstanceOf[js.Any], Effect = Effect.asInstanceOf[js.Any], Index = Index.asInstanceOf[js.Any], Shift = Shift.asInstanceOf[js.Any], X = X.asInstanceOf[js.Any], Y = Y.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MultiPageBeforeDropOrPasteParameter]
  }
}

