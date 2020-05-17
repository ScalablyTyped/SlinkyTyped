package typingsSlinky.awsSdk.swfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.COMPLETED
  - typingsSlinky.awsSdk.awsSdkStrings.FAILED
  - typingsSlinky.awsSdk.awsSdkStrings.CANCELED
  - typingsSlinky.awsSdk.awsSdkStrings.TERMINATED
  - typingsSlinky.awsSdk.awsSdkStrings.CONTINUED_AS_NEW
  - typingsSlinky.awsSdk.awsSdkStrings.TIMED_OUT
  - java.lang.String
*/
trait CloseStatus extends js.Object

object CloseStatus {
  @scala.inline
  def COMPLETED: typingsSlinky.awsSdk.awsSdkStrings.COMPLETED = "COMPLETED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.COMPLETED]
  @scala.inline
  def FAILED: typingsSlinky.awsSdk.awsSdkStrings.FAILED = "FAILED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.FAILED]
  @scala.inline
  def CANCELED: typingsSlinky.awsSdk.awsSdkStrings.CANCELED = "CANCELED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.CANCELED]
  @scala.inline
  def TERMINATED: typingsSlinky.awsSdk.awsSdkStrings.TERMINATED = "TERMINATED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.TERMINATED]
  @scala.inline
  def CONTINUED_AS_NEW: typingsSlinky.awsSdk.awsSdkStrings.CONTINUED_AS_NEW = "CONTINUED_AS_NEW".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.CONTINUED_AS_NEW]
  @scala.inline
  def TIMED_OUT: typingsSlinky.awsSdk.awsSdkStrings.TIMED_OUT = "TIMED_OUT".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.TIMED_OUT]
  @scala.inline
  implicit def apply(value: String): CloseStatus = value.asInstanceOf[CloseStatus]
}

