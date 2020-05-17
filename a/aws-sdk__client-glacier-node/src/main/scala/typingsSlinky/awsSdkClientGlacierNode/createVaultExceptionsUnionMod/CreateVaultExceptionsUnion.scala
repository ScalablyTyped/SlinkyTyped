package typingsSlinky.awsSdkClientGlacierNode.createVaultExceptionsUnionMod

import typingsSlinky.awsSdkClientGlacierNode.typesInvalidParameterValueExceptionMod.InvalidParameterValueException
import typingsSlinky.awsSdkClientGlacierNode.typesLimitExceededExceptionMod.LimitExceededException
import typingsSlinky.awsSdkClientGlacierNode.typesMissingParameterValueExceptionMod.MissingParameterValueException
import typingsSlinky.awsSdkClientGlacierNode.typesServiceUnavailableExceptionMod.ServiceUnavailableException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdkClientGlacierNode.typesInvalidParameterValueExceptionMod.InvalidParameterValueException
  - typingsSlinky.awsSdkClientGlacierNode.typesMissingParameterValueExceptionMod.MissingParameterValueException
  - typingsSlinky.awsSdkClientGlacierNode.typesServiceUnavailableExceptionMod.ServiceUnavailableException
  - typingsSlinky.awsSdkClientGlacierNode.typesLimitExceededExceptionMod.LimitExceededException
*/
trait CreateVaultExceptionsUnion extends js.Object

object CreateVaultExceptionsUnion {
  @scala.inline
  implicit def apply(value: InvalidParameterValueException): CreateVaultExceptionsUnion = value.asInstanceOf[CreateVaultExceptionsUnion]
  @scala.inline
  implicit def apply(value: LimitExceededException): CreateVaultExceptionsUnion = value.asInstanceOf[CreateVaultExceptionsUnion]
  @scala.inline
  implicit def apply(value: MissingParameterValueException): CreateVaultExceptionsUnion = value.asInstanceOf[CreateVaultExceptionsUnion]
  @scala.inline
  implicit def apply(value: ServiceUnavailableException): CreateVaultExceptionsUnion = value.asInstanceOf[CreateVaultExceptionsUnion]
}

