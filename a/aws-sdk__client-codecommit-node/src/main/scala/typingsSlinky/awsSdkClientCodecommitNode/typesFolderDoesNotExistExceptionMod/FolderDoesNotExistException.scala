package typingsSlinky.awsSdkClientCodecommitNode.typesFolderDoesNotExistExceptionMod

import typingsSlinky.awsSdkClientCodecommitNode.getFolderExceptionsUnionMod.GetFolderExceptionsUnion
import typingsSlinky.awsSdkTypes.exceptionMod.ServiceException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FolderDoesNotExistException
  extends ServiceException[FolderDoesNotExistExceptionDetails]
     with GetFolderExceptionsUnion {
  @JSName("name")
  var name_FolderDoesNotExistException: typingsSlinky.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.FolderDoesNotExistException = js.native
}

