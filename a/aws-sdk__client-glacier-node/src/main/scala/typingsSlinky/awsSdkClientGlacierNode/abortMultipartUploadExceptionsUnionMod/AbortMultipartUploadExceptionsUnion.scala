package typingsSlinky.awsSdkClientGlacierNode.abortMultipartUploadExceptionsUnionMod

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
trait AbortMultipartUploadExceptionsUnion extends js.Object

object AbortMultipartUploadExceptionsUnion {
  @scala.inline
  implicit def apply(value: InvalidParameterValueException): AbortMultipartUploadExceptionsUnion = value.asInstanceOf[AbortMultipartUploadExceptionsUnion]
  @scala.inline
  implicit def apply(value: MissingParameterValueException): AbortMultipartUploadExceptionsUnion = value.asInstanceOf[AbortMultipartUploadExceptionsUnion]
  @scala.inline
  implicit def apply(value: ResourceNotFoundException): AbortMultipartUploadExceptionsUnion = value.asInstanceOf[AbortMultipartUploadExceptionsUnion]
  @scala.inline
  implicit def apply(value: ServiceUnavailableException): AbortMultipartUploadExceptionsUnion = value.asInstanceOf[AbortMultipartUploadExceptionsUnion]
}

