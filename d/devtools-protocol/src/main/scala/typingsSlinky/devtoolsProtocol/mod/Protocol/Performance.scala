package typingsSlinky.devtoolsProtocol.mod.Protocol

import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.threadTicks
import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.timeTicks
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Performance {
  
  @js.native
  trait EnableRequest extends StObject {
    
    /**
      * Time domain to use for collecting and reporting duration metrics. (EnableRequestTimeDomain enum)
      */
    var timeDomain: js.UndefOr[timeTicks | threadTicks] = js.native
  }
  object EnableRequest {
    
    @scala.inline
    def apply(): EnableRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EnableRequest]
    }
    
    @scala.inline
    implicit class EnableRequestMutableBuilder[Self <: EnableRequest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTimeDomain(value: timeTicks | threadTicks): Self = StObject.set(x, "timeDomain", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeDomainUndefined: Self = StObject.set(x, "timeDomain", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.timeTicks
    - typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.threadTicks
  */
  trait EnableRequestTimeDomain extends StObject
  object EnableRequestTimeDomain {
    
    @scala.inline
    def ThreadTicks: threadTicks = "threadTicks".asInstanceOf[threadTicks]
    
    @scala.inline
    def TimeTicks: timeTicks = "timeTicks".asInstanceOf[timeTicks]
  }
  
  @js.native
  trait GetMetricsResponse extends StObject {
    
    /**
      * Current values for run-time metrics.
      */
    var metrics: js.Array[Metric] = js.native
  }
  object GetMetricsResponse {
    
    @scala.inline
    def apply(metrics: js.Array[Metric]): GetMetricsResponse = {
      val __obj = js.Dynamic.literal(metrics = metrics.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetMetricsResponse]
    }
    
    @scala.inline
    implicit class GetMetricsResponseMutableBuilder[Self <: GetMetricsResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMetrics(value: js.Array[Metric]): Self = StObject.set(x, "metrics", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetricsVarargs(value: Metric*): Self = StObject.set(x, "metrics", js.Array(value :_*))
    }
  }
  
  @js.native
  trait Metric extends StObject {
    
    /**
      * Metric name.
      */
    var name: String = js.native
    
    /**
      * Metric value.
      */
    var value: Double = js.native
  }
  object Metric {
    
    @scala.inline
    def apply(name: String, value: Double): Metric = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Metric]
    }
    
    @scala.inline
    implicit class MetricMutableBuilder[Self <: Metric] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait MetricsEvent extends StObject {
    
    /**
      * Current values of the metrics.
      */
    var metrics: js.Array[Metric] = js.native
    
    /**
      * Timestamp title.
      */
    var title: String = js.native
  }
  object MetricsEvent {
    
    @scala.inline
    def apply(metrics: js.Array[Metric], title: String): MetricsEvent = {
      val __obj = js.Dynamic.literal(metrics = metrics.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[MetricsEvent]
    }
    
    @scala.inline
    implicit class MetricsEventMutableBuilder[Self <: MetricsEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMetrics(value: js.Array[Metric]): Self = StObject.set(x, "metrics", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetricsVarargs(value: Metric*): Self = StObject.set(x, "metrics", js.Array(value :_*))
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SetTimeDomainRequest extends StObject {
    
    /**
      * Time domain (SetTimeDomainRequestTimeDomain enum)
      */
    var timeDomain: timeTicks | threadTicks = js.native
  }
  object SetTimeDomainRequest {
    
    @scala.inline
    def apply(timeDomain: timeTicks | threadTicks): SetTimeDomainRequest = {
      val __obj = js.Dynamic.literal(timeDomain = timeDomain.asInstanceOf[js.Any])
      __obj.asInstanceOf[SetTimeDomainRequest]
    }
    
    @scala.inline
    implicit class SetTimeDomainRequestMutableBuilder[Self <: SetTimeDomainRequest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTimeDomain(value: timeTicks | threadTicks): Self = StObject.set(x, "timeDomain", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.timeTicks
    - typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.threadTicks
  */
  trait SetTimeDomainRequestTimeDomain extends StObject
  object SetTimeDomainRequestTimeDomain {
    
    @scala.inline
    def ThreadTicks: threadTicks = "threadTicks".asInstanceOf[threadTicks]
    
    @scala.inline
    def TimeTicks: timeTicks = "timeTicks".asInstanceOf[timeTicks]
  }
}
