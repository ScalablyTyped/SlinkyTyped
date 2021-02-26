package typingsSlinky.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SimpleCondition extends StObject {
  
  /**
    * The dimension settings for the event that's associated with the activity.
    */
  var EventCondition: js.UndefOr[typingsSlinky.awsSdk.pinpointMod.EventCondition] = js.native
  
  /**
    * The segment that's associated with the activity.
    */
  var SegmentCondition: js.UndefOr[typingsSlinky.awsSdk.pinpointMod.SegmentCondition] = js.native
  
  /**
    * The dimension settings for the segment that's associated with the activity.
    */
  var SegmentDimensions: js.UndefOr[typingsSlinky.awsSdk.pinpointMod.SegmentDimensions] = js.native
}
object SimpleCondition {
  
  @scala.inline
  def apply(): SimpleCondition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SimpleCondition]
  }
  
  @scala.inline
  implicit class SimpleConditionMutableBuilder[Self <: SimpleCondition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEventCondition(value: EventCondition): Self = StObject.set(x, "EventCondition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventConditionUndefined: Self = StObject.set(x, "EventCondition", js.undefined)
    
    @scala.inline
    def setSegmentCondition(value: SegmentCondition): Self = StObject.set(x, "SegmentCondition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSegmentConditionUndefined: Self = StObject.set(x, "SegmentCondition", js.undefined)
    
    @scala.inline
    def setSegmentDimensions(value: SegmentDimensions): Self = StObject.set(x, "SegmentDimensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSegmentDimensionsUndefined: Self = StObject.set(x, "SegmentDimensions", js.undefined)
  }
}
