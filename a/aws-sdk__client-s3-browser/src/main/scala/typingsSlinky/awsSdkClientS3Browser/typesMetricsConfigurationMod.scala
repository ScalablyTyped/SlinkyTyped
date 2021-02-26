package typingsSlinky.awsSdkClientS3Browser

import typingsSlinky.awsSdkClientS3Browser.typesMetricsFilterMod.MetricsFilter
import typingsSlinky.awsSdkClientS3Browser.typesMetricsFilterMod.UnmarshalledMetricsFilter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMetricsConfigurationMod {
  
  @js.native
  trait MetricsConfiguration extends StObject {
    
    /**
      * <p>Specifies a metrics configuration filter. The metrics configuration will only include objects that meet the filter's criteria. A filter must be a prefix, a tag, or a conjunction (MetricsAndOperator).</p>
      */
    var Filter: js.UndefOr[MetricsFilter] = js.native
    
    /**
      * <p>The ID used to identify the metrics configuration.</p>
      */
    var Id: String = js.native
  }
  object MetricsConfiguration {
    
    @scala.inline
    def apply(Id: String): MetricsConfiguration = {
      val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
      __obj.asInstanceOf[MetricsConfiguration]
    }
    
    @scala.inline
    implicit class MetricsConfigurationMutableBuilder[Self <: MetricsConfiguration] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFilter(value: MetricsFilter): Self = StObject.set(x, "Filter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterUndefined: Self = StObject.set(x, "Filter", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait UnmarshalledMetricsConfiguration extends MetricsConfiguration {
    
    /**
      * <p>Specifies a metrics configuration filter. The metrics configuration will only include objects that meet the filter's criteria. A filter must be a prefix, a tag, or a conjunction (MetricsAndOperator).</p>
      */
    @JSName("Filter")
    var Filter_UnmarshalledMetricsConfiguration: js.UndefOr[UnmarshalledMetricsFilter] = js.native
  }
  object UnmarshalledMetricsConfiguration {
    
    @scala.inline
    def apply(Id: String): UnmarshalledMetricsConfiguration = {
      val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
      __obj.asInstanceOf[UnmarshalledMetricsConfiguration]
    }
    
    @scala.inline
    implicit class UnmarshalledMetricsConfigurationMutableBuilder[Self <: UnmarshalledMetricsConfiguration] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFilter(value: UnmarshalledMetricsFilter): Self = StObject.set(x, "Filter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterUndefined: Self = StObject.set(x, "Filter", js.undefined)
    }
  }
}
