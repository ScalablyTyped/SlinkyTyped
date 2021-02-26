package typingsSlinky.cesium.anon

import typingsSlinky.cesium.mod.JulianDate
import typingsSlinky.cesium.mod.ModelAnimationLoop
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Delay extends StObject {
  
  var delay: js.UndefOr[Double] = js.native
  
  var loop: js.UndefOr[ModelAnimationLoop] = js.native
  
  var name: String = js.native
  
  var removeOnStop: js.UndefOr[Boolean] = js.native
  
  var reverse: js.UndefOr[Boolean] = js.native
  
  var speedup: js.UndefOr[Double] = js.native
  
  var startTime: js.UndefOr[JulianDate] = js.native
  
  var stopTime: js.UndefOr[JulianDate] = js.native
}
object Delay {
  
  @scala.inline
  def apply(name: String): Delay = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Delay]
  }
  
  @scala.inline
  implicit class DelayMutableBuilder[Self <: Delay] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
    
    @scala.inline
    def setLoop(value: ModelAnimationLoop): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoopUndefined: Self = StObject.set(x, "loop", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveOnStop(value: Boolean): Self = StObject.set(x, "removeOnStop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveOnStopUndefined: Self = StObject.set(x, "removeOnStop", js.undefined)
    
    @scala.inline
    def setReverse(value: Boolean): Self = StObject.set(x, "reverse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReverseUndefined: Self = StObject.set(x, "reverse", js.undefined)
    
    @scala.inline
    def setSpeedup(value: Double): Self = StObject.set(x, "speedup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpeedupUndefined: Self = StObject.set(x, "speedup", js.undefined)
    
    @scala.inline
    def setStartTime(value: JulianDate): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    
    @scala.inline
    def setStopTime(value: JulianDate): Self = StObject.set(x, "stopTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStopTimeUndefined: Self = StObject.set(x, "stopTime", js.undefined)
  }
}
