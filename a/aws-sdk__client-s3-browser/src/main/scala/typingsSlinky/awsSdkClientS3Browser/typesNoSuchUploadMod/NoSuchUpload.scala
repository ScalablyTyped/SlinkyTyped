package typingsSlinky.awsSdkClientS3Browser.typesNoSuchUploadMod

import typingsSlinky.awsSdkTypes.exceptionMod.ServiceException
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NoSuchUpload extends ServiceException[NoSuchUploadDetails] {
  @JSName("name")
  var name_NoSuchUpload: typingsSlinky.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.NoSuchUpload
}

object NoSuchUpload {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: NoSuchUploadDetails,
    message: String,
    name: typingsSlinky.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.NoSuchUpload,
    stack: String = null
  ): NoSuchUpload = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[NoSuchUpload]
  }
}

