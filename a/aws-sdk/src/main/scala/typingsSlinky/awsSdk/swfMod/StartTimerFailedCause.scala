package typingsSlinky.awsSdk.swfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.TIMER_ID_ALREADY_IN_USE
  - typingsSlinky.awsSdk.awsSdkStrings.OPEN_TIMERS_LIMIT_EXCEEDED
  - typingsSlinky.awsSdk.awsSdkStrings.TIMER_CREATION_RATE_EXCEEDED
  - typingsSlinky.awsSdk.awsSdkStrings.OPERATION_NOT_PERMITTED
  - java.lang.String
*/
trait StartTimerFailedCause extends js.Object

object StartTimerFailedCause {
  @scala.inline
  def TIMER_ID_ALREADY_IN_USE: typingsSlinky.awsSdk.awsSdkStrings.TIMER_ID_ALREADY_IN_USE = "TIMER_ID_ALREADY_IN_USE".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.TIMER_ID_ALREADY_IN_USE]
  @scala.inline
  def OPEN_TIMERS_LIMIT_EXCEEDED: typingsSlinky.awsSdk.awsSdkStrings.OPEN_TIMERS_LIMIT_EXCEEDED = "OPEN_TIMERS_LIMIT_EXCEEDED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.OPEN_TIMERS_LIMIT_EXCEEDED]
  @scala.inline
  def TIMER_CREATION_RATE_EXCEEDED: typingsSlinky.awsSdk.awsSdkStrings.TIMER_CREATION_RATE_EXCEEDED = "TIMER_CREATION_RATE_EXCEEDED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.TIMER_CREATION_RATE_EXCEEDED]
  @scala.inline
  def OPERATION_NOT_PERMITTED: typingsSlinky.awsSdk.awsSdkStrings.OPERATION_NOT_PERMITTED = "OPERATION_NOT_PERMITTED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.OPERATION_NOT_PERMITTED]
  @scala.inline
  implicit def apply(value: String): StartTimerFailedCause = value.asInstanceOf[StartTimerFailedCause]
}

