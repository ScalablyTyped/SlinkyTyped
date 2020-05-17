package typingsSlinky.awsSdkClientGlacierNode.deleteVaultAccessPolicyExceptionsUnionMod

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
trait DeleteVaultAccessPolicyExceptionsUnion extends js.Object

object DeleteVaultAccessPolicyExceptionsUnion {
  @scala.inline
  implicit def apply(value: InvalidParameterValueException): DeleteVaultAccessPolicyExceptionsUnion = value.asInstanceOf[DeleteVaultAccessPolicyExceptionsUnion]
  @scala.inline
  implicit def apply(value: MissingParameterValueException): DeleteVaultAccessPolicyExceptionsUnion = value.asInstanceOf[DeleteVaultAccessPolicyExceptionsUnion]
  @scala.inline
  implicit def apply(value: ResourceNotFoundException): DeleteVaultAccessPolicyExceptionsUnion = value.asInstanceOf[DeleteVaultAccessPolicyExceptionsUnion]
  @scala.inline
  implicit def apply(value: ServiceUnavailableException): DeleteVaultAccessPolicyExceptionsUnion = value.asInstanceOf[DeleteVaultAccessPolicyExceptionsUnion]
}

