package typingsSlinky.awsSdkClientDynamodbBrowser.deleteTableExceptionsUnionMod

import typingsSlinky.awsSdkClientDynamodbBrowser.typesInternalServerErrorMod.InternalServerError
import typingsSlinky.awsSdkClientDynamodbBrowser.typesLimitExceededExceptionMod.LimitExceededException
import typingsSlinky.awsSdkClientDynamodbBrowser.typesResourceInUseExceptionMod.ResourceInUseException
import typingsSlinky.awsSdkClientDynamodbBrowser.typesResourceNotFoundExceptionMod.ResourceNotFoundException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdkClientDynamodbBrowser.typesResourceInUseExceptionMod.ResourceInUseException
  - typingsSlinky.awsSdkClientDynamodbBrowser.typesResourceNotFoundExceptionMod.ResourceNotFoundException
  - typingsSlinky.awsSdkClientDynamodbBrowser.typesLimitExceededExceptionMod.LimitExceededException
  - typingsSlinky.awsSdkClientDynamodbBrowser.typesInternalServerErrorMod.InternalServerError
*/
trait DeleteTableExceptionsUnion extends js.Object

object DeleteTableExceptionsUnion {
  @scala.inline
  implicit def apply(value: InternalServerError): DeleteTableExceptionsUnion = value.asInstanceOf[DeleteTableExceptionsUnion]
  @scala.inline
  implicit def apply(value: LimitExceededException): DeleteTableExceptionsUnion = value.asInstanceOf[DeleteTableExceptionsUnion]
  @scala.inline
  implicit def apply(value: ResourceInUseException): DeleteTableExceptionsUnion = value.asInstanceOf[DeleteTableExceptionsUnion]
  @scala.inline
  implicit def apply(value: ResourceNotFoundException): DeleteTableExceptionsUnion = value.asInstanceOf[DeleteTableExceptionsUnion]
}

