package typingsSlinky.awsSdkClientCodecommitNode.typesSameFileContentExceptionMod

import typingsSlinky.awsSdkClientCodecommitNode.putFileExceptionsUnionMod.PutFileExceptionsUnion
import typingsSlinky.awsSdkTypes.exceptionMod.ServiceException
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SameFileContentException
  extends ServiceException[SameFileContentExceptionDetails]
     with PutFileExceptionsUnion {
  @JSName("name")
  var name_SameFileContentException: typingsSlinky.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.SameFileContentException
}

object SameFileContentException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: SameFileContentExceptionDetails,
    message: String,
    name: typingsSlinky.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.SameFileContentException,
    stack: String = null
  ): SameFileContentException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[SameFileContentException]
  }
}

