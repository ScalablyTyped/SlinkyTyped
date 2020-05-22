package typingsSlinky.awsSdkClientGlacierNode.typesInsufficientCapacityExceptionMod

import typingsSlinky.awsSdkClientGlacierNode.initiateJobExceptionsUnionMod.InitiateJobExceptionsUnion
import typingsSlinky.awsSdkTypes.exceptionMod.ServiceException
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InsufficientCapacityException
  extends ServiceException[InsufficientCapacityExceptionDetails]
     with InitiateJobExceptionsUnion {
  @JSName("name")
  var name_InsufficientCapacityException: typingsSlinky.awsSdkClientGlacierNode.awsSdkClientGlacierNodeStrings.InsufficientCapacityException
}

object InsufficientCapacityException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: InsufficientCapacityExceptionDetails,
    message: String,
    name: typingsSlinky.awsSdkClientGlacierNode.awsSdkClientGlacierNodeStrings.InsufficientCapacityException,
    stack: String = null
  ): InsufficientCapacityException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[InsufficientCapacityException]
  }
}

