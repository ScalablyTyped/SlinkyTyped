package typingsSlinky.awsSdkTypes.exceptionMod

import typingsSlinky.awsSdkTypes.responseMod.MetadataBearer
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import typingsSlinky.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServiceException[Details]
  extends Error
     with MetadataBearer {
  var details: Details = js.native
}

object ServiceException {
  @scala.inline
  def apply[Details]($metadata: ResponseMetadata, details: Details, message: String, name: String): ServiceException[Details] = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceException[Details]]
  }
  @scala.inline
  implicit class ServiceExceptionOps[Self[details] <: ServiceException[details], Details] (val x: Self[Details]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Details] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Details]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[Details] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[Details] with Other]
    @scala.inline
    def withDetails(value: Details): Self[Details] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("details")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

