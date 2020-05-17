package typingsSlinky.awsSdkClientLambdaNode.deleteFunctionExceptionsUnionMod

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
  - typingsSlinky.awsSdkClientLambdaNode.typesResourceNotFoundExceptionMod.ResourceNotFoundException
  - typingsSlinky.awsSdkClientLambdaNode.typesTooManyRequestsExceptionMod.TooManyRequestsException
  - typingsSlinky.awsSdkClientLambdaNode.typesInvalidParameterValueExceptionMod.InvalidParameterValueException
  - typingsSlinky.awsSdkClientLambdaNode.typesResourceConflictExceptionMod.ResourceConflictException
*/
trait DeleteFunctionExceptionsUnion extends js.Object

object DeleteFunctionExceptionsUnion {
  @scala.inline
  implicit def apply(value: InvalidParameterValueException): DeleteFunctionExceptionsUnion = value.asInstanceOf[DeleteFunctionExceptionsUnion]
  @scala.inline
  implicit def apply(value: ResourceConflictException): DeleteFunctionExceptionsUnion = value.asInstanceOf[DeleteFunctionExceptionsUnion]
  @scala.inline
  implicit def apply(value: ResourceNotFoundException): DeleteFunctionExceptionsUnion = value.asInstanceOf[DeleteFunctionExceptionsUnion]
  @scala.inline
  implicit def apply(value: ServiceException): DeleteFunctionExceptionsUnion = value.asInstanceOf[DeleteFunctionExceptionsUnion]
  @scala.inline
  implicit def apply(value: TooManyRequestsException): DeleteFunctionExceptionsUnion = value.asInstanceOf[DeleteFunctionExceptionsUnion]
}

