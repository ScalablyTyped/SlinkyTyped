package typingsSlinky.awsSdkClientLambdaNode.typesInvalidZipFileExceptionMod

import typingsSlinky.awsSdkClientLambdaNode.invokeExceptionsUnionMod.InvokeExceptionsUnion
import typingsSlinky.awsSdkTypes.exceptionMod.ServiceException
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InvalidZipFileException
  extends ServiceException[InvalidZipFileExceptionDetails]
     with InvokeExceptionsUnion {
  @JSName("name")
  var name_InvalidZipFileException: typingsSlinky.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.InvalidZipFileException
}

object InvalidZipFileException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: InvalidZipFileExceptionDetails,
    message: String,
    name: typingsSlinky.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.InvalidZipFileException,
    stack: String = null
  ): InvalidZipFileException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[InvalidZipFileException]
  }
}

