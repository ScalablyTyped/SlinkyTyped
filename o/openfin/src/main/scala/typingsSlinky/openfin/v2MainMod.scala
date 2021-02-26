package typingsSlinky.openfin

import typingsSlinky.openfin.anon.FnCall
import typingsSlinky.openfin.clientMod.RoutingInfo
import typingsSlinky.openfin.identityMod.Identity
import typingsSlinky.openfin.notificationMod.NotificationOptions
import typingsSlinky.openfin.shapesIdentityMod.ProviderIdentity
import typingsSlinky.openfin.transportMod.default
import typingsSlinky.openfin.wireMod.ConnectConfig
import typingsSlinky.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object v2MainMod {
  
  @JSImport("openfin/_v2/main", "Application")
  @js.native
  class Application protected ()
    extends typingsSlinky.openfin.applicationMod.Application {
    def this(wire: default, identity: Identity) = this()
  }
  
  @JSImport("openfin/_v2/main", "ChannelClient")
  @js.native
  class ChannelClient protected ()
    extends typingsSlinky.openfin.clientMod.ChannelClient {
    def this(
      routingInfo: RoutingInfo,
      send: FnCall,
      clientMap: Map[String, typingsSlinky.openfin.clientMod.ChannelClient]
    ) = this()
  }
  
  @JSImport("openfin/_v2/main", "ChannelProvider")
  @js.native
  class ChannelProvider protected ()
    extends typingsSlinky.openfin.providerMod.ChannelProvider {
    def this(providerIdentity: ProviderIdentity, send: FnCall) = this()
  }
  
  @JSImport("openfin/_v2/main", "Fin")
  @js.native
  class Fin protected ()
    extends typingsSlinky.openfin.finMod.default {
    def this(wire: default) = this()
  }
  
  @JSImport("openfin/_v2/main", "Frame")
  @js.native
  class Frame protected ()
    extends typingsSlinky.openfin.frameFrameMod.Frame {
    def this(wire: default, identity: Identity) = this()
  }
  
  @JSImport("openfin/_v2/main", "Notification")
  @js.native
  class Notification protected ()
    extends typingsSlinky.openfin.notificationMod.Notification {
    def this(wire: default, options: NotificationOptions) = this()
  }
  
  @JSImport("openfin/_v2/main", "System")
  @js.native
  class System protected ()
    extends typingsSlinky.openfin.systemSystemMod.default {
    def this(wire: default) = this()
  }
  
  @JSImport("openfin/_v2/main", "View")
  @js.native
  class View protected ()
    extends typingsSlinky.openfin.viewViewMod.View {
    def this(wire: default, identity: Identity) = this()
  }
  
  @JSImport("openfin/_v2/main", "Window")
  @js.native
  class Window protected ()
    extends typingsSlinky.openfin.windowWindowMod.Window {
    def this(wire: default, identity: Identity) = this()
  }
  
  @JSImport("openfin/_v2/main", "connect")
  @js.native
  def connect(config: ConnectConfig): js.Promise[typingsSlinky.openfin.finMod.default] = js.native
  
  @JSImport("openfin/_v2/main", "launch")
  @js.native
  def launch(config: ConnectConfig): js.Promise[Double] = js.native
}
