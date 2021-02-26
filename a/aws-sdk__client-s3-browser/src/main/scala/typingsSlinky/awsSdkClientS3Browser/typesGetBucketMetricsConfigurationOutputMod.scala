package typingsSlinky.awsSdkClientS3Browser

import typingsSlinky.awsSdkClientS3Browser.outputTypesUnionMod._OutputTypesUnion
import typingsSlinky.awsSdkClientS3Browser.typesMetricsConfigurationMod.UnmarshalledMetricsConfiguration
import typingsSlinky.awsSdkTypes.responseMod.MetadataBearer
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesGetBucketMetricsConfigurationOutputMod {
  
  @js.native
  trait GetBucketMetricsConfigurationOutput
    extends MetadataBearer
       with _OutputTypesUnion {
    
    /**
      * <p>Specifies the metrics configuration.</p>
      */
    var MetricsConfiguration: js.UndefOr[UnmarshalledMetricsConfiguration] = js.native
  }
  object GetBucketMetricsConfigurationOutput {
    
    @scala.inline
    def apply($metadata: ResponseMetadata): GetBucketMetricsConfigurationOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetBucketMetricsConfigurationOutput]
    }
    
    @scala.inline
    implicit class GetBucketMetricsConfigurationOutputMutableBuilder[Self <: GetBucketMetricsConfigurationOutput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMetricsConfiguration(value: UnmarshalledMetricsConfiguration): Self = StObject.set(x, "MetricsConfiguration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetricsConfigurationUndefined: Self = StObject.set(x, "MetricsConfiguration", js.undefined)
    }
  }
}
