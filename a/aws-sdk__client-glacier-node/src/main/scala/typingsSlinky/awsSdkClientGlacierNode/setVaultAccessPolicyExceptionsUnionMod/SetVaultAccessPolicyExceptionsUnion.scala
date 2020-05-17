package typingsSlinky.awsSdkClientGlacierNode.setVaultAccessPolicyExceptionsUnionMod

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
trait SetVaultAccessPolicyExceptionsUnion extends js.Object

object SetVaultAccessPolicyExceptionsUnion {
  @scala.inline
  implicit def apply(value: InvalidParameterValueException): SetVaultAccessPolicyExceptionsUnion = value.asInstanceOf[SetVaultAccessPolicyExceptionsUnion]
  @scala.inline
  implicit def apply(value: MissingParameterValueException): SetVaultAccessPolicyExceptionsUnion = value.asInstanceOf[SetVaultAccessPolicyExceptionsUnion]
  @scala.inline
  implicit def apply(value: ResourceNotFoundException): SetVaultAccessPolicyExceptionsUnion = value.asInstanceOf[SetVaultAccessPolicyExceptionsUnion]
  @scala.inline
  implicit def apply(value: ServiceUnavailableException): SetVaultAccessPolicyExceptionsUnion = value.asInstanceOf[SetVaultAccessPolicyExceptionsUnion]
}

