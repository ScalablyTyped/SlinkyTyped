package typingsSlinky.awsSdkClientCodecommitNode.typesDirectoryNameConflictsWithFileNameExceptionMod

import typingsSlinky.awsSdkClientCodecommitNode.putFileExceptionsUnionMod.PutFileExceptionsUnion
import typingsSlinky.awsSdkTypes.exceptionMod.ServiceException
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DirectoryNameConflictsWithFileNameException
  extends ServiceException[DirectoryNameConflictsWithFileNameExceptionDetails]
     with PutFileExceptionsUnion {
  @JSName("name")
  var name_DirectoryNameConflictsWithFileNameException: typingsSlinky.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.DirectoryNameConflictsWithFileNameException
}

object DirectoryNameConflictsWithFileNameException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: DirectoryNameConflictsWithFileNameExceptionDetails,
    message: String,
    name: typingsSlinky.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.DirectoryNameConflictsWithFileNameException,
    stack: String = null
  ): DirectoryNameConflictsWithFileNameException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectoryNameConflictsWithFileNameException]
  }
}

