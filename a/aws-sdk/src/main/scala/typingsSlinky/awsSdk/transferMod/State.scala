package typingsSlinky.awsSdk.transferMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.OFFLINE
  - typingsSlinky.awsSdk.awsSdkStrings.ONLINE
  - typingsSlinky.awsSdk.awsSdkStrings.STARTING
  - typingsSlinky.awsSdk.awsSdkStrings.STOPPING
  - typingsSlinky.awsSdk.awsSdkStrings.START_FAILED
  - typingsSlinky.awsSdk.awsSdkStrings.STOP_FAILED
  - java.lang.String
*/
trait State extends js.Object

object State {
  @scala.inline
  def OFFLINE: typingsSlinky.awsSdk.awsSdkStrings.OFFLINE = "OFFLINE".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.OFFLINE]
  @scala.inline
  def ONLINE: typingsSlinky.awsSdk.awsSdkStrings.ONLINE = "ONLINE".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.ONLINE]
  @scala.inline
  def STARTING: typingsSlinky.awsSdk.awsSdkStrings.STARTING = "STARTING".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.STARTING]
  @scala.inline
  def STOPPING: typingsSlinky.awsSdk.awsSdkStrings.STOPPING = "STOPPING".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.STOPPING]
  @scala.inline
  def START_FAILED: typingsSlinky.awsSdk.awsSdkStrings.START_FAILED = "START_FAILED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.START_FAILED]
  @scala.inline
  def STOP_FAILED: typingsSlinky.awsSdk.awsSdkStrings.STOP_FAILED = "STOP_FAILED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.STOP_FAILED]
  @scala.inline
  implicit def apply(value: String): State = value.asInstanceOf[State]
}

