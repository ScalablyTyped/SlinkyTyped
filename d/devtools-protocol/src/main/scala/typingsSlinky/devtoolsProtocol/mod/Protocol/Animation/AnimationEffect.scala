package typingsSlinky.devtoolsProtocol.mod.Protocol.Animation

import typingsSlinky.devtoolsProtocol.mod.Protocol.DOM.BackendNodeId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnimationEffect extends StObject {
  
  /**
    * `AnimationEffect`'s target node.
    */
  var backendNodeId: js.UndefOr[BackendNodeId] = js.native
  
  /**
    * `AnimationEffect`'s delay.
    */
  var delay: Double = js.native
  
  /**
    * `AnimationEffect`'s playback direction.
    */
  var direction: String = js.native
  
  /**
    * `AnimationEffect`'s iteration duration.
    */
  var duration: Double = js.native
  
  /**
    * `AnimationEffect`'s timing function.
    */
  var easing: String = js.native
  
  /**
    * `AnimationEffect`'s end delay.
    */
  var endDelay: Double = js.native
  
  /**
    * `AnimationEffect`'s fill mode.
    */
  var fill: String = js.native
  
  /**
    * `AnimationEffect`'s iteration start.
    */
  var iterationStart: Double = js.native
  
  /**
    * `AnimationEffect`'s iterations.
    */
  var iterations: Double = js.native
  
  /**
    * `AnimationEffect`'s keyframes.
    */
  var keyframesRule: js.UndefOr[KeyframesRule] = js.native
}
object AnimationEffect {
  
  @scala.inline
  def apply(
    delay: Double,
    direction: String,
    duration: Double,
    easing: String,
    endDelay: Double,
    fill: String,
    iterationStart: Double,
    iterations: Double
  ): AnimationEffect = {
    val __obj = js.Dynamic.literal(delay = delay.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], easing = easing.asInstanceOf[js.Any], endDelay = endDelay.asInstanceOf[js.Any], fill = fill.asInstanceOf[js.Any], iterationStart = iterationStart.asInstanceOf[js.Any], iterations = iterations.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimationEffect]
  }
  
  @scala.inline
  implicit class AnimationEffectMutableBuilder[Self <: AnimationEffect] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackendNodeId(value: BackendNodeId): Self = StObject.set(x, "backendNodeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackendNodeIdUndefined: Self = StObject.set(x, "backendNodeId", js.undefined)
    
    @scala.inline
    def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirection(value: String): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEasing(value: String): Self = StObject.set(x, "easing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndDelay(value: Double): Self = StObject.set(x, "endDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFill(value: String): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIterationStart(value: Double): Self = StObject.set(x, "iterationStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIterations(value: Double): Self = StObject.set(x, "iterations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyframesRule(value: KeyframesRule): Self = StObject.set(x, "keyframesRule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyframesRuleUndefined: Self = StObject.set(x, "keyframesRule", js.undefined)
  }
}
