package typingsSlinky.awsSdkClientDynamodbNode.updateTableExceptionsUnionMod

import typingsSlinky.awsSdkClientDynamodbNode.typesInternalServerErrorMod.InternalServerError
import typingsSlinky.awsSdkClientDynamodbNode.typesLimitExceededExceptionMod.LimitExceededException
import typingsSlinky.awsSdkClientDynamodbNode.typesResourceInUseExceptionMod.ResourceInUseException
import typingsSlinky.awsSdkClientDynamodbNode.typesResourceNotFoundExceptionMod.ResourceNotFoundException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdkClientDynamodbNode.typesResourceInUseExceptionMod.ResourceInUseException
  - typingsSlinky.awsSdkClientDynamodbNode.typesResourceNotFoundExceptionMod.ResourceNotFoundException
  - typingsSlinky.awsSdkClientDynamodbNode.typesLimitExceededExceptionMod.LimitExceededException
  - typingsSlinky.awsSdkClientDynamodbNode.typesInternalServerErrorMod.InternalServerError
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

