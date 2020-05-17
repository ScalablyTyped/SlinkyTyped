package typingsSlinky.awsSdk.iotsecuretunnelingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.OPEN
  - typingsSlinky.awsSdk.awsSdkStrings.CLOSED
  - java.lang.String
*/
trait TunnelStatus extends js.Object

object TunnelStatus {
  @scala.inline
  def OPEN: typingsSlinky.awsSdk.awsSdkStrings.OPEN = "OPEN".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.OPEN]
  @scala.inline
  def CLOSED: typingsSlinky.awsSdk.awsSdkStrings.CLOSED = "CLOSED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.CLOSED]
  @scala.inline
  implicit def apply(value: String): TunnelStatus = value.asInstanceOf[TunnelStatus]
}

