package typingsSlinky.awsSdkClientLambdaNode.updateEventSourceMappingExceptionsUnionMod

import typingsSlinky.awsSdkClientLambdaNode.typesInvalidParameterValueExceptionMod.InvalidParameterValueException
import typingsSlinky.awsSdkClientLambdaNode.typesResourceConflictExceptionMod.ResourceConflictException
import typingsSlinky.awsSdkClientLambdaNode.typesResourceInUseExceptionMod.ResourceInUseException
import typingsSlinky.awsSdkClientLambdaNode.typesResourceNotFoundExceptionMod.ResourceNotFoundException
import typingsSlinky.awsSdkClientLambdaNode.typesServiceExceptionMod.ServiceException
import typingsSlinky.awsSdkClientLambdaNode.typesTooManyRequestsExceptionMod.TooManyRequestsException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdkClientLambdaNode.typesServiceExceptionMod.ServiceException
  - typingsSlinky.awsSdkClientLambdaNode.typesResourceNotFoundExceptionMod.ResourceNotFoundException
  - typingsSlinky.awsSdkClientLambdaNode.typesInvalidParameterValueExceptionMod.InvalidParameterValueException
  - typingsSlinky.awsSdkClientLambdaNode.typesTooManyRequestsExceptionMod.TooManyRequestsException
  - typingsSlinky.awsSdkClientLambdaNode.typesResourceConflictExceptionMod.ResourceConflictException
  - typingsSlinky.awsSdkClientLambdaNode.typesResourceInUseExceptionMod.ResourceInUseException
*/
trait UpdateEventSourceMappingExceptionsUnion extends js.Object

object UpdateEventSourceMappingExceptionsUnion {
  @scala.inline
  implicit def apply(value: InvalidParameterValueException): UpdateEventSourceMappingExceptionsUnion = value.asInstanceOf[UpdateEventSourceMappingExceptionsUnion]
  @scala.inline
  implicit def apply(value: ResourceConflictException): UpdateEventSourceMappingExceptionsUnion = value.asInstanceOf[UpdateEventSourceMappingExceptionsUnion]
  @scala.inline
  implicit def apply(value: ResourceInUseException): UpdateEventSourceMappingExceptionsUnion = value.asInstanceOf[UpdateEventSourceMappingExceptionsUnion]
  @scala.inline
  implicit def apply(value: ResourceNotFoundException): UpdateEventSourceMappingExceptionsUnion = value.asInstanceOf[UpdateEventSourceMappingExceptionsUnion]
  @scala.inline
  implicit def apply(value: ServiceException): UpdateEventSourceMappingExceptionsUnion = value.asInstanceOf[UpdateEventSourceMappingExceptionsUnion]
  @scala.inline
  implicit def apply(value: TooManyRequestsException): UpdateEventSourceMappingExceptionsUnion = value.asInstanceOf[UpdateEventSourceMappingExceptionsUnion]
}

