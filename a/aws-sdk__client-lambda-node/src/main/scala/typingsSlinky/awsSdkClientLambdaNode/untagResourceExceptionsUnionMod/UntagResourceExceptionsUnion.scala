package typingsSlinky.awsSdkClientLambdaNode.untagResourceExceptionsUnionMod

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
trait UntagResourceExceptionsUnion extends js.Object

object UntagResourceExceptionsUnion {
  @scala.inline
  implicit def apply(value: InvalidParameterValueException): UntagResourceExceptionsUnion = value.asInstanceOf[UntagResourceExceptionsUnion]
  @scala.inline
  implicit def apply(value: ResourceNotFoundException): UntagResourceExceptionsUnion = value.asInstanceOf[UntagResourceExceptionsUnion]
  @scala.inline
  implicit def apply(value: ServiceException): UntagResourceExceptionsUnion = value.asInstanceOf[UntagResourceExceptionsUnion]
  @scala.inline
  implicit def apply(value: TooManyRequestsException): UntagResourceExceptionsUnion = value.asInstanceOf[UntagResourceExceptionsUnion]
}

