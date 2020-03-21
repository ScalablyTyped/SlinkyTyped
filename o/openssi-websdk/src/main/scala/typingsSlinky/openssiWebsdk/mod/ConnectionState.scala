package typingsSlinky.openssiWebsdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.openssiWebsdk.openssiWebsdkStrings.inbound_offer
  - typingsSlinky.openssiWebsdk.openssiWebsdkStrings.outbound_offer
  - typingsSlinky.openssiWebsdk.openssiWebsdkStrings.connected
  - typingsSlinky.openssiWebsdk.openssiWebsdkStrings.rejected
*/
trait ConnectionState extends js.Object

object ConnectionState {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def connected: typingsSlinky.openssiWebsdk.openssiWebsdkStrings.connected = this.cast("connected")
  @scala.inline
  def inbound_offer: typingsSlinky.openssiWebsdk.openssiWebsdkStrings.inbound_offer = this.cast("inbound_offer")
  @scala.inline
  def outbound_offer: typingsSlinky.openssiWebsdk.openssiWebsdkStrings.outbound_offer = this.cast("outbound_offer")
  @scala.inline
  def rejected: typingsSlinky.openssiWebsdk.openssiWebsdkStrings.rejected = this.cast("rejected")
}

