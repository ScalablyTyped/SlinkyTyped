package typingsSlinky.awsSdkClientCognitoIdentityBrowser

import typingsSlinky.awsSdkClientCognitoIdentityBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientCognitoIdentityBrowser.typesUnprocessedIdentityIdMod.UnmarshalledUnprocessedIdentityId
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesDeleteIdentitiesOutputMod {
  
  @js.native
  trait DeleteIdentitiesOutput extends OutputTypesUnion {
    
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata = js.native
    
    /**
      * <p>An array of UnprocessedIdentityId objects, each of which contains an ErrorCode and IdentityId.</p>
      */
    var UnprocessedIdentityIds: js.UndefOr[js.Array[UnmarshalledUnprocessedIdentityId]] = js.native
  }
  object DeleteIdentitiesOutput {
    
    @scala.inline
    def apply($metadata: ResponseMetadata): DeleteIdentitiesOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[DeleteIdentitiesOutput]
    }
    
    @scala.inline
    implicit class DeleteIdentitiesOutputMutableBuilder[Self <: DeleteIdentitiesOutput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnprocessedIdentityIds(value: js.Array[UnmarshalledUnprocessedIdentityId]): Self = StObject.set(x, "UnprocessedIdentityIds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnprocessedIdentityIdsUndefined: Self = StObject.set(x, "UnprocessedIdentityIds", js.undefined)
      
      @scala.inline
      def setUnprocessedIdentityIdsVarargs(value: UnmarshalledUnprocessedIdentityId*): Self = StObject.set(x, "UnprocessedIdentityIds", js.Array(value :_*))
    }
  }
}
