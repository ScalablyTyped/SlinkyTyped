package typingsSlinky.awsSdkClientGlacierNode.typesRequestTimeoutExceptionMod

import typingsSlinky.awsSdkClientGlacierNode.uploadArchiveExceptionsUnionMod.UploadArchiveExceptionsUnion
import typingsSlinky.awsSdkClientGlacierNode.uploadMultipartPartExceptionsUnionMod.UploadMultipartPartExceptionsUnion
import typingsSlinky.awsSdkTypes.exceptionMod.ServiceException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RequestTimeoutException
  extends ServiceException[RequestTimeoutExceptionDetails]
     with UploadArchiveExceptionsUnion
     with UploadMultipartPartExceptionsUnion {
  @JSName("name")
  var name_RequestTimeoutException: typingsSlinky.awsSdkClientGlacierNode.awsSdkClientGlacierNodeStrings.RequestTimeoutException = js.native
}

