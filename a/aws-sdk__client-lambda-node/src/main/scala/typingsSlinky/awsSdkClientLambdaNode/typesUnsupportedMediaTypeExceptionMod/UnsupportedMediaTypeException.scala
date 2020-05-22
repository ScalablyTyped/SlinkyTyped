package typingsSlinky.awsSdkClientLambdaNode.typesUnsupportedMediaTypeExceptionMod

import typingsSlinky.awsSdkClientLambdaNode.invokeExceptionsUnionMod.InvokeExceptionsUnion
import typingsSlinky.awsSdkTypes.exceptionMod.ServiceException
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnsupportedMediaTypeException
  extends ServiceException[UnsupportedMediaTypeExceptionDetails]
     with InvokeExceptionsUnion {
  @JSName("name")
  var name_UnsupportedMediaTypeException: typingsSlinky.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.UnsupportedMediaTypeException
}

object UnsupportedMediaTypeException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: UnsupportedMediaTypeExceptionDetails,
    message: String,
    name: typingsSlinky.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.UnsupportedMediaTypeException,
    stack: String = null
  ): UnsupportedMediaTypeException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnsupportedMediaTypeException]
  }
}

