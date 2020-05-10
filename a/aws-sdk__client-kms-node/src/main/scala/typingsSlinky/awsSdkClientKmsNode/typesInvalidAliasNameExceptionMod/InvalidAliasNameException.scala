package typingsSlinky.awsSdkClientKmsNode.typesInvalidAliasNameExceptionMod

import typingsSlinky.awsSdkClientKmsNode.createAliasExceptionsUnionMod.CreateAliasExceptionsUnion
import typingsSlinky.awsSdkTypes.exceptionMod.ServiceException
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InvalidAliasNameException
  extends ServiceException[InvalidAliasNameExceptionDetails]
     with CreateAliasExceptionsUnion {
  @JSName("name")
  var name_InvalidAliasNameException: typingsSlinky.awsSdkClientKmsNode.awsSdkClientKmsNodeStrings.InvalidAliasNameException = js.native
}

object InvalidAliasNameException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: InvalidAliasNameExceptionDetails,
    message: String,
    name: typingsSlinky.awsSdkClientKmsNode.awsSdkClientKmsNodeStrings.InvalidAliasNameException
  ): InvalidAliasNameException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[InvalidAliasNameException]
  }
  @scala.inline
  implicit class InvalidAliasNameExceptionOps[Self <: InvalidAliasNameException] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: typingsSlinky.awsSdkClientKmsNode.awsSdkClientKmsNodeStrings.InvalidAliasNameException): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

