package typingsSlinky.awsSdkClientKinesisBrowser

import typingsSlinky.awsSdkClientKinesisBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesDescribeLimitsOutputMod {
  
  @js.native
  trait DescribeLimitsOutput extends OutputTypesUnion {
    
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata = js.native
    
    /**
      * <p>The number of open shards.</p>
      */
    var OpenShardCount: Double = js.native
    
    /**
      * <p>The maximum number of shards.</p>
      */
    var ShardLimit: Double = js.native
  }
  object DescribeLimitsOutput {
    
    @scala.inline
    def apply($metadata: ResponseMetadata, OpenShardCount: Double, ShardLimit: Double): DescribeLimitsOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], OpenShardCount = OpenShardCount.asInstanceOf[js.Any], ShardLimit = ShardLimit.asInstanceOf[js.Any])
      __obj.asInstanceOf[DescribeLimitsOutput]
    }
    
    @scala.inline
    implicit class DescribeLimitsOutputMutableBuilder[Self <: DescribeLimitsOutput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpenShardCount(value: Double): Self = StObject.set(x, "OpenShardCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShardLimit(value: Double): Self = StObject.set(x, "ShardLimit", value.asInstanceOf[js.Any])
    }
  }
}
