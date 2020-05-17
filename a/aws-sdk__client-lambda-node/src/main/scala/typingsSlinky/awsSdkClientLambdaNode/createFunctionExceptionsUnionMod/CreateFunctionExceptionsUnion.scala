package typingsSlinky.awsSdkClientLambdaNode.createFunctionExceptionsUnionMod

import typingsSlinky.awsSdkClientLambdaNode.typesCodeStorageExceededExceptionMod.CodeStorageExceededException
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
  - typingsSlinky.awsSdkClientLambdaNode.typesResourceNotFoundExceptionMod.ResourceNotFoundException
  - typingsSlinky.awsSdkClientLambdaNode.typesResourceConflictExceptionMod.ResourceConflictException
  - typingsSlinky.awsSdkClientLambdaNode.typesTooManyRequestsExceptionMod.TooManyRequestsException
  - typingsSlinky.awsSdkClientLambdaNode.typesCodeStorageExceededExceptionMod.CodeStorageExceededException
*/
trait CreateFunctionExceptionsUnion extends js.Object

object CreateFunctionExceptionsUnion {
  @scala.inline
  implicit def apply(value: CodeStorageExceededException): CreateFunctionExceptionsUnion = value.asInstanceOf[CreateFunctionExceptionsUnion]
  @scala.inline
  implicit def apply(value: InvalidParameterValueException): CreateFunctionExceptionsUnion = value.asInstanceOf[CreateFunctionExceptionsUnion]
  @scala.inline
  implicit def apply(value: ResourceConflictException): CreateFunctionExceptionsUnion = value.asInstanceOf[CreateFunctionExceptionsUnion]
  @scala.inline
  implicit def apply(value: ResourceNotFoundException): CreateFunctionExceptionsUnion = value.asInstanceOf[CreateFunctionExceptionsUnion]
  @scala.inline
  implicit def apply(value: ServiceException): CreateFunctionExceptionsUnion = value.asInstanceOf[CreateFunctionExceptionsUnion]
  @scala.inline
  implicit def apply(value: TooManyRequestsException): CreateFunctionExceptionsUnion = value.asInstanceOf[CreateFunctionExceptionsUnion]
}

