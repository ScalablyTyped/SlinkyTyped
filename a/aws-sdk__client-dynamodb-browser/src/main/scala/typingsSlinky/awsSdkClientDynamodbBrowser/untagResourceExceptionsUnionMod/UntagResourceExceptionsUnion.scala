package typingsSlinky.awsSdkClientDynamodbBrowser.untagResourceExceptionsUnionMod

import typingsSlinky.awsSdkClientDynamodbBrowser.typesInternalServerErrorMod.InternalServerError
import typingsSlinky.awsSdkClientDynamodbBrowser.typesLimitExceededExceptionMod.LimitExceededException
import typingsSlinky.awsSdkClientDynamodbBrowser.typesResourceInUseExceptionMod.ResourceInUseException
import typingsSlinky.awsSdkClientDynamodbBrowser.typesResourceNotFoundExceptionMod.ResourceNotFoundException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdkClientDynamodbBrowser.typesLimitExceededExceptionMod.LimitExceededException
  - typingsSlinky.awsSdkClientDynamodbBrowser.typesResourceNotFoundExceptionMod.ResourceNotFoundException
  - typingsSlinky.awsSdkClientDynamodbBrowser.typesInternalServerErrorMod.InternalServerError
  - typingsSlinky.awsSdkClientDynamodbBrowser.typesResourceInUseExceptionMod.ResourceInUseException
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

