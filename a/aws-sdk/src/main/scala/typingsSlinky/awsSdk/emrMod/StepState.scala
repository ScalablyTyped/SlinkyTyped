package typingsSlinky.awsSdk.emrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.PENDING
  - typingsSlinky.awsSdk.awsSdkStrings.CANCEL_PENDING
  - typingsSlinky.awsSdk.awsSdkStrings.RUNNING
  - typingsSlinky.awsSdk.awsSdkStrings.COMPLETED
  - typingsSlinky.awsSdk.awsSdkStrings.CANCELLED
  - typingsSlinky.awsSdk.awsSdkStrings.FAILED
  - typingsSlinky.awsSdk.awsSdkStrings.INTERRUPTED
  - java.lang.String
*/
trait StepState extends js.Object

object StepState {
  @scala.inline
  def PENDING: typingsSlinky.awsSdk.awsSdkStrings.PENDING = "PENDING".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.PENDING]
  @scala.inline
  def CANCEL_PENDING: typingsSlinky.awsSdk.awsSdkStrings.CANCEL_PENDING = "CANCEL_PENDING".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.CANCEL_PENDING]
  @scala.inline
  def RUNNING: typingsSlinky.awsSdk.awsSdkStrings.RUNNING = "RUNNING".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.RUNNING]
  @scala.inline
  def COMPLETED: typingsSlinky.awsSdk.awsSdkStrings.COMPLETED = "COMPLETED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.COMPLETED]
  @scala.inline
  def CANCELLED: typingsSlinky.awsSdk.awsSdkStrings.CANCELLED = "CANCELLED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.CANCELLED]
  @scala.inline
  def FAILED: typingsSlinky.awsSdk.awsSdkStrings.FAILED = "FAILED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.FAILED]
  @scala.inline
  def INTERRUPTED: typingsSlinky.awsSdk.awsSdkStrings.INTERRUPTED = "INTERRUPTED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.INTERRUPTED]
  @scala.inline
  implicit def apply(value: java.lang.String): StepState = value.asInstanceOf[StepState]
}

