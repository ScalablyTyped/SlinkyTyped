package typingsSlinky.awsSdkClientDynamodbNode.untagResourceExceptionsUnionMod

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
trait UntagResourceExceptionsUnion extends js.Object

object UntagResourceExceptionsUnion {
  @scala.inline
  implicit def apply(value: InternalServerError): UntagResourceExceptionsUnion = value.asInstanceOf[UntagResourceExceptionsUnion]
  @scala.inline
  implicit def apply(value: LimitExceededException): UntagResourceExceptionsUnion = value.asInstanceOf[UntagResourceExceptionsUnion]
  @scala.inline
  implicit def apply(value: ResourceInUseException): UntagResourceExceptionsUnion = value.asInstanceOf[UntagResourceExceptionsUnion]
  @scala.inline
  implicit def apply(value: ResourceNotFoundException): UntagResourceExceptionsUnion = value.asInstanceOf[UntagResourceExceptionsUnion]
}

