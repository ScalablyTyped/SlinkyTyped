package typingsSlinky.openfin.clientMod

import typingsSlinky.openfin.anon.FnCall
import typingsSlinky.openfin.channelChannelMod.ChannelBase
import typingsSlinky.openfin.shapesIdentityMod.ProviderIdentity
import typingsSlinky.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("openfin/_v2/api/interappbus/channel/client", "ChannelClient")
@js.native
class ChannelClient protected () extends ChannelBase {
  def this(routingInfo: RoutingInfo, send: FnCall, clientMap: Map[String, ChannelClient]) = this()
  
  var clientMap: js.Any = js.native
  
  def disconnect(): js.Promise[Unit] = js.native
  
  var disconnectListener: js.Any = js.native
  
  def dispatch(action: String): js.Promise[_] = js.native
  def dispatch(action: String, payload: js.Any): js.Promise[_] = js.native
  
  var endpointId: js.Any = js.native
  
  def onDisconnection(listener: DisconnectionListener): Unit = js.native
  
  def providerIdentity: ProviderIdentity = js.native
}
