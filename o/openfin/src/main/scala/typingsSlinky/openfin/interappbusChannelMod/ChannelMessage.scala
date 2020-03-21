package typingsSlinky.openfin.interappbusChannelMod

import typingsSlinky.openfin.channelChannelMod.ProviderIdentity
import typingsSlinky.openfin.identityMod.Identity
import typingsSlinky.openfin.transportMod.Message
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChannelMessage
  extends Message[js.Any] {
  var ackToSender: js.Any = js.native
  var connectAction: Boolean = js.native
  var providerIdentity: ProviderIdentity = js.native
  var senderIdentity: Identity = js.native
}

