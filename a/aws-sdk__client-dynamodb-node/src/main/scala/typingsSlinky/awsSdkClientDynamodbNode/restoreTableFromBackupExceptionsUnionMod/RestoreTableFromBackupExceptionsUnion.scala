package typingsSlinky.awsSdkClientDynamodbNode.restoreTableFromBackupExceptionsUnionMod

import typingsSlinky.awsSdkClientDynamodbNode.typesBackupInUseExceptionMod.BackupInUseException
import typingsSlinky.awsSdkClientDynamodbNode.typesBackupNotFoundExceptionMod.BackupNotFoundException
import typingsSlinky.awsSdkClientDynamodbNode.typesInternalServerErrorMod.InternalServerError
import typingsSlinky.awsSdkClientDynamodbNode.typesLimitExceededExceptionMod.LimitExceededException
import typingsSlinky.awsSdkClientDynamodbNode.typesTableAlreadyExistsExceptionMod.TableAlreadyExistsException
import typingsSlinky.awsSdkClientDynamodbNode.typesTableInUseExceptionMod.TableInUseException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdkClientDynamodbNode.typesTableAlreadyExistsExceptionMod.TableAlreadyExistsException
  - typingsSlinky.awsSdkClientDynamodbNode.typesTableInUseExceptionMod.TableInUseException
  - typingsSlinky.awsSdkClientDynamodbNode.typesBackupNotFoundExceptionMod.BackupNotFoundException
  - typingsSlinky.awsSdkClientDynamodbNode.typesBackupInUseExceptionMod.BackupInUseException
  - typingsSlinky.awsSdkClientDynamodbNode.typesLimitExceededExceptionMod.LimitExceededException
  - typingsSlinky.awsSdkClientDynamodbNode.typesInternalServerErrorMod.InternalServerError
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

