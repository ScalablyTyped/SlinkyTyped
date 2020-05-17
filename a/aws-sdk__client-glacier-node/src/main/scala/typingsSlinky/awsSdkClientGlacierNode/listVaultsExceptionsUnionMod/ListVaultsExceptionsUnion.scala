package typingsSlinky.awsSdkClientGlacierNode.listVaultsExceptionsUnionMod

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
trait ListVaultsExceptionsUnion extends js.Object

object ListVaultsExceptionsUnion {
  @scala.inline
  implicit def apply(value: InvalidParameterValueException): ListVaultsExceptionsUnion = value.asInstanceOf[ListVaultsExceptionsUnion]
  @scala.inline
  implicit def apply(value: MissingParameterValueException): ListVaultsExceptionsUnion = value.asInstanceOf[ListVaultsExceptionsUnion]
  @scala.inline
  implicit def apply(value: ResourceNotFoundException): ListVaultsExceptionsUnion = value.asInstanceOf[ListVaultsExceptionsUnion]
  @scala.inline
  implicit def apply(value: ServiceUnavailableException): ListVaultsExceptionsUnion = value.asInstanceOf[ListVaultsExceptionsUnion]
}

