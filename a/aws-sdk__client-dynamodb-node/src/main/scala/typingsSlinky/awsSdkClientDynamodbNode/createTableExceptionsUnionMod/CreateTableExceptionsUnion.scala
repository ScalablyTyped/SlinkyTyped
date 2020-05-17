package typingsSlinky.awsSdkClientDynamodbNode.createTableExceptionsUnionMod

import typingsSlinky.awsSdkClientDynamodbNode.typesInternalServerErrorMod.InternalServerError
import typingsSlinky.awsSdkClientDynamodbNode.typesLimitExceededExceptionMod.LimitExceededException
import typingsSlinky.awsSdkClientDynamodbNode.typesResourceInUseExceptionMod.ResourceInUseException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdkClientDynamodbNode.typesResourceInUseExceptionMod.ResourceInUseException
  - typingsSlinky.awsSdkClientDynamodbNode.typesLimitExceededExceptionMod.LimitExceededException
  - typingsSlinky.awsSdkClientDynamodbNode.typesInternalServerErrorMod.InternalServerError
*/
trait CreateTableExceptionsUnion extends js.Object

object CreateTableExceptionsUnion {
  @scala.inline
  implicit def apply(value: InternalServerError): CreateTableExceptionsUnion = value.asInstanceOf[CreateTableExceptionsUnion]
  @scala.inline
  implicit def apply(value: LimitExceededException): CreateTableExceptionsUnion = value.asInstanceOf[CreateTableExceptionsUnion]
  @scala.inline
  implicit def apply(value: ResourceInUseException): CreateTableExceptionsUnion = value.asInstanceOf[CreateTableExceptionsUnion]
}

