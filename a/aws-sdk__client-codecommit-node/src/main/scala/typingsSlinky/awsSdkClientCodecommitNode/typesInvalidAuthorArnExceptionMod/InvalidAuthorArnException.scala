package typingsSlinky.awsSdkClientCodecommitNode.typesInvalidAuthorArnExceptionMod

import typingsSlinky.awsSdkClientCodecommitNode.listPullRequestsExceptionsUnionMod.ListPullRequestsExceptionsUnion
import typingsSlinky.awsSdkTypes.exceptionMod.ServiceException
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InvalidAuthorArnException
  extends ServiceException[InvalidAuthorArnExceptionDetails]
     with ListPullRequestsExceptionsUnion {
  @JSName("name")
  var name_InvalidAuthorArnException: typingsSlinky.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.InvalidAuthorArnException
}

object InvalidAuthorArnException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: InvalidAuthorArnExceptionDetails,
    message: String,
    name: typingsSlinky.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.InvalidAuthorArnException,
    stack: String = null
  ): InvalidAuthorArnException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[InvalidAuthorArnException]
  }
}

