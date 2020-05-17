package typingsSlinky.awsSdkClientGlacierNode.initiateMultipartUploadExceptionsUnionMod

import typingsSlinky.awsSdkClientGlacierNode.typesInvalidParameterValueExceptionMod.InvalidParameterValueException
import typingsSlinky.awsSdkClientGlacierNode.typesMissingParameterValueExceptionMod.MissingParameterValueException
import typingsSlinky.awsSdkClientGlacierNode.typesResourceNotFoundExceptionMod.ResourceNotFoundException
import typingsSlinky.awsSdkClientGlacierNode.typesServiceUnavailableExceptionMod.ServiceUnavailableException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdkClientGlacierNode.typesResourceNotFoundExceptionMod.ResourceNotFoundException
  - typingsSlinky.awsSdkClientGlacierNode.typesInvalidParameterValueExceptionMod.InvalidParameterValueException
  - typingsSlinky.awsSdkClientGlacierNode.typesMissingParameterValueExceptionMod.MissingParameterValueException
  - typingsSlinky.awsSdkClientGlacierNode.typesServiceUnavailableExceptionMod.ServiceUnavailableException
*/
trait InitiateMultipartUploadExceptionsUnion extends js.Object

object InitiateMultipartUploadExceptionsUnion {
  @scala.inline
  implicit def apply(value: InvalidParameterValueException): InitiateMultipartUploadExceptionsUnion = value.asInstanceOf[InitiateMultipartUploadExceptionsUnion]
  @scala.inline
  implicit def apply(value: MissingParameterValueException): InitiateMultipartUploadExceptionsUnion = value.asInstanceOf[InitiateMultipartUploadExceptionsUnion]
  @scala.inline
  implicit def apply(value: ResourceNotFoundException): InitiateMultipartUploadExceptionsUnion = value.asInstanceOf[InitiateMultipartUploadExceptionsUnion]
  @scala.inline
  implicit def apply(value: ServiceUnavailableException): InitiateMultipartUploadExceptionsUnion = value.asInstanceOf[InitiateMultipartUploadExceptionsUnion]
}

