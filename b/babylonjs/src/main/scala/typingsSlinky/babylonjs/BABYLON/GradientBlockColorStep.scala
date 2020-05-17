package typingsSlinky.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
    def withColor(value: Color3): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStep(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("step")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

