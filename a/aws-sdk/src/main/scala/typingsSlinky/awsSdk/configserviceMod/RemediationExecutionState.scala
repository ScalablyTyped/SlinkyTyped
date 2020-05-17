package typingsSlinky.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.QUEUED
  - typingsSlinky.awsSdk.awsSdkStrings.IN_PROGRESS
  - typingsSlinky.awsSdk.awsSdkStrings.SUCCEEDED
  - typingsSlinky.awsSdk.awsSdkStrings.FAILED
  - java.lang.String
*/
trait RemediationExecutionState extends js.Object

object RemediationExecutionState {
  @scala.inline
  def QUEUED: typingsSlinky.awsSdk.awsSdkStrings.QUEUED = "QUEUED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.QUEUED]
  @scala.inline
  def IN_PROGRESS: typingsSlinky.awsSdk.awsSdkStrings.IN_PROGRESS = "IN_PROGRESS".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.IN_PROGRESS]
  @scala.inline
  def SUCCEEDED: typingsSlinky.awsSdk.awsSdkStrings.SUCCEEDED = "SUCCEEDED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.SUCCEEDED]
  @scala.inline
  def FAILED: typingsSlinky.awsSdk.awsSdkStrings.FAILED = "FAILED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.FAILED]
  @scala.inline
  implicit def apply(value: java.lang.String): RemediationExecutionState = value.asInstanceOf[RemediationExecutionState]
}

