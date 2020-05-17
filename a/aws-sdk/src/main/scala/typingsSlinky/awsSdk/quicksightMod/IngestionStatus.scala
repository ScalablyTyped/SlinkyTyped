package typingsSlinky.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.INITIALIZED
  - typingsSlinky.awsSdk.awsSdkStrings.QUEUED
  - typingsSlinky.awsSdk.awsSdkStrings.RUNNING
  - typingsSlinky.awsSdk.awsSdkStrings.FAILED
  - typingsSlinky.awsSdk.awsSdkStrings.COMPLETED
  - typingsSlinky.awsSdk.awsSdkStrings.CANCELLED
  - java.lang.String
*/
trait IngestionStatus extends js.Object

object IngestionStatus {
  @scala.inline
  def INITIALIZED: typingsSlinky.awsSdk.awsSdkStrings.INITIALIZED = "INITIALIZED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.INITIALIZED]
  @scala.inline
  def QUEUED: typingsSlinky.awsSdk.awsSdkStrings.QUEUED = "QUEUED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.QUEUED]
  @scala.inline
  def RUNNING: typingsSlinky.awsSdk.awsSdkStrings.RUNNING = "RUNNING".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.RUNNING]
  @scala.inline
  def FAILED: typingsSlinky.awsSdk.awsSdkStrings.FAILED = "FAILED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.FAILED]
  @scala.inline
  def COMPLETED: typingsSlinky.awsSdk.awsSdkStrings.COMPLETED = "COMPLETED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.COMPLETED]
  @scala.inline
  def CANCELLED: typingsSlinky.awsSdk.awsSdkStrings.CANCELLED = "CANCELLED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.CANCELLED]
  @scala.inline
  implicit def apply(value: java.lang.String): IngestionStatus = value.asInstanceOf[IngestionStatus]
}

