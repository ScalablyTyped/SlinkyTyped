package typingsSlinky.awsSdkClientGlacierNode

import typingsSlinky.awsSdkClientGlacierNode.outputTypesUnionMod._OutputTypesUnion
import typingsSlinky.awsSdkClientGlacierNode.typesProvisionedCapacityDescriptionMod.UnmarshalledProvisionedCapacityDescription
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesListProvisionedCapacityOutputMod {
  
  @js.native
  trait ListProvisionedCapacityOutput extends _OutputTypesUnion {
    
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata = js.native
    
    /**
      * <p>The response body contains the following JSON fields.</p>
      */
    var ProvisionedCapacityList: js.UndefOr[js.Array[UnmarshalledProvisionedCapacityDescription]] = js.native
  }
  object ListProvisionedCapacityOutput {
    
    @scala.inline
    def apply($metadata: ResponseMetadata): ListProvisionedCapacityOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[ListProvisionedCapacityOutput]
    }
    
    @scala.inline
    implicit class ListProvisionedCapacityOutputMutableBuilder[Self <: ListProvisionedCapacityOutput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProvisionedCapacityList(value: js.Array[UnmarshalledProvisionedCapacityDescription]): Self = StObject.set(x, "ProvisionedCapacityList", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProvisionedCapacityListUndefined: Self = StObject.set(x, "ProvisionedCapacityList", js.undefined)
      
      @scala.inline
      def setProvisionedCapacityListVarargs(value: UnmarshalledProvisionedCapacityDescription*): Self = StObject.set(x, "ProvisionedCapacityList", js.Array(value :_*))
    }
  }
}
