package typingsSlinky.awsSdk.cloudwatchlogsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.CANCELLED
  - typingsSlinky.awsSdk.awsSdkStrings.COMPLETED
  - typingsSlinky.awsSdk.awsSdkStrings.FAILED
  - typingsSlinky.awsSdk.awsSdkStrings.PENDING
  - typingsSlinky.awsSdk.awsSdkStrings.PENDING_CANCEL
  - typingsSlinky.awsSdk.awsSdkStrings.RUNNING
  - java.lang.String
*/
trait ExportTaskStatusCode extends js.Object

object ExportTaskStatusCode {
  @scala.inline
  def CANCELLED: typingsSlinky.awsSdk.awsSdkStrings.CANCELLED = "CANCELLED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.CANCELLED]
  @scala.inline
  def COMPLETED: typingsSlinky.awsSdk.awsSdkStrings.COMPLETED = "COMPLETED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.COMPLETED]
  @scala.inline
  def FAILED: typingsSlinky.awsSdk.awsSdkStrings.FAILED = "FAILED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.FAILED]
  @scala.inline
  def PENDING: typingsSlinky.awsSdk.awsSdkStrings.PENDING = "PENDING".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.PENDING]
  @scala.inline
  def PENDING_CANCEL: typingsSlinky.awsSdk.awsSdkStrings.PENDING_CANCEL = "PENDING_CANCEL".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.PENDING_CANCEL]
  @scala.inline
  def RUNNING: typingsSlinky.awsSdk.awsSdkStrings.RUNNING = "RUNNING".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.RUNNING]
  @scala.inline
  implicit def apply(value: String): ExportTaskStatusCode = value.asInstanceOf[ExportTaskStatusCode]
}

