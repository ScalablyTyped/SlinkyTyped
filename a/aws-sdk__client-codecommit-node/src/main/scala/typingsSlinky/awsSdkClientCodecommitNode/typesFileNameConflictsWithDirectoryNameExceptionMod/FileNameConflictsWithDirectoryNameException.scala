package typingsSlinky.awsSdkClientCodecommitNode.typesFileNameConflictsWithDirectoryNameExceptionMod

import typingsSlinky.awsSdkClientCodecommitNode.putFileExceptionsUnionMod.PutFileExceptionsUnion
import typingsSlinky.awsSdkTypes.exceptionMod.ServiceException
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FileNameConflictsWithDirectoryNameException
  extends ServiceException[FileNameConflictsWithDirectoryNameExceptionDetails]
     with PutFileExceptionsUnion {
  
  @JSName("name")
  var name_FileNameConflictsWithDirectoryNameException: typingsSlinky.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.FileNameConflictsWithDirectoryNameException = js.native
}
object FileNameConflictsWithDirectoryNameException {
  
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: FileNameConflictsWithDirectoryNameExceptionDetails,
    message: String,
    name: typingsSlinky.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.FileNameConflictsWithDirectoryNameException
  ): FileNameConflictsWithDirectoryNameException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileNameConflictsWithDirectoryNameException]
  }
  
  @scala.inline
  implicit class FileNameConflictsWithDirectoryNameExceptionOps[Self <: FileNameConflictsWithDirectoryNameException] (val x: Self) extends AnyVal {
    
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
      value: typingsSlinky.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.FileNameConflictsWithDirectoryNameException
    ): Self = this.set("name", value.asInstanceOf[js.Any])
  }
}
