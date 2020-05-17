package typingsSlinky.awsSdkClientLambdaNode.getEventSourceMappingExceptionsUnionMod

import typingsSlinky.awsSdkClientLambdaNode.typesInvalidParameterValueExceptionMod.InvalidParameterValueException
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
*/
trait GetEventSourceMappingExceptionsUnion extends js.Object

object GetEventSourceMappingExceptionsUnion {
  @scala.inline
  implicit def apply(value: InvalidParameterValueException): GetEventSourceMappingExceptionsUnion = value.asInstanceOf[GetEventSourceMappingExceptionsUnion]
  @scala.inline
  implicit def apply(value: ResourceNotFoundException): GetEventSourceMappingExceptionsUnion = value.asInstanceOf[GetEventSourceMappingExceptionsUnion]
  @scala.inline
  implicit def apply(value: ServiceException): GetEventSourceMappingExceptionsUnion = value.asInstanceOf[GetEventSourceMappingExceptionsUnion]
  @scala.inline
  implicit def apply(value: TooManyRequestsException): GetEventSourceMappingExceptionsUnion = value.asInstanceOf[GetEventSourceMappingExceptionsUnion]
}

