package typingsSlinky.awsSdk.cloudwatcheventsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Replay extends StObject {
  
  /**
    * A time stamp for the time to start replaying events. Any event with a creation time prior to the EventEndTime specified is replayed.
    */
  var EventEndTime: js.UndefOr[js.Date] = js.native
  
  /**
    * A time stamp for the time that the last event was replayed.
    */
  var EventLastReplayedTime: js.UndefOr[js.Date] = js.native
  
  /**
    * The ARN of the archive to replay event from.
    */
  var EventSourceArn: js.UndefOr[Arn] = js.native
  
  /**
    * A time stamp for the time to start replaying events. This is determined by the time in the event as described in Time.
    */
  var EventStartTime: js.UndefOr[js.Date] = js.native
  
  /**
    * A time stamp for the time that the replay completed.
    */
  var ReplayEndTime: js.UndefOr[js.Date] = js.native
  
  /**
    * The name of the replay.
    */
  var ReplayName: js.UndefOr[typingsSlinky.awsSdk.cloudwatcheventsMod.ReplayName] = js.native
  
  /**
    * A time stamp for the time that the replay started.
    */
  var ReplayStartTime: js.UndefOr[js.Date] = js.native
  
  /**
    * The current state of the replay.
    */
  var State: js.UndefOr[ReplayState] = js.native
  
  /**
    * A description of why the replay is in the current state.
    */
  var StateReason: js.UndefOr[ReplayStateReason] = js.native
}
object Replay {
  
  @scala.inline
  def apply(): Replay = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Replay]
  }
  
  @scala.inline
  implicit class ReplayMutableBuilder[Self <: Replay] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEventEndTime(value: js.Date): Self = StObject.set(x, "EventEndTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventEndTimeUndefined: Self = StObject.set(x, "EventEndTime", js.undefined)
    
    @scala.inline
    def setEventLastReplayedTime(value: js.Date): Self = StObject.set(x, "EventLastReplayedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventLastReplayedTimeUndefined: Self = StObject.set(x, "EventLastReplayedTime", js.undefined)
    
    @scala.inline
    def setEventSourceArn(value: Arn): Self = StObject.set(x, "EventSourceArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventSourceArnUndefined: Self = StObject.set(x, "EventSourceArn", js.undefined)
    
    @scala.inline
    def setEventStartTime(value: js.Date): Self = StObject.set(x, "EventStartTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventStartTimeUndefined: Self = StObject.set(x, "EventStartTime", js.undefined)
    
    @scala.inline
    def setReplayEndTime(value: js.Date): Self = StObject.set(x, "ReplayEndTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplayEndTimeUndefined: Self = StObject.set(x, "ReplayEndTime", js.undefined)
    
    @scala.inline
    def setReplayName(value: ReplayName): Self = StObject.set(x, "ReplayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplayNameUndefined: Self = StObject.set(x, "ReplayName", js.undefined)
    
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
