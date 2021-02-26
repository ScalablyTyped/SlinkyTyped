package typingsSlinky.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  implicit class TextureOptimizationMutableBuilder[Self <: TextureOptimization] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaximumSize(value: Double): Self = StObject.set(x, "maximumSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
  }
}
