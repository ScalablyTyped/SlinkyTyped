package typingsSlinky.openfin.interappbusChannelMod

import typingsSlinky.openfin.baseMod.EmitterBase
import typingsSlinky.openfin.channelMod.ChannelEvents
import typingsSlinky.openfin.clientMod.ChannelClient
import typingsSlinky.openfin.providerMod.ChannelProvider
import typingsSlinky.openfin.shapesIdentityMod.ProviderIdentity
import typingsSlinky.openfin.transportMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("openfin/_v2/api/interappbus/channel", "Channel")
@js.native
class Channel protected () extends EmitterBase[ChannelEvents] {
  def this(wire: default) = this()
  
  /* protected */ def addChannelToClientMaps(channel: ChannelClient, channelId: String, endpointId: String): Unit = js.native
  
  /* protected */ def checkForPreviousClientConnection(channelId: String): Unit = js.native
  
  var clientMap: js.Any = js.native
  
  def connect(channelName: String): js.Promise[ChannelClient] = js.native
  def connect(channelName: String, options: ConnectOptions): js.Promise[ChannelClient] = js.native
  
  def create(channelName: String): js.Promise[ChannelProvider] = js.native
  
  var endpointIdMap: js.Any = js.native
  
  def getAllChannels(): js.Promise[js.Array[ProviderIdentity]] = js.native
  
  def onChannelConnect(listener: js.Function1[/* repeated */ js.Any, Unit]): js.Promise[Unit] = js.native
  
  def onChannelDisconnect(listener: js.Function1[/* repeated */ js.Any, Unit]): js.Promise[Unit] = js.native
  
  def onmessage(msg: ChannelMessage): Boolean = js.native
  
  var processChannelConnection: js.Any = js.native
  
  var processChannelMessage: js.Any = js.native
  
  var providerMap: js.Any = js.native
  
  /* protected */ def removeChannelFromClientMaps(channelId: String, endpointId: String): Unit = js.native
  
  /* protected */ def removeChannelFromProviderMap(channelId: String): Unit = js.native
}
