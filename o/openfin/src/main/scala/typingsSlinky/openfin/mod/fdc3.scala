package typingsSlinky.openfin.mod

import typingsSlinky.openfin.contextChannelsMod.AppChannelTransport
import typingsSlinky.openfin.contextChannelsMod.SystemChannelTransport
import typingsSlinky.openfin.identityMod.Identity
import typingsSlinky.openfin.openfinStrings.`channel-changed`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * When running within the OpenFin Runtime, and the `fdc3Api` flag in your manifest is set, your web applications will
  * have access to the "fdc3" namespace without the need to include additional source files. You can treat the "fdc3"
  * namespace as you would the "window", "navigator" or "document" objects.
  */
/* was `typeof imported_main` */
object fdc3 {
  
  @JSImport("openfin", "fdc3.AppChannel")
  @js.native
  class AppChannel protected ()
    extends typingsSlinky.openfin.mainMod.AppChannel {
    /**
      * @hidden
      *
      * Channel objects should not be created directly by an application, channel objects should be obtained by calling the relevant APIs.
      */
    def this(transport: AppChannelTransport) = this()
  }
  
  @JSImport("openfin", "fdc3.ApplicationError")
  @js.native
  object ApplicationError extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsSlinky.openfin.errorsMod.ApplicationError with String] = js.native
    
    /* "ApplicationError:LaunchError" */ val LaunchError: typingsSlinky.openfin.errorsMod.ApplicationError.LaunchError with String = js.native
    
    /* "ApplicationError:LaunchTimeout" */ val LaunchTimeout: typingsSlinky.openfin.errorsMod.ApplicationError.LaunchTimeout with String = js.native
    
    /* "ApplicationError:NotFound" */ val NotFound: typingsSlinky.openfin.errorsMod.ApplicationError.NotFound with String = js.native
  }
  type ApplicationError = typingsSlinky.openfin.errorsMod.ApplicationError
  
  @JSImport("openfin", "fdc3.ChannelBase")
  @js.native
  abstract class ChannelBase protected ()
    extends typingsSlinky.openfin.mainMod.ChannelBase {
    protected def this(id: String, `type`: String) = this()
  }
  
  @JSImport("openfin", "fdc3.ChannelError")
  @js.native
  object ChannelError extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsSlinky.openfin.errorsMod.ChannelError with String] = js.native
    
    /* "ChannelError:ChannelWithIdDoesNotExist" */ val ChannelWithIdDoesNotExist: typingsSlinky.openfin.errorsMod.ChannelError.ChannelWithIdDoesNotExist with String = js.native
  }
  type ChannelError = typingsSlinky.openfin.errorsMod.ChannelError
  
  @JSImport("openfin", "fdc3.ConnectionError")
  @js.native
  object ConnectionError extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsSlinky.openfin.errorsMod.ConnectionError with String] = js.native
    
    /* "ConnectionError:WindowWithIdentityNotFound" */ val WindowWithIdentityNotFound: typingsSlinky.openfin.errorsMod.ConnectionError.WindowWithIdentityNotFound with String = js.native
  }
  type ConnectionError = typingsSlinky.openfin.errorsMod.ConnectionError
  
  @JSImport("openfin", "fdc3.DefaultChannel")
  @js.native
  /**
    * @hidden
    *
    * Channel objects should not be created directly by an application, channel objects should be obtained by calling the relevant APIs.
    */
  class DefaultChannel_ ()
    extends typingsSlinky.openfin.mainMod.DefaultChannel_
  
  @JSImport("openfin", "fdc3.FDC3Error")
  @js.native
  class FDC3Error protected ()
    extends typingsSlinky.openfin.mainMod.FDC3Error {
    def this(code: String, message: String) = this()
  }
  
  @JSImport("openfin", "fdc3.Intents")
  @js.native
  object Intents extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsSlinky.openfin.intentsMod.Intents with String] = js.native
    
    /* "DialCall" */ val DIAL_CALL: typingsSlinky.openfin.intentsMod.Intents.DIAL_CALL with String = js.native
    
    /* "SaveContact" */ val SAVE_CONTACT: typingsSlinky.openfin.intentsMod.Intents.SAVE_CONTACT with String = js.native
    
    /* "SaveInstrument" */ val SAVE_INSTRUMENT: typingsSlinky.openfin.intentsMod.Intents.SAVE_INSTRUMENT with String = js.native
    
    /* "ShareContext" */ val SHARE_CONTEXT: typingsSlinky.openfin.intentsMod.Intents.SHARE_CONTEXT with String = js.native
    
    /* "StartCall" */ val START_CALL: typingsSlinky.openfin.intentsMod.Intents.START_CALL with String = js.native
    
    /* "StartChat" */ val START_CHAT: typingsSlinky.openfin.intentsMod.Intents.START_CHAT with String = js.native
    
    /* "ViewChart" */ val VIEW_CHART: typingsSlinky.openfin.intentsMod.Intents.VIEW_CHART with String = js.native
    
    /* "ViewContact" */ val VIEW_CONTACT: typingsSlinky.openfin.intentsMod.Intents.VIEW_CONTACT with String = js.native
    
    /* "ViewNews" */ val VIEW_NEWS: typingsSlinky.openfin.intentsMod.Intents.VIEW_NEWS with String = js.native
    
    /* "ViewQuote" */ val VIEW_QUOTE: typingsSlinky.openfin.intentsMod.Intents.VIEW_QUOTE with String = js.native
  }
  type Intents = typingsSlinky.openfin.intentsMod.Intents
  
  @JSImport("openfin", "fdc3.ResolveError")
  @js.native
  object ResolveError extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsSlinky.openfin.errorsMod.ResolveError with String] = js.native
    
    /* "ResolveError:AppDoesNotHandleIntent" */ val AppDoesNotHandleIntent: typingsSlinky.openfin.errorsMod.ResolveError.AppDoesNotHandleIntent with String = js.native
    
    /* "ResolveError:NoAppsFound" */ val NoAppsFound: typingsSlinky.openfin.errorsMod.ResolveError.NoAppsFound with String = js.native
    
    /* "ResolveError:ResolverClosedOrCancelled" */ val ResolverClosedOrCancelled: typingsSlinky.openfin.errorsMod.ResolveError.ResolverClosedOrCancelled with String = js.native
  }
  type ResolveError = typingsSlinky.openfin.errorsMod.ResolveError
  
  @JSImport("openfin", "fdc3.SendContextError")
  @js.native
  object SendContextError extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsSlinky.openfin.errorsMod.SendContextError with String] = js.native
    
    /* "SendContextError:HandlerError" */ val HandlerError: typingsSlinky.openfin.errorsMod.SendContextError.HandlerError with String = js.native
    
    /* "SendContextError:SendIntentTimeout" */ val HandlerTimeout: typingsSlinky.openfin.errorsMod.SendContextError.HandlerTimeout with String = js.native
    
    /* "SendContextError:NoHandler" */ val NoHandler: typingsSlinky.openfin.errorsMod.SendContextError.NoHandler with String = js.native
  }
  type SendContextError = typingsSlinky.openfin.errorsMod.SendContextError
  
  @JSImport("openfin", "fdc3.SystemChannel")
  @js.native
  class SystemChannel protected ()
    extends typingsSlinky.openfin.mainMod.SystemChannel {
    /**
      * @hidden
      *
      * Channel objects should not be created directly by an application, channel objects should be obtained by calling the relevant APIs.
      */
    def this(transport: SystemChannelTransport) = this()
  }
  
  @JSImport("openfin", "fdc3.addContextListener")
  @js.native
  def addContextListener(handler: js.Function1[/* context */ typingsSlinky.openfin.contextMod.Context, Unit]): typingsSlinky.openfin.mainMod.ContextListener = js.native
  
  @JSImport("openfin", "fdc3.addEventListener")
  @js.native
  def addEventListener_channelchanged(
    eventType: `channel-changed`,
    handler: js.Function1[/* event */ typingsSlinky.openfin.contextChannelsMod.ChannelChangedEvent, Unit]
  ): Unit = js.native
  
  @JSImport("openfin", "fdc3.addIntentListener")
  @js.native
  def addIntentListener(intent: String, handler: js.Function1[/* context */ typingsSlinky.openfin.contextMod.Context, _]): typingsSlinky.openfin.mainMod.IntentListener = js.native
  
  @JSImport("openfin", "fdc3.broadcast")
  @js.native
  def broadcast(context: typingsSlinky.openfin.contextMod.Context): js.Promise[Unit] = js.native
  
  @JSImport("openfin", "fdc3.defaultChannel")
  @js.native
  val defaultChannel: typingsSlinky.openfin.contextChannelsMod.DefaultChannel_ = js.native
  
  @JSImport("openfin", "fdc3.findIntent")
  @js.native
  def findIntent(intent: String): js.Promise[typingsSlinky.openfin.mainMod.AppIntent] = js.native
  @JSImport("openfin", "fdc3.findIntent")
  @js.native
  def findIntent(intent: String, context: typingsSlinky.openfin.contextMod.Context): js.Promise[typingsSlinky.openfin.mainMod.AppIntent] = js.native
  
  @JSImport("openfin", "fdc3.findIntentsByContext")
  @js.native
  def findIntentsByContext(context: typingsSlinky.openfin.contextMod.Context): js.Promise[js.Array[typingsSlinky.openfin.mainMod.AppIntent]] = js.native
  
  @JSImport("openfin", "fdc3.getChannelById")
  @js.native
  def getChannelById(channelId: typingsSlinky.openfin.contextChannelsMod.ChannelId): js.Promise[typingsSlinky.openfin.contextChannelsMod.Channel] = js.native
  
  @JSImport("openfin", "fdc3.getCurrentChannel")
  @js.native
  def getCurrentChannel(): js.Promise[typingsSlinky.openfin.contextChannelsMod.Channel] = js.native
  @JSImport("openfin", "fdc3.getCurrentChannel")
  @js.native
  def getCurrentChannel(identity: Identity): js.Promise[typingsSlinky.openfin.contextChannelsMod.Channel] = js.native
  
  @JSImport("openfin", "fdc3.getOrCreateAppChannel")
  @js.native
  def getOrCreateAppChannel(name: String): js.Promise[typingsSlinky.openfin.contextChannelsMod.AppChannel] = js.native
  
  @JSImport("openfin", "fdc3.getSystemChannels")
  @js.native
  def getSystemChannels(): js.Promise[js.Array[typingsSlinky.openfin.contextChannelsMod.SystemChannel]] = js.native
  
  @JSImport("openfin", "fdc3.open")
  @js.native
  def open(name: typingsSlinky.openfin.directoryMod.AppName): js.Promise[Unit] = js.native
  @JSImport("openfin", "fdc3.open")
  @js.native
  def open(
    name: typingsSlinky.openfin.directoryMod.AppName,
    context: typingsSlinky.openfin.contextMod.Context
  ): js.Promise[Unit] = js.native
  
  @JSImport("openfin", "fdc3.raiseIntent")
  @js.native
  def raiseIntent(intent: String, context: typingsSlinky.openfin.contextMod.Context): js.Promise[typingsSlinky.openfin.mainMod.IntentResolution] = js.native
  @JSImport("openfin", "fdc3.raiseIntent")
  @js.native
  def raiseIntent(
    intent: String,
    context: typingsSlinky.openfin.contextMod.Context,
    target: typingsSlinky.openfin.directoryMod.AppName
  ): js.Promise[typingsSlinky.openfin.mainMod.IntentResolution] = js.native
  
  @JSImport("openfin", "fdc3.removeEventListener")
  @js.native
  def removeEventListener_channelchanged(
    eventType: `channel-changed`,
    handler: js.Function1[/* event */ typingsSlinky.openfin.contextChannelsMod.ChannelChangedEvent, Unit]
  ): Unit = js.native
  
  type AppDirIntent = typingsSlinky.openfin.directoryMod.AppDirIntent
  
  type AppId = typingsSlinky.openfin.directoryMod.AppId
  
  type AppImage = typingsSlinky.openfin.directoryMod.AppImage
  
  type AppIntent = typingsSlinky.openfin.mainMod.AppIntent
  
  type AppName = typingsSlinky.openfin.directoryMod.AppName
  
  type Application = typingsSlinky.openfin.directoryMod.Application
  
  type Channel = typingsSlinky.openfin.contextChannelsMod.Channel
  
  type ChannelChangedEvent = typingsSlinky.openfin.contextChannelsMod.ChannelChangedEvent
  
  type ChannelContextListener = typingsSlinky.openfin.contextChannelsMod.ChannelContextListener
  
  type ChannelId = typingsSlinky.openfin.contextChannelsMod.ChannelId
  
  type ChannelWindowAddedEvent = typingsSlinky.openfin.contextChannelsMod.ChannelWindowAddedEvent
  
  type ChannelWindowRemovedEvent = typingsSlinky.openfin.contextChannelsMod.ChannelWindowRemovedEvent
  
  type ContactContext = typingsSlinky.openfin.contextMod.ContactContext
  
  type Context = typingsSlinky.openfin.contextMod.Context
  
  type ContextListener = typingsSlinky.openfin.mainMod.ContextListener
  
  type DefaultChannel = typingsSlinky.openfin.mainMod.DefaultChannel_
  
  type DisplayMetadata = typingsSlinky.openfin.contextChannelsMod.DisplayMetadata
  
  type Icon = typingsSlinky.openfin.directoryMod.Icon
  
  type InstrumentContext = typingsSlinky.openfin.contextMod.InstrumentContext
  
  type IntentListener = typingsSlinky.openfin.mainMod.IntentListener
  
  type IntentMetadata = typingsSlinky.openfin.mainMod.IntentMetadata
  
  type IntentResolution = typingsSlinky.openfin.mainMod.IntentResolution
  
  type Listener = typingsSlinky.openfin.mainMod.Listener
  
  type NameValuePair = typingsSlinky.openfin.directoryMod.NameValuePair
  
  type OrganizationContext = typingsSlinky.openfin.contextMod.OrganizationContext
}
