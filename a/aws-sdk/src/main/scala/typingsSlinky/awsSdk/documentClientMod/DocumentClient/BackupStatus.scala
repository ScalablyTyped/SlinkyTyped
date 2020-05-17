package typingsSlinky.awsSdk.documentClientMod.DocumentClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.CREATING
  - typingsSlinky.awsSdk.awsSdkStrings.DELETED
  - typingsSlinky.awsSdk.awsSdkStrings.AVAILABLE
  - java.lang.String
*/
trait BackupStatus extends js.Object

object BackupStatus {
  @scala.inline
  def CREATING: typingsSlinky.awsSdk.awsSdkStrings.CREATING = "CREATING".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.CREATING]
  @scala.inline
  def DELETED: typingsSlinky.awsSdk.awsSdkStrings.DELETED = "DELETED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.DELETED]
  @scala.inline
  def AVAILABLE: typingsSlinky.awsSdk.awsSdkStrings.AVAILABLE = "AVAILABLE".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.AVAILABLE]
  @scala.inline
  implicit def apply(value: java.lang.String): BackupStatus = value.asInstanceOf[BackupStatus]
}

