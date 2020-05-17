package typingsSlinky.awsSdkClientGlacierNode.uploadMultipartPartExceptionsUnionMod

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
trait UploadMultipartPartExceptionsUnion extends js.Object

object UploadMultipartPartExceptionsUnion {
  @scala.inline
  implicit def apply(value: InvalidParameterValueException): UploadMultipartPartExceptionsUnion = value.asInstanceOf[UploadMultipartPartExceptionsUnion]
  @scala.inline
  implicit def apply(value: MissingParameterValueException): UploadMultipartPartExceptionsUnion = value.asInstanceOf[UploadMultipartPartExceptionsUnion]
  @scala.inline
  implicit def apply(value: RequestTimeoutException): UploadMultipartPartExceptionsUnion = value.asInstanceOf[UploadMultipartPartExceptionsUnion]
  @scala.inline
  implicit def apply(value: ResourceNotFoundException): UploadMultipartPartExceptionsUnion = value.asInstanceOf[UploadMultipartPartExceptionsUnion]
  @scala.inline
  implicit def apply(value: ServiceUnavailableException): UploadMultipartPartExceptionsUnion = value.asInstanceOf[UploadMultipartPartExceptionsUnion]
}

