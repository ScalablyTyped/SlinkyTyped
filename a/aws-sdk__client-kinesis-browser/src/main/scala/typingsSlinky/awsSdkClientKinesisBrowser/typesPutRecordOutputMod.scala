package typingsSlinky.awsSdkClientKinesisBrowser

import typingsSlinky.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.KMS
import typingsSlinky.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.NONE
import typingsSlinky.awsSdkClientKinesisBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesPutRecordOutputMod {
  
  @js.native
  trait PutRecordOutput extends OutputTypesUnion {
    
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata = js.native
    
    /**
      * <p>The encryption type to use on the record. This parameter can be one of the following values:</p> <ul> <li> <p> <code>NONE</code>: Do not encrypt the records in the stream.</p> </li> <li> <p> <code>KMS</code>: Use server-side encryption on the records in the stream using a customer-managed AWS KMS key.</p> </li> </ul>
      */
    var EncryptionType: js.UndefOr[NONE | KMS | String] = js.native
    
    /**
      * <p>The sequence number identifier that was assigned to the put data record. The sequence number for the record is unique across all records in the stream. A sequence number is the identifier associated with every record put into the stream.</p>
      */
    var SequenceNumber: String = js.native
    
    /**
      * <p>The shard ID of the shard where the data record was placed.</p>
      */
    var ShardId: String = js.native
  }
  object PutRecordOutput {
    
    @scala.inline
    def apply($metadata: ResponseMetadata, SequenceNumber: String, ShardId: String): PutRecordOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], SequenceNumber = SequenceNumber.asInstanceOf[js.Any], ShardId = ShardId.asInstanceOf[js.Any])
      __obj.asInstanceOf[PutRecordOutput]
    }
    
    @scala.inline
    implicit class PutRecordOutputMutableBuilder[Self <: PutRecordOutput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncryptionType(value: NONE | KMS | String): Self = StObject.set(x, "EncryptionType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncryptionTypeUndefined: Self = StObject.set(x, "EncryptionType", js.undefined)
      
      @scala.inline
      def setSequenceNumber(value: String): Self = StObject.set(x, "SequenceNumber", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShardId(value: String): Self = StObject.set(x, "ShardId", value.asInstanceOf[js.Any])
    }
  }
}
