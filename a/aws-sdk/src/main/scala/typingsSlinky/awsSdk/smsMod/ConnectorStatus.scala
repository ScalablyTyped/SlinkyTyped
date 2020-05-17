package typingsSlinky.awsSdk.smsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.HEALTHY
  - typingsSlinky.awsSdk.awsSdkStrings.UNHEALTHY
  - java.lang.String
*/
trait ConnectorStatus extends js.Object

object ConnectorStatus {
  @scala.inline
  def HEALTHY: typingsSlinky.awsSdk.awsSdkStrings.HEALTHY = "HEALTHY".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.HEALTHY]
  @scala.inline
  def UNHEALTHY: typingsSlinky.awsSdk.awsSdkStrings.UNHEALTHY = "UNHEALTHY".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.UNHEALTHY]
  @scala.inline
  implicit def apply(value: String): ConnectorStatus = value.asInstanceOf[ConnectorStatus]
}

