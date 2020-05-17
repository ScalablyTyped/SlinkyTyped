package typingsSlinky.awsSdkClientLambdaNode.getFunctionExceptionsUnionMod

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
trait GetFunctionExceptionsUnion extends js.Object

object GetFunctionExceptionsUnion {
  @scala.inline
  implicit def apply(value: InvalidParameterValueException): GetFunctionExceptionsUnion = value.asInstanceOf[GetFunctionExceptionsUnion]
  @scala.inline
  implicit def apply(value: ResourceNotFoundException): GetFunctionExceptionsUnion = value.asInstanceOf[GetFunctionExceptionsUnion]
  @scala.inline
  implicit def apply(value: ServiceException): GetFunctionExceptionsUnion = value.asInstanceOf[GetFunctionExceptionsUnion]
  @scala.inline
  implicit def apply(value: TooManyRequestsException): GetFunctionExceptionsUnion = value.asInstanceOf[GetFunctionExceptionsUnion]
}

