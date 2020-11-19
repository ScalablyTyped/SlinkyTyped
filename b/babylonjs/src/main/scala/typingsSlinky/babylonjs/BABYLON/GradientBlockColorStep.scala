package typingsSlinky.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GradientBlockColorStep extends js.Object {
  
  /**
    * Gets or sets the color associated with this step
    */
  var color: Color3 = js.native
  
  /**
    * Gets or sets a value indicating which step this color is associated with (between 0 and 1)
    */
  var step: Double = js.native
}
object GradientBlockColorStep {
  
  @scala.inline
  def apply(color: Color3, step: Double): GradientBlockColorStep = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], step = step.asInstanceOf[js.Any])
    __obj.asInstanceOf[GradientBlockColorStep]
  }
  
  @scala.inline
  implicit class GradientBlockColorStepOps[Self <: GradientBlockColorStep] (val x: Self) extends AnyVal {
    
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
    def setColor(value: Color3): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStep(value: Double): Self = this.set("step", value.asInstanceOf[js.Any])
  }
}
