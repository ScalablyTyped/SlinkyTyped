package typingsSlinky.awsSdkClientXrayNode

import typingsSlinky.awsSdkClientXrayNode.typesErrorStatisticsMod.ErrorStatistics
import typingsSlinky.awsSdkClientXrayNode.typesErrorStatisticsMod.UnmarshalledErrorStatistics
import typingsSlinky.awsSdkClientXrayNode.typesFaultStatisticsMod.FaultStatistics
import typingsSlinky.awsSdkClientXrayNode.typesFaultStatisticsMod.UnmarshalledFaultStatistics
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesServiceStatisticsMod {
  
  @js.native
  trait ServiceStatistics extends StObject {
    
    /**
      * <p>Information about requests that failed with a 4xx Client Error status code.</p>
      */
    var ErrorStatistics: js.UndefOr[typingsSlinky.awsSdkClientXrayNode.typesErrorStatisticsMod.ErrorStatistics] = js.native
    
    /**
      * <p>Information about requests that failed with a 5xx Server Error status code.</p>
      */
    var FaultStatistics: js.UndefOr[typingsSlinky.awsSdkClientXrayNode.typesFaultStatisticsMod.FaultStatistics] = js.native
    
    /**
      * <p>The number of requests that completed with a 2xx Success status code.</p>
      */
    var OkCount: js.UndefOr[Double] = js.native
    
    /**
      * <p>The total number of completed requests.</p>
      */
    var TotalCount: js.UndefOr[Double] = js.native
    
    /**
      * <p>The aggregate response time of completed requests.</p>
      */
    var TotalResponseTime: js.UndefOr[Double] = js.native
  }
  object ServiceStatistics {
    
    @scala.inline
    def apply(): ServiceStatistics = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ServiceStatistics]
    }
    
    @scala.inline
    implicit class ServiceStatisticsMutableBuilder[Self <: ServiceStatistics] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setErrorStatistics(value: ErrorStatistics): Self = StObject.set(x, "ErrorStatistics", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorStatisticsUndefined: Self = StObject.set(x, "ErrorStatistics", js.undefined)
      
      @scala.inline
      def setFaultStatistics(value: FaultStatistics): Self = StObject.set(x, "FaultStatistics", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFaultStatisticsUndefined: Self = StObject.set(x, "FaultStatistics", js.undefined)
      
      @scala.inline
      def setOkCount(value: Double): Self = StObject.set(x, "OkCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOkCountUndefined: Self = StObject.set(x, "OkCount", js.undefined)
      
      @scala.inline
      def setTotalCount(value: Double): Self = StObject.set(x, "TotalCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTotalCountUndefined: Self = StObject.set(x, "TotalCount", js.undefined)
      
      @scala.inline
      def setTotalResponseTime(value: Double): Self = StObject.set(x, "TotalResponseTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTotalResponseTimeUndefined: Self = StObject.set(x, "TotalResponseTime", js.undefined)
    }
  }
  
  @js.native
  trait UnmarshalledServiceStatistics extends ServiceStatistics {
    
    /**
      * <p>Information about requests that failed with a 4xx Client Error status code.</p>
      */
    @JSName("ErrorStatistics")
    var ErrorStatistics_UnmarshalledServiceStatistics: js.UndefOr[UnmarshalledErrorStatistics] = js.native
    
    /**
      * <p>Information about requests that failed with a 5xx Server Error status code.</p>
      */
    @JSName("FaultStatistics")
    var FaultStatistics_UnmarshalledServiceStatistics: js.UndefOr[UnmarshalledFaultStatistics] = js.native
  }
  object UnmarshalledServiceStatistics {
    
    @scala.inline
    def apply(): UnmarshalledServiceStatistics = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledServiceStatistics]
    }
    
    @scala.inline
    implicit class UnmarshalledServiceStatisticsMutableBuilder[Self <: UnmarshalledServiceStatistics] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setErrorStatistics(value: UnmarshalledErrorStatistics): Self = StObject.set(x, "ErrorStatistics", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorStatisticsUndefined: Self = StObject.set(x, "ErrorStatistics", js.undefined)
      
      @scala.inline
      def setFaultStatistics(value: UnmarshalledFaultStatistics): Self = StObject.set(x, "FaultStatistics", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFaultStatisticsUndefined: Self = StObject.set(x, "FaultStatistics", js.undefined)
    }
  }
}
