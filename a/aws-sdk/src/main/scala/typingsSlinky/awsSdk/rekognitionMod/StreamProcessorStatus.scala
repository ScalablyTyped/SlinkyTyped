package typingsSlinky.awsSdk.rekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.STOPPED
  - typingsSlinky.awsSdk.awsSdkStrings.STARTING
  - typingsSlinky.awsSdk.awsSdkStrings.RUNNING
  - typingsSlinky.awsSdk.awsSdkStrings.FAILED
  - typingsSlinky.awsSdk.awsSdkStrings.STOPPING
  - java.lang.String
*/
trait StreamProcessorStatus extends js.Object

object StreamProcessorStatus {
  @scala.inline
  def STOPPED: typingsSlinky.awsSdk.awsSdkStrings.STOPPED = "STOPPED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.STOPPED]
  @scala.inline
  def STARTING: typingsSlinky.awsSdk.awsSdkStrings.STARTING = "STARTING".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.STARTING]
  @scala.inline
  def RUNNING: typingsSlinky.awsSdk.awsSdkStrings.RUNNING = "RUNNING".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.RUNNING]
  @scala.inline
  def FAILED: typingsSlinky.awsSdk.awsSdkStrings.FAILED = "FAILED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.FAILED]
  @scala.inline
  def STOPPING: typingsSlinky.awsSdk.awsSdkStrings.STOPPING = "STOPPING".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.STOPPING]
  @scala.inline
  implicit def apply(value: java.lang.String): StreamProcessorStatus = value.asInstanceOf[StreamProcessorStatus]
}

