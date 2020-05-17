package typingsSlinky.awsSdk.swfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.START_TO_CLOSE
  - typingsSlinky.awsSdk.awsSdkStrings.SCHEDULE_TO_START
  - typingsSlinky.awsSdk.awsSdkStrings.SCHEDULE_TO_CLOSE
  - typingsSlinky.awsSdk.awsSdkStrings.HEARTBEAT
  - java.lang.String
*/
trait ActivityTaskTimeoutType extends js.Object

object ActivityTaskTimeoutType {
  @scala.inline
  def START_TO_CLOSE: typingsSlinky.awsSdk.awsSdkStrings.START_TO_CLOSE = "START_TO_CLOSE".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.START_TO_CLOSE]
  @scala.inline
  def SCHEDULE_TO_START: typingsSlinky.awsSdk.awsSdkStrings.SCHEDULE_TO_START = "SCHEDULE_TO_START".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.SCHEDULE_TO_START]
  @scala.inline
  def SCHEDULE_TO_CLOSE: typingsSlinky.awsSdk.awsSdkStrings.SCHEDULE_TO_CLOSE = "SCHEDULE_TO_CLOSE".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.SCHEDULE_TO_CLOSE]
  @scala.inline
  def HEARTBEAT: typingsSlinky.awsSdk.awsSdkStrings.HEARTBEAT = "HEARTBEAT".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.HEARTBEAT]
  @scala.inline
  implicit def apply(value: String): ActivityTaskTimeoutType = value.asInstanceOf[ActivityTaskTimeoutType]
}

