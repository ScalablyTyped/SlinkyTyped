package typingsSlinky.awsSdkClientDynamodbNode.deleteTableExceptionsUnionMod

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

