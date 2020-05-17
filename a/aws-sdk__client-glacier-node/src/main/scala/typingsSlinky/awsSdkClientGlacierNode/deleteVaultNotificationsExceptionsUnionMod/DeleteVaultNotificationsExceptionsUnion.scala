package typingsSlinky.awsSdkClientGlacierNode.deleteVaultNotificationsExceptionsUnionMod

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
trait DeleteVaultNotificationsExceptionsUnion extends js.Object

object DeleteVaultNotificationsExceptionsUnion {
  @scala.inline
  implicit def apply(value: InvalidParameterValueException): DeleteVaultNotificationsExceptionsUnion = value.asInstanceOf[DeleteVaultNotificationsExceptionsUnion]
  @scala.inline
  implicit def apply(value: MissingParameterValueException): DeleteVaultNotificationsExceptionsUnion = value.asInstanceOf[DeleteVaultNotificationsExceptionsUnion]
  @scala.inline
  implicit def apply(value: ResourceNotFoundException): DeleteVaultNotificationsExceptionsUnion = value.asInstanceOf[DeleteVaultNotificationsExceptionsUnion]
  @scala.inline
  implicit def apply(value: ServiceUnavailableException): DeleteVaultNotificationsExceptionsUnion = value.asInstanceOf[DeleteVaultNotificationsExceptionsUnion]
}

