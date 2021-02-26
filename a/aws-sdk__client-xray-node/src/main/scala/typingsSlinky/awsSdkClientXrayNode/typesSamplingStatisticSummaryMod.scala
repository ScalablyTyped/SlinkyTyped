package typingsSlinky.awsSdkClientXrayNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSamplingStatisticSummaryMod {
  
  @js.native
  trait SamplingStatisticSummary extends StObject {
    
    /**
      * <p>The number of requests recorded with borrowed reservoir quota.</p>
      */
    var BorrowCount: js.UndefOr[Double] = js.native
    
    /**
      * <p>The number of requests that matched the rule.</p>
      */
    var RequestCount: js.UndefOr[Double] = js.native
    
    /**
      * <p>The name of the sampling rule.</p>
      */
    var RuleName: js.UndefOr[String] = js.native
    
    /**
      * <p>The number of requests recorded.</p>
      */
    var SampledCount: js.UndefOr[Double] = js.native
    
    /**
      * <p>The start time of the reporting window.</p>
      */
    var Timestamp: js.UndefOr[js.Date | String | Double] = js.native
  }
  object SamplingStatisticSummary {
    
    @scala.inline
    def apply(): SamplingStatisticSummary = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SamplingStatisticSummary]
    }
    
    @scala.inline
    implicit class SamplingStatisticSummaryMutableBuilder[Self <: SamplingStatisticSummary] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBorrowCount(value: Double): Self = StObject.set(x, "BorrowCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorrowCountUndefined: Self = StObject.set(x, "BorrowCount", js.undefined)
      
      @scala.inline
      def setRequestCount(value: Double): Self = StObject.set(x, "RequestCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequestCountUndefined: Self = StObject.set(x, "RequestCount", js.undefined)
      
      @scala.inline
      def setRuleName(value: String): Self = StObject.set(x, "RuleName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRuleNameUndefined: Self = StObject.set(x, "RuleName", js.undefined)
      
      @scala.inline
      def setSampledCount(value: Double): Self = StObject.set(x, "SampledCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSampledCountUndefined: Self = StObject.set(x, "SampledCount", js.undefined)
      
      @scala.inline
      def setTimestamp(value: js.Date | String | Double): Self = StObject.set(x, "Timestamp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimestampDate(value: js.Date): Self = StObject.set(x, "Timestamp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimestampUndefined: Self = StObject.set(x, "Timestamp", js.undefined)
    }
  }
  
  @js.native
  trait UnmarshalledSamplingStatisticSummary extends SamplingStatisticSummary {
    
    /**
      * <p>The start time of the reporting window.</p>
      */
    @JSName("Timestamp")
    var Timestamp_UnmarshalledSamplingStatisticSummary: js.UndefOr[js.Date] = js.native
  }
  object UnmarshalledSamplingStatisticSummary {
    
    @scala.inline
    def apply(): UnmarshalledSamplingStatisticSummary = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledSamplingStatisticSummary]
    }
    
    @scala.inline
    implicit class UnmarshalledSamplingStatisticSummaryMutableBuilder[Self <: UnmarshalledSamplingStatisticSummary] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTimestamp(value: js.Date): Self = StObject.set(x, "Timestamp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimestampUndefined: Self = StObject.set(x, "Timestamp", js.undefined)
    }
  }
}
