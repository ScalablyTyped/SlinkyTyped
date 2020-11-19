package typingsSlinky.awsSdkClientCodecommitNode.typesPostCommentReplyOutputMod

import typingsSlinky.awsSdkClientCodecommitNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientCodecommitNode.typesCommentMod.UnmarshalledComment
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PostCommentReplyOutput extends OutputTypesUnion {
  
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata = js.native
  
  /**
    * <p>Information about the reply to a comment.</p>
    */
  var comment: js.UndefOr[UnmarshalledComment] = js.native
}
object PostCommentReplyOutput {
  
  @scala.inline
  def apply($metadata: ResponseMetadata): PostCommentReplyOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostCommentReplyOutput]
  }
  
  @scala.inline
  implicit class PostCommentReplyOutputOps[Self <: PostCommentReplyOutput] (val x: Self) extends AnyVal {
    
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
    def setComment(value: UnmarshalledComment): Self = this.set("comment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComment: Self = this.set("comment", js.undefined)
  }
}
