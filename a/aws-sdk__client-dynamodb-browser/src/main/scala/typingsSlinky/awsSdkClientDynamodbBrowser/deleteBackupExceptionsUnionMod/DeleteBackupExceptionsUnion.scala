package typingsSlinky.awsSdkClientDynamodbBrowser.deleteBackupExceptionsUnionMod

import typingsSlinky.awsSdkClientDynamodbBrowser.typesBackupInUseExceptionMod.BackupInUseException
import typingsSlinky.awsSdkClientDynamodbBrowser.typesBackupNotFoundExceptionMod.BackupNotFoundException
import typingsSlinky.awsSdkClientDynamodbBrowser.typesInternalServerErrorMod.InternalServerError
import typingsSlinky.awsSdkClientDynamodbBrowser.typesLimitExceededExceptionMod.LimitExceededException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdkClientDynamodbBrowser.typesBackupNotFoundExceptionMod.BackupNotFoundException
  - typingsSlinky.awsSdkClientDynamodbBrowser.typesBackupInUseExceptionMod.BackupInUseException
  - typingsSlinky.awsSdkClientDynamodbBrowser.typesLimitExceededExceptionMod.LimitExceededException
  - typingsSlinky.awsSdkClientDynamodbBrowser.typesInternalServerErrorMod.InternalServerError
*/
trait DeleteBackupExceptionsUnion extends js.Object

object DeleteBackupExceptionsUnion {
  @scala.inline
  implicit def apply(value: BackupInUseException): DeleteBackupExceptionsUnion = value.asInstanceOf[DeleteBackupExceptionsUnion]
  @scala.inline
  implicit def apply(value: BackupNotFoundException): DeleteBackupExceptionsUnion = value.asInstanceOf[DeleteBackupExceptionsUnion]
  @scala.inline
  implicit def apply(value: InternalServerError): DeleteBackupExceptionsUnion = value.asInstanceOf[DeleteBackupExceptionsUnion]
  @scala.inline
  implicit def apply(value: LimitExceededException): DeleteBackupExceptionsUnion = value.asInstanceOf[DeleteBackupExceptionsUnion]
}

