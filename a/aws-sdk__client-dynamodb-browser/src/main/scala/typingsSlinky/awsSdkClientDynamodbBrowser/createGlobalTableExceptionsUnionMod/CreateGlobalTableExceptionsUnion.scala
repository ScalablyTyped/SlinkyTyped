package typingsSlinky.awsSdkClientDynamodbBrowser.createGlobalTableExceptionsUnionMod

import typingsSlinky.awsSdkClientDynamodbBrowser.typesGlobalTableAlreadyExistsExceptionMod.GlobalTableAlreadyExistsException
import typingsSlinky.awsSdkClientDynamodbBrowser.typesInternalServerErrorMod.InternalServerError
import typingsSlinky.awsSdkClientDynamodbBrowser.typesLimitExceededExceptionMod.LimitExceededException
import typingsSlinky.awsSdkClientDynamodbBrowser.typesTableNotFoundExceptionMod.TableNotFoundException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdkClientDynamodbBrowser.typesLimitExceededExceptionMod.LimitExceededException
  - typingsSlinky.awsSdkClientDynamodbBrowser.typesInternalServerErrorMod.InternalServerError
  - typingsSlinky.awsSdkClientDynamodbBrowser.typesGlobalTableAlreadyExistsExceptionMod.GlobalTableAlreadyExistsException
  - typingsSlinky.awsSdkClientDynamodbBrowser.typesTableNotFoundExceptionMod.TableNotFoundException
*/
trait CreateGlobalTableExceptionsUnion extends js.Object

object CreateGlobalTableExceptionsUnion {
  @scala.inline
  implicit def apply(value: GlobalTableAlreadyExistsException): CreateGlobalTableExceptionsUnion = value.asInstanceOf[CreateGlobalTableExceptionsUnion]
  @scala.inline
  implicit def apply(value: InternalServerError): CreateGlobalTableExceptionsUnion = value.asInstanceOf[CreateGlobalTableExceptionsUnion]
  @scala.inline
  implicit def apply(value: LimitExceededException): CreateGlobalTableExceptionsUnion = value.asInstanceOf[CreateGlobalTableExceptionsUnion]
  @scala.inline
  implicit def apply(value: TableNotFoundException): CreateGlobalTableExceptionsUnion = value.asInstanceOf[CreateGlobalTableExceptionsUnion]
}

