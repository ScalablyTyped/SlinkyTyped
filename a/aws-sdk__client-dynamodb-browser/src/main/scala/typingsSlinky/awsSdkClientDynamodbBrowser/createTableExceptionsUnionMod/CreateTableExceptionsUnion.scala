package typingsSlinky.awsSdkClientDynamodbBrowser.createTableExceptionsUnionMod

import typingsSlinky.awsSdkClientDynamodbBrowser.typesInternalServerErrorMod.InternalServerError
import typingsSlinky.awsSdkClientDynamodbBrowser.typesLimitExceededExceptionMod.LimitExceededException
import typingsSlinky.awsSdkClientDynamodbBrowser.typesResourceInUseExceptionMod.ResourceInUseException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdkClientDynamodbBrowser.typesResourceInUseExceptionMod.ResourceInUseException
  - typingsSlinky.awsSdkClientDynamodbBrowser.typesLimitExceededExceptionMod.LimitExceededException
  - typingsSlinky.awsSdkClientDynamodbBrowser.typesInternalServerErrorMod.InternalServerError
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

