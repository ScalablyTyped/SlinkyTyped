package typingsSlinky.awsSdk.iotsecuretunnelingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.CONNECTED
  - typingsSlinky.awsSdk.awsSdkStrings.DISCONNECTED
  - java.lang.String
*/
trait ConnectionStatus extends js.Object

object ConnectionStatus {
  @scala.inline
  def CONNECTED: typingsSlinky.awsSdk.awsSdkStrings.CONNECTED = "CONNECTED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.CONNECTED]
  @scala.inline
  def DISCONNECTED: typingsSlinky.awsSdk.awsSdkStrings.DISCONNECTED = "DISCONNECTED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.DISCONNECTED]
  @scala.inline
  implicit def apply(value: String): ConnectionStatus = value.asInstanceOf[ConnectionStatus]
}

