package typingsSlinky.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.CREATED
  - typingsSlinky.awsSdk.awsSdkStrings.PREPARING_FOR_INITIALIZATION
  - typingsSlinky.awsSdk.awsSdkStrings.INITIALIZING
  - typingsSlinky.awsSdk.awsSdkStrings.PROCESSING
  - typingsSlinky.awsSdk.awsSdkStrings.PENDING_JOB
  - typingsSlinky.awsSdk.awsSdkStrings.COMPLETING
  - typingsSlinky.awsSdk.awsSdkStrings.COMPLETED
  - typingsSlinky.awsSdk.awsSdkStrings.FAILING
  - typingsSlinky.awsSdk.awsSdkStrings.FAILED
  - java.lang.String
*/
trait JobStatus extends js.Object

object JobStatus {
  @scala.inline
  def CREATED: typingsSlinky.awsSdk.awsSdkStrings.CREATED = "CREATED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.CREATED]
  @scala.inline
  def PREPARING_FOR_INITIALIZATION: typingsSlinky.awsSdk.awsSdkStrings.PREPARING_FOR_INITIALIZATION = "PREPARING_FOR_INITIALIZATION".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.PREPARING_FOR_INITIALIZATION]
  @scala.inline
  def INITIALIZING: typingsSlinky.awsSdk.awsSdkStrings.INITIALIZING = "INITIALIZING".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.INITIALIZING]
  @scala.inline
  def PROCESSING: typingsSlinky.awsSdk.awsSdkStrings.PROCESSING = "PROCESSING".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.PROCESSING]
  @scala.inline
  def PENDING_JOB: typingsSlinky.awsSdk.awsSdkStrings.PENDING_JOB = "PENDING_JOB".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.PENDING_JOB]
  @scala.inline
  def COMPLETING: typingsSlinky.awsSdk.awsSdkStrings.COMPLETING = "COMPLETING".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.COMPLETING]
  @scala.inline
  def COMPLETED: typingsSlinky.awsSdk.awsSdkStrings.COMPLETED = "COMPLETED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.COMPLETED]
  @scala.inline
  def FAILING: typingsSlinky.awsSdk.awsSdkStrings.FAILING = "FAILING".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.FAILING]
  @scala.inline
  def FAILED: typingsSlinky.awsSdk.awsSdkStrings.FAILED = "FAILED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.FAILED]
  @scala.inline
  implicit def apply(value: String): JobStatus = value.asInstanceOf[JobStatus]
}

