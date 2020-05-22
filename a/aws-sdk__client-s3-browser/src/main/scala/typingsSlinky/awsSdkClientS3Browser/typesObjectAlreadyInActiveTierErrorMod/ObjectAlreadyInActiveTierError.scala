package typingsSlinky.awsSdkClientS3Browser.typesObjectAlreadyInActiveTierErrorMod

import typingsSlinky.awsSdkTypes.exceptionMod.ServiceException
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ObjectAlreadyInActiveTierError extends ServiceException[ObjectAlreadyInActiveTierErrorDetails] {
  @JSName("name")
  var name_ObjectAlreadyInActiveTierError: typingsSlinky.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.ObjectAlreadyInActiveTierError
}

object ObjectAlreadyInActiveTierError {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: ObjectAlreadyInActiveTierErrorDetails,
    message: String,
    name: typingsSlinky.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.ObjectAlreadyInActiveTierError,
    stack: String = null
  ): ObjectAlreadyInActiveTierError = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectAlreadyInActiveTierError]
  }
}

