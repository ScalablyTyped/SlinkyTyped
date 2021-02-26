package typingsSlinky.awsSdkClientXrayNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSamplingStatisticsDocumentMod {
  
  @js.native
  trait SamplingStatisticsDocument extends StObject {
    
    /**
      * <p>The number of requests recorded with borrowed reservoir quota.</p>
      */
    var BorrowCount: js.UndefOr[Double] = js.native
    
    /**
      * <p>A unique identifier for the service in hexadecimal.</p>
      */
    var ClientID: String = js.native
    
    /**
      * <p>The number of requests that matched the rule.</p>
      */
    var RequestCount: Double = js.native
    
    /**
      * <p>The name of the sampling rule.</p>
      */
    var RuleName: String = js.native
    
    /**
      * <p>The number of requests recorded.</p>
      */
    var SampledCount: Double = js.native
    
    /**
      * <p>The current time.</p>
      */
    var Timestamp: js.Date | String | Double = js.native
  }
  object SamplingStatisticsDocument {
    
    @scala.inline
    def apply(
      ClientID: String,
      RequestCount: Double,
      RuleName: String,
      SampledCount: Double,
      Timestamp: js.Date | String | Double
    ): SamplingStatisticsDocument = {
      val __obj = js.Dynamic.literal(ClientID = ClientID.asInstanceOf[js.Any], RequestCount = RequestCount.asInstanceOf[js.Any], RuleName = RuleName.asInstanceOf[js.Any], SampledCount = SampledCount.asInstanceOf[js.Any], Timestamp = Timestamp.asInstanceOf[js.Any])
      __obj.asInstanceOf[SamplingStatisticsDocument]
    }
    
    @scala.inline
    implicit class SamplingStatisticsDocumentMutableBuilder[Self <: SamplingStatisticsDocument] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBorrowCount(value: Double): Self = StObject.set(x, "BorrowCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorrowCountUndefined: Self = StObject.set(x, "BorrowCount", js.undefined)
      
      @scala.inline
      def setClientID(value: String): Self = StObject.set(x, "ClientID", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequestCount(value: Double): Self = StObject.set(x, "RequestCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRuleName(value: String): Self = StObject.set(x, "RuleName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSampledCount(value: Double): Self = StObject.set(x, "SampledCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimestamp(value: js.Date | String | Double): Self = StObject.set(x, "Timestamp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimestampDate(value: js.Date): Self = StObject.set(x, "Timestamp", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait UnmarshalledSamplingStatisticsDocument extends SamplingStatisticsDocument {
    
    /**
      * <p>The current time.</p>
      */
    @JSName("Timestamp")
    var Timestamp_UnmarshalledSamplingStatisticsDocument: js.Date = js.native
  }
  object UnmarshalledSamplingStatisticsDocument {
    
    @scala.inline
    def apply(ClientID: String, RequestCount: Double, RuleName: String, SampledCount: Double, Timestamp: js.Date): UnmarshalledSamplingStatisticsDocument = {
      val __obj = js.Dynamic.literal(ClientID = ClientID.asInstanceOf[js.Any], RequestCount = RequestCount.asInstanceOf[js.Any], RuleName = RuleName.asInstanceOf[js.Any], SampledCount = SampledCount.asInstanceOf[js.Any], Timestamp = Timestamp.asInstanceOf[js.Any])
      __obj.asInstanceOf[UnmarshalledSamplingStatisticsDocument]
    }
    
    @scala.inline
    implicit class UnmarshalledSamplingStatisticsDocumentMutableBuilder[Self <: UnmarshalledSamplingStatisticsDocument] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTimestamp(value: js.Date): Self = StObject.set(x, "Timestamp", value.asInstanceOf[js.Any])
    }
  }
}
