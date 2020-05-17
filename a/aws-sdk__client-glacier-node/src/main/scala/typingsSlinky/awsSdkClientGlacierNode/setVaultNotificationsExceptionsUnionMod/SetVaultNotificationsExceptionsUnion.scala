package typingsSlinky.awsSdkClientGlacierNode.setVaultNotificationsExceptionsUnionMod

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
trait SetVaultNotificationsExceptionsUnion extends js.Object

object SetVaultNotificationsExceptionsUnion {
  @scala.inline
  implicit def apply(value: InvalidParameterValueException): SetVaultNotificationsExceptionsUnion = value.asInstanceOf[SetVaultNotificationsExceptionsUnion]
  @scala.inline
  implicit def apply(value: MissingParameterValueException): SetVaultNotificationsExceptionsUnion = value.asInstanceOf[SetVaultNotificationsExceptionsUnion]
  @scala.inline
  implicit def apply(value: ResourceNotFoundException): SetVaultNotificationsExceptionsUnion = value.asInstanceOf[SetVaultNotificationsExceptionsUnion]
  @scala.inline
  implicit def apply(value: ServiceUnavailableException): SetVaultNotificationsExceptionsUnion = value.asInstanceOf[SetVaultNotificationsExceptionsUnion]
}

