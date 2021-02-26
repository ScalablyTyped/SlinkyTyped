package typingsSlinky.awsSdk.swfMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActivityTaskStartedEventAttributes extends StObject {
  
  /**
    * Identity of the worker that was assigned this task. This aids diagnostics when problems arise. The form of this identity is user defined.
    */
  var identity: js.UndefOr[Identity] = js.native
  
  /**
    * The ID of the ActivityTaskScheduled event that was recorded when this activity task was scheduled. This information can be useful for diagnosing problems by tracing back the chain of events leading up to this event.
    */
  var scheduledEventId: EventId = js.native
}
object ActivityTaskStartedEventAttributes {
  
  @scala.inline
  def apply(scheduledEventId: EventId): ActivityTaskStartedEventAttributes = {
    val __obj = js.Dynamic.literal(scheduledEventId = scheduledEventId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActivityTaskStartedEventAttributes]
  }
  
  @scala.inline
  implicit class ActivityTaskStartedEventAttributesMutableBuilder[Self <: ActivityTaskStartedEventAttributes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIdentity(value: Identity): Self = StObject.set(x, "identity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentityUndefined: Self = StObject.set(x, "identity", js.undefined)
    
    @scala.inline
    def setScheduledEventId(value: EventId): Self = StObject.set(x, "scheduledEventId", value.asInstanceOf[js.Any])
  }
}
