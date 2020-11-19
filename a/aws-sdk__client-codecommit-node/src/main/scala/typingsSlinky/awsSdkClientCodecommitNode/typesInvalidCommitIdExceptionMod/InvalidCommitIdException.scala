package typingsSlinky.awsSdkClientCodecommitNode.typesInvalidCommitIdExceptionMod

import typingsSlinky.awsSdkClientCodecommitNode.createBranchExceptionsUnionMod.CreateBranchExceptionsUnion
import typingsSlinky.awsSdkClientCodecommitNode.getCommentsForComparedCommitExceptionsUnionMod.GetCommentsForComparedCommitExceptionsUnion
import typingsSlinky.awsSdkClientCodecommitNode.getCommentsForPullRequestExceptionsUnionMod.GetCommentsForPullRequestExceptionsUnion
import typingsSlinky.awsSdkClientCodecommitNode.getCommitExceptionsUnionMod.GetCommitExceptionsUnion
import typingsSlinky.awsSdkClientCodecommitNode.getDifferencesExceptionsUnionMod.GetDifferencesExceptionsUnion
import typingsSlinky.awsSdkClientCodecommitNode.mergePullRequestByFastForwardExceptionsUnionMod.MergePullRequestByFastForwardExceptionsUnion
import typingsSlinky.awsSdkClientCodecommitNode.postCommentForComparedCommitExceptionsUnionMod.PostCommentForComparedCommitExceptionsUnion
import typingsSlinky.awsSdkClientCodecommitNode.postCommentForPullRequestExceptionsUnionMod.PostCommentForPullRequestExceptionsUnion
import typingsSlinky.awsSdkTypes.exceptionMod.ServiceException
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InvalidCommitIdException
  extends ServiceException[InvalidCommitIdExceptionDetails]
     with CreateBranchExceptionsUnion
     with GetCommentsForComparedCommitExceptionsUnion
     with GetCommentsForPullRequestExceptionsUnion
     with GetCommitExceptionsUnion
     with GetDifferencesExceptionsUnion
     with MergePullRequestByFastForwardExceptionsUnion
     with PostCommentForComparedCommitExceptionsUnion
     with PostCommentForPullRequestExceptionsUnion {
  
  @JSName("name")
  var name_InvalidCommitIdException: typingsSlinky.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.InvalidCommitIdException = js.native
}
object InvalidCommitIdException {
  
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: InvalidCommitIdExceptionDetails,
    message: String,
    name: typingsSlinky.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.InvalidCommitIdException
  ): InvalidCommitIdException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[InvalidCommitIdException]
  }
  
  @scala.inline
  implicit class InvalidCommitIdExceptionOps[Self <: InvalidCommitIdException] (val x: Self) extends AnyVal {
    
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
      value: typingsSlinky.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.InvalidCommitIdException
    ): Self = this.set("name", value.asInstanceOf[js.Any])
  }
}
