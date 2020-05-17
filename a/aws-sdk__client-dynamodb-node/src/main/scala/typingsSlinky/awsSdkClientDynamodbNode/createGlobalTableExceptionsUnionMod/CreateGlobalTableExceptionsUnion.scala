package typingsSlinky.awsSdkClientDynamodbNode.createGlobalTableExceptionsUnionMod

import typingsSlinky.awsSdkClientDynamodbNode.typesGlobalTableAlreadyExistsExceptionMod.GlobalTableAlreadyExistsException
import typingsSlinky.awsSdkClientDynamodbNode.typesInternalServerErrorMod.InternalServerError
import typingsSlinky.awsSdkClientDynamodbNode.typesLimitExceededExceptionMod.LimitExceededException
import typingsSlinky.awsSdkClientDynamodbNode.typesTableNotFoundExceptionMod.TableNotFoundException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdkClientDynamodbNode.typesLimitExceededExceptionMod.LimitExceededException
  - typingsSlinky.awsSdkClientDynamodbNode.typesInternalServerErrorMod.InternalServerError
  - typingsSlinky.awsSdkClientDynamodbNode.typesGlobalTableAlreadyExistsExceptionMod.GlobalTableAlreadyExistsException
  - typingsSlinky.awsSdkClientDynamodbNode.typesTableNotFoundExceptionMod.TableNotFoundException
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

