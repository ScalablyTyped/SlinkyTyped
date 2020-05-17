package typingsSlinky.awsSdkClientGlacierNode.getVaultAccessPolicyExceptionsUnionMod

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
trait GetVaultAccessPolicyExceptionsUnion extends js.Object

object GetVaultAccessPolicyExceptionsUnion {
  @scala.inline
  implicit def apply(value: InvalidParameterValueException): GetVaultAccessPolicyExceptionsUnion = value.asInstanceOf[GetVaultAccessPolicyExceptionsUnion]
  @scala.inline
  implicit def apply(value: MissingParameterValueException): GetVaultAccessPolicyExceptionsUnion = value.asInstanceOf[GetVaultAccessPolicyExceptionsUnion]
  @scala.inline
  implicit def apply(value: ResourceNotFoundException): GetVaultAccessPolicyExceptionsUnion = value.asInstanceOf[GetVaultAccessPolicyExceptionsUnion]
  @scala.inline
  implicit def apply(value: ServiceUnavailableException): GetVaultAccessPolicyExceptionsUnion = value.asInstanceOf[GetVaultAccessPolicyExceptionsUnion]
}

