package typingsSlinky.awsSdk.swfMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CancelTimerDecisionAttributes extends StObject {
  
  /**
    *  The unique ID of the timer to cancel.
    */
  var timerId: TimerId = js.native
}
object CancelTimerDecisionAttributes {
  
  @scala.inline
  def apply(timerId: TimerId): CancelTimerDecisionAttributes = {
    val __obj = js.Dynamic.literal(timerId = timerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelTimerDecisionAttributes]
  }
  
  @scala.inline
  implicit class CancelTimerDecisionAttributesMutableBuilder[Self <: CancelTimerDecisionAttributes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTimerId(value: TimerId): Self = StObject.set(x, "timerId", value.asInstanceOf[js.Any])
  }
}
