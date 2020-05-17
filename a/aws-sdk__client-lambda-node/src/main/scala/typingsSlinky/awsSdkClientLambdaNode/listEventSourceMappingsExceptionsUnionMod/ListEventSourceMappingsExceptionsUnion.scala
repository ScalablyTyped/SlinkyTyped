package typingsSlinky.awsSdkClientLambdaNode.listEventSourceMappingsExceptionsUnionMod

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
trait ListEventSourceMappingsExceptionsUnion extends js.Object

object ListEventSourceMappingsExceptionsUnion {
  @scala.inline
  implicit def apply(value: InvalidParameterValueException): ListEventSourceMappingsExceptionsUnion = value.asInstanceOf[ListEventSourceMappingsExceptionsUnion]
  @scala.inline
  implicit def apply(value: ResourceNotFoundException): ListEventSourceMappingsExceptionsUnion = value.asInstanceOf[ListEventSourceMappingsExceptionsUnion]
  @scala.inline
  implicit def apply(value: ServiceException): ListEventSourceMappingsExceptionsUnion = value.asInstanceOf[ListEventSourceMappingsExceptionsUnion]
  @scala.inline
  implicit def apply(value: TooManyRequestsException): ListEventSourceMappingsExceptionsUnion = value.asInstanceOf[ListEventSourceMappingsExceptionsUnion]
}

