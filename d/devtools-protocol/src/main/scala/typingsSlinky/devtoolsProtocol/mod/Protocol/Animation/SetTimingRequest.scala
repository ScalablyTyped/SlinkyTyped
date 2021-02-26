package typingsSlinky.devtoolsProtocol.mod.Protocol.Animation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SetTimingRequest extends StObject {
  
  /**
    * Animation id.
    */
  var animationId: String = js.native
  
  /**
    * Delay of the animation.
    */
  var delay: Double = js.native
  
  /**
    * Duration of the animation.
    */
  var duration: Double = js.native
}
object SetTimingRequest {
  
  @scala.inline
  def apply(animationId: String, delay: Double, duration: Double): SetTimingRequest = {
    val __obj = js.Dynamic.literal(animationId = animationId.asInstanceOf[js.Any], delay = delay.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetTimingRequest]
  }
  
  @scala.inline
  implicit class SetTimingRequestMutableBuilder[Self <: SetTimingRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnimationId(value: String): Self = StObject.set(x, "animationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
  }
}
