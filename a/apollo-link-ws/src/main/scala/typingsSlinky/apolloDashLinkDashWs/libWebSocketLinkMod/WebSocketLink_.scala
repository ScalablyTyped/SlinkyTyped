package typingsSlinky.apolloDashLinkDashWs.libWebSocketLinkMod

import typingsSlinky.apolloDashLink.apolloDashLinkMod.ApolloLink
import typingsSlinky.apolloDashLinkDashWs.libWebSocketLinkMod.WebSocketLink.Configuration
import typingsSlinky.subscriptionsDashTransportDashWs.subscriptionsDashTransportDashWsMod.SubscriptionClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-link-ws/lib/webSocketLink", "WebSocketLink")
@js.native
class WebSocketLink_ protected () extends ApolloLink {
  def this(paramsOrClient: Configuration) = this()
  def this(paramsOrClient: SubscriptionClient) = this()
  var subscriptionClient: js.Any = js.native
}

