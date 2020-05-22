package typingsSlinky.awsSdkClientCodecommitNode.typesMaximumRepositoryNamesExceededExceptionMod

import typingsSlinky.awsSdkClientCodecommitNode.batchGetRepositoriesExceptionsUnionMod.BatchGetRepositoriesExceptionsUnion
import typingsSlinky.awsSdkTypes.exceptionMod.ServiceException
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MaximumRepositoryNamesExceededException
  extends ServiceException[MaximumRepositoryNamesExceededExceptionDetails]
     with BatchGetRepositoriesExceptionsUnion {
  @JSName("name")
  var name_MaximumRepositoryNamesExceededException: typingsSlinky.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.MaximumRepositoryNamesExceededException
}

object MaximumRepositoryNamesExceededException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: MaximumRepositoryNamesExceededExceptionDetails,
    message: String,
    name: typingsSlinky.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.MaximumRepositoryNamesExceededException,
    stack: String = null
  ): MaximumRepositoryNamesExceededException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaximumRepositoryNamesExceededException]
  }
}

