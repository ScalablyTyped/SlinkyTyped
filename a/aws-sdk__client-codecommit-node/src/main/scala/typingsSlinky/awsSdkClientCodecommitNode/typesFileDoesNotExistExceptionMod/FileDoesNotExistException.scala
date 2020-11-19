package typingsSlinky.awsSdkClientCodecommitNode.typesFileDoesNotExistExceptionMod

import typingsSlinky.awsSdkClientCodecommitNode.deleteFileExceptionsUnionMod.DeleteFileExceptionsUnion
import typingsSlinky.awsSdkClientCodecommitNode.getFileExceptionsUnionMod.GetFileExceptionsUnion
import typingsSlinky.awsSdkTypes.exceptionMod.ServiceException
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FileDoesNotExistException
  extends ServiceException[FileDoesNotExistExceptionDetails]
     with DeleteFileExceptionsUnion
     with GetFileExceptionsUnion {
  
  @JSName("name")
  var name_FileDoesNotExistException: typingsSlinky.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.FileDoesNotExistException = js.native
}
object FileDoesNotExistException {
  
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: FileDoesNotExistExceptionDetails,
    message: String,
    name: typingsSlinky.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.FileDoesNotExistException
  ): FileDoesNotExistException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileDoesNotExistException]
  }
  
  @scala.inline
  implicit class FileDoesNotExistExceptionOps[Self <: FileDoesNotExistException] (val x: Self) extends AnyVal {
    
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
      value: typingsSlinky.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.FileDoesNotExistException
    ): Self = this.set("name", value.asInstanceOf[js.Any])
  }
}
