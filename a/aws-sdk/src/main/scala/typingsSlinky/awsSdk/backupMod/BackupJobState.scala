package typingsSlinky.awsSdk.backupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.CREATED
  - typingsSlinky.awsSdk.awsSdkStrings.PENDING
  - typingsSlinky.awsSdk.awsSdkStrings.RUNNING
  - typingsSlinky.awsSdk.awsSdkStrings.ABORTING
  - typingsSlinky.awsSdk.awsSdkStrings.ABORTED
  - typingsSlinky.awsSdk.awsSdkStrings.COMPLETED
  - typingsSlinky.awsSdk.awsSdkStrings.FAILED
  - typingsSlinky.awsSdk.awsSdkStrings.EXPIRED
  - java.lang.String
*/
trait BackupJobState extends js.Object

object BackupJobState {
  @scala.inline
  def CREATED: typingsSlinky.awsSdk.awsSdkStrings.CREATED = "CREATED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.CREATED]
  @scala.inline
  def PENDING: typingsSlinky.awsSdk.awsSdkStrings.PENDING = "PENDING".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.PENDING]
  @scala.inline
  def RUNNING: typingsSlinky.awsSdk.awsSdkStrings.RUNNING = "RUNNING".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.RUNNING]
  @scala.inline
  def ABORTING: typingsSlinky.awsSdk.awsSdkStrings.ABORTING = "ABORTING".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.ABORTING]
  @scala.inline
  def ABORTED: typingsSlinky.awsSdk.awsSdkStrings.ABORTED = "ABORTED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.ABORTED]
  @scala.inline
  def COMPLETED: typingsSlinky.awsSdk.awsSdkStrings.COMPLETED = "COMPLETED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.COMPLETED]
  @scala.inline
  def FAILED: typingsSlinky.awsSdk.awsSdkStrings.FAILED = "FAILED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.FAILED]
  @scala.inline
  def EXPIRED: typingsSlinky.awsSdk.awsSdkStrings.EXPIRED = "EXPIRED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.EXPIRED]
  @scala.inline
  implicit def apply(value: String): BackupJobState = value.asInstanceOf[BackupJobState]
}

