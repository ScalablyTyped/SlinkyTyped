package typingsSlinky.awsSdkClientCodecommitNode.typesInvalidBranchNameExceptionMod

import typingsSlinky.awsSdkClientCodecommitNode.createBranchExceptionsUnionMod.CreateBranchExceptionsUnion
import typingsSlinky.awsSdkClientCodecommitNode.deleteBranchExceptionsUnionMod.DeleteBranchExceptionsUnion
import typingsSlinky.awsSdkClientCodecommitNode.deleteFileExceptionsUnionMod.DeleteFileExceptionsUnion
import typingsSlinky.awsSdkClientCodecommitNode.getBranchExceptionsUnionMod.GetBranchExceptionsUnion
import typingsSlinky.awsSdkClientCodecommitNode.putFileExceptionsUnionMod.PutFileExceptionsUnion
import typingsSlinky.awsSdkClientCodecommitNode.updateDefaultBranchExceptionsUnionMod.UpdateDefaultBranchExceptionsUnion
import typingsSlinky.awsSdkTypes.exceptionMod.ServiceException
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InvalidBranchNameException
  extends ServiceException[InvalidBranchNameExceptionDetails]
     with CreateBranchExceptionsUnion
     with DeleteBranchExceptionsUnion
     with DeleteFileExceptionsUnion
     with GetBranchExceptionsUnion
     with PutFileExceptionsUnion
     with UpdateDefaultBranchExceptionsUnion {
  
  @JSName("name")
  var name_InvalidBranchNameException: typingsSlinky.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.InvalidBranchNameException = js.native
}
object InvalidBranchNameException {
  
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: InvalidBranchNameExceptionDetails,
    message: String,
    name: typingsSlinky.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.InvalidBranchNameException
  ): InvalidBranchNameException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[InvalidBranchNameException]
  }
  
  @scala.inline
  implicit class InvalidBranchNameExceptionOps[Self <: InvalidBranchNameException] (val x: Self) extends AnyVal {
    
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
      value: typingsSlinky.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.InvalidBranchNameException
    ): Self = this.set("name", value.asInstanceOf[js.Any])
  }
}
