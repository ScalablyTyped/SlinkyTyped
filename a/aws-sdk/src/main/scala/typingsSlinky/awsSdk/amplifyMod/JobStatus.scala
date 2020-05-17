package typingsSlinky.awsSdk.amplifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.PENDING
  - typingsSlinky.awsSdk.awsSdkStrings.PROVISIONING
  - typingsSlinky.awsSdk.awsSdkStrings.RUNNING
  - typingsSlinky.awsSdk.awsSdkStrings.FAILED
  - typingsSlinky.awsSdk.awsSdkStrings.SUCCEED
  - typingsSlinky.awsSdk.awsSdkStrings.CANCELLING
  - typingsSlinky.awsSdk.awsSdkStrings.CANCELLED
  - java.lang.String
*/
trait JobStatus extends js.Object

object JobStatus {
  @scala.inline
  def PENDING: typingsSlinky.awsSdk.awsSdkStrings.PENDING = "PENDING".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.PENDING]
  @scala.inline
  def PROVISIONING: typingsSlinky.awsSdk.awsSdkStrings.PROVISIONING = "PROVISIONING".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.PROVISIONING]
  @scala.inline
  def RUNNING: typingsSlinky.awsSdk.awsSdkStrings.RUNNING = "RUNNING".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.RUNNING]
  @scala.inline
  def FAILED: typingsSlinky.awsSdk.awsSdkStrings.FAILED = "FAILED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.FAILED]
  @scala.inline
  def SUCCEED: typingsSlinky.awsSdk.awsSdkStrings.SUCCEED = "SUCCEED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.SUCCEED]
  @scala.inline
  def CANCELLING: typingsSlinky.awsSdk.awsSdkStrings.CANCELLING = "CANCELLING".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.CANCELLING]
  @scala.inline
  def CANCELLED: typingsSlinky.awsSdk.awsSdkStrings.CANCELLED = "CANCELLED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.CANCELLED]
  @scala.inline
  implicit def apply(value: String): JobStatus = value.asInstanceOf[JobStatus]
}

