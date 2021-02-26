package typingsSlinky.awsSdkClientKmsNode

import typingsSlinky.awsSdkClientKmsNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesReEncryptOutputMod {
  
  @js.native
  trait ReEncryptOutput extends OutputTypesUnion {
    
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata = js.native
    
    /**
      * <p>The reencrypted data. When you use the HTTP API or the AWS CLI, the value is Base64-encoded. Otherwise, it is not encoded.</p>
      */
    var CiphertextBlob: js.UndefOr[js.typedarray.Uint8Array] = js.native
    
    /**
      * <p>Unique identifier of the CMK used to reencrypt the data.</p>
      */
    var KeyId: js.UndefOr[String] = js.native
    
    /**
      * <p>Unique identifier of the CMK used to originally encrypt the data.</p>
      */
    var SourceKeyId: js.UndefOr[String] = js.native
  }
  object ReEncryptOutput {
    
    @scala.inline
    def apply($metadata: ResponseMetadata): ReEncryptOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReEncryptOutput]
    }
    
    @scala.inline
    implicit class ReEncryptOutputMutableBuilder[Self <: ReEncryptOutput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCiphertextBlob(value: js.typedarray.Uint8Array): Self = StObject.set(x, "CiphertextBlob", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCiphertextBlobUndefined: Self = StObject.set(x, "CiphertextBlob", js.undefined)
      
      @scala.inline
      def setKeyId(value: String): Self = StObject.set(x, "KeyId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyIdUndefined: Self = StObject.set(x, "KeyId", js.undefined)
      
      @scala.inline
      def setSourceKeyId(value: String): Self = StObject.set(x, "SourceKeyId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceKeyIdUndefined: Self = StObject.set(x, "SourceKeyId", js.undefined)
    }
  }
}
