package typingsSlinky.awsSdkClientDynamodbNode.createBackupExceptionsUnionMod

import typingsSlinky.awsSdkClientDynamodbNode.typesBackupInUseExceptionMod.BackupInUseException
import typingsSlinky.awsSdkClientDynamodbNode.typesContinuousBackupsUnavailableExceptionMod.ContinuousBackupsUnavailableException
import typingsSlinky.awsSdkClientDynamodbNode.typesInternalServerErrorMod.InternalServerError
import typingsSlinky.awsSdkClientDynamodbNode.typesLimitExceededExceptionMod.LimitExceededException
import typingsSlinky.awsSdkClientDynamodbNode.typesTableInUseExceptionMod.TableInUseException
import typingsSlinky.awsSdkClientDynamodbNode.typesTableNotFoundExceptionMod.TableNotFoundException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdkClientDynamodbNode.typesTableNotFoundExceptionMod.TableNotFoundException
  - typingsSlinky.awsSdkClientDynamodbNode.typesTableInUseExceptionMod.TableInUseException
  - typingsSlinky.awsSdkClientDynamodbNode.typesContinuousBackupsUnavailableExceptionMod.ContinuousBackupsUnavailableException
  - typingsSlinky.awsSdkClientDynamodbNode.typesBackupInUseExceptionMod.BackupInUseException
  - typingsSlinky.awsSdkClientDynamodbNode.typesLimitExceededExceptionMod.LimitExceededException
  - typingsSlinky.awsSdkClientDynamodbNode.typesInternalServerErrorMod.InternalServerError
*/
trait CreateBackupExceptionsUnion extends js.Object

object CreateBackupExceptionsUnion {
  @scala.inline
  implicit def apply(value: BackupInUseException): CreateBackupExceptionsUnion = value.asInstanceOf[CreateBackupExceptionsUnion]
  @scala.inline
  implicit def apply(value: ContinuousBackupsUnavailableException): CreateBackupExceptionsUnion = value.asInstanceOf[CreateBackupExceptionsUnion]
  @scala.inline
  implicit def apply(value: InternalServerError): CreateBackupExceptionsUnion = value.asInstanceOf[CreateBackupExceptionsUnion]
  @scala.inline
  implicit def apply(value: LimitExceededException): CreateBackupExceptionsUnion = value.asInstanceOf[CreateBackupExceptionsUnion]
  @scala.inline
  implicit def apply(value: TableInUseException): CreateBackupExceptionsUnion = value.asInstanceOf[CreateBackupExceptionsUnion]
  @scala.inline
  implicit def apply(value: TableNotFoundException): CreateBackupExceptionsUnion = value.asInstanceOf[CreateBackupExceptionsUnion]
}

