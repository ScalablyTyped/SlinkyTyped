package typingsSlinky.awsSdkClientGlacierNode.listMultipartUploadsExceptionsUnionMod

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
trait ListMultipartUploadsExceptionsUnion extends js.Object

object ListMultipartUploadsExceptionsUnion {
  @scala.inline
  implicit def apply(value: InvalidParameterValueException): ListMultipartUploadsExceptionsUnion = value.asInstanceOf[ListMultipartUploadsExceptionsUnion]
  @scala.inline
  implicit def apply(value: MissingParameterValueException): ListMultipartUploadsExceptionsUnion = value.asInstanceOf[ListMultipartUploadsExceptionsUnion]
  @scala.inline
  implicit def apply(value: ResourceNotFoundException): ListMultipartUploadsExceptionsUnion = value.asInstanceOf[ListMultipartUploadsExceptionsUnion]
  @scala.inline
  implicit def apply(value: ServiceUnavailableException): ListMultipartUploadsExceptionsUnion = value.asInstanceOf[ListMultipartUploadsExceptionsUnion]
}

