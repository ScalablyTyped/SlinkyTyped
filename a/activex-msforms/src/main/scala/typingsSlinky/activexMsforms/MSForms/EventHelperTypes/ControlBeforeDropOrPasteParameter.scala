package typingsSlinky.activexMsforms.MSForms.EventHelperTypes

import typingsSlinky.activexMsforms.MSForms.DataObject
import typingsSlinky.activexMsforms.MSForms.ReturnBoolean
import typingsSlinky.activexMsforms.MSForms.ReturnEffect
import typingsSlinky.activexMsforms.MSForms.fmAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ControlBeforeDropOrPasteParameter extends js.Object {
  
  val Action: fmAction = js.native
  
  val Cancel: ReturnBoolean = js.native
  
  val Data: DataObject = js.native
  
  val Effect: ReturnEffect = js.native
  
  val Shift: Double = js.native
  
  val X: Double = js.native
  
  val Y: Double = js.native
}
object ControlBeforeDropOrPasteParameter {
  
  @scala.inline
  def apply(
    Action: fmAction,
    Cancel: ReturnBoolean,
    Data: DataObject,
    Effect: ReturnEffect,
    Shift: Double,
    X: Double,
    Y: Double
  ): ControlBeforeDropOrPasteParameter = {
    val __obj = js.Dynamic.literal(Action = Action.asInstanceOf[js.Any], Cancel = Cancel.asInstanceOf[js.Any], Data = Data.asInstanceOf[js.Any], Effect = Effect.asInstanceOf[js.Any], Shift = Shift.asInstanceOf[js.Any], X = X.asInstanceOf[js.Any], Y = Y.asInstanceOf[js.Any])
    __obj.asInstanceOf[ControlBeforeDropOrPasteParameter]
  }
  
  @scala.inline
  implicit class ControlBeforeDropOrPasteParameterOps[Self <: ControlBeforeDropOrPasteParameter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAction(value: fmAction): Self = this.set("Action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCancel(value: ReturnBoolean): Self = this.set("Cancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setData(value: DataObject): Self = this.set("Data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEffect(value: ReturnEffect): Self = this.set("Effect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShift(value: Double): Self = this.set("Shift", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX(value: Double): Self = this.set("X", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: Double): Self = this.set("Y", value.asInstanceOf[js.Any])
  }
}
