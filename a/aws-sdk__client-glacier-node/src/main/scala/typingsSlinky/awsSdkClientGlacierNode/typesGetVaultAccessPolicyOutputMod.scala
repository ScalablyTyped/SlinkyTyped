package typingsSlinky.awsSdkClientGlacierNode

import typingsSlinky.awsSdkClientGlacierNode.outputTypesUnionMod._OutputTypesUnion
import typingsSlinky.awsSdkClientGlacierNode.typesVaultAccessPolicyMod.UnmarshalledVaultAccessPolicy
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesGetVaultAccessPolicyOutputMod {
  
  @js.native
  trait GetVaultAccessPolicyOutput extends _OutputTypesUnion {
    
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata = js.native
    
    /**
      * <p>Contains the returned vault access policy as a JSON string.</p>
      */
    var policy: js.UndefOr[UnmarshalledVaultAccessPolicy] = js.native
  }
  object GetVaultAccessPolicyOutput {
    
    @scala.inline
    def apply($metadata: ResponseMetadata): GetVaultAccessPolicyOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetVaultAccessPolicyOutput]
    }
    
    @scala.inline
    implicit class GetVaultAccessPolicyOutputMutableBuilder[Self <: GetVaultAccessPolicyOutput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPolicy(value: UnmarshalledVaultAccessPolicy): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPolicyUndefined: Self = StObject.set(x, "policy", js.undefined)
    }
  }
}
