package typingsSlinky.awsSdkClientLambdaNode.putFunctionConcurrencyExceptionsUnionMod

import typingsSlinky.awsSdkClientLambdaNode.typesInvalidParameterValueExceptionMod.InvalidParameterValueException
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
  - typingsSlinky.awsSdkClientLambdaNode.typesTooManyRequestsExceptionMod.TooManyRequestsException
*/
trait PutFunctionConcurrencyExceptionsUnion extends js.Object

object PutFunctionConcurrencyExceptionsUnion {
  @scala.inline
  implicit def apply(value: InvalidParameterValueException): PutFunctionConcurrencyExceptionsUnion = value.asInstanceOf[PutFunctionConcurrencyExceptionsUnion]
  @scala.inline
  implicit def apply(value: ResourceNotFoundException): PutFunctionConcurrencyExceptionsUnion = value.asInstanceOf[PutFunctionConcurrencyExceptionsUnion]
  @scala.inline
  implicit def apply(value: ServiceException): PutFunctionConcurrencyExceptionsUnion = value.asInstanceOf[PutFunctionConcurrencyExceptionsUnion]
  @scala.inline
  implicit def apply(value: TooManyRequestsException): PutFunctionConcurrencyExceptionsUnion = value.asInstanceOf[PutFunctionConcurrencyExceptionsUnion]
}

