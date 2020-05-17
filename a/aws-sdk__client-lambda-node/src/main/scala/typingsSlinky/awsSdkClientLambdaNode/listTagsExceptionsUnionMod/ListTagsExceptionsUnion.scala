package typingsSlinky.awsSdkClientLambdaNode.listTagsExceptionsUnionMod

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
trait ListTagsExceptionsUnion extends js.Object

object ListTagsExceptionsUnion {
  @scala.inline
  implicit def apply(value: InvalidParameterValueException): ListTagsExceptionsUnion = value.asInstanceOf[ListTagsExceptionsUnion]
  @scala.inline
  implicit def apply(value: ResourceNotFoundException): ListTagsExceptionsUnion = value.asInstanceOf[ListTagsExceptionsUnion]
  @scala.inline
  implicit def apply(value: ServiceException): ListTagsExceptionsUnion = value.asInstanceOf[ListTagsExceptionsUnion]
  @scala.inline
  implicit def apply(value: TooManyRequestsException): ListTagsExceptionsUnion = value.asInstanceOf[ListTagsExceptionsUnion]
}

