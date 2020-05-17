package typingsSlinky.awsSdkClientLambdaNode.invokeAsyncExceptionsUnionMod

import typingsSlinky.awsSdkClientLambdaNode.typesInvalidRequestContentExceptionMod.InvalidRequestContentException
import typingsSlinky.awsSdkClientLambdaNode.typesInvalidRuntimeExceptionMod.InvalidRuntimeException
import typingsSlinky.awsSdkClientLambdaNode.typesResourceNotFoundExceptionMod.ResourceNotFoundException
import typingsSlinky.awsSdkClientLambdaNode.typesServiceExceptionMod.ServiceException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdkClientLambdaNode.typesServiceExceptionMod.ServiceException
  - typingsSlinky.awsSdkClientLambdaNode.typesResourceNotFoundExceptionMod.ResourceNotFoundException
  - typingsSlinky.awsSdkClientLambdaNode.typesInvalidRequestContentExceptionMod.InvalidRequestContentException
  - typingsSlinky.awsSdkClientLambdaNode.typesInvalidRuntimeExceptionMod.InvalidRuntimeException
*/
trait InvokeAsyncExceptionsUnion extends js.Object

object InvokeAsyncExceptionsUnion {
  @scala.inline
  implicit def apply(value: InvalidRequestContentException): InvokeAsyncExceptionsUnion = value.asInstanceOf[InvokeAsyncExceptionsUnion]
  @scala.inline
  implicit def apply(value: InvalidRuntimeException): InvokeAsyncExceptionsUnion = value.asInstanceOf[InvokeAsyncExceptionsUnion]
  @scala.inline
  implicit def apply(value: ResourceNotFoundException): InvokeAsyncExceptionsUnion = value.asInstanceOf[InvokeAsyncExceptionsUnion]
  @scala.inline
  implicit def apply(value: ServiceException): InvokeAsyncExceptionsUnion = value.asInstanceOf[InvokeAsyncExceptionsUnion]
}

