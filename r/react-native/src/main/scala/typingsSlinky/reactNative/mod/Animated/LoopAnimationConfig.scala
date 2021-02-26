package typingsSlinky.reactNative.mod.Animated

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LoopAnimationConfig extends StObject {
  
  var iterations: js.UndefOr[Double] = js.native
  
  // default -1 for infinite
  /**
    * Defaults to `true`
    */
  var resetBeforeIteration: js.UndefOr[Boolean] = js.native
}
object LoopAnimationConfig {
  
  @scala.inline
  def apply(): LoopAnimationConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoopAnimationConfig]
  }
  
  @scala.inline
  implicit class LoopAnimationConfigMutableBuilder[Self <: LoopAnimationConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIterations(value: Double): Self = StObject.set(x, "iterations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIterationsUndefined: Self = StObject.set(x, "iterations", js.undefined)
    
    @scala.inline
    def setResetBeforeIteration(value: Boolean): Self = StObject.set(x, "resetBeforeIteration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResetBeforeIterationUndefined: Self = StObject.set(x, "resetBeforeIteration", js.undefined)
  }
}
