package typingsSlinky.awsSdkClientS3Browser

import typingsSlinky.awsSdkClientS3Browser.outputTypesUnionMod._OutputTypesUnion
import typingsSlinky.awsSdkClientS3Browser.typesAnalyticsConfigurationMod.UnmarshalledAnalyticsConfiguration
import typingsSlinky.awsSdkTypes.responseMod.MetadataBearer
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesGetBucketAnalyticsConfigurationOutputMod {
  
  @js.native
  trait GetBucketAnalyticsConfigurationOutput
    extends MetadataBearer
       with _OutputTypesUnion {
    
    /**
      * <p>The configuration and any analyses for the analytics filter.</p>
      */
    var AnalyticsConfiguration: js.UndefOr[UnmarshalledAnalyticsConfiguration] = js.native
  }
  object GetBucketAnalyticsConfigurationOutput {
    
    @scala.inline
    def apply($metadata: ResponseMetadata): GetBucketAnalyticsConfigurationOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetBucketAnalyticsConfigurationOutput]
    }
    
    @scala.inline
    implicit class GetBucketAnalyticsConfigurationOutputMutableBuilder[Self <: GetBucketAnalyticsConfigurationOutput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnalyticsConfiguration(value: UnmarshalledAnalyticsConfiguration): Self = StObject.set(x, "AnalyticsConfiguration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnalyticsConfigurationUndefined: Self = StObject.set(x, "AnalyticsConfiguration", js.undefined)
    }
  }
}
