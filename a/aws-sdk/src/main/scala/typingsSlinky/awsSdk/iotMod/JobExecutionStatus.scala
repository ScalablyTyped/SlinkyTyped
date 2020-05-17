package typingsSlinky.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.QUEUED
  - typingsSlinky.awsSdk.awsSdkStrings.IN_PROGRESS
  - typingsSlinky.awsSdk.awsSdkStrings.SUCCEEDED
  - typingsSlinky.awsSdk.awsSdkStrings.FAILED
  - typingsSlinky.awsSdk.awsSdkStrings.TIMED_OUT
  - typingsSlinky.awsSdk.awsSdkStrings.REJECTED
  - typingsSlinky.awsSdk.awsSdkStrings.REMOVED
  - typingsSlinky.awsSdk.awsSdkStrings.CANCELED
  - java.lang.String
*/
trait JobExecutionStatus extends js.Object

object JobExecutionStatus {
  @scala.inline
  def QUEUED: typingsSlinky.awsSdk.awsSdkStrings.QUEUED = "QUEUED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.QUEUED]
  @scala.inline
  def IN_PROGRESS: typingsSlinky.awsSdk.awsSdkStrings.IN_PROGRESS = "IN_PROGRESS".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.IN_PROGRESS]
  @scala.inline
  def SUCCEEDED: typingsSlinky.awsSdk.awsSdkStrings.SUCCEEDED = "SUCCEEDED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.SUCCEEDED]
  @scala.inline
  def FAILED: typingsSlinky.awsSdk.awsSdkStrings.FAILED = "FAILED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.FAILED]
  @scala.inline
  def TIMED_OUT: typingsSlinky.awsSdk.awsSdkStrings.TIMED_OUT = "TIMED_OUT".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.TIMED_OUT]
  @scala.inline
  def REJECTED: typingsSlinky.awsSdk.awsSdkStrings.REJECTED = "REJECTED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.REJECTED]
  @scala.inline
  def REMOVED: typingsSlinky.awsSdk.awsSdkStrings.REMOVED = "REMOVED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.REMOVED]
  @scala.inline
  def CANCELED: typingsSlinky.awsSdk.awsSdkStrings.CANCELED = "CANCELED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.CANCELED]
  @scala.inline
  implicit def apply(value: java.lang.String): JobExecutionStatus = value.asInstanceOf[JobExecutionStatus]
}

