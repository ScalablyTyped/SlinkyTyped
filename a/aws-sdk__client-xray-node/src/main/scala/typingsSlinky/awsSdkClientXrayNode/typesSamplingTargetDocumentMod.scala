package typingsSlinky.awsSdkClientXrayNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSamplingTargetDocumentMod {
  
  @js.native
  trait SamplingTargetDocument extends StObject {
    
    /**
      * <p>The percentage of matching requests to instrument, after the reservoir is exhausted.</p>
      */
    var FixedRate: js.UndefOr[Double] = js.native
    
    /**
      * <p>The number of seconds for the service to wait before getting sampling targets again.</p>
      */
    var Interval: js.UndefOr[Double] = js.native
    
    /**
      * <p>The number of requests per second that X-Ray allocated this service.</p>
      */
    var ReservoirQuota: js.UndefOr[Double] = js.native
    
    /**
      * <p>When the reservoir quota expires.</p>
      */
    var ReservoirQuotaTTL: js.UndefOr[js.Date | String | Double] = js.native
    
    /**
      * <p>The name of the sampling rule.</p>
      */
    var RuleName: js.UndefOr[String] = js.native
  }
  object SamplingTargetDocument {
    
    @scala.inline
    def apply(): SamplingTargetDocument = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SamplingTargetDocument]
    }
    
    @scala.inline
    implicit class SamplingTargetDocumentMutableBuilder[Self <: SamplingTargetDocument] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFixedRate(value: Double): Self = StObject.set(x, "FixedRate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFixedRateUndefined: Self = StObject.set(x, "FixedRate", js.undefined)
      
      @scala.inline
      def setInterval(value: Double): Self = StObject.set(x, "Interval", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIntervalUndefined: Self = StObject.set(x, "Interval", js.undefined)
      
      @scala.inline
      def setReservoirQuota(value: Double): Self = StObject.set(x, "ReservoirQuota", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReservoirQuotaTTL(value: js.Date | String | Double): Self = StObject.set(x, "ReservoirQuotaTTL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReservoirQuotaTTLDate(value: js.Date): Self = StObject.set(x, "ReservoirQuotaTTL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReservoirQuotaTTLUndefined: Self = StObject.set(x, "ReservoirQuotaTTL", js.undefined)
      
      @scala.inline
      def setReservoirQuotaUndefined: Self = StObject.set(x, "ReservoirQuota", js.undefined)
      
      @scala.inline
      def setRuleName(value: String): Self = StObject.set(x, "RuleName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRuleNameUndefined: Self = StObject.set(x, "RuleName", js.undefined)
    }
  }
  
  @js.native
  trait UnmarshalledSamplingTargetDocument extends SamplingTargetDocument {
    
    /**
      * <p>When the reservoir quota expires.</p>
      */
    @JSName("ReservoirQuotaTTL")
    var ReservoirQuotaTTL_UnmarshalledSamplingTargetDocument: js.UndefOr[js.Date] = js.native
  }
  object UnmarshalledSamplingTargetDocument {
    
    @scala.inline
    def apply(): UnmarshalledSamplingTargetDocument = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledSamplingTargetDocument]
    }
    
    @scala.inline
    implicit class UnmarshalledSamplingTargetDocumentMutableBuilder[Self <: UnmarshalledSamplingTargetDocument] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setReservoirQuotaTTL(value: js.Date): Self = StObject.set(x, "ReservoirQuotaTTL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReservoirQuotaTTLUndefined: Self = StObject.set(x, "ReservoirQuotaTTL", js.undefined)
    }
  }
}
