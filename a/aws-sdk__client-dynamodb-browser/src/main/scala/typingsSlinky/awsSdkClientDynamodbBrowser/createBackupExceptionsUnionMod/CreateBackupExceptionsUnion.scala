package typingsSlinky.awsSdkClientDynamodbBrowser.createBackupExceptionsUnionMod

import typingsSlinky.awsSdkClientDynamodbBrowser.typesBackupInUseExceptionMod.BackupInUseException
import typingsSlinky.awsSdkClientDynamodbBrowser.typesContinuousBackupsUnavailableExceptionMod.ContinuousBackupsUnavailableException
import typingsSlinky.awsSdkClientDynamodbBrowser.typesInternalServerErrorMod.InternalServerError
import typingsSlinky.awsSdkClientDynamodbBrowser.typesLimitExceededExceptionMod.LimitExceededException
import typingsSlinky.awsSdkClientDynamodbBrowser.typesTableInUseExceptionMod.TableInUseException
import typingsSlinky.awsSdkClientDynamodbBrowser.typesTableNotFoundExceptionMod.TableNotFoundException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdkClientDynamodbBrowser.typesTableNotFoundExceptionMod.TableNotFoundException
  - typingsSlinky.awsSdkClientDynamodbBrowser.typesTableInUseExceptionMod.TableInUseException
  - typingsSlinky.awsSdkClientDynamodbBrowser.typesContinuousBackupsUnavailableExceptionMod.ContinuousBackupsUnavailableException
  - typingsSlinky.awsSdkClientDynamodbBrowser.typesBackupInUseExceptionMod.BackupInUseException
  - typingsSlinky.awsSdkClientDynamodbBrowser.typesLimitExceededExceptionMod.LimitExceededException
  - typingsSlinky.awsSdkClientDynamodbBrowser.typesInternalServerErrorMod.InternalServerError
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

