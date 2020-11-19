package typingsSlinky.openfin.mod.fdc3

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typingsSlinky.openfin.contextChannelsMod.AppChannelTransport
import typingsSlinky.openfin.contextChannelsMod.SystemChannelTransport
import typingsSlinky.openfin.identityMod.Identity
import typingsSlinky.openfin.mainMod.DefaultChannel_
import typingsSlinky.openfin.openfinStrings.`channel-changed`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("openfin", "fdc3")
@js.native
object ^ extends js.Object {
  
  var AppChannel: Instantiable1[/* transport */ AppChannelTransport, typingsSlinky.openfin.mainMod.AppChannel] = js.native
  
  var ChannelBase: Instantiable2[/* id */ String, /* type */ String, typingsSlinky.openfin.mainMod.ChannelBase] = js.native
  
  var DefaultChannel: Instantiable0[DefaultChannel_] = js.native
  
  var FDC3Error: Instantiable2[/* code */ String, /* message */ String, typingsSlinky.openfin.mainMod.FDC3Error] = js.native
  
  var SystemChannel: Instantiable1[
    /* transport */ SystemChannelTransport, 
    typingsSlinky.openfin.mainMod.SystemChannel
  ] = js.native
  
  def addContextListener(handler: js.Function1[/* context */ typingsSlinky.openfin.contextMod.Context, Unit]): typingsSlinky.openfin.mainMod.ContextListener = js.native
  
  @JSName("addEventListener")
  def addEventListener_channelchanged(
    eventType: `channel-changed`,
    handler: js.Function1[/* event */ typingsSlinky.openfin.contextChannelsMod.ChannelChangedEvent, Unit]
  ): Unit = js.native
  
  def addIntentListener(intent: String, handler: js.Function1[/* context */ typingsSlinky.openfin.contextMod.Context, _]): typingsSlinky.openfin.mainMod.IntentListener = js.native
  
  def broadcast(context: typingsSlinky.openfin.contextMod.Context): js.Promise[Unit] = js.native
  
  val defaultChannel: typingsSlinky.openfin.contextChannelsMod.DefaultChannel_ = js.native
  
  def findIntent(intent: String): js.Promise[typingsSlinky.openfin.mainMod.AppIntent] = js.native
  def findIntent(intent: String, context: typingsSlinky.openfin.contextMod.Context): js.Promise[typingsSlinky.openfin.mainMod.AppIntent] = js.native
  
  def findIntentsByContext(context: typingsSlinky.openfin.contextMod.Context): js.Promise[js.Array[typingsSlinky.openfin.mainMod.AppIntent]] = js.native
  
  def getChannelById(channelId: typingsSlinky.openfin.contextChannelsMod.ChannelId): js.Promise[typingsSlinky.openfin.contextChannelsMod.Channel] = js.native
  
  def getCurrentChannel(): js.Promise[typingsSlinky.openfin.contextChannelsMod.Channel] = js.native
  def getCurrentChannel(identity: Identity): js.Promise[typingsSlinky.openfin.contextChannelsMod.Channel] = js.native
  
  def getOrCreateAppChannel(name: String): js.Promise[typingsSlinky.openfin.contextChannelsMod.AppChannel] = js.native
  
  def getSystemChannels(): js.Promise[js.Array[typingsSlinky.openfin.contextChannelsMod.SystemChannel]] = js.native
  
  def open(name: typingsSlinky.openfin.directoryMod.AppName): js.Promise[Unit] = js.native
  def open(
    name: typingsSlinky.openfin.directoryMod.AppName,
    context: typingsSlinky.openfin.contextMod.Context
  ): js.Promise[Unit] = js.native
  
  def raiseIntent(intent: String, context: typingsSlinky.openfin.contextMod.Context): js.Promise[typingsSlinky.openfin.mainMod.IntentResolution] = js.native
  def raiseIntent(
    intent: String,
    context: typingsSlinky.openfin.contextMod.Context,
    target: typingsSlinky.openfin.directoryMod.AppName
  ): js.Promise[typingsSlinky.openfin.mainMod.IntentResolution] = js.native
  
  @JSName("removeEventListener")
  def removeEventListener_channelchanged(
    eventType: `channel-changed`,
    handler: js.Function1[/* event */ typingsSlinky.openfin.contextChannelsMod.ChannelChangedEvent, Unit]
  ): Unit = js.native
}
