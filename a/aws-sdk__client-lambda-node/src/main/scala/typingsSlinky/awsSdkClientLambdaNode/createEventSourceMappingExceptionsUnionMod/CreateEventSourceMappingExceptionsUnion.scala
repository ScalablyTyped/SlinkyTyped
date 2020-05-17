package typingsSlinky.awsSdkClientLambdaNode.createEventSourceMappingExceptionsUnionMod

import typingsSlinky.awsSdkClientLambdaNode.typesInvalidParameterValueExceptionMod.InvalidParameterValueException
import typingsSlinky.awsSdkClientLambdaNode.typesResourceConflictExceptionMod.ResourceConflictException
import typingsSlinky.awsSdkClientLambdaNode.typesResourceNotFoundExceptionMod.ResourceNotFoundException
import typingsSlinky.awsSdkClientLambdaNode.typesServiceExceptionMod.ServiceException
import typingsSlinky.awsSdkClientLambdaNode.typesTooManyRequestsExceptionMod.TooManyRequestsException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdkClientLambdaNode.typesServiceExceptionMod.ServiceException
  - typingsSlinky.awsSdkClientLambdaNode.typesInvalidParameterValueExceptionMod.InvalidParameterValueException
  - typingsSlinky.awsSdkClientLambdaNode.typesResourceConflictExceptionMod.ResourceConflictException
  - typingsSlinky.awsSdkClientLambdaNode.typesTooManyRequestsExceptionMod.TooManyRequestsException
  - typingsSlinky.awsSdkClientLambdaNode.typesResourceNotFoundExceptionMod.ResourceNotFoundException
*/
trait CreateEventSourceMappingExceptionsUnion extends js.Object

object CreateEventSourceMappingExceptionsUnion {
  @scala.inline
  implicit def apply(value: InvalidParameterValueException): CreateEventSourceMappingExceptionsUnion = value.asInstanceOf[CreateEventSourceMappingExceptionsUnion]
  @scala.inline
  implicit def apply(value: ResourceConflictException): CreateEventSourceMappingExceptionsUnion = value.asInstanceOf[CreateEventSourceMappingExceptionsUnion]
  @scala.inline
  implicit def apply(value: ResourceNotFoundException): CreateEventSourceMappingExceptionsUnion = value.asInstanceOf[CreateEventSourceMappingExceptionsUnion]
  @scala.inline
  implicit def apply(value: ServiceException): CreateEventSourceMappingExceptionsUnion = value.asInstanceOf[CreateEventSourceMappingExceptionsUnion]
  @scala.inline
  implicit def apply(value: TooManyRequestsException): CreateEventSourceMappingExceptionsUnion = value.asInstanceOf[CreateEventSourceMappingExceptionsUnion]
}

