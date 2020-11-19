package typingsSlinky.openfin

import typingsSlinky.openfin.anon.FnCall
import typingsSlinky.openfin.clientMod.RoutingInfo
import typingsSlinky.openfin.finMod.default
import typingsSlinky.openfin.identityMod.Identity
import typingsSlinky.openfin.notificationMod.NotificationOptions
import typingsSlinky.openfin.shapesIdentityMod.ProviderIdentity
import typingsSlinky.openfin.wireMod.ConnectConfig
import typingsSlinky.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("openfin/_v2/main", JSImport.Namespace)
@js.native
object v2MainMod extends js.Object {
  
  def connect(config: ConnectConfig): js.Promise[default] = js.native
  
  def launch(config: ConnectConfig): js.Promise[Double] = js.native
  
  @js.native
  class Application protected ()
    extends typingsSlinky.openfin.applicationMod.Application {
    def this(wire: typingsSlinky.openfin.transportMod.default, identity: Identity) = this()
  }
  
  @js.native
  class ChannelClient protected ()
    extends typingsSlinky.openfin.clientMod.ChannelClient {
    def this(
      routingInfo: RoutingInfo,
      send: FnCall,
      clientMap: Map[String, typingsSlinky.openfin.clientMod.ChannelClient]
    ) = this()
  }
  
  @js.native
  class ChannelProvider protected ()
    extends typingsSlinky.openfin.providerMod.ChannelProvider {
    def this(providerIdentity: ProviderIdentity, send: FnCall) = this()
  }
  
  @js.native
  class Fin protected () extends default {
    def this(wire: typingsSlinky.openfin.transportMod.default) = this()
  }
  
  @js.native
  class Frame protected ()
    extends typingsSlinky.openfin.frameFrameMod.Frame {
    def this(wire: typingsSlinky.openfin.transportMod.default, identity: Identity) = this()
  }
  
  @js.native
  class Notification protected ()
    extends typingsSlinky.openfin.notificationMod.Notification {
    def this(wire: typingsSlinky.openfin.transportMod.default, options: NotificationOptions) = this()
  }
  
  @js.native
  class System protected ()
    extends typingsSlinky.openfin.systemSystemMod.default {
    def this(wire: typingsSlinky.openfin.transportMod.default) = this()
  }
  
  @js.native
  class View protected ()
    extends typingsSlinky.openfin.viewViewMod.View {
    def this(wire: typingsSlinky.openfin.transportMod.default, identity: Identity) = this()
  }
  
  @js.native
  class Window protected ()
    extends typingsSlinky.openfin.windowWindowMod.Window {
    def this(wire: typingsSlinky.openfin.transportMod.default, identity: Identity) = this()
  }
}
