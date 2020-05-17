package typingsSlinky.openfin

import typingsSlinky.openfin.anon.FnCall
import typingsSlinky.openfin.channelChannelMod.ChannelBase
import typingsSlinky.openfin.channelChannelMod.ProviderIdentity
import typingsSlinky.openfin.identityMod.Identity
import typingsSlinky.openfin.notificationMod.NotificationOptions
import typingsSlinky.openfin.transportMod.default
import typingsSlinky.openfin.wireMod.ConnectConfig
import typingsSlinky.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("openfin/_v2/main", JSImport.Namespace)
@js.native
object mainMod extends js.Object {
  @js.native
  class Application protected ()
    extends typingsSlinky.openfin.applicationMod.Application {
    def this(wire: default, identity: Identity) = this()
  }
  
  @js.native
  class ChannelClient protected ()
    extends typingsSlinky.openfin.clientMod.ChannelClient {
    def this(providerIdentity: ProviderIdentity, send: FnCall, channelMap: Map[String, ChannelBase]) = this()
  }
  
  @js.native
  class ChannelProvider protected ()
    extends typingsSlinky.openfin.providerMod.ChannelProvider {
    def this(providerIdentity: ProviderIdentity, send: FnCall) = this()
  }
  
  @js.native
  class Fin protected ()
    extends typingsSlinky.openfin.finMod.default {
    def this(wire: default) = this()
  }
  
  @js.native
  class Frame protected ()
    extends typingsSlinky.openfin.frameFrameMod.Frame {
    def this(wire: default, identity: Identity) = this()
  }
  
  @js.native
  class Notification protected ()
    extends typingsSlinky.openfin.notificationMod.Notification {
    def this(wire: default, options: NotificationOptions) = this()
  }
  
  @js.native
  class System protected ()
    extends typingsSlinky.openfin.systemSystemMod.default {
    def this(wire: default) = this()
  }
  
  @js.native
  class View protected ()
    extends typingsSlinky.openfin.viewViewMod.View {
    def this(wire: default, identity: Identity) = this()
  }
  
  @js.native
  class Window protected ()
    extends typingsSlinky.openfin.windowWindowMod.Window {
    def this(wire: default, identity: Identity) = this()
  }
  
  def connect(config: ConnectConfig): js.Promise[typingsSlinky.openfin.finMod.default] = js.native
  def launch(config: ConnectConfig): js.Promise[Double] = js.native
}

