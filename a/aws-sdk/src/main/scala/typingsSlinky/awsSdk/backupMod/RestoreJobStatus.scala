package typingsSlinky.awsSdk.backupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.PENDING
  - typingsSlinky.awsSdk.awsSdkStrings.RUNNING
  - typingsSlinky.awsSdk.awsSdkStrings.COMPLETED
  - typingsSlinky.awsSdk.awsSdkStrings.ABORTED
  - typingsSlinky.awsSdk.awsSdkStrings.FAILED
  - java.lang.String
*/
trait RestoreJobStatus extends js.Object

object RestoreJobStatus {
  @scala.inline
  def PENDING: typingsSlinky.awsSdk.awsSdkStrings.PENDING = "PENDING".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.PENDING]
  @scala.inline
  def RUNNING: typingsSlinky.awsSdk.awsSdkStrings.RUNNING = "RUNNING".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.RUNNING]
  @scala.inline
  def COMPLETED: typingsSlinky.awsSdk.awsSdkStrings.COMPLETED = "COMPLETED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.COMPLETED]
  @scala.inline
  def ABORTED: typingsSlinky.awsSdk.awsSdkStrings.ABORTED = "ABORTED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.ABORTED]
  @scala.inline
  def FAILED: typingsSlinky.awsSdk.awsSdkStrings.FAILED = "FAILED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.FAILED]
  @scala.inline
  implicit def apply(value: String): RestoreJobStatus = value.asInstanceOf[RestoreJobStatus]
}

