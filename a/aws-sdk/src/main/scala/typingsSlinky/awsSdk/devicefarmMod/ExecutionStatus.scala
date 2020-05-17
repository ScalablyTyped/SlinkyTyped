package typingsSlinky.awsSdk.devicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.PENDING
  - typingsSlinky.awsSdk.awsSdkStrings.PENDING_CONCURRENCY
  - typingsSlinky.awsSdk.awsSdkStrings.PENDING_DEVICE
  - typingsSlinky.awsSdk.awsSdkStrings.PROCESSING
  - typingsSlinky.awsSdk.awsSdkStrings.SCHEDULING
  - typingsSlinky.awsSdk.awsSdkStrings.PREPARING
  - typingsSlinky.awsSdk.awsSdkStrings.RUNNING
  - typingsSlinky.awsSdk.awsSdkStrings.COMPLETED
  - typingsSlinky.awsSdk.awsSdkStrings.STOPPING
  - java.lang.String
*/
trait ExecutionStatus extends js.Object

object ExecutionStatus {
  @scala.inline
  def PENDING: typingsSlinky.awsSdk.awsSdkStrings.PENDING = "PENDING".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.PENDING]
  @scala.inline
  def PENDING_CONCURRENCY: typingsSlinky.awsSdk.awsSdkStrings.PENDING_CONCURRENCY = "PENDING_CONCURRENCY".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.PENDING_CONCURRENCY]
  @scala.inline
  def PENDING_DEVICE: typingsSlinky.awsSdk.awsSdkStrings.PENDING_DEVICE = "PENDING_DEVICE".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.PENDING_DEVICE]
  @scala.inline
  def PROCESSING: typingsSlinky.awsSdk.awsSdkStrings.PROCESSING = "PROCESSING".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.PROCESSING]
  @scala.inline
  def SCHEDULING: typingsSlinky.awsSdk.awsSdkStrings.SCHEDULING = "SCHEDULING".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.SCHEDULING]
  @scala.inline
  def PREPARING: typingsSlinky.awsSdk.awsSdkStrings.PREPARING = "PREPARING".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.PREPARING]
  @scala.inline
  def RUNNING: typingsSlinky.awsSdk.awsSdkStrings.RUNNING = "RUNNING".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.RUNNING]
  @scala.inline
  def COMPLETED: typingsSlinky.awsSdk.awsSdkStrings.COMPLETED = "COMPLETED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.COMPLETED]
  @scala.inline
  def STOPPING: typingsSlinky.awsSdk.awsSdkStrings.STOPPING = "STOPPING".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.STOPPING]
  @scala.inline
  implicit def apply(value: java.lang.String): ExecutionStatus = value.asInstanceOf[ExecutionStatus]
}

