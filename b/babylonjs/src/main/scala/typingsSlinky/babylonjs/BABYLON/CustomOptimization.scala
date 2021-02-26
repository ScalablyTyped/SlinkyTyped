package typingsSlinky.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomOptimization extends SceneOptimization {
  
  /**
    * Callback called to apply the custom optimization.
    */
  def onApply(scene: Scene, optimizer: SceneOptimizer): Boolean = js.native
  
  /**
    * Callback called to get custom description
    */
  def onGetDescription(): String = js.native
}
object CustomOptimization {
  
  @scala.inline
  def apply(
    apply: (Scene, SceneOptimizer) => Boolean,
    getDescription: () => String,
    onApply: (Scene, SceneOptimizer) => Boolean,
    onGetDescription: () => String,
    priority: Double
  ): CustomOptimization = {
    val __obj = js.Dynamic.literal(apply = js.Any.fromFunction2(apply), getDescription = js.Any.fromFunction0(getDescription), onApply = js.Any.fromFunction2(onApply), onGetDescription = js.Any.fromFunction0(onGetDescription), priority = priority.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomOptimization]
  }
  
  @scala.inline
  implicit class CustomOptimizationMutableBuilder[Self <: CustomOptimization] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOnApply(value: (Scene, SceneOptimizer) => Boolean): Self = StObject.set(x, "onApply", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnGetDescription(value: () => String): Self = StObject.set(x, "onGetDescription", js.Any.fromFunction0(value))
  }
}
