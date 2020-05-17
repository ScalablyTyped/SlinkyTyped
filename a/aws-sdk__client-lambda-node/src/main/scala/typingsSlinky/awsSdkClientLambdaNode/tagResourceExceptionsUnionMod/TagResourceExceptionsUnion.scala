package typingsSlinky.awsSdkClientLambdaNode.tagResourceExceptionsUnionMod

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
trait TagResourceExceptionsUnion extends js.Object

object TagResourceExceptionsUnion {
  @scala.inline
  implicit def apply(value: InvalidParameterValueException): TagResourceExceptionsUnion = value.asInstanceOf[TagResourceExceptionsUnion]
  @scala.inline
  implicit def apply(value: ResourceNotFoundException): TagResourceExceptionsUnion = value.asInstanceOf[TagResourceExceptionsUnion]
  @scala.inline
  implicit def apply(value: ServiceException): TagResourceExceptionsUnion = value.asInstanceOf[TagResourceExceptionsUnion]
  @scala.inline
  implicit def apply(value: TooManyRequestsException): TagResourceExceptionsUnion = value.asInstanceOf[TagResourceExceptionsUnion]
}

