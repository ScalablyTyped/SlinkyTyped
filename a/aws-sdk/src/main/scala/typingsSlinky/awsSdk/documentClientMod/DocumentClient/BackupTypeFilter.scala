package typingsSlinky.awsSdk.documentClientMod.DocumentClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.USER
  - typingsSlinky.awsSdk.awsSdkStrings.SYSTEM
  - typingsSlinky.awsSdk.awsSdkStrings.AWS_BACKUP
  - typingsSlinky.awsSdk.awsSdkStrings.ALL
  - java.lang.String
*/
trait BackupTypeFilter extends js.Object

object BackupTypeFilter {
  @scala.inline
  def USER: typingsSlinky.awsSdk.awsSdkStrings.USER = "USER".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.USER]
  @scala.inline
  def SYSTEM: typingsSlinky.awsSdk.awsSdkStrings.SYSTEM = "SYSTEM".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.SYSTEM]
  @scala.inline
  def AWS_BACKUP: typingsSlinky.awsSdk.awsSdkStrings.AWS_BACKUP = "AWS_BACKUP".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.AWS_BACKUP]
  @scala.inline
  def ALL: typingsSlinky.awsSdk.awsSdkStrings.ALL = "ALL".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.ALL]
  @scala.inline
  implicit def apply(value: java.lang.String): BackupTypeFilter = value.asInstanceOf[BackupTypeFilter]
}

