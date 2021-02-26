package typingsSlinky.awsSdkClientKinesisBrowser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesPutRecordsResultEntryMod {
  
  @js.native
  trait PutRecordsResultEntry extends StObject {
    
    /**
      * <p>The error code for an individual record result. <code>ErrorCodes</code> can be either <code>ProvisionedThroughputExceededException</code> or <code>InternalFailure</code>.</p>
      */
    var ErrorCode: js.UndefOr[String] = js.native
    
    /**
      * <p>The error message for an individual record result. An <code>ErrorCode</code> value of <code>ProvisionedThroughputExceededException</code> has an error message that includes the account ID, stream name, and shard ID. An <code>ErrorCode</code> value of <code>InternalFailure</code> has the error message <code>"Internal Service Failure"</code>.</p>
      */
    var ErrorMessage: js.UndefOr[String] = js.native
    
    /**
      * <p>The sequence number for an individual record result.</p>
      */
    var SequenceNumber: js.UndefOr[String] = js.native
    
    /**
      * <p>The shard ID for an individual record result.</p>
      */
    var ShardId: js.UndefOr[String] = js.native
  }
  object PutRecordsResultEntry {
    
    @scala.inline
    def apply(): PutRecordsResultEntry = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PutRecordsResultEntry]
    }
    
    @scala.inline
    implicit class PutRecordsResultEntryMutableBuilder[Self <: PutRecordsResultEntry] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setErrorCode(value: String): Self = StObject.set(x, "ErrorCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorCodeUndefined: Self = StObject.set(x, "ErrorCode", js.undefined)
      
      @scala.inline
      def setErrorMessage(value: String): Self = StObject.set(x, "ErrorMessage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorMessageUndefined: Self = StObject.set(x, "ErrorMessage", js.undefined)
      
      @scala.inline
      def setSequenceNumber(value: String): Self = StObject.set(x, "SequenceNumber", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSequenceNumberUndefined: Self = StObject.set(x, "SequenceNumber", js.undefined)
      
      @scala.inline
      def setShardId(value: String): Self = StObject.set(x, "ShardId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShardIdUndefined: Self = StObject.set(x, "ShardId", js.undefined)
    }
  }
  
  type UnmarshalledPutRecordsResultEntry = PutRecordsResultEntry
}
