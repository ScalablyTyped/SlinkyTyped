package typingsSlinky.antDesignReactNative.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MinuteStep extends StObject {
  
  var minuteStep: Double = js.native
  
  var mode: String = js.native
  
  var use12Hours: Boolean = js.native
}
object MinuteStep {
  
  @scala.inline
  def apply(minuteStep: Double, mode: String, use12Hours: Boolean): MinuteStep = {
    val __obj = js.Dynamic.literal(minuteStep = minuteStep.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], use12Hours = use12Hours.asInstanceOf[js.Any])
    __obj.asInstanceOf[MinuteStep]
  }
  
  @scala.inline
  implicit class MinuteStepMutableBuilder[Self <: MinuteStep] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMinuteStep(value: Double): Self = StObject.set(x, "minuteStep", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUse12Hours(value: Boolean): Self = StObject.set(x, "use12Hours", value.asInstanceOf[js.Any])
  }
}
