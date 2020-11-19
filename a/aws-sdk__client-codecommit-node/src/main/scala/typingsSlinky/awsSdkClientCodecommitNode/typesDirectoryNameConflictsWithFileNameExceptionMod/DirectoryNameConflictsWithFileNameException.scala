package typingsSlinky.awsSdkClientCodecommitNode.typesDirectoryNameConflictsWithFileNameExceptionMod

import typingsSlinky.awsSdkClientCodecommitNode.putFileExceptionsUnionMod.PutFileExceptionsUnion
import typingsSlinky.awsSdkTypes.exceptionMod.ServiceException
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DirectoryNameConflictsWithFileNameException
  extends ServiceException[DirectoryNameConflictsWithFileNameExceptionDetails]
     with PutFileExceptionsUnion {
  
  @JSName("name")
  var name_DirectoryNameConflictsWithFileNameException: typingsSlinky.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.DirectoryNameConflictsWithFileNameException = js.native
}
object DirectoryNameConflictsWithFileNameException {
  
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: DirectoryNameConflictsWithFileNameExceptionDetails,
    message: String,
    name: typingsSlinky.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.DirectoryNameConflictsWithFileNameException
  ): DirectoryNameConflictsWithFileNameException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectoryNameConflictsWithFileNameException]
  }
  
  @scala.inline
  implicit class DirectoryNameConflictsWithFileNameExceptionOps[Self <: DirectoryNameConflictsWithFileNameException] (val x: Self) extends AnyVal {
    
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
      value: typingsSlinky.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.DirectoryNameConflictsWithFileNameException
    ): Self = this.set("name", value.asInstanceOf[js.Any])
  }
}
