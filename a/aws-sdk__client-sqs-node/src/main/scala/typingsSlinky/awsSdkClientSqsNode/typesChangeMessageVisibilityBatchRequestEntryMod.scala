package typingsSlinky.awsSdkClientSqsNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesChangeMessageVisibilityBatchRequestEntryMod {
  
  @js.native
  trait ChangeMessageVisibilityBatchRequestEntry extends StObject {
    
    /**
      * <p>An identifier for this particular receipt handle used to communicate the result.</p> <note> <p>The <code>Id</code>s of a batch request need to be unique within a request</p> </note>
      */
    var Id: String = js.native
    
    /**
      * <p>A receipt handle.</p>
      */
    var ReceiptHandle: String = js.native
    
    /**
      * <p>The new value (in seconds) for the message's visibility timeout.</p>
      */
    var VisibilityTimeout: js.UndefOr[Double] = js.native
  }
  object ChangeMessageVisibilityBatchRequestEntry {
    
    @scala.inline
    def apply(Id: String, ReceiptHandle: String): ChangeMessageVisibilityBatchRequestEntry = {
      val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any], ReceiptHandle = ReceiptHandle.asInstanceOf[js.Any])
      __obj.asInstanceOf[ChangeMessageVisibilityBatchRequestEntry]
    }
    
    @scala.inline
    implicit class ChangeMessageVisibilityBatchRequestEntryMutableBuilder[Self <: ChangeMessageVisibilityBatchRequestEntry] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReceiptHandle(value: String): Self = StObject.set(x, "ReceiptHandle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisibilityTimeout(value: Double): Self = StObject.set(x, "VisibilityTimeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisibilityTimeoutUndefined: Self = StObject.set(x, "VisibilityTimeout", js.undefined)
    }
  }
  
  type UnmarshalledChangeMessageVisibilityBatchRequestEntry = ChangeMessageVisibilityBatchRequestEntry
}
