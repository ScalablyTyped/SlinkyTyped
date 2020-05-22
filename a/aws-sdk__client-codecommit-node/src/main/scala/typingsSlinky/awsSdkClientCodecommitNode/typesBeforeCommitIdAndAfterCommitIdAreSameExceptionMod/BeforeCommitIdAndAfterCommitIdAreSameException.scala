package typingsSlinky.awsSdkClientCodecommitNode.typesBeforeCommitIdAndAfterCommitIdAreSameExceptionMod

import typingsSlinky.awsSdkClientCodecommitNode.postCommentForComparedCommitExceptionsUnionMod.PostCommentForComparedCommitExceptionsUnion
import typingsSlinky.awsSdkClientCodecommitNode.postCommentForPullRequestExceptionsUnionMod.PostCommentForPullRequestExceptionsUnion
import typingsSlinky.awsSdkTypes.exceptionMod.ServiceException
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BeforeCommitIdAndAfterCommitIdAreSameException
  extends ServiceException[BeforeCommitIdAndAfterCommitIdAreSameExceptionDetails]
     with PostCommentForComparedCommitExceptionsUnion
     with PostCommentForPullRequestExceptionsUnion {
  @JSName("name")
  var name_BeforeCommitIdAndAfterCommitIdAreSameException: typingsSlinky.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.BeforeCommitIdAndAfterCommitIdAreSameException
}

object BeforeCommitIdAndAfterCommitIdAreSameException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: BeforeCommitIdAndAfterCommitIdAreSameExceptionDetails,
    message: String,
    name: typingsSlinky.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.BeforeCommitIdAndAfterCommitIdAreSameException,
    stack: String = null
  ): BeforeCommitIdAndAfterCommitIdAreSameException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[BeforeCommitIdAndAfterCommitIdAreSameException]
  }
}

