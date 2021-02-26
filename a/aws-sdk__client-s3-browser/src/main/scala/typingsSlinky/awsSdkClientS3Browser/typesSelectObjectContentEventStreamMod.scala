package typingsSlinky.awsSdkClientS3Browser

import typingsSlinky.awsSdkClientS3Browser.typesContinuationEventMod.ContinuationEvent
import typingsSlinky.awsSdkClientS3Browser.typesContinuationEventMod.UnmarshalledContinuationEvent
import typingsSlinky.awsSdkClientS3Browser.typesEndEventMod.EndEvent
import typingsSlinky.awsSdkClientS3Browser.typesEndEventMod.UnmarshalledEndEvent
import typingsSlinky.awsSdkClientS3Browser.typesProgressEventMod.ProgressEvent
import typingsSlinky.awsSdkClientS3Browser.typesProgressEventMod.UnmarshalledProgressEvent
import typingsSlinky.awsSdkClientS3Browser.typesRecordsEventMod.RecordsEvent
import typingsSlinky.awsSdkClientS3Browser.typesRecordsEventMod.UnmarshalledRecordsEvent
import typingsSlinky.awsSdkClientS3Browser.typesStatsEventMod.StatsEvent
import typingsSlinky.awsSdkClientS3Browser.typesStatsEventMod.UnmarshalledStatsEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSelectObjectContentEventStreamMod {
  
  @js.native
  trait SelectObjectContentEventStream extends StObject {
    
    /**
      * <p>The Continuation Event.</p>
      */
    var Cont: js.UndefOr[ContinuationEvent] = js.native
    
    /**
      * <p>The End Event.</p>
      */
    var End: js.UndefOr[EndEvent] = js.native
    
    /**
      * <p>The Progress Event.</p>
      */
    var Progress: js.UndefOr[ProgressEvent] = js.native
    
    /**
      * <p>The Records Event.</p>
      */
    var Records: js.UndefOr[RecordsEvent] = js.native
    
    /**
      * <p>The Stats Event.</p>
      */
    var Stats: js.UndefOr[StatsEvent] = js.native
  }
  object SelectObjectContentEventStream {
    
    @scala.inline
    def apply(): SelectObjectContentEventStream = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SelectObjectContentEventStream]
    }
    
    @scala.inline
    implicit class SelectObjectContentEventStreamMutableBuilder[Self <: SelectObjectContentEventStream] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCont(value: ContinuationEvent): Self = StObject.set(x, "Cont", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContUndefined: Self = StObject.set(x, "Cont", js.undefined)
      
      @scala.inline
      def setEnd(value: EndEvent): Self = StObject.set(x, "End", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndUndefined: Self = StObject.set(x, "End", js.undefined)
      
      @scala.inline
      def setProgress(value: ProgressEvent): Self = StObject.set(x, "Progress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProgressUndefined: Self = StObject.set(x, "Progress", js.undefined)
      
      @scala.inline
      def setRecords(value: RecordsEvent): Self = StObject.set(x, "Records", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRecordsUndefined: Self = StObject.set(x, "Records", js.undefined)
      
      @scala.inline
      def setStats(value: StatsEvent): Self = StObject.set(x, "Stats", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatsUndefined: Self = StObject.set(x, "Stats", js.undefined)
    }
  }
  
  @js.native
  trait UnmarshalledSelectObjectContentEventStream extends SelectObjectContentEventStream {
    
    /**
      * <p>The Continuation Event.</p>
      */
    @JSName("Cont")
    var Cont_UnmarshalledSelectObjectContentEventStream: js.UndefOr[UnmarshalledContinuationEvent] = js.native
    
    /**
      * <p>The End Event.</p>
      */
    @JSName("End")
    var End_UnmarshalledSelectObjectContentEventStream: js.UndefOr[UnmarshalledEndEvent] = js.native
    
    /**
      * <p>The Progress Event.</p>
      */
    @JSName("Progress")
    var Progress_UnmarshalledSelectObjectContentEventStream: js.UndefOr[UnmarshalledProgressEvent] = js.native
    
    /**
      * <p>The Records Event.</p>
      */
    @JSName("Records")
    var Records_UnmarshalledSelectObjectContentEventStream: js.UndefOr[UnmarshalledRecordsEvent] = js.native
    
    /**
      * <p>The Stats Event.</p>
      */
    @JSName("Stats")
    var Stats_UnmarshalledSelectObjectContentEventStream: js.UndefOr[UnmarshalledStatsEvent] = js.native
  }
  object UnmarshalledSelectObjectContentEventStream {
    
    @scala.inline
    def apply(): UnmarshalledSelectObjectContentEventStream = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledSelectObjectContentEventStream]
    }
    
    @scala.inline
    implicit class UnmarshalledSelectObjectContentEventStreamMutableBuilder[Self <: UnmarshalledSelectObjectContentEventStream] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCont(value: UnmarshalledContinuationEvent): Self = StObject.set(x, "Cont", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContUndefined: Self = StObject.set(x, "Cont", js.undefined)
      
      @scala.inline
      def setEnd(value: UnmarshalledEndEvent): Self = StObject.set(x, "End", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndUndefined: Self = StObject.set(x, "End", js.undefined)
      
      @scala.inline
      def setProgress(value: UnmarshalledProgressEvent): Self = StObject.set(x, "Progress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProgressUndefined: Self = StObject.set(x, "Progress", js.undefined)
      
      @scala.inline
      def setRecords(value: UnmarshalledRecordsEvent): Self = StObject.set(x, "Records", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRecordsUndefined: Self = StObject.set(x, "Records", js.undefined)
      
      @scala.inline
      def setStats(value: UnmarshalledStatsEvent): Self = StObject.set(x, "Stats", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatsUndefined: Self = StObject.set(x, "Stats", js.undefined)
    }
  }
}
