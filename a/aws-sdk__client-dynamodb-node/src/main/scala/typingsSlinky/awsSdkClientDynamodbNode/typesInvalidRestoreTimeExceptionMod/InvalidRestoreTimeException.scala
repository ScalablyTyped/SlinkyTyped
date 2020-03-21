package typingsSlinky.awsSdkClientDynamodbNode.typesInvalidRestoreTimeExceptionMod

import typingsSlinky.awsSdkClientDynamodbNode.restoreTableToPointInTimeExceptionsUnionMod.RestoreTableToPointInTimeExceptionsUnion
import typingsSlinky.awsSdkTypes.exceptionMod.ServiceException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InvalidRestoreTimeException
  extends ServiceException[InvalidRestoreTimeExceptionDetails]
     with RestoreTableToPointInTimeExceptionsUnion {
  @JSName("name")
  var name_InvalidRestoreTimeException: typingsSlinky.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.InvalidRestoreTimeException = js.native
}

