package typingsSlinky.awsSdkClientGlacierNode.deleteVaultExceptionsUnionMod

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
trait DeleteVaultExceptionsUnion extends js.Object

object DeleteVaultExceptionsUnion {
  @scala.inline
  implicit def apply(value: InvalidParameterValueException): DeleteVaultExceptionsUnion = value.asInstanceOf[DeleteVaultExceptionsUnion]
  @scala.inline
  implicit def apply(value: MissingParameterValueException): DeleteVaultExceptionsUnion = value.asInstanceOf[DeleteVaultExceptionsUnion]
  @scala.inline
  implicit def apply(value: ResourceNotFoundException): DeleteVaultExceptionsUnion = value.asInstanceOf[DeleteVaultExceptionsUnion]
  @scala.inline
  implicit def apply(value: ServiceUnavailableException): DeleteVaultExceptionsUnion = value.asInstanceOf[DeleteVaultExceptionsUnion]
}

