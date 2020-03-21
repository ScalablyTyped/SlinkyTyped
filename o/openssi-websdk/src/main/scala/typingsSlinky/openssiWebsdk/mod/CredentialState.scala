package typingsSlinky.openssiWebsdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.openssiWebsdk.openssiWebsdkStrings.outbound_request
  - typingsSlinky.openssiWebsdk.openssiWebsdkStrings.inbound_request
  - typingsSlinky.openssiWebsdk.openssiWebsdkStrings.outbound_offer
  - typingsSlinky.openssiWebsdk.openssiWebsdkStrings.inbound_offer
  - typingsSlinky.openssiWebsdk.openssiWebsdkStrings.accepted
  - typingsSlinky.openssiWebsdk.openssiWebsdkStrings.rejected
  - typingsSlinky.openssiWebsdk.openssiWebsdkStrings.issued
  - typingsSlinky.openssiWebsdk.openssiWebsdkStrings.stored
*/
trait CredentialState extends js.Object

object CredentialState {
  @scala.inline
  def accepted: typingsSlinky.openssiWebsdk.openssiWebsdkStrings.accepted = this.cast("accepted")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def inbound_offer: typingsSlinky.openssiWebsdk.openssiWebsdkStrings.inbound_offer = this.cast("inbound_offer")
  @scala.inline
  def inbound_request: typingsSlinky.openssiWebsdk.openssiWebsdkStrings.inbound_request = this.cast("inbound_request")
  @scala.inline
  def issued: typingsSlinky.openssiWebsdk.openssiWebsdkStrings.issued = this.cast("issued")
  @scala.inline
  def outbound_offer: typingsSlinky.openssiWebsdk.openssiWebsdkStrings.outbound_offer = this.cast("outbound_offer")
  @scala.inline
  def outbound_request: typingsSlinky.openssiWebsdk.openssiWebsdkStrings.outbound_request = this.cast("outbound_request")
  @scala.inline
  def rejected: typingsSlinky.openssiWebsdk.openssiWebsdkStrings.rejected = this.cast("rejected")
  @scala.inline
  def stored: typingsSlinky.openssiWebsdk.openssiWebsdkStrings.stored = this.cast("stored")
}

