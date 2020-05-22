package typingsSlinky.awsSdkClientCodecommitNode.typesMaximumOpenPullRequestsExceededExceptionMod

import typingsSlinky.awsSdkClientCodecommitNode.createPullRequestExceptionsUnionMod.CreatePullRequestExceptionsUnion
import typingsSlinky.awsSdkTypes.exceptionMod.ServiceException
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MaximumOpenPullRequestsExceededException
  extends ServiceException[MaximumOpenPullRequestsExceededExceptionDetails]
     with CreatePullRequestExceptionsUnion {
  @JSName("name")
  var name_MaximumOpenPullRequestsExceededException: typingsSlinky.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.MaximumOpenPullRequestsExceededException
}

object MaximumOpenPullRequestsExceededException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: MaximumOpenPullRequestsExceededExceptionDetails,
    message: String,
    name: typingsSlinky.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.MaximumOpenPullRequestsExceededException,
    stack: String = null
  ): MaximumOpenPullRequestsExceededException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaximumOpenPullRequestsExceededException]
  }
}

