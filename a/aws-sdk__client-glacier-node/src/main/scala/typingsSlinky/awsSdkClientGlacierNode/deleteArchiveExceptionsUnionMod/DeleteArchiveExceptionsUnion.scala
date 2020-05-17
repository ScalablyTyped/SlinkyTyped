package typingsSlinky.awsSdkClientGlacierNode.deleteArchiveExceptionsUnionMod

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
trait DeleteArchiveExceptionsUnion extends js.Object

object DeleteArchiveExceptionsUnion {
  @scala.inline
  implicit def apply(value: InvalidParameterValueException): DeleteArchiveExceptionsUnion = value.asInstanceOf[DeleteArchiveExceptionsUnion]
  @scala.inline
  implicit def apply(value: MissingParameterValueException): DeleteArchiveExceptionsUnion = value.asInstanceOf[DeleteArchiveExceptionsUnion]
  @scala.inline
  implicit def apply(value: ResourceNotFoundException): DeleteArchiveExceptionsUnion = value.asInstanceOf[DeleteArchiveExceptionsUnion]
  @scala.inline
  implicit def apply(value: ServiceUnavailableException): DeleteArchiveExceptionsUnion = value.asInstanceOf[DeleteArchiveExceptionsUnion]
}

