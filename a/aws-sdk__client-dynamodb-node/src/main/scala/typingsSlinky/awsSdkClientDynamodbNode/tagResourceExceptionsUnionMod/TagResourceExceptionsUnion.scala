package typingsSlinky.awsSdkClientDynamodbNode.tagResourceExceptionsUnionMod

import typingsSlinky.awsSdkClientDynamodbNode.typesInternalServerErrorMod.InternalServerError
import typingsSlinky.awsSdkClientDynamodbNode.typesLimitExceededExceptionMod.LimitExceededException
import typingsSlinky.awsSdkClientDynamodbNode.typesResourceInUseExceptionMod.ResourceInUseException
import typingsSlinky.awsSdkClientDynamodbNode.typesResourceNotFoundExceptionMod.ResourceNotFoundException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdkClientDynamodbNode.typesLimitExceededExceptionMod.LimitExceededException
  - typingsSlinky.awsSdkClientDynamodbNode.typesResourceNotFoundExceptionMod.ResourceNotFoundException
  - typingsSlinky.awsSdkClientDynamodbNode.typesInternalServerErrorMod.InternalServerError
  - typingsSlinky.awsSdkClientDynamodbNode.typesResourceInUseExceptionMod.ResourceInUseException
*/
trait TagResourceExceptionsUnion extends js.Object

object TagResourceExceptionsUnion {
  @scala.inline
  implicit def apply(value: InternalServerError): TagResourceExceptionsUnion = value.asInstanceOf[TagResourceExceptionsUnion]
  @scala.inline
  implicit def apply(value: LimitExceededException): TagResourceExceptionsUnion = value.asInstanceOf[TagResourceExceptionsUnion]
  @scala.inline
  implicit def apply(value: ResourceInUseException): TagResourceExceptionsUnion = value.asInstanceOf[TagResourceExceptionsUnion]
  @scala.inline
  implicit def apply(value: ResourceNotFoundException): TagResourceExceptionsUnion = value.asInstanceOf[TagResourceExceptionsUnion]
}

