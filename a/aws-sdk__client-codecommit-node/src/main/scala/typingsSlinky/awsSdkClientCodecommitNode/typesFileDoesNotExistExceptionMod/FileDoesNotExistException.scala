package typingsSlinky.awsSdkClientCodecommitNode.typesFileDoesNotExistExceptionMod

import typingsSlinky.awsSdkClientCodecommitNode.deleteFileExceptionsUnionMod.DeleteFileExceptionsUnion
import typingsSlinky.awsSdkClientCodecommitNode.getFileExceptionsUnionMod.GetFileExceptionsUnion
import typingsSlinky.awsSdkTypes.exceptionMod.ServiceException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FileDoesNotExistException
  extends ServiceException[FileDoesNotExistExceptionDetails]
     with DeleteFileExceptionsUnion
     with GetFileExceptionsUnion {
  @JSName("name")
  var name_FileDoesNotExistException: typingsSlinky.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.FileDoesNotExistException = js.native
}

