package typingsSlinky.awsSdkClientCodecommitNode.typesInvalidPullRequestIdExceptionMod

import typingsSlinky.awsSdkClientCodecommitNode.describePullRequestEventsExceptionsUnionMod.DescribePullRequestEventsExceptionsUnion
import typingsSlinky.awsSdkClientCodecommitNode.getCommentsForPullRequestExceptionsUnionMod.GetCommentsForPullRequestExceptionsUnion
import typingsSlinky.awsSdkClientCodecommitNode.getPullRequestExceptionsUnionMod.GetPullRequestExceptionsUnion
import typingsSlinky.awsSdkClientCodecommitNode.mergePullRequestByFastForwardExceptionsUnionMod.MergePullRequestByFastForwardExceptionsUnion
import typingsSlinky.awsSdkClientCodecommitNode.postCommentForPullRequestExceptionsUnionMod.PostCommentForPullRequestExceptionsUnion
import typingsSlinky.awsSdkClientCodecommitNode.updatePullRequestDescriptionExceptionsUnionMod.UpdatePullRequestDescriptionExceptionsUnion
import typingsSlinky.awsSdkClientCodecommitNode.updatePullRequestStatusExceptionsUnionMod.UpdatePullRequestStatusExceptionsUnion
import typingsSlinky.awsSdkClientCodecommitNode.updatePullRequestTitleExceptionsUnionMod.UpdatePullRequestTitleExceptionsUnion
import typingsSlinky.awsSdkTypes.exceptionMod.ServiceException
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InvalidPullRequestIdException
  extends ServiceException[InvalidPullRequestIdExceptionDetails]
     with DescribePullRequestEventsExceptionsUnion
     with GetCommentsForPullRequestExceptionsUnion
     with GetPullRequestExceptionsUnion
     with MergePullRequestByFastForwardExceptionsUnion
     with PostCommentForPullRequestExceptionsUnion
     with UpdatePullRequestDescriptionExceptionsUnion
     with UpdatePullRequestStatusExceptionsUnion
     with UpdatePullRequestTitleExceptionsUnion {
  
  @JSName("name")
  var name_InvalidPullRequestIdException: typingsSlinky.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.InvalidPullRequestIdException = js.native
}
object InvalidPullRequestIdException {
  
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: InvalidPullRequestIdExceptionDetails,
    message: String,
    name: typingsSlinky.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.InvalidPullRequestIdException
  ): InvalidPullRequestIdException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[InvalidPullRequestIdException]
  }
  
  @scala.inline
  implicit class InvalidPullRequestIdExceptionOps[Self <: InvalidPullRequestIdException] (val x: Self) extends AnyVal {
    
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
      value: typingsSlinky.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.InvalidPullRequestIdException
    ): Self = this.set("name", value.asInstanceOf[js.Any])
  }
}
