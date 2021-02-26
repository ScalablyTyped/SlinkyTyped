package typingsSlinky.awsSdkClientXrayNode

import typingsSlinky.awsSdkClientXrayNode.typesSegmentMod.Segment
import typingsSlinky.awsSdkClientXrayNode.typesSegmentMod.UnmarshalledSegment
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesTraceMod {
  
  @js.native
  trait Trace extends StObject {
    
    /**
      * <p>The length of time in seconds between the start time of the root segment and the end time of the last segment that completed.</p>
      */
    var Duration: js.UndefOr[Double] = js.native
    
    /**
      * <p>The unique identifier for the request that generated the trace's segments and subsegments.</p>
      */
    var Id: js.UndefOr[String] = js.native
    
    /**
      * <p>Segment documents for the segments and subsegments that comprise the trace.</p>
      */
    var Segments: js.UndefOr[js.Array[Segment] | js.Iterable[Segment]] = js.native
  }
  object Trace {
    
    @scala.inline
    def apply(): Trace = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Trace]
    }
    
    @scala.inline
    implicit class TraceMutableBuilder[Self <: Trace] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDuration(value: Double): Self = StObject.set(x, "Duration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDurationUndefined: Self = StObject.set(x, "Duration", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
      
      @scala.inline
      def setSegments(value: js.Array[Segment] | js.Iterable[Segment]): Self = StObject.set(x, "Segments", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSegmentsIterable(value: js.Iterable[Segment]): Self = StObject.set(x, "Segments", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSegmentsUndefined: Self = StObject.set(x, "Segments", js.undefined)
      
      @scala.inline
      def setSegmentsVarargs(value: Segment*): Self = StObject.set(x, "Segments", js.Array(value :_*))
    }
  }
  
  @js.native
  trait UnmarshalledTrace extends Trace {
    
    /**
      * <p>Segment documents for the segments and subsegments that comprise the trace.</p>
      */
    @JSName("Segments")
    var Segments_UnmarshalledTrace: js.UndefOr[js.Array[UnmarshalledSegment]] = js.native
  }
  object UnmarshalledTrace {
    
    @scala.inline
    def apply(): UnmarshalledTrace = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledTrace]
    }
    
    @scala.inline
    implicit class UnmarshalledTraceMutableBuilder[Self <: UnmarshalledTrace] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSegments(value: js.Array[UnmarshalledSegment]): Self = StObject.set(x, "Segments", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSegmentsUndefined: Self = StObject.set(x, "Segments", js.undefined)
      
      @scala.inline
      def setSegmentsVarargs(value: UnmarshalledSegment*): Self = StObject.set(x, "Segments", js.Array(value :_*))
    }
  }
}
