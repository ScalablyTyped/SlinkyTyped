package typingsSlinky.awsSdkClientDynamodbBrowser.tagResourceExceptionsUnionMod

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

