package typingsSlinky.awsSdkClientKmsBrowser.typesIncorrectKeyMaterialExceptionMod

import typingsSlinky.awsSdkClientKmsBrowser.importKeyMaterialExceptionsUnionMod.ImportKeyMaterialExceptionsUnion
import typingsSlinky.awsSdkTypes.exceptionMod.ServiceException
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IncorrectKeyMaterialException
  extends ServiceException[IncorrectKeyMaterialExceptionDetails]
     with ImportKeyMaterialExceptionsUnion {
  @JSName("name")
  var name_IncorrectKeyMaterialException: typingsSlinky.awsSdkClientKmsBrowser.awsSdkClientKmsBrowserStrings.IncorrectKeyMaterialException = js.native
}

object IncorrectKeyMaterialException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: IncorrectKeyMaterialExceptionDetails,
    message: String,
    name: typingsSlinky.awsSdkClientKmsBrowser.awsSdkClientKmsBrowserStrings.IncorrectKeyMaterialException
  ): IncorrectKeyMaterialException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IncorrectKeyMaterialException]
  }
  @scala.inline
  implicit class IncorrectKeyMaterialExceptionOps[Self <: IncorrectKeyMaterialException] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(
      value: typingsSlinky.awsSdkClientKmsBrowser.awsSdkClientKmsBrowserStrings.IncorrectKeyMaterialException
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

