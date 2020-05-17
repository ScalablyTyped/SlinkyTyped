package typingsSlinky.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HardwareScalingOptimization extends SceneOptimization {
  var _currentScale: js.Any = js.native
  var _directionOffset: js.Any = js.native
  /**
    * Defines the maximum scale to use (2 by default)
    */
  var maximumScale: Double = js.native
  /**
    * Defines the step to use between two passes (0.5 by default)
    */
  var step: Double = js.native
}

object HardwareScalingOptimization {
  @scala.inline
  def apply(
    _currentScale: js.Any,
    _directionOffset: js.Any,
    apply: (Scene, SceneOptimizer) => Boolean,
    getDescription: () => String,
    maximumScale: Double,
    priority: Double,
    step: Double
  ): HardwareScalingOptimization = {
    val __obj = js.Dynamic.literal(_currentScale = _currentScale.asInstanceOf[js.Any], _directionOffset = _directionOffset.asInstanceOf[js.Any], apply = js.Any.fromFunction2(apply), getDescription = js.Any.fromFunction0(getDescription), maximumScale = maximumScale.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any], step = step.asInstanceOf[js.Any])
    __obj.asInstanceOf[HardwareScalingOptimization]
  }
  @scala.inline
  implicit class HardwareScalingOptimizationOps[Self <: HardwareScalingOptimization] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_currentScale(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_currentScale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_directionOffset(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_directionOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaximumScale(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximumScale")(value.asInstanceOf[js.Any])
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

