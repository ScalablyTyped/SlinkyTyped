package typingsSlinky.awsSdkClientGlacierNode.uploadArchiveExceptionsUnionMod

import typingsSlinky.awsSdkClientGlacierNode.typesInvalidParameterValueExceptionMod.InvalidParameterValueException
import typingsSlinky.awsSdkClientGlacierNode.typesMissingParameterValueExceptionMod.MissingParameterValueException
import typingsSlinky.awsSdkClientGlacierNode.typesRequestTimeoutExceptionMod.RequestTimeoutException
import typingsSlinky.awsSdkClientGlacierNode.typesResourceNotFoundExceptionMod.ResourceNotFoundException
import typingsSlinky.awsSdkClientGlacierNode.typesServiceUnavailableExceptionMod.ServiceUnavailableException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdkClientGlacierNode.typesResourceNotFoundExceptionMod.ResourceNotFoundException
  - typingsSlinky.awsSdkClientGlacierNode.typesInvalidParameterValueExceptionMod.InvalidParameterValueException
  - typingsSlinky.awsSdkClientGlacierNode.typesMissingParameterValueExceptionMod.MissingParameterValueException
  - typingsSlinky.awsSdkClientGlacierNode.typesRequestTimeoutExceptionMod.RequestTimeoutException
  - typingsSlinky.awsSdkClientGlacierNode.typesServiceUnavailableExceptionMod.ServiceUnavailableException
*/
trait UploadArchiveExceptionsUnion extends js.Object

object UploadArchiveExceptionsUnion {
  @scala.inline
  implicit def apply(value: InvalidParameterValueException): UploadArchiveExceptionsUnion = value.asInstanceOf[UploadArchiveExceptionsUnion]
  @scala.inline
  implicit def apply(value: MissingParameterValueException): UploadArchiveExceptionsUnion = value.asInstanceOf[UploadArchiveExceptionsUnion]
  @scala.inline
  implicit def apply(value: RequestTimeoutException): UploadArchiveExceptionsUnion = value.asInstanceOf[UploadArchiveExceptionsUnion]
  @scala.inline
  implicit def apply(value: ResourceNotFoundException): UploadArchiveExceptionsUnion = value.asInstanceOf[UploadArchiveExceptionsUnion]
  @scala.inline
  implicit def apply(value: ServiceUnavailableException): UploadArchiveExceptionsUnion = value.asInstanceOf[UploadArchiveExceptionsUnion]
}

