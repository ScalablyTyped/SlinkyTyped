package typingsSlinky.awsSdk.datasyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.QUEUED
  - typingsSlinky.awsSdk.awsSdkStrings.LAUNCHING
  - typingsSlinky.awsSdk.awsSdkStrings.PREPARING
  - typingsSlinky.awsSdk.awsSdkStrings.TRANSFERRING
  - typingsSlinky.awsSdk.awsSdkStrings.VERIFYING
  - typingsSlinky.awsSdk.awsSdkStrings.SUCCESS
  - typingsSlinky.awsSdk.awsSdkStrings.ERROR
  - java.lang.String
*/
trait TaskExecutionStatus extends js.Object

object TaskExecutionStatus {
  @scala.inline
  def QUEUED: typingsSlinky.awsSdk.awsSdkStrings.QUEUED = "QUEUED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.QUEUED]
  @scala.inline
  def LAUNCHING: typingsSlinky.awsSdk.awsSdkStrings.LAUNCHING = "LAUNCHING".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.LAUNCHING]
  @scala.inline
  def PREPARING: typingsSlinky.awsSdk.awsSdkStrings.PREPARING = "PREPARING".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.PREPARING]
  @scala.inline
  def TRANSFERRING: typingsSlinky.awsSdk.awsSdkStrings.TRANSFERRING = "TRANSFERRING".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.TRANSFERRING]
  @scala.inline
  def VERIFYING: typingsSlinky.awsSdk.awsSdkStrings.VERIFYING = "VERIFYING".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.VERIFYING]
  @scala.inline
  def SUCCESS: typingsSlinky.awsSdk.awsSdkStrings.SUCCESS = "SUCCESS".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.SUCCESS]
  @scala.inline
  def ERROR: typingsSlinky.awsSdk.awsSdkStrings.ERROR = "ERROR".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.ERROR]
  @scala.inline
  implicit def apply(value: String): TaskExecutionStatus = value.asInstanceOf[TaskExecutionStatus]
}

