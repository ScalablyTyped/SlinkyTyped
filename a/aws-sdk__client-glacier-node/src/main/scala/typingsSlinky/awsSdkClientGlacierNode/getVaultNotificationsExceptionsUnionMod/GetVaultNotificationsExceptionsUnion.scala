package typingsSlinky.awsSdkClientGlacierNode.getVaultNotificationsExceptionsUnionMod

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
trait GetVaultNotificationsExceptionsUnion extends js.Object

object GetVaultNotificationsExceptionsUnion {
  @scala.inline
  implicit def apply(value: InvalidParameterValueException): GetVaultNotificationsExceptionsUnion = value.asInstanceOf[GetVaultNotificationsExceptionsUnion]
  @scala.inline
  implicit def apply(value: MissingParameterValueException): GetVaultNotificationsExceptionsUnion = value.asInstanceOf[GetVaultNotificationsExceptionsUnion]
  @scala.inline
  implicit def apply(value: ResourceNotFoundException): GetVaultNotificationsExceptionsUnion = value.asInstanceOf[GetVaultNotificationsExceptionsUnion]
  @scala.inline
  implicit def apply(value: ServiceUnavailableException): GetVaultNotificationsExceptionsUnion = value.asInstanceOf[GetVaultNotificationsExceptionsUnion]
}

