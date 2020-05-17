package typingsSlinky.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.PENDING
  - typingsSlinky.awsSdk.awsSdkStrings.FULFILLED
  - typingsSlinky.awsSdk.awsSdkStrings.CANCELLED
  - typingsSlinky.awsSdk.awsSdkStrings.TIMED_OUT
  - typingsSlinky.awsSdk.awsSdkStrings.FAILED
  - java.lang.String
*/
trait GameSessionPlacementState extends js.Object

object GameSessionPlacementState {
  @scala.inline
  def PENDING: typingsSlinky.awsSdk.awsSdkStrings.PENDING = "PENDING".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.PENDING]
  @scala.inline
  def FULFILLED: typingsSlinky.awsSdk.awsSdkStrings.FULFILLED = "FULFILLED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.FULFILLED]
  @scala.inline
  def CANCELLED: typingsSlinky.awsSdk.awsSdkStrings.CANCELLED = "CANCELLED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.CANCELLED]
  @scala.inline
  def TIMED_OUT: typingsSlinky.awsSdk.awsSdkStrings.TIMED_OUT = "TIMED_OUT".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.TIMED_OUT]
  @scala.inline
  def FAILED: typingsSlinky.awsSdk.awsSdkStrings.FAILED = "FAILED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.FAILED]
  @scala.inline
  implicit def apply(value: String): GameSessionPlacementState = value.asInstanceOf[GameSessionPlacementState]
}

