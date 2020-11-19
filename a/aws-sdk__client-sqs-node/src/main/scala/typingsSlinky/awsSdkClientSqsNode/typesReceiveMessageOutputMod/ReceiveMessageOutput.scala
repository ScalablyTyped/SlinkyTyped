package typingsSlinky.awsSdkClientSqsNode.typesReceiveMessageOutputMod

import typingsSlinky.awsSdkClientSqsNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientSqsNode.typesMessageMod.UnmarshalledMessage
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  implicit class ReceiveMessageOutputOps[Self <: ReceiveMessageOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def set$metadata(value: ResponseMetadata): Self = this.set("$metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessagesVarargs(value: UnmarshalledMessage*): Self = this.set("Messages", js.Array(value :_*))
    
    @scala.inline
    def setMessages(value: js.Array[UnmarshalledMessage]): Self = this.set("Messages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessages: Self = this.set("Messages", js.undefined)
  }
}
