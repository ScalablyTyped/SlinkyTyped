package typingsSlinky.awsSdkClientKmsNode.typesInvalidImportTokenExceptionMod

import typingsSlinky.awsSdkClientKmsNode.importKeyMaterialExceptionsUnionMod.ImportKeyMaterialExceptionsUnion
import typingsSlinky.awsSdkTypes.exceptionMod.ServiceException
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InvalidImportTokenException
  extends ServiceException[InvalidImportTokenExceptionDetails]
     with ImportKeyMaterialExceptionsUnion {
  @JSName("name")
  var name_InvalidImportTokenException: typingsSlinky.awsSdkClientKmsNode.awsSdkClientKmsNodeStrings.InvalidImportTokenException = js.native
}

object InvalidImportTokenException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: InvalidImportTokenExceptionDetails,
    message: String,
    name: typingsSlinky.awsSdkClientKmsNode.awsSdkClientKmsNodeStrings.InvalidImportTokenException
  ): InvalidImportTokenException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[InvalidImportTokenException]
  }
  @scala.inline
  implicit class InvalidImportTokenExceptionOps[Self <: InvalidImportTokenException] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: typingsSlinky.awsSdkClientKmsNode.awsSdkClientKmsNodeStrings.InvalidImportTokenException): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

