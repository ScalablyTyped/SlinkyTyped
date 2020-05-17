package typingsSlinky.awsSdkClientGlacierNode.completeVaultLockExceptionsUnionMod

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
trait CompleteVaultLockExceptionsUnion extends js.Object

object CompleteVaultLockExceptionsUnion {
  @scala.inline
  implicit def apply(value: InvalidParameterValueException): CompleteVaultLockExceptionsUnion = value.asInstanceOf[CompleteVaultLockExceptionsUnion]
  @scala.inline
  implicit def apply(value: MissingParameterValueException): CompleteVaultLockExceptionsUnion = value.asInstanceOf[CompleteVaultLockExceptionsUnion]
  @scala.inline
  implicit def apply(value: ResourceNotFoundException): CompleteVaultLockExceptionsUnion = value.asInstanceOf[CompleteVaultLockExceptionsUnion]
  @scala.inline
  implicit def apply(value: ServiceUnavailableException): CompleteVaultLockExceptionsUnion = value.asInstanceOf[CompleteVaultLockExceptionsUnion]
}

