package typingsSlinky.awsSdkTypes.exceptionMod

import typingsSlinky.awsSdkTypes.awsSdkTypesStrings.Error
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnkownServiceException
  extends ServiceException[js.UndefOr[scala.Nothing]] {
  @JSName("name")
  var name_UnkownServiceException: Error = js.native
}

object UnkownServiceException {
  @scala.inline
  def apply($metadata: ResponseMetadata, message: String, name: Error): UnkownServiceException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnkownServiceException]
  }
  @scala.inline
  implicit class UnkownServiceExceptionOps[Self <: UnkownServiceException] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: Error): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

