package typingsSlinky.maximMazurokGapiClientAnalyticsreporting.gapi.client.analyticsreporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DynamicSegment extends StObject {
  
  /** The name of the dynamic segment. */
  var name: js.UndefOr[String] = js.native
  
  /** Session Segment to select sessions to include in the segment. */
  var sessionSegment: js.UndefOr[SegmentDefinition] = js.native
  
  /** User Segment to select users to include in the segment. */
  var userSegment: js.UndefOr[SegmentDefinition] = js.native
}
object DynamicSegment {
  
  @scala.inline
  def apply(): DynamicSegment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DynamicSegment]
  }
  
  @scala.inline
  implicit class DynamicSegmentMutableBuilder[Self <: DynamicSegment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setSessionSegment(value: SegmentDefinition): Self = StObject.set(x, "sessionSegment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSessionSegmentUndefined: Self = StObject.set(x, "sessionSegment", js.undefined)
    
    @scala.inline
    def setUserSegment(value: SegmentDefinition): Self = StObject.set(x, "userSegment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserSegmentUndefined: Self = StObject.set(x, "userSegment", js.undefined)
  }
}
