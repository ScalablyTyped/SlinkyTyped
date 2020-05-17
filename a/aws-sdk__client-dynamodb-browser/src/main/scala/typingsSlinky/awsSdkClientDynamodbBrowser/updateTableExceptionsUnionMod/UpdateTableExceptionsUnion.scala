package typingsSlinky.awsSdkClientDynamodbBrowser.updateTableExceptionsUnionMod

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
trait UpdateTableExceptionsUnion extends js.Object

object UpdateTableExceptionsUnion {
  @scala.inline
  implicit def apply(value: InternalServerError): UpdateTableExceptionsUnion = value.asInstanceOf[UpdateTableExceptionsUnion]
  @scala.inline
  implicit def apply(value: LimitExceededException): UpdateTableExceptionsUnion = value.asInstanceOf[UpdateTableExceptionsUnion]
  @scala.inline
  implicit def apply(value: ResourceInUseException): UpdateTableExceptionsUnion = value.asInstanceOf[UpdateTableExceptionsUnion]
  @scala.inline
  implicit def apply(value: ResourceNotFoundException): UpdateTableExceptionsUnion = value.asInstanceOf[UpdateTableExceptionsUnion]
}

