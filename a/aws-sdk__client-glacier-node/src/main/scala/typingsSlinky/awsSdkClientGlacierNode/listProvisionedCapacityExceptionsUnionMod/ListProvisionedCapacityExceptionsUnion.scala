package typingsSlinky.awsSdkClientGlacierNode.listProvisionedCapacityExceptionsUnionMod

import typingsSlinky.awsSdkClientGlacierNode.typesInvalidParameterValueExceptionMod.InvalidParameterValueException
import typingsSlinky.awsSdkClientGlacierNode.typesMissingParameterValueExceptionMod.MissingParameterValueException
import typingsSlinky.awsSdkClientGlacierNode.typesServiceUnavailableExceptionMod.ServiceUnavailableException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdkClientGlacierNode.typesInvalidParameterValueExceptionMod.InvalidParameterValueException
  - typingsSlinky.awsSdkClientGlacierNode.typesMissingParameterValueExceptionMod.MissingParameterValueException
  - typingsSlinky.awsSdkClientGlacierNode.typesServiceUnavailableExceptionMod.ServiceUnavailableException
*/
trait ListProvisionedCapacityExceptionsUnion extends js.Object

object ListProvisionedCapacityExceptionsUnion {
  @scala.inline
  implicit def apply(value: InvalidParameterValueException): ListProvisionedCapacityExceptionsUnion = value.asInstanceOf[ListProvisionedCapacityExceptionsUnion]
  @scala.inline
  implicit def apply(value: MissingParameterValueException): ListProvisionedCapacityExceptionsUnion = value.asInstanceOf[ListProvisionedCapacityExceptionsUnion]
  @scala.inline
  implicit def apply(value: ServiceUnavailableException): ListProvisionedCapacityExceptionsUnion = value.asInstanceOf[ListProvisionedCapacityExceptionsUnion]
}

