package typingsSlinky.awsSdkClientGlacierNode.abortVaultLockExceptionsUnionMod

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
trait AbortVaultLockExceptionsUnion extends js.Object

object AbortVaultLockExceptionsUnion {
  @scala.inline
  implicit def apply(value: InvalidParameterValueException): AbortVaultLockExceptionsUnion = value.asInstanceOf[AbortVaultLockExceptionsUnion]
  @scala.inline
  implicit def apply(value: MissingParameterValueException): AbortVaultLockExceptionsUnion = value.asInstanceOf[AbortVaultLockExceptionsUnion]
  @scala.inline
  implicit def apply(value: ResourceNotFoundException): AbortVaultLockExceptionsUnion = value.asInstanceOf[AbortVaultLockExceptionsUnion]
  @scala.inline
  implicit def apply(value: ServiceUnavailableException): AbortVaultLockExceptionsUnion = value.asInstanceOf[AbortVaultLockExceptionsUnion]
}

