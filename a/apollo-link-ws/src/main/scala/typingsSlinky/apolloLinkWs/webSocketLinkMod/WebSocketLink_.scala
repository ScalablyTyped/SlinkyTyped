package typingsSlinky.apolloLinkWs.webSocketLinkMod

import typingsSlinky.apolloLink.mod.ApolloLink
import typingsSlinky.apolloLinkWs.webSocketLinkMod.WebSocketLink.Configuration
import typingsSlinky.subscriptionsTransportWs.mod.SubscriptionClient
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

