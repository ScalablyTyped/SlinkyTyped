package typingsSlinky.openfin

import typingsSlinky.openfin.contextChannelsMod.AppChannelTransport
import typingsSlinky.openfin.contextChannelsMod.Channel
import typingsSlinky.openfin.contextChannelsMod.ChannelChangedEvent
import typingsSlinky.openfin.contextChannelsMod.ChannelId
import typingsSlinky.openfin.contextChannelsMod.SystemChannelTransport
import typingsSlinky.openfin.contextMod.Context
import typingsSlinky.openfin.directoryMod.AppName
import typingsSlinky.openfin.directoryMod.Application
import typingsSlinky.openfin.identityMod.Identity
import typingsSlinky.openfin.openfinStrings.`channel-changed`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mainMod {
  
  @JSImport("openfin/_v2/fdc3/main", "AppChannel")
  @js.native
  class AppChannel protected ()
    extends typingsSlinky.openfin.contextChannelsMod.AppChannel {
    /**
      * @hidden
      *
      * Channel objects should not be created directly by an application, channel objects should be obtained by calling the relevant APIs.
      */
    def this(transport: AppChannelTransport) = this()
  }
  
  @JSImport("openfin/_v2/fdc3/main", "ApplicationError")
  @js.native
  object ApplicationError extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsSlinky.openfin.errorsMod.ApplicationError with String] = js.native
    
    /* "ApplicationError:LaunchError" */ val LaunchError: typingsSlinky.openfin.errorsMod.ApplicationError.LaunchError with String = js.native
    
    /* "ApplicationError:LaunchTimeout" */ val LaunchTimeout: typingsSlinky.openfin.errorsMod.ApplicationError.LaunchTimeout with String = js.native
    
    /* "ApplicationError:NotFound" */ val NotFound: typingsSlinky.openfin.errorsMod.ApplicationError.NotFound with String = js.native
  }
  
  @JSImport("openfin/_v2/fdc3/main", "ChannelBase")
  @js.native
  abstract class ChannelBase protected ()
    extends typingsSlinky.openfin.contextChannelsMod.ChannelBase {
    protected def this(id: String, `type`: String) = this()
  }
  
  @JSImport("openfin/_v2/fdc3/main", "ChannelError")
  @js.native
  object ChannelError extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsSlinky.openfin.errorsMod.ChannelError with String] = js.native
    
    /* "ChannelError:ChannelWithIdDoesNotExist" */ val ChannelWithIdDoesNotExist: typingsSlinky.openfin.errorsMod.ChannelError.ChannelWithIdDoesNotExist with String = js.native
  }
  
  @JSImport("openfin/_v2/fdc3/main", "ConnectionError")
  @js.native
  object ConnectionError extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsSlinky.openfin.errorsMod.ConnectionError with String] = js.native
    
    /* "ConnectionError:WindowWithIdentityNotFound" */ val WindowWithIdentityNotFound: typingsSlinky.openfin.errorsMod.ConnectionError.WindowWithIdentityNotFound with String = js.native
  }
  
  @JSImport("openfin/_v2/fdc3/main", "DefaultChannel")
  @js.native
  /**
    * @hidden
    *
    * Channel objects should not be created directly by an application, channel objects should be obtained by calling the relevant APIs.
    */
  class DefaultChannel_ ()
    extends typingsSlinky.openfin.contextChannelsMod.DefaultChannel_
  
  @JSImport("openfin/_v2/fdc3/main", "FDC3Error")
  @js.native
  class FDC3Error protected ()
    extends typingsSlinky.openfin.errorsMod.FDC3Error {
    def this(code: String, message: String) = this()
  }
  
  @JSImport("openfin/_v2/fdc3/main", "Intents")
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
  
  @JSImport("openfin/_v2/fdc3/main", "ResolveError")
  @js.native
  object ResolveError extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsSlinky.openfin.errorsMod.ResolveError with String] = js.native
    
    /* "ResolveError:AppDoesNotHandleIntent" */ val AppDoesNotHandleIntent: typingsSlinky.openfin.errorsMod.ResolveError.AppDoesNotHandleIntent with String = js.native
    
    /* "ResolveError:NoAppsFound" */ val NoAppsFound: typingsSlinky.openfin.errorsMod.ResolveError.NoAppsFound with String = js.native
    
    /* "ResolveError:ResolverClosedOrCancelled" */ val ResolverClosedOrCancelled: typingsSlinky.openfin.errorsMod.ResolveError.ResolverClosedOrCancelled with String = js.native
  }
  
  @JSImport("openfin/_v2/fdc3/main", "SendContextError")
  @js.native
  object SendContextError extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsSlinky.openfin.errorsMod.SendContextError with String] = js.native
    
    /* "SendContextError:HandlerError" */ val HandlerError: typingsSlinky.openfin.errorsMod.SendContextError.HandlerError with String = js.native
    
    /* "SendContextError:SendIntentTimeout" */ val HandlerTimeout: typingsSlinky.openfin.errorsMod.SendContextError.HandlerTimeout with String = js.native
    
    /* "SendContextError:NoHandler" */ val NoHandler: typingsSlinky.openfin.errorsMod.SendContextError.NoHandler with String = js.native
  }
  
  @JSImport("openfin/_v2/fdc3/main", "SystemChannel")
  @js.native
  class SystemChannel protected ()
    extends typingsSlinky.openfin.contextChannelsMod.SystemChannel {
    /**
      * @hidden
      *
      * Channel objects should not be created directly by an application, channel objects should be obtained by calling the relevant APIs.
      */
    def this(transport: SystemChannelTransport) = this()
  }
  
  @JSImport("openfin/_v2/fdc3/main", "addContextListener")
  @js.native
  def addContextListener(handler: js.Function1[/* context */ Context, Unit]): ContextListener = js.native
  
  @JSImport("openfin/_v2/fdc3/main", "addEventListener")
  @js.native
  def addEventListener_channelchanged(eventType: `channel-changed`, handler: js.Function1[/* event */ ChannelChangedEvent, Unit]): Unit = js.native
  
  @JSImport("openfin/_v2/fdc3/main", "addIntentListener")
  @js.native
  def addIntentListener(intent: String, handler: js.Function1[/* context */ Context, _]): IntentListener = js.native
  
  @JSImport("openfin/_v2/fdc3/main", "broadcast")
  @js.native
  def broadcast(context: Context): js.Promise[Unit] = js.native
  
  @JSImport("openfin/_v2/fdc3/main", "defaultChannel")
  @js.native
  val defaultChannel: typingsSlinky.openfin.contextChannelsMod.DefaultChannel_ = js.native
  
  @JSImport("openfin/_v2/fdc3/main", "findIntent")
  @js.native
  def findIntent(intent: String): js.Promise[AppIntent] = js.native
  @JSImport("openfin/_v2/fdc3/main", "findIntent")
  @js.native
  def findIntent(intent: String, context: Context): js.Promise[AppIntent] = js.native
  
  @JSImport("openfin/_v2/fdc3/main", "findIntentsByContext")
  @js.native
  def findIntentsByContext(context: Context): js.Promise[js.Array[AppIntent]] = js.native
  
  @JSImport("openfin/_v2/fdc3/main", "getChannelById")
  @js.native
  def getChannelById(channelId: ChannelId): js.Promise[Channel] = js.native
  
  @JSImport("openfin/_v2/fdc3/main", "getCurrentChannel")
  @js.native
  def getCurrentChannel(): js.Promise[Channel] = js.native
  @JSImport("openfin/_v2/fdc3/main", "getCurrentChannel")
  @js.native
  def getCurrentChannel(identity: Identity): js.Promise[Channel] = js.native
  
  @JSImport("openfin/_v2/fdc3/main", "getOrCreateAppChannel")
  @js.native
  def getOrCreateAppChannel(name: String): js.Promise[typingsSlinky.openfin.contextChannelsMod.AppChannel] = js.native
  
  @JSImport("openfin/_v2/fdc3/main", "getSystemChannels")
  @js.native
  def getSystemChannels(): js.Promise[js.Array[typingsSlinky.openfin.contextChannelsMod.SystemChannel]] = js.native
  
  @JSImport("openfin/_v2/fdc3/main", "open")
  @js.native
  def open(name: AppName): js.Promise[Unit] = js.native
  @JSImport("openfin/_v2/fdc3/main", "open")
  @js.native
  def open(name: AppName, context: Context): js.Promise[Unit] = js.native
  
  @JSImport("openfin/_v2/fdc3/main", "raiseIntent")
  @js.native
  def raiseIntent(intent: String, context: Context): js.Promise[IntentResolution] = js.native
  @JSImport("openfin/_v2/fdc3/main", "raiseIntent")
  @js.native
  def raiseIntent(intent: String, context: Context, target: AppName): js.Promise[IntentResolution] = js.native
  
  @JSImport("openfin/_v2/fdc3/main", "removeEventListener")
  @js.native
  def removeEventListener_channelchanged(eventType: `channel-changed`, handler: js.Function1[/* event */ ChannelChangedEvent, Unit]): Unit = js.native
  
  @js.native
  trait AppIntent extends StObject {
    
    /**
      * An array of applications that are associated with this intent.
      */
    var apps: js.Array[Application] = js.native
    
    /**
      * Descriptor of this intent.
      */
    var intent: IntentMetadata = js.native
  }
  object AppIntent {
    
    @scala.inline
    def apply(apps: js.Array[Application], intent: IntentMetadata): AppIntent = {
      val __obj = js.Dynamic.literal(apps = apps.asInstanceOf[js.Any], intent = intent.asInstanceOf[js.Any])
      __obj.asInstanceOf[AppIntent]
    }
    
    @scala.inline
    implicit class AppIntentMutableBuilder[Self <: AppIntent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApps(value: js.Array[Application]): Self = StObject.set(x, "apps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAppsVarargs(value: Application*): Self = StObject.set(x, "apps", js.Array(value :_*))
      
      @scala.inline
      def setIntent(value: IntentMetadata): Self = StObject.set(x, "intent", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ContextListener extends Listener {
    
    /**
      * The handler for when this listener receives a context broadcast.
      */
    def handler(context: Context): Unit = js.native
    
    /**
      * Unsubscribe the listener object. We will no longer receive context messages on this handler.
      *
      * Calling this method has no effect if the listener has already been unsubscribed. To re-subscribe, call
      * [[addContextListener]] again to create a new listener object.
      */
    def unsubscribe(): Unit = js.native
  }
  object ContextListener {
    
    @scala.inline
    def apply(handler: Context => Unit, unsubscribe: () => Unit): ContextListener = {
      val __obj = js.Dynamic.literal(handler = js.Any.fromFunction1(handler), unsubscribe = js.Any.fromFunction0(unsubscribe))
      __obj.asInstanceOf[ContextListener]
    }
    
    @scala.inline
    implicit class ContextListenerMutableBuilder[Self <: ContextListener] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHandler(value: Context => Unit): Self = StObject.set(x, "handler", js.Any.fromFunction1(value))
      
      @scala.inline
      def setUnsubscribe(value: () => Unit): Self = StObject.set(x, "unsubscribe", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait IntentListener extends Listener {
    
    /**
      * The handler for when this listener receives an intent.
      */
    def handler(context: Context): js.Any | js.Promise[_] = js.native
    
    /**
      * The intent name that we are listening to. Is whatever is passed into [[addIntentListener]].
      */
    var intent: String = js.native
    
    /**
      * Unsubscribe the listener object. We will no longer receive intent messages on this handler.
      *
      * Calling this method has no effect if the listener has already been unsubscribed. To re-subscribe, call
      * [[addIntentListener]] again to create a new listener object.
      */
    def unsubscribe(): Unit = js.native
  }
  object IntentListener {
    
    @scala.inline
    def apply(handler: Context => js.Any | js.Promise[_], intent: String, unsubscribe: () => Unit): IntentListener = {
      val __obj = js.Dynamic.literal(handler = js.Any.fromFunction1(handler), intent = intent.asInstanceOf[js.Any], unsubscribe = js.Any.fromFunction0(unsubscribe))
      __obj.asInstanceOf[IntentListener]
    }
    
    @scala.inline
    implicit class IntentListenerMutableBuilder[Self <: IntentListener] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHandler(value: Context => js.Any | js.Promise[_]): Self = StObject.set(x, "handler", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIntent(value: String): Self = StObject.set(x, "intent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnsubscribe(value: () => Unit): Self = StObject.set(x, "unsubscribe", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait IntentMetadata extends StObject {
    
    /**
      * The human-readable name of the intent.
      */
    var displayName: String = js.native
    
    /**
      * The machine readable name of the intent.
      */
    var name: String = js.native
  }
  object IntentMetadata {
    
    @scala.inline
    def apply(displayName: String, name: String): IntentMetadata = {
      val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[IntentMetadata]
    }
    
    @scala.inline
    implicit class IntentMetadataMutableBuilder[Self <: IntentMetadata] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IntentResolution extends StObject {
    
    /**
      * Any data returned by the target application's intent listener.
      *
      * If the target application registered multiple listeners, this will be the first non-`undefined` value returned
      * by a listener.
      */
    var data: js.UndefOr[js.Any] = js.native
    
    /**
      * The machine-readable name of the app that resolved this intent.
      */
    var source: AppName = js.native
    
    /**
      * For future use. Right now always the string `'1.0.0'`.
      */
    var version: String = js.native
  }
  object IntentResolution {
    
    @scala.inline
    def apply(source: AppName, version: String): IntentResolution = {
      val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[IntentResolution]
    }
    
    @scala.inline
    implicit class IntentResolutionMutableBuilder[Self <: IntentResolution] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setSource(value: AppName): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.openfin.mainMod.ContextListener
    - typingsSlinky.openfin.mainMod.IntentListener
    - typingsSlinky.openfin.contextChannelsMod.ChannelContextListener
  */
  trait Listener extends StObject
  object Listener {
    
    @scala.inline
    def ChannelContextListener(channel: Channel, handler: Context => Unit, unsubscribe: () => Unit): typingsSlinky.openfin.contextChannelsMod.ChannelContextListener = {
      val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], handler = js.Any.fromFunction1(handler), unsubscribe = js.Any.fromFunction0(unsubscribe))
      __obj.asInstanceOf[typingsSlinky.openfin.contextChannelsMod.ChannelContextListener]
    }
    
    @scala.inline
    def ContextListener(handler: Context => Unit, unsubscribe: () => Unit): typingsSlinky.openfin.mainMod.ContextListener = {
      val __obj = js.Dynamic.literal(handler = js.Any.fromFunction1(handler), unsubscribe = js.Any.fromFunction0(unsubscribe))
      __obj.asInstanceOf[typingsSlinky.openfin.mainMod.ContextListener]
    }
    
    @scala.inline
    def IntentListener(handler: Context => js.Any | js.Promise[_], intent: String, unsubscribe: () => Unit): typingsSlinky.openfin.mainMod.IntentListener = {
      val __obj = js.Dynamic.literal(handler = js.Any.fromFunction1(handler), intent = intent.asInstanceOf[js.Any], unsubscribe = js.Any.fromFunction0(unsubscribe))
      __obj.asInstanceOf[typingsSlinky.openfin.mainMod.IntentListener]
    }
  }
}
