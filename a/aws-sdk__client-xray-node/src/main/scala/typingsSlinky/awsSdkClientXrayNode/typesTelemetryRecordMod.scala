package typingsSlinky.awsSdkClientXrayNode

import typingsSlinky.awsSdkClientXrayNode.typesBackendConnectionErrorsMod.BackendConnectionErrors
import typingsSlinky.awsSdkClientXrayNode.typesBackendConnectionErrorsMod.UnmarshalledBackendConnectionErrors
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesTelemetryRecordMod {
  
  @js.native
  trait TelemetryRecord extends StObject {
    
    /**
      * <p/>
      */
    var BackendConnectionErrors: js.UndefOr[
        typingsSlinky.awsSdkClientXrayNode.typesBackendConnectionErrorsMod.BackendConnectionErrors
      ] = js.native
    
    /**
      * <p/>
      */
    var SegmentsReceivedCount: js.UndefOr[Double] = js.native
    
    /**
      * <p/>
      */
    var SegmentsRejectedCount: js.UndefOr[Double] = js.native
    
    /**
      * <p/>
      */
    var SegmentsSentCount: js.UndefOr[Double] = js.native
    
    /**
      * <p/>
      */
    var SegmentsSpilloverCount: js.UndefOr[Double] = js.native
    
    /**
      * <p/>
      */
    var Timestamp: js.Date | String | Double = js.native
  }
  object TelemetryRecord {
    
    @scala.inline
    def apply(Timestamp: js.Date | String | Double): TelemetryRecord = {
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
      def setSegmentsReceivedCount(value: Double): Self = StObject.set(x, "SegmentsReceivedCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSegmentsReceivedCountUndefined: Self = StObject.set(x, "SegmentsReceivedCount", js.undefined)
      
      @scala.inline
      def setSegmentsRejectedCount(value: Double): Self = StObject.set(x, "SegmentsRejectedCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSegmentsRejectedCountUndefined: Self = StObject.set(x, "SegmentsRejectedCount", js.undefined)
      
      @scala.inline
      def setSegmentsSentCount(value: Double): Self = StObject.set(x, "SegmentsSentCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSegmentsSentCountUndefined: Self = StObject.set(x, "SegmentsSentCount", js.undefined)
      
      @scala.inline
      def setSegmentsSpilloverCount(value: Double): Self = StObject.set(x, "SegmentsSpilloverCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSegmentsSpilloverCountUndefined: Self = StObject.set(x, "SegmentsSpilloverCount", js.undefined)
      
      @scala.inline
      def setTimestamp(value: js.Date | String | Double): Self = StObject.set(x, "Timestamp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimestampDate(value: js.Date): Self = StObject.set(x, "Timestamp", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait UnmarshalledTelemetryRecord extends TelemetryRecord {
    
    /**
      * <p/>
      */
    @JSName("BackendConnectionErrors")
    var BackendConnectionErrors_UnmarshalledTelemetryRecord: js.UndefOr[UnmarshalledBackendConnectionErrors] = js.native
    
    /**
      * <p/>
      */
    @JSName("Timestamp")
    var Timestamp_UnmarshalledTelemetryRecord: js.Date = js.native
  }
  object UnmarshalledTelemetryRecord {
    
    @scala.inline
    def apply(Timestamp: js.Date): UnmarshalledTelemetryRecord = {
      val __obj = js.Dynamic.literal(Timestamp = Timestamp.asInstanceOf[js.Any])
      __obj.asInstanceOf[UnmarshalledTelemetryRecord]
    }
    
    @scala.inline
    implicit class UnmarshalledTelemetryRecordMutableBuilder[Self <: UnmarshalledTelemetryRecord] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBackendConnectionErrors(value: UnmarshalledBackendConnectionErrors): Self = StObject.set(x, "BackendConnectionErrors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackendConnectionErrorsUndefined: Self = StObject.set(x, "BackendConnectionErrors", js.undefined)
      
      @scala.inline
      def setTimestamp(value: js.Date): Self = StObject.set(x, "Timestamp", value.asInstanceOf[js.Any])
    }
  }
}
