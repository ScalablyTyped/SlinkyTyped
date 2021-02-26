package typingsSlinky.awsSdkClientSqsNode

import typingsSlinky.awsSdkClientSqsNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientSqsNode.typesMessageMod.UnmarshalledMessage
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesReceiveMessageOutputMod {
  
  @js.native
  trait ReceiveMessageOutput extends OutputTypesUnion {
    
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata = js.native
    
    /**
      * <p>A list of messages.</p>
      */
    var Messages: js.UndefOr[js.Array[UnmarshalledMessage]] = js.native
  }
  object ReceiveMessageOutput {
    
    @scala.inline
    def apply($metadata: ResponseMetadata): ReceiveMessageOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReceiveMessageOutput]
    }
    
    @scala.inline
    implicit class ReceiveMessageOutputMutableBuilder[Self <: ReceiveMessageOutput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessages(value: js.Array[UnmarshalledMessage]): Self = StObject.set(x, "Messages", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessagesUndefined: Self = StObject.set(x, "Messages", js.undefined)
      
      @scala.inline
      def setMessagesVarargs(value: UnmarshalledMessage*): Self = StObject.set(x, "Messages", js.Array(value :_*))
    }
  }
}
