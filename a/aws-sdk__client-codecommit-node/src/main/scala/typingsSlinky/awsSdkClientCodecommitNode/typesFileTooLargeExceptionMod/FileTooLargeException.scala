package typingsSlinky.awsSdkClientCodecommitNode.typesFileTooLargeExceptionMod

import typingsSlinky.awsSdkClientCodecommitNode.getBlobExceptionsUnionMod.GetBlobExceptionsUnion
import typingsSlinky.awsSdkClientCodecommitNode.getFileExceptionsUnionMod.GetFileExceptionsUnion
import typingsSlinky.awsSdkTypes.exceptionMod.ServiceException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FileTooLargeException
  extends ServiceException[FileTooLargeExceptionDetails]
     with GetBlobExceptionsUnion
     with GetFileExceptionsUnion {
  @JSName("name")
  var name_FileTooLargeException: typingsSlinky.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.FileTooLargeException = js.native
}

