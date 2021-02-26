package typingsSlinky.awsSdk.eventbridgeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StartReplayResponse extends StObject {
  
  /**
    * The ARN of the replay.
    */
  var ReplayArn: js.UndefOr[typingsSlinky.awsSdk.eventbridgeMod.ReplayArn] = js.native
  
  /**
    * The time at which the replay started.
    */
  var ReplayStartTime: js.UndefOr[js.Date] = js.native
  
  /**
    * The state of the replay.
    */
  var State: js.UndefOr[ReplayState] = js.native
  
  /**
    * The reason that the replay is in the state.
    */
  var StateReason: js.UndefOr[ReplayStateReason] = js.native
}
object StartReplayResponse {
  
  @scala.inline
  def apply(): StartReplayResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartReplayResponse]
  }
  
  @scala.inline
  implicit class StartReplayResponseMutableBuilder[Self <: StartReplayResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReplayArn(value: ReplayArn): Self = StObject.set(x, "ReplayArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplayArnUndefined: Self = StObject.set(x, "ReplayArn", js.undefined)
    
    @scala.inline
    def setReplayStartTime(value: js.Date): Self = StObject.set(x, "ReplayStartTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplayStartTimeUndefined: Self = StObject.set(x, "ReplayStartTime", js.undefined)
    
    @scala.inline
    def setState(value: ReplayState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateReason(value: ReplayStateReason): Self = StObject.set(x, "StateReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateReasonUndefined: Self = StObject.set(x, "StateReason", js.undefined)
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
  }
}
