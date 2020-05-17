package typingsSlinky.awsSdkClientGlacierNode.listPartsExceptionsUnionMod

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
trait ListPartsExceptionsUnion extends js.Object

object ListPartsExceptionsUnion {
  @scala.inline
  implicit def apply(value: InvalidParameterValueException): ListPartsExceptionsUnion = value.asInstanceOf[ListPartsExceptionsUnion]
  @scala.inline
  implicit def apply(value: MissingParameterValueException): ListPartsExceptionsUnion = value.asInstanceOf[ListPartsExceptionsUnion]
  @scala.inline
  implicit def apply(value: ResourceNotFoundException): ListPartsExceptionsUnion = value.asInstanceOf[ListPartsExceptionsUnion]
  @scala.inline
  implicit def apply(value: ServiceUnavailableException): ListPartsExceptionsUnion = value.asInstanceOf[ListPartsExceptionsUnion]
}

