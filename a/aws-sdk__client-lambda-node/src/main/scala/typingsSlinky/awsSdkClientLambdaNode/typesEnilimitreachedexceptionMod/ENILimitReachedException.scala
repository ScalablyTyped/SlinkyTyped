package typingsSlinky.awsSdkClientLambdaNode.typesEnilimitreachedexceptionMod

import typingsSlinky.awsSdkClientLambdaNode.invokeExceptionsUnionMod.InvokeExceptionsUnion
import typingsSlinky.awsSdkTypes.exceptionMod.ServiceException
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ENILimitReachedException
  extends ServiceException[ENILimitReachedExceptionDetails]
     with InvokeExceptionsUnion {
  @JSName("name")
  var name_ENILimitReachedException: typingsSlinky.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.ENILimitReachedException
}

object ENILimitReachedException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: ENILimitReachedExceptionDetails,
    message: String,
    name: typingsSlinky.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.ENILimitReachedException,
    stack: String = null
  ): ENILimitReachedException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[ENILimitReachedException]
  }
}

