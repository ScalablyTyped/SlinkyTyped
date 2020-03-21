package typingsSlinky.awsSdkClientDynamodbNode.typesContinuousBackupsUnavailableExceptionMod

import typingsSlinky.awsSdkClientDynamodbNode.createBackupExceptionsUnionMod.CreateBackupExceptionsUnion
import typingsSlinky.awsSdkClientDynamodbNode.updateContinuousBackupsExceptionsUnionMod.UpdateContinuousBackupsExceptionsUnion
import typingsSlinky.awsSdkTypes.exceptionMod.ServiceException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContinuousBackupsUnavailableException
  extends ServiceException[ContinuousBackupsUnavailableExceptionDetails]
     with CreateBackupExceptionsUnion
     with UpdateContinuousBackupsExceptionsUnion {
  @JSName("name")
  var name_ContinuousBackupsUnavailableException: typingsSlinky.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.ContinuousBackupsUnavailableException = js.native
}

