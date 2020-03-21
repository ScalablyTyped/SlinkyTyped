package typingsSlinky.awsSdkClientDynamodbNode.typesGlobalTableAlreadyExistsExceptionMod

import typingsSlinky.awsSdkClientDynamodbNode.createGlobalTableExceptionsUnionMod.CreateGlobalTableExceptionsUnion
import typingsSlinky.awsSdkTypes.exceptionMod.ServiceException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GlobalTableAlreadyExistsException
  extends ServiceException[GlobalTableAlreadyExistsExceptionDetails]
     with CreateGlobalTableExceptionsUnion {
  @JSName("name")
  var name_GlobalTableAlreadyExistsException: typingsSlinky.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.GlobalTableAlreadyExistsException = js.native
}

