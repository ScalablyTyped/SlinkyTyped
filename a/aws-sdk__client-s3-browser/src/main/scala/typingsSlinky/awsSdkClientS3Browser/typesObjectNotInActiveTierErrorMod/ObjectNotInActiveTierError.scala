package typingsSlinky.awsSdkClientS3Browser.typesObjectNotInActiveTierErrorMod

import typingsSlinky.awsSdkTypes.exceptionMod.ServiceException
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ObjectNotInActiveTierError extends ServiceException[ObjectNotInActiveTierErrorDetails] {
  @JSName("name")
  var name_ObjectNotInActiveTierError: typingsSlinky.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.ObjectNotInActiveTierError = js.native
}

object ObjectNotInActiveTierError {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: ObjectNotInActiveTierErrorDetails,
    message: String,
    name: typingsSlinky.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.ObjectNotInActiveTierError
  ): ObjectNotInActiveTierError = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectNotInActiveTierError]
  }
  @scala.inline
  implicit class ObjectNotInActiveTierErrorOps[Self <: ObjectNotInActiveTierError] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: typingsSlinky.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.ObjectNotInActiveTierError): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

