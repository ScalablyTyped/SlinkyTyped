package typingsSlinky.awsSdk.xrayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TelemetryRecord extends StObject {
  
  /**
    * 
    */
  var BackendConnectionErrors: js.UndefOr[typingsSlinky.awsSdk.xrayMod.BackendConnectionErrors] = js.native
  
  /**
    * 
    */
  var SegmentsReceivedCount: js.UndefOr[NullableInteger] = js.native
  
  /**
    * 
    */
  var SegmentsRejectedCount: js.UndefOr[NullableInteger] = js.native
  
  /**
    * 
    */
  var SegmentsSentCount: js.UndefOr[NullableInteger] = js.native
  
  /**
    * 
    */
  var SegmentsSpilloverCount: js.UndefOr[NullableInteger] = js.native
  
  /**
    * 
    */
  var Timestamp: js.Date = js.native
}
object TelemetryRecord {
  
  @scala.inline
  def apply(Timestamp: js.Date): TelemetryRecord = {
    val __obj = js.Dynamic.literal(Timestamp = Timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[TelemetryRecord]
  }
  
  @scala.inline
  implicit class TelemetryRecordMutableBuilder[Self <: TelemetryRecord] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackendConnectionErrors(value: BackendConnectionErrors): Self = StObject.set(x, "BackendConnectionErrors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackendConnectionErrorsUndefined: Self = StObject.set(x, "BackendConnectionErrors", js.undefined)
    
    @scala.inline
    def setSegmentsReceivedCount(value: NullableInteger): Self = StObject.set(x, "SegmentsReceivedCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSegmentsReceivedCountUndefined: Self = StObject.set(x, "SegmentsReceivedCount", js.undefined)
    
    @scala.inline
    def setSegmentsRejectedCount(value: NullableInteger): Self = StObject.set(x, "SegmentsRejectedCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSegmentsRejectedCountUndefined: Self = StObject.set(x, "SegmentsRejectedCount", js.undefined)
    
    @scala.inline
    def setSegmentsSentCount(value: NullableInteger): Self = StObject.set(x, "SegmentsSentCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSegmentsSentCountUndefined: Self = StObject.set(x, "SegmentsSentCount", js.undefined)
    
    @scala.inline
    def setSegmentsSpilloverCount(value: NullableInteger): Self = StObject.set(x, "SegmentsSpilloverCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSegmentsSpilloverCountUndefined: Self = StObject.set(x, "SegmentsSpilloverCount", js.undefined)
    
    @scala.inline
    def setTimestamp(value: js.Date): Self = StObject.set(x, "Timestamp", value.asInstanceOf[js.Any])
  }
}
