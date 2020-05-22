package typingsSlinky.awsSdkClientCodecommitNode.typesTipOfSourceReferenceIsDifferentExceptionMod

import typingsSlinky.awsSdkClientCodecommitNode.mergePullRequestByFastForwardExceptionsUnionMod.MergePullRequestByFastForwardExceptionsUnion
import typingsSlinky.awsSdkTypes.exceptionMod.ServiceException
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TipOfSourceReferenceIsDifferentException
  extends ServiceException[TipOfSourceReferenceIsDifferentExceptionDetails]
     with MergePullRequestByFastForwardExceptionsUnion {
  @JSName("name")
  var name_TipOfSourceReferenceIsDifferentException: typingsSlinky.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.TipOfSourceReferenceIsDifferentException
}

object TipOfSourceReferenceIsDifferentException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: TipOfSourceReferenceIsDifferentExceptionDetails,
    message: String,
    name: typingsSlinky.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.TipOfSourceReferenceIsDifferentException,
    stack: String = null
  ): TipOfSourceReferenceIsDifferentException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[TipOfSourceReferenceIsDifferentException]
  }
}

