package typingsSlinky.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.READY
  - typingsSlinky.awsSdk.awsSdkStrings.PENDING
  - typingsSlinky.awsSdk.awsSdkStrings.WAS_OFFLINE
  - typingsSlinky.awsSdk.awsSdkStrings.DEREGISTERED
  - typingsSlinky.awsSdk.awsSdkStrings.FAILED
  - java.lang.String
*/
trait DeviceStatus extends js.Object

object DeviceStatus {
  @scala.inline
  def READY: typingsSlinky.awsSdk.awsSdkStrings.READY = "READY".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.READY]
  @scala.inline
  def PENDING: typingsSlinky.awsSdk.awsSdkStrings.PENDING = "PENDING".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.PENDING]
  @scala.inline
  def WAS_OFFLINE: typingsSlinky.awsSdk.awsSdkStrings.WAS_OFFLINE = "WAS_OFFLINE".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.WAS_OFFLINE]
  @scala.inline
  def DEREGISTERED: typingsSlinky.awsSdk.awsSdkStrings.DEREGISTERED = "DEREGISTERED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.DEREGISTERED]
  @scala.inline
  def FAILED: typingsSlinky.awsSdk.awsSdkStrings.FAILED = "FAILED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.FAILED]
  @scala.inline
  implicit def apply(value: String): DeviceStatus = value.asInstanceOf[DeviceStatus]
}

