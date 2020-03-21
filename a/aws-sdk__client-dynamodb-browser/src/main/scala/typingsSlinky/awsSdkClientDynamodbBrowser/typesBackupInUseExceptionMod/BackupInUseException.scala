package typingsSlinky.awsSdkClientDynamodbBrowser.typesBackupInUseExceptionMod

import typingsSlinky.awsSdkClientDynamodbBrowser.createBackupExceptionsUnionMod.CreateBackupExceptionsUnion
import typingsSlinky.awsSdkClientDynamodbBrowser.deleteBackupExceptionsUnionMod.DeleteBackupExceptionsUnion
import typingsSlinky.awsSdkClientDynamodbBrowser.restoreTableFromBackupExceptionsUnionMod.RestoreTableFromBackupExceptionsUnion
import typingsSlinky.awsSdkTypes.exceptionMod.ServiceException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BackupInUseException
  extends ServiceException[BackupInUseExceptionDetails]
     with CreateBackupExceptionsUnion
     with DeleteBackupExceptionsUnion
     with RestoreTableFromBackupExceptionsUnion {
  @JSName("name")
  var name_BackupInUseException: typingsSlinky.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.BackupInUseException = js.native
}

