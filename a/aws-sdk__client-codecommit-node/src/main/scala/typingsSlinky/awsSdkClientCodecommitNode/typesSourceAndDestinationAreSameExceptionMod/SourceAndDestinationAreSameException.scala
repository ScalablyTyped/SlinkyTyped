package typingsSlinky.awsSdkClientCodecommitNode.typesSourceAndDestinationAreSameExceptionMod

import typingsSlinky.awsSdkClientCodecommitNode.createPullRequestExceptionsUnionMod.CreatePullRequestExceptionsUnion
import typingsSlinky.awsSdkTypes.exceptionMod.ServiceException
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SourceAndDestinationAreSameException
  extends ServiceException[SourceAndDestinationAreSameExceptionDetails]
     with CreatePullRequestExceptionsUnion {
  @JSName("name")
  var name_SourceAndDestinationAreSameException: typingsSlinky.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.SourceAndDestinationAreSameException
}

object SourceAndDestinationAreSameException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: SourceAndDestinationAreSameExceptionDetails,
    message: String,
    name: typingsSlinky.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.SourceAndDestinationAreSameException,
    stack: String = null
  ): SourceAndDestinationAreSameException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceAndDestinationAreSameException]
  }
}

