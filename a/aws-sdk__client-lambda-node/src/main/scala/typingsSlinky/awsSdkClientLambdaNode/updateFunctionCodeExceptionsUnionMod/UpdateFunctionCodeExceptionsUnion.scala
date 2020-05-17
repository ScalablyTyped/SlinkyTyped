package typingsSlinky.awsSdkClientLambdaNode.updateFunctionCodeExceptionsUnionMod

import typingsSlinky.awsSdkClientLambdaNode.typesCodeStorageExceededExceptionMod.CodeStorageExceededException
import typingsSlinky.awsSdkClientLambdaNode.typesInvalidParameterValueExceptionMod.InvalidParameterValueException
import typingsSlinky.awsSdkClientLambdaNode.typesPreconditionFailedExceptionMod.PreconditionFailedException
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
  - typingsSlinky.awsSdkClientLambdaNode.typesCodeStorageExceededExceptionMod.CodeStorageExceededException
  - typingsSlinky.awsSdkClientLambdaNode.typesPreconditionFailedExceptionMod.PreconditionFailedException
*/
trait UpdateFunctionCodeExceptionsUnion extends js.Object

object UpdateFunctionCodeExceptionsUnion {
  @scala.inline
  implicit def apply(value: CodeStorageExceededException): UpdateFunctionCodeExceptionsUnion = value.asInstanceOf[UpdateFunctionCodeExceptionsUnion]
  @scala.inline
  implicit def apply(value: InvalidParameterValueException): UpdateFunctionCodeExceptionsUnion = value.asInstanceOf[UpdateFunctionCodeExceptionsUnion]
  @scala.inline
  implicit def apply(value: PreconditionFailedException): UpdateFunctionCodeExceptionsUnion = value.asInstanceOf[UpdateFunctionCodeExceptionsUnion]
  @scala.inline
  implicit def apply(value: ResourceNotFoundException): UpdateFunctionCodeExceptionsUnion = value.asInstanceOf[UpdateFunctionCodeExceptionsUnion]
  @scala.inline
  implicit def apply(value: ServiceException): UpdateFunctionCodeExceptionsUnion = value.asInstanceOf[UpdateFunctionCodeExceptionsUnion]
  @scala.inline
  implicit def apply(value: TooManyRequestsException): UpdateFunctionCodeExceptionsUnion = value.asInstanceOf[UpdateFunctionCodeExceptionsUnion]
}

