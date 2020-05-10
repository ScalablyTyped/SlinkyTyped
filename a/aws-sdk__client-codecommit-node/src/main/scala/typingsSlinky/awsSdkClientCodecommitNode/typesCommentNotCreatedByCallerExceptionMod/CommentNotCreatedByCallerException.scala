package typingsSlinky.awsSdkClientCodecommitNode.typesCommentNotCreatedByCallerExceptionMod

import typingsSlinky.awsSdkClientCodecommitNode.updateCommentExceptionsUnionMod.UpdateCommentExceptionsUnion
import typingsSlinky.awsSdkTypes.exceptionMod.ServiceException
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommentNotCreatedByCallerException
  extends ServiceException[CommentNotCreatedByCallerExceptionDetails]
     with UpdateCommentExceptionsUnion {
  @JSName("name")
  var name_CommentNotCreatedByCallerException: typingsSlinky.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.CommentNotCreatedByCallerException = js.native
}

object CommentNotCreatedByCallerException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: CommentNotCreatedByCallerExceptionDetails,
    message: String,
    name: typingsSlinky.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.CommentNotCreatedByCallerException
  ): CommentNotCreatedByCallerException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommentNotCreatedByCallerException]
  }
  @scala.inline
  implicit class CommentNotCreatedByCallerExceptionOps[Self <: CommentNotCreatedByCallerException] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(
      value: typingsSlinky.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.CommentNotCreatedByCallerException
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

