package typingsSlinky.awsSdk.dataexchangeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.WAITING
  - typingsSlinky.awsSdk.awsSdkStrings.IN_PROGRESS
  - typingsSlinky.awsSdk.awsSdkStrings.ERROR
  - typingsSlinky.awsSdk.awsSdkStrings.COMPLETED
  - typingsSlinky.awsSdk.awsSdkStrings.CANCELLED
  - typingsSlinky.awsSdk.awsSdkStrings.TIMED_OUT
  - java.lang.String
*/
trait State extends js.Object

object State {
  @scala.inline
  def WAITING: typingsSlinky.awsSdk.awsSdkStrings.WAITING = "WAITING".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.WAITING]
  @scala.inline
  def IN_PROGRESS: typingsSlinky.awsSdk.awsSdkStrings.IN_PROGRESS = "IN_PROGRESS".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.IN_PROGRESS]
  @scala.inline
  def ERROR: typingsSlinky.awsSdk.awsSdkStrings.ERROR = "ERROR".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.ERROR]
  @scala.inline
  def COMPLETED: typingsSlinky.awsSdk.awsSdkStrings.COMPLETED = "COMPLETED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.COMPLETED]
  @scala.inline
  def CANCELLED: typingsSlinky.awsSdk.awsSdkStrings.CANCELLED = "CANCELLED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.CANCELLED]
  @scala.inline
  def TIMED_OUT: typingsSlinky.awsSdk.awsSdkStrings.TIMED_OUT = "TIMED_OUT".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.TIMED_OUT]
  @scala.inline
  implicit def apply(value: String): State = value.asInstanceOf[State]
}

