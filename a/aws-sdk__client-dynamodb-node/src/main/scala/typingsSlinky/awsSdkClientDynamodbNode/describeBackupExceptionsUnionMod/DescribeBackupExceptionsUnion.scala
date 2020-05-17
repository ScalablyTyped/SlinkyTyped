package typingsSlinky.awsSdkClientDynamodbNode.describeBackupExceptionsUnionMod

import typingsSlinky.awsSdkClientDynamodbNode.typesBackupNotFoundExceptionMod.BackupNotFoundException
import typingsSlinky.awsSdkClientDynamodbNode.typesInternalServerErrorMod.InternalServerError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdkClientDynamodbNode.typesBackupNotFoundExceptionMod.BackupNotFoundException
  - typingsSlinky.awsSdkClientDynamodbNode.typesInternalServerErrorMod.InternalServerError
*/
trait DescribeBackupExceptionsUnion extends js.Object

object DescribeBackupExceptionsUnion {
  @scala.inline
  implicit def apply(value: BackupNotFoundException): DescribeBackupExceptionsUnion = value.asInstanceOf[DescribeBackupExceptionsUnion]
  @scala.inline
  implicit def apply(value: InternalServerError): DescribeBackupExceptionsUnion = value.asInstanceOf[DescribeBackupExceptionsUnion]
}

