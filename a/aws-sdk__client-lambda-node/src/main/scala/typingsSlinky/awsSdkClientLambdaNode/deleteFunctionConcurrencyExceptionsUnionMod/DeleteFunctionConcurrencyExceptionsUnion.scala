package typingsSlinky.awsSdkClientLambdaNode.deleteFunctionConcurrencyExceptionsUnionMod

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
  - typingsSlinky.awsSdkClientLambdaNode.typesTooManyRequestsExceptionMod.TooManyRequestsException
  - typingsSlinky.awsSdkClientLambdaNode.typesInvalidParameterValueExceptionMod.InvalidParameterValueException
*/
trait DeleteFunctionConcurrencyExceptionsUnion extends js.Object

object DeleteFunctionConcurrencyExceptionsUnion {
  @scala.inline
  implicit def apply(value: InvalidParameterValueException): DeleteFunctionConcurrencyExceptionsUnion = value.asInstanceOf[DeleteFunctionConcurrencyExceptionsUnion]
  @scala.inline
  implicit def apply(value: ResourceNotFoundException): DeleteFunctionConcurrencyExceptionsUnion = value.asInstanceOf[DeleteFunctionConcurrencyExceptionsUnion]
  @scala.inline
  implicit def apply(value: ServiceException): DeleteFunctionConcurrencyExceptionsUnion = value.asInstanceOf[DeleteFunctionConcurrencyExceptionsUnion]
  @scala.inline
  implicit def apply(value: TooManyRequestsException): DeleteFunctionConcurrencyExceptionsUnion = value.asInstanceOf[DeleteFunctionConcurrencyExceptionsUnion]
}

