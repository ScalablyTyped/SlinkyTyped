package typingsSlinky.awsSdkClientLambdaNode.getFunctionConfigurationExceptionsUnionMod

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
trait GetFunctionConfigurationExceptionsUnion extends js.Object

object GetFunctionConfigurationExceptionsUnion {
  @scala.inline
  implicit def apply(value: InvalidParameterValueException): GetFunctionConfigurationExceptionsUnion = value.asInstanceOf[GetFunctionConfigurationExceptionsUnion]
  @scala.inline
  implicit def apply(value: ResourceNotFoundException): GetFunctionConfigurationExceptionsUnion = value.asInstanceOf[GetFunctionConfigurationExceptionsUnion]
  @scala.inline
  implicit def apply(value: ServiceException): GetFunctionConfigurationExceptionsUnion = value.asInstanceOf[GetFunctionConfigurationExceptionsUnion]
  @scala.inline
  implicit def apply(value: TooManyRequestsException): GetFunctionConfigurationExceptionsUnion = value.asInstanceOf[GetFunctionConfigurationExceptionsUnion]
}

