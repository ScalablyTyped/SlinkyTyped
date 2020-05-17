package typingsSlinky.awsSdkClientGlacierNode.getVaultLockExceptionsUnionMod

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
trait GetVaultLockExceptionsUnion extends js.Object

object GetVaultLockExceptionsUnion {
  @scala.inline
  implicit def apply(value: InvalidParameterValueException): GetVaultLockExceptionsUnion = value.asInstanceOf[GetVaultLockExceptionsUnion]
  @scala.inline
  implicit def apply(value: MissingParameterValueException): GetVaultLockExceptionsUnion = value.asInstanceOf[GetVaultLockExceptionsUnion]
  @scala.inline
  implicit def apply(value: ResourceNotFoundException): GetVaultLockExceptionsUnion = value.asInstanceOf[GetVaultLockExceptionsUnion]
  @scala.inline
  implicit def apply(value: ServiceUnavailableException): GetVaultLockExceptionsUnion = value.asInstanceOf[GetVaultLockExceptionsUnion]
}

