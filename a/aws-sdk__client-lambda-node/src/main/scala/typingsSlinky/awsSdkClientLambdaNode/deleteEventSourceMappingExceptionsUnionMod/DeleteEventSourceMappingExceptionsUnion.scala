package typingsSlinky.awsSdkClientLambdaNode.deleteEventSourceMappingExceptionsUnionMod

import typingsSlinky.awsSdkClientLambdaNode.typesInvalidParameterValueExceptionMod.InvalidParameterValueException
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
  - typingsSlinky.awsSdkClientLambdaNode.typesResourceInUseExceptionMod.ResourceInUseException
*/
trait DeleteEventSourceMappingExceptionsUnion extends js.Object

object DeleteEventSourceMappingExceptionsUnion {
  @scala.inline
  implicit def apply(value: InvalidParameterValueException): DeleteEventSourceMappingExceptionsUnion = value.asInstanceOf[DeleteEventSourceMappingExceptionsUnion]
  @scala.inline
  implicit def apply(value: ResourceInUseException): DeleteEventSourceMappingExceptionsUnion = value.asInstanceOf[DeleteEventSourceMappingExceptionsUnion]
  @scala.inline
  implicit def apply(value: ResourceNotFoundException): DeleteEventSourceMappingExceptionsUnion = value.asInstanceOf[DeleteEventSourceMappingExceptionsUnion]
  @scala.inline
  implicit def apply(value: ServiceException): DeleteEventSourceMappingExceptionsUnion = value.asInstanceOf[DeleteEventSourceMappingExceptionsUnion]
  @scala.inline
  implicit def apply(value: TooManyRequestsException): DeleteEventSourceMappingExceptionsUnion = value.asInstanceOf[DeleteEventSourceMappingExceptionsUnion]
}

