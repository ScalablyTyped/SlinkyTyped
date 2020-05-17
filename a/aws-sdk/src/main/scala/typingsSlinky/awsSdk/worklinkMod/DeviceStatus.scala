package typingsSlinky.awsSdk.worklinkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.ACTIVE
  - typingsSlinky.awsSdk.awsSdkStrings.SIGNED_OUT
  - java.lang.String
*/
trait DeviceStatus extends js.Object

object DeviceStatus {
  @scala.inline
  def ACTIVE: typingsSlinky.awsSdk.awsSdkStrings.ACTIVE = "ACTIVE".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.ACTIVE]
  @scala.inline
  def SIGNED_OUT: typingsSlinky.awsSdk.awsSdkStrings.SIGNED_OUT = "SIGNED_OUT".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.SIGNED_OUT]
  @scala.inline
  implicit def apply(value: String): DeviceStatus = value.asInstanceOf[DeviceStatus]
}

