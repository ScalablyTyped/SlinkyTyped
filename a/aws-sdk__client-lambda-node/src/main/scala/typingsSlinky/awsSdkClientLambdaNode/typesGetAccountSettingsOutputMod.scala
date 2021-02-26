package typingsSlinky.awsSdkClientLambdaNode

import typingsSlinky.awsSdkClientLambdaNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientLambdaNode.typesAccountLimitMod.UnmarshalledAccountLimit
import typingsSlinky.awsSdkClientLambdaNode.typesAccountUsageMod.UnmarshalledAccountUsage
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesGetAccountSettingsOutputMod {
  
  @js.native
  trait GetAccountSettingsOutput extends OutputTypesUnion {
    
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata = js.native
    
    /**
      * <p>Limits related to concurrency and code storage.</p>
      */
    var AccountLimit: js.UndefOr[UnmarshalledAccountLimit] = js.native
    
    /**
      * <p>The number of functions and amount of storage in use.</p>
      */
    var AccountUsage: js.UndefOr[UnmarshalledAccountUsage] = js.native
  }
  object GetAccountSettingsOutput {
    
    @scala.inline
    def apply($metadata: ResponseMetadata): GetAccountSettingsOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetAccountSettingsOutput]
    }
    
    @scala.inline
    implicit class GetAccountSettingsOutputMutableBuilder[Self <: GetAccountSettingsOutput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccountLimit(value: UnmarshalledAccountLimit): Self = StObject.set(x, "AccountLimit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccountLimitUndefined: Self = StObject.set(x, "AccountLimit", js.undefined)
      
      @scala.inline
      def setAccountUsage(value: UnmarshalledAccountUsage): Self = StObject.set(x, "AccountUsage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccountUsageUndefined: Self = StObject.set(x, "AccountUsage", js.undefined)
    }
  }
}
