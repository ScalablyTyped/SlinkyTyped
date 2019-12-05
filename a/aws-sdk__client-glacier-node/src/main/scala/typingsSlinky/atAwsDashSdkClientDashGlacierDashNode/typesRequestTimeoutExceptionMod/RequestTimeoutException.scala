package typingsSlinky.atAwsDashSdkClientDashGlacierDashNode.typesRequestTimeoutExceptionMod

import typingsSlinky.atAwsDashSdkClientDashGlacierDashNode.typesUploadArchiveExceptionsUnionMod.UploadArchiveExceptionsUnion
import typingsSlinky.atAwsDashSdkClientDashGlacierDashNode.typesUploadMultipartPartExceptionsUnionMod.UploadMultipartPartExceptionsUnion
import typingsSlinky.atAwsDashSdkTypes.buildExceptionMod.ServiceException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RequestTimeoutException
  extends ServiceException[_RequestTimeoutExceptionDetails]
     with UploadArchiveExceptionsUnion
     with UploadMultipartPartExceptionsUnion {
  @JSName("name")
  var name_RequestTimeoutException: typingsSlinky.atAwsDashSdkClientDashGlacierDashNode.atAwsDashSdkClientDashGlacierDashNodeStrings.RequestTimeoutException = js.native
}

