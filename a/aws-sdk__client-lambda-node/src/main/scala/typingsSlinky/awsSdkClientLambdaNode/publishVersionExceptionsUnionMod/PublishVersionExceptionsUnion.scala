package typingsSlinky.awsSdkClientLambdaNode.publishVersionExceptionsUnionMod

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
trait PublishVersionExceptionsUnion extends js.Object

object PublishVersionExceptionsUnion {
  @scala.inline
  implicit def apply(value: CodeStorageExceededException): PublishVersionExceptionsUnion = value.asInstanceOf[PublishVersionExceptionsUnion]
  @scala.inline
  implicit def apply(value: InvalidParameterValueException): PublishVersionExceptionsUnion = value.asInstanceOf[PublishVersionExceptionsUnion]
  @scala.inline
  implicit def apply(value: PreconditionFailedException): PublishVersionExceptionsUnion = value.asInstanceOf[PublishVersionExceptionsUnion]
  @scala.inline
  implicit def apply(value: ResourceNotFoundException): PublishVersionExceptionsUnion = value.asInstanceOf[PublishVersionExceptionsUnion]
  @scala.inline
  implicit def apply(value: ServiceException): PublishVersionExceptionsUnion = value.asInstanceOf[PublishVersionExceptionsUnion]
  @scala.inline
  implicit def apply(value: TooManyRequestsException): PublishVersionExceptionsUnion = value.asInstanceOf[PublishVersionExceptionsUnion]
}

