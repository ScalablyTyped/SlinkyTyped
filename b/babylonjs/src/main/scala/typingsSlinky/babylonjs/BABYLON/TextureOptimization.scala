package typingsSlinky.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextureOptimization extends SceneOptimization {
  /**
    * Defines the maximum sized allowed for textures (1024 is the default value). If a texture is bigger, it will be scaled down using a factor defined by the step parameter
    */
  var maximumSize: Double = js.native
  /**
    * Defines the factor (0.5 by default) used to scale down textures bigger than maximum sized allowed.
    */
  var step: Double = js.native
}

object TextureOptimization {
  @scala.inline
  def apply(
    apply: (Scene, SceneOptimizer) => Boolean,
    getDescription: () => String,
    maximumSize: Double,
    priority: Double,
    step: Double
  ): TextureOptimization = {
    val __obj = js.Dynamic.literal(apply = js.Any.fromFunction2(apply), getDescription = js.Any.fromFunction0(getDescription), maximumSize = maximumSize.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any], step = step.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextureOptimization]
  }
  @scala.inline
  implicit class TextureOptimizationOps[Self <: TextureOptimization] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMaximumSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximumSize")(value.asInstanceOf[js.Any])
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

