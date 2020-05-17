package typingsSlinky.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.STARTING
  - typingsSlinky.awsSdk.awsSdkStrings.RUNNING
  - typingsSlinky.awsSdk.awsSdkStrings.STOPPING
  - typingsSlinky.awsSdk.awsSdkStrings.STOPPED
  - typingsSlinky.awsSdk.awsSdkStrings.SUCCEEDED
  - typingsSlinky.awsSdk.awsSdkStrings.FAILED
  - typingsSlinky.awsSdk.awsSdkStrings.TIMEOUT
  - java.lang.String
*/
trait JobRunState extends js.Object

object JobRunState {
  @scala.inline
  def STARTING: typingsSlinky.awsSdk.awsSdkStrings.STARTING = "STARTING".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.STARTING]
  @scala.inline
  def RUNNING: typingsSlinky.awsSdk.awsSdkStrings.RUNNING = "RUNNING".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.RUNNING]
  @scala.inline
  def STOPPING: typingsSlinky.awsSdk.awsSdkStrings.STOPPING = "STOPPING".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.STOPPING]
  @scala.inline
  def STOPPED: typingsSlinky.awsSdk.awsSdkStrings.STOPPED = "STOPPED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.STOPPED]
  @scala.inline
  def SUCCEEDED: typingsSlinky.awsSdk.awsSdkStrings.SUCCEEDED = "SUCCEEDED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.SUCCEEDED]
  @scala.inline
  def FAILED: typingsSlinky.awsSdk.awsSdkStrings.FAILED = "FAILED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.FAILED]
  @scala.inline
  def TIMEOUT: typingsSlinky.awsSdk.awsSdkStrings.TIMEOUT = "TIMEOUT".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.TIMEOUT]
  @scala.inline
  implicit def apply(value: String): JobRunState = value.asInstanceOf[JobRunState]
}

