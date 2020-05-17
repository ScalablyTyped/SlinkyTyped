package typingsSlinky.awsSdkClientGlacierNode.initiateJobExceptionsUnionMod

import typingsSlinky.awsSdkClientGlacierNode.typesInsufficientCapacityExceptionMod.InsufficientCapacityException
import typingsSlinky.awsSdkClientGlacierNode.typesInvalidParameterValueExceptionMod.InvalidParameterValueException
import typingsSlinky.awsSdkClientGlacierNode.typesMissingParameterValueExceptionMod.MissingParameterValueException
import typingsSlinky.awsSdkClientGlacierNode.typesPolicyEnforcedExceptionMod.PolicyEnforcedException
import typingsSlinky.awsSdkClientGlacierNode.typesResourceNotFoundExceptionMod.ResourceNotFoundException
import typingsSlinky.awsSdkClientGlacierNode.typesServiceUnavailableExceptionMod.ServiceUnavailableException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdkClientGlacierNode.typesResourceNotFoundExceptionMod.ResourceNotFoundException
  - typingsSlinky.awsSdkClientGlacierNode.typesPolicyEnforcedExceptionMod.PolicyEnforcedException
  - typingsSlinky.awsSdkClientGlacierNode.typesInvalidParameterValueExceptionMod.InvalidParameterValueException
  - typingsSlinky.awsSdkClientGlacierNode.typesMissingParameterValueExceptionMod.MissingParameterValueException
  - typingsSlinky.awsSdkClientGlacierNode.typesInsufficientCapacityExceptionMod.InsufficientCapacityException
  - typingsSlinky.awsSdkClientGlacierNode.typesServiceUnavailableExceptionMod.ServiceUnavailableException
*/
trait InitiateJobExceptionsUnion extends js.Object

object InitiateJobExceptionsUnion {
  @scala.inline
  implicit def apply(value: InsufficientCapacityException): InitiateJobExceptionsUnion = value.asInstanceOf[InitiateJobExceptionsUnion]
  @scala.inline
  implicit def apply(value: InvalidParameterValueException): InitiateJobExceptionsUnion = value.asInstanceOf[InitiateJobExceptionsUnion]
  @scala.inline
  implicit def apply(value: MissingParameterValueException): InitiateJobExceptionsUnion = value.asInstanceOf[InitiateJobExceptionsUnion]
  @scala.inline
  implicit def apply(value: PolicyEnforcedException): InitiateJobExceptionsUnion = value.asInstanceOf[InitiateJobExceptionsUnion]
  @scala.inline
  implicit def apply(value: ResourceNotFoundException): InitiateJobExceptionsUnion = value.asInstanceOf[InitiateJobExceptionsUnion]
  @scala.inline
  implicit def apply(value: ServiceUnavailableException): InitiateJobExceptionsUnion = value.asInstanceOf[InitiateJobExceptionsUnion]
}

