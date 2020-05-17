package typingsSlinky.awsSdk.cloudhsmv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.CREATE_IN_PROGRESS
  - typingsSlinky.awsSdk.awsSdkStrings.READY
  - typingsSlinky.awsSdk.awsSdkStrings.DELETED
  - typingsSlinky.awsSdk.awsSdkStrings.PENDING_DELETION
  - java.lang.String
*/
trait BackupState extends js.Object

object BackupState {
  @scala.inline
  def CREATE_IN_PROGRESS: typingsSlinky.awsSdk.awsSdkStrings.CREATE_IN_PROGRESS = "CREATE_IN_PROGRESS".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.CREATE_IN_PROGRESS]
  @scala.inline
  def READY: typingsSlinky.awsSdk.awsSdkStrings.READY = "READY".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.READY]
  @scala.inline
  def DELETED: typingsSlinky.awsSdk.awsSdkStrings.DELETED = "DELETED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.DELETED]
  @scala.inline
  def PENDING_DELETION: typingsSlinky.awsSdk.awsSdkStrings.PENDING_DELETION = "PENDING_DELETION".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.PENDING_DELETION]
  @scala.inline
  implicit def apply(value: java.lang.String): BackupState = value.asInstanceOf[BackupState]
}

