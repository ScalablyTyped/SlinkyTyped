package typingsSlinky.awsSdk.kmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.CONNECTED
  - typingsSlinky.awsSdk.awsSdkStrings.CONNECTING
  - typingsSlinky.awsSdk.awsSdkStrings.FAILED
  - typingsSlinky.awsSdk.awsSdkStrings.DISCONNECTED
  - typingsSlinky.awsSdk.awsSdkStrings.DISCONNECTING
  - java.lang.String
*/
trait ConnectionStateType extends js.Object

object ConnectionStateType {
  @scala.inline
  def CONNECTED: typingsSlinky.awsSdk.awsSdkStrings.CONNECTED = "CONNECTED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.CONNECTED]
  @scala.inline
  def CONNECTING: typingsSlinky.awsSdk.awsSdkStrings.CONNECTING = "CONNECTING".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.CONNECTING]
  @scala.inline
  def FAILED: typingsSlinky.awsSdk.awsSdkStrings.FAILED = "FAILED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.FAILED]
  @scala.inline
  def DISCONNECTED: typingsSlinky.awsSdk.awsSdkStrings.DISCONNECTED = "DISCONNECTED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.DISCONNECTED]
  @scala.inline
  def DISCONNECTING: typingsSlinky.awsSdk.awsSdkStrings.DISCONNECTING = "DISCONNECTING".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.DISCONNECTING]
  @scala.inline
  implicit def apply(value: String): ConnectionStateType = value.asInstanceOf[ConnectionStateType]
}

