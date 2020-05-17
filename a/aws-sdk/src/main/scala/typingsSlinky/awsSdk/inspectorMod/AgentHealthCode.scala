package typingsSlinky.awsSdk.inspectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.IDLE
  - typingsSlinky.awsSdk.awsSdkStrings.RUNNING
  - typingsSlinky.awsSdk.awsSdkStrings.SHUTDOWN
  - typingsSlinky.awsSdk.awsSdkStrings.UNHEALTHY
  - typingsSlinky.awsSdk.awsSdkStrings.THROTTLED
  - typingsSlinky.awsSdk.awsSdkStrings.UNKNOWN
  - java.lang.String
*/
trait AgentHealthCode extends js.Object

object AgentHealthCode {
  @scala.inline
  def IDLE: typingsSlinky.awsSdk.awsSdkStrings.IDLE = "IDLE".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.IDLE]
  @scala.inline
  def RUNNING: typingsSlinky.awsSdk.awsSdkStrings.RUNNING = "RUNNING".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.RUNNING]
  @scala.inline
  def SHUTDOWN: typingsSlinky.awsSdk.awsSdkStrings.SHUTDOWN = "SHUTDOWN".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.SHUTDOWN]
  @scala.inline
  def UNHEALTHY: typingsSlinky.awsSdk.awsSdkStrings.UNHEALTHY = "UNHEALTHY".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.UNHEALTHY]
  @scala.inline
  def THROTTLED: typingsSlinky.awsSdk.awsSdkStrings.THROTTLED = "THROTTLED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.THROTTLED]
  @scala.inline
  def UNKNOWN: typingsSlinky.awsSdk.awsSdkStrings.UNKNOWN = "UNKNOWN".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.UNKNOWN]
  @scala.inline
  implicit def apply(value: String): AgentHealthCode = value.asInstanceOf[AgentHealthCode]
}

