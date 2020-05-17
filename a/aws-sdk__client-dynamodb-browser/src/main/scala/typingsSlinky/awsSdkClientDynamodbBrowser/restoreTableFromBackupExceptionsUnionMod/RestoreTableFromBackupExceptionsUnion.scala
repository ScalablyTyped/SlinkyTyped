package typingsSlinky.awsSdkClientDynamodbBrowser.restoreTableFromBackupExceptionsUnionMod

import typingsSlinky.awsSdkClientDynamodbBrowser.typesBackupInUseExceptionMod.BackupInUseException
import typingsSlinky.awsSdkClientDynamodbBrowser.typesBackupNotFoundExceptionMod.BackupNotFoundException
import typingsSlinky.awsSdkClientDynamodbBrowser.typesInternalServerErrorMod.InternalServerError
import typingsSlinky.awsSdkClientDynamodbBrowser.typesLimitExceededExceptionMod.LimitExceededException
import typingsSlinky.awsSdkClientDynamodbBrowser.typesTableAlreadyExistsExceptionMod.TableAlreadyExistsException
import typingsSlinky.awsSdkClientDynamodbBrowser.typesTableInUseExceptionMod.TableInUseException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdkClientDynamodbBrowser.typesTableAlreadyExistsExceptionMod.TableAlreadyExistsException
  - typingsSlinky.awsSdkClientDynamodbBrowser.typesTableInUseExceptionMod.TableInUseException
  - typingsSlinky.awsSdkClientDynamodbBrowser.typesBackupNotFoundExceptionMod.BackupNotFoundException
  - typingsSlinky.awsSdkClientDynamodbBrowser.typesBackupInUseExceptionMod.BackupInUseException
  - typingsSlinky.awsSdkClientDynamodbBrowser.typesLimitExceededExceptionMod.LimitExceededException
  - typingsSlinky.awsSdkClientDynamodbBrowser.typesInternalServerErrorMod.InternalServerError
*/
trait RestoreTableFromBackupExceptionsUnion extends js.Object

object RestoreTableFromBackupExceptionsUnion {
  @scala.inline
  implicit def apply(value: BackupInUseException): RestoreTableFromBackupExceptionsUnion = value.asInstanceOf[RestoreTableFromBackupExceptionsUnion]
  @scala.inline
  implicit def apply(value: BackupNotFoundException): RestoreTableFromBackupExceptionsUnion = value.asInstanceOf[RestoreTableFromBackupExceptionsUnion]
  @scala.inline
  implicit def apply(value: InternalServerError): RestoreTableFromBackupExceptionsUnion = value.asInstanceOf[RestoreTableFromBackupExceptionsUnion]
  @scala.inline
  implicit def apply(value: LimitExceededException): RestoreTableFromBackupExceptionsUnion = value.asInstanceOf[RestoreTableFromBackupExceptionsUnion]
  @scala.inline
  implicit def apply(value: TableAlreadyExistsException): RestoreTableFromBackupExceptionsUnion = value.asInstanceOf[RestoreTableFromBackupExceptionsUnion]
  @scala.inline
  implicit def apply(value: TableInUseException): RestoreTableFromBackupExceptionsUnion = value.asInstanceOf[RestoreTableFromBackupExceptionsUnion]
}

