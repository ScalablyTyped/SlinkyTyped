package typingsSlinky.awsSdkClientGlacierNode.initiateVaultLockExceptionsUnionMod

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
trait InitiateVaultLockExceptionsUnion extends js.Object

object InitiateVaultLockExceptionsUnion {
  @scala.inline
  implicit def apply(value: InvalidParameterValueException): InitiateVaultLockExceptionsUnion = value.asInstanceOf[InitiateVaultLockExceptionsUnion]
  @scala.inline
  implicit def apply(value: MissingParameterValueException): InitiateVaultLockExceptionsUnion = value.asInstanceOf[InitiateVaultLockExceptionsUnion]
  @scala.inline
  implicit def apply(value: ResourceNotFoundException): InitiateVaultLockExceptionsUnion = value.asInstanceOf[InitiateVaultLockExceptionsUnion]
  @scala.inline
  implicit def apply(value: ServiceUnavailableException): InitiateVaultLockExceptionsUnion = value.asInstanceOf[InitiateVaultLockExceptionsUnion]
}

