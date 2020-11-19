package typingsSlinky.awsSdkClientCodecommitNode.typesInvalidCommentIdExceptionMod

import typingsSlinky.awsSdkClientCodecommitNode.deleteCommentContentExceptionsUnionMod.DeleteCommentContentExceptionsUnion
import typingsSlinky.awsSdkClientCodecommitNode.getCommentExceptionsUnionMod.GetCommentExceptionsUnion
import typingsSlinky.awsSdkClientCodecommitNode.postCommentReplyExceptionsUnionMod.PostCommentReplyExceptionsUnion
import typingsSlinky.awsSdkClientCodecommitNode.updateCommentExceptionsUnionMod.UpdateCommentExceptionsUnion
import typingsSlinky.awsSdkTypes.exceptionMod.ServiceException
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InvalidCommentIdException
  extends ServiceException[InvalidCommentIdExceptionDetails]
     with DeleteCommentContentExceptionsUnion
     with GetCommentExceptionsUnion
     with PostCommentReplyExceptionsUnion
     with UpdateCommentExceptionsUnion {
  
  @JSName("name")
  var name_InvalidCommentIdException: typingsSlinky.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.InvalidCommentIdException = js.native
}
object InvalidCommentIdException {
  
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: InvalidCommentIdExceptionDetails,
    message: String,
    name: typingsSlinky.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.InvalidCommentIdException
  ): InvalidCommentIdException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[InvalidCommentIdException]
  }
  
  @scala.inline
  implicit class InvalidCommentIdExceptionOps[Self <: InvalidCommentIdException] (val x: Self) extends AnyVal {
    
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
    def setName(
      value: typingsSlinky.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.InvalidCommentIdException
    ): Self = this.set("name", value.asInstanceOf[js.Any])
  }
}
