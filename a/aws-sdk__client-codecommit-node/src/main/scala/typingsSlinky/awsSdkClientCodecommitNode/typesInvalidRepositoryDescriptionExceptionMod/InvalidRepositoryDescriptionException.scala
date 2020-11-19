package typingsSlinky.awsSdkClientCodecommitNode.typesInvalidRepositoryDescriptionExceptionMod

import typingsSlinky.awsSdkClientCodecommitNode.createRepositoryExceptionsUnionMod.CreateRepositoryExceptionsUnion
import typingsSlinky.awsSdkClientCodecommitNode.updateRepositoryDescriptionExceptionsUnionMod.UpdateRepositoryDescriptionExceptionsUnion
import typingsSlinky.awsSdkTypes.exceptionMod.ServiceException
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InvalidRepositoryDescriptionException
  extends ServiceException[InvalidRepositoryDescriptionExceptionDetails]
     with CreateRepositoryExceptionsUnion
     with UpdateRepositoryDescriptionExceptionsUnion {
  
  @JSName("name")
  var name_InvalidRepositoryDescriptionException: typingsSlinky.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.InvalidRepositoryDescriptionException = js.native
}
object InvalidRepositoryDescriptionException {
  
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: InvalidRepositoryDescriptionExceptionDetails,
    message: String,
    name: typingsSlinky.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.InvalidRepositoryDescriptionException
  ): InvalidRepositoryDescriptionException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[InvalidRepositoryDescriptionException]
  }
  
  @scala.inline
  implicit class InvalidRepositoryDescriptionExceptionOps[Self <: InvalidRepositoryDescriptionException] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setName(
      value: typingsSlinky.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.InvalidRepositoryDescriptionException
    ): Self = this.set("name", value.asInstanceOf[js.Any])
  }
}
