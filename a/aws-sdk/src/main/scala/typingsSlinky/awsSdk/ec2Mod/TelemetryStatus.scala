package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.UP
  - typingsSlinky.awsSdk.awsSdkStrings.DOWN
  - java.lang.String
*/
trait TelemetryStatus extends js.Object

object TelemetryStatus {
  @scala.inline
  def UP: typingsSlinky.awsSdk.awsSdkStrings.UP = "UP".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.UP]
  @scala.inline
  def DOWN: typingsSlinky.awsSdk.awsSdkStrings.DOWN = "DOWN".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.DOWN]
  @scala.inline
  implicit def apply(value: java.lang.String): TelemetryStatus = value.asInstanceOf[TelemetryStatus]
}

