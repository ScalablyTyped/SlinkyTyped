package typingsSlinky.awsSdkClientCodecommitNode.typesParentCommitIdOutdatedExceptionMod

import typingsSlinky.awsSdkClientCodecommitNode.deleteFileExceptionsUnionMod.DeleteFileExceptionsUnion
import typingsSlinky.awsSdkClientCodecommitNode.putFileExceptionsUnionMod.PutFileExceptionsUnion
import typingsSlinky.awsSdkTypes.exceptionMod.ServiceException
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParentCommitIdOutdatedException
  extends ServiceException[ParentCommitIdOutdatedExceptionDetails]
     with DeleteFileExceptionsUnion
     with PutFileExceptionsUnion {
  
  @JSName("name")
  var name_ParentCommitIdOutdatedException: typingsSlinky.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.ParentCommitIdOutdatedException = js.native
}
object ParentCommitIdOutdatedException {
  
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: ParentCommitIdOutdatedExceptionDetails,
    message: String,
    name: typingsSlinky.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.ParentCommitIdOutdatedException
  ): ParentCommitIdOutdatedException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParentCommitIdOutdatedException]
  }
  
  @scala.inline
  implicit class ParentCommitIdOutdatedExceptionOps[Self <: ParentCommitIdOutdatedException] (val x: Self) extends AnyVal {
    
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
      value: typingsSlinky.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.ParentCommitIdOutdatedException
    ): Self = this.set("name", value.asInstanceOf[js.Any])
  }
}
