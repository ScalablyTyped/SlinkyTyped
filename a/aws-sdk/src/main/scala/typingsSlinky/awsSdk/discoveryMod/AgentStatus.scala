package typingsSlinky.awsSdk.discoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.HEALTHY
  - typingsSlinky.awsSdk.awsSdkStrings.UNHEALTHY
  - typingsSlinky.awsSdk.awsSdkStrings.RUNNING
  - typingsSlinky.awsSdk.awsSdkStrings.UNKNOWN
  - typingsSlinky.awsSdk.awsSdkStrings.BLACKLISTED
  - typingsSlinky.awsSdk.awsSdkStrings.SHUTDOWN
  - java.lang.String
*/
trait AgentStatus extends js.Object

object AgentStatus {
  @scala.inline
  def HEALTHY: typingsSlinky.awsSdk.awsSdkStrings.HEALTHY = "HEALTHY".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.HEALTHY]
  @scala.inline
  def UNHEALTHY: typingsSlinky.awsSdk.awsSdkStrings.UNHEALTHY = "UNHEALTHY".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.UNHEALTHY]
  @scala.inline
  def RUNNING: typingsSlinky.awsSdk.awsSdkStrings.RUNNING = "RUNNING".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.RUNNING]
  @scala.inline
  def UNKNOWN: typingsSlinky.awsSdk.awsSdkStrings.UNKNOWN = "UNKNOWN".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.UNKNOWN]
  @scala.inline
  def BLACKLISTED: typingsSlinky.awsSdk.awsSdkStrings.BLACKLISTED = "BLACKLISTED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.BLACKLISTED]
  @scala.inline
  def SHUTDOWN: typingsSlinky.awsSdk.awsSdkStrings.SHUTDOWN = "SHUTDOWN".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.SHUTDOWN]
  @scala.inline
  implicit def apply(value: java.lang.String): AgentStatus = value.asInstanceOf[AgentStatus]
}

