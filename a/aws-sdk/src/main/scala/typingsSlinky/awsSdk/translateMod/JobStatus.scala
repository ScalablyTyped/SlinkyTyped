package typingsSlinky.awsSdk.translateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.SUBMITTED
  - typingsSlinky.awsSdk.awsSdkStrings.IN_PROGRESS
  - typingsSlinky.awsSdk.awsSdkStrings.COMPLETED
  - typingsSlinky.awsSdk.awsSdkStrings.COMPLETED_WITH_ERROR
  - typingsSlinky.awsSdk.awsSdkStrings.FAILED
  - typingsSlinky.awsSdk.awsSdkStrings.STOP_REQUESTED
  - typingsSlinky.awsSdk.awsSdkStrings.STOPPED
  - java.lang.String
*/
trait JobStatus extends js.Object

object JobStatus {
  @scala.inline
  def SUBMITTED: typingsSlinky.awsSdk.awsSdkStrings.SUBMITTED = "SUBMITTED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.SUBMITTED]
  @scala.inline
  def IN_PROGRESS: typingsSlinky.awsSdk.awsSdkStrings.IN_PROGRESS = "IN_PROGRESS".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.IN_PROGRESS]
  @scala.inline
  def COMPLETED: typingsSlinky.awsSdk.awsSdkStrings.COMPLETED = "COMPLETED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.COMPLETED]
  @scala.inline
  def COMPLETED_WITH_ERROR: typingsSlinky.awsSdk.awsSdkStrings.COMPLETED_WITH_ERROR = "COMPLETED_WITH_ERROR".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.COMPLETED_WITH_ERROR]
  @scala.inline
  def FAILED: typingsSlinky.awsSdk.awsSdkStrings.FAILED = "FAILED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.FAILED]
  @scala.inline
  def STOP_REQUESTED: typingsSlinky.awsSdk.awsSdkStrings.STOP_REQUESTED = "STOP_REQUESTED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.STOP_REQUESTED]
  @scala.inline
  def STOPPED: typingsSlinky.awsSdk.awsSdkStrings.STOPPED = "STOPPED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.STOPPED]
  @scala.inline
  implicit def apply(value: java.lang.String): JobStatus = value.asInstanceOf[JobStatus]
}

