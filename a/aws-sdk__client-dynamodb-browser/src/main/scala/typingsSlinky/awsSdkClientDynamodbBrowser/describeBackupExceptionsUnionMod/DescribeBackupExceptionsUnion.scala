package typingsSlinky.awsSdkClientDynamodbBrowser.describeBackupExceptionsUnionMod

import typingsSlinky.awsSdkClientDynamodbBrowser.typesBackupNotFoundExceptionMod.BackupNotFoundException
import typingsSlinky.awsSdkClientDynamodbBrowser.typesInternalServerErrorMod.InternalServerError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdkClientDynamodbBrowser.typesBackupNotFoundExceptionMod.BackupNotFoundException
  - typingsSlinky.awsSdkClientDynamodbBrowser.typesInternalServerErrorMod.InternalServerError
*/
trait DescribeBackupExceptionsUnion extends js.Object

object DescribeBackupExceptionsUnion {
  @scala.inline
  implicit def apply(value: BackupNotFoundException): DescribeBackupExceptionsUnion = value.asInstanceOf[DescribeBackupExceptionsUnion]
  @scala.inline
  implicit def apply(value: InternalServerError): DescribeBackupExceptionsUnion = value.asInstanceOf[DescribeBackupExceptionsUnion]
}

