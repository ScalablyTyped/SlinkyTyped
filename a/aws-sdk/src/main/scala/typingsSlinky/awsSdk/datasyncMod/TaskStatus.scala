package typingsSlinky.awsSdk.datasyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.AVAILABLE
  - typingsSlinky.awsSdk.awsSdkStrings.CREATING
  - typingsSlinky.awsSdk.awsSdkStrings.QUEUED
  - typingsSlinky.awsSdk.awsSdkStrings.RUNNING
  - typingsSlinky.awsSdk.awsSdkStrings.UNAVAILABLE
  - java.lang.String
*/
trait TaskStatus extends js.Object

object TaskStatus {
  @scala.inline
  def AVAILABLE: typingsSlinky.awsSdk.awsSdkStrings.AVAILABLE = "AVAILABLE".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.AVAILABLE]
  @scala.inline
  def CREATING: typingsSlinky.awsSdk.awsSdkStrings.CREATING = "CREATING".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.CREATING]
  @scala.inline
  def QUEUED: typingsSlinky.awsSdk.awsSdkStrings.QUEUED = "QUEUED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.QUEUED]
  @scala.inline
  def RUNNING: typingsSlinky.awsSdk.awsSdkStrings.RUNNING = "RUNNING".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.RUNNING]
  @scala.inline
  def UNAVAILABLE: typingsSlinky.awsSdk.awsSdkStrings.UNAVAILABLE = "UNAVAILABLE".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.UNAVAILABLE]
  @scala.inline
  implicit def apply(value: String): TaskStatus = value.asInstanceOf[TaskStatus]
}

