package typingsSlinky.burns

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.burns.anon.Exclude
import typingsSlinky.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("burns", JSImport.Namespace)
  @js.native
  val ^ : Burns = js.native
  
  /**
    * Burns
    */
  @js.native
  trait Burns extends StObject {
    
    def configure(): this.type = js.native
    def configure(config: Config): this.type = js.native
    
    def dispatch(eventName: String): this.type = js.native
    def dispatch(eventName: String, eventData: js.UndefOr[scala.Nothing], exclude: Exclude): this.type = js.native
    def dispatch(eventName: String, eventData: Record[String, _]): this.type = js.native
    def dispatch(eventName: String, eventData: Record[String, _], exclude: Exclude): this.type = js.native
    
    def registerEvents(newEvents: Record[String, EventHandler]): this.type = js.native
  }
  
  /**
    * Burns configuration settings
    */
  @js.native
  trait Config extends StObject {
    
    var broadcaster: js.UndefOr[String | Null] = js.native
    
    var defaultHandler: js.UndefOr[HandlerFn] = js.native
    
    var pusher: js.UndefOr[Record[String, _]] = js.native
  }
  object Config {
    
    @scala.inline
    def apply(): Config = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Config]
    }
    
    @scala.inline
    implicit class ConfigMutableBuilder[Self <: Config] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBroadcaster(value: String): Self = StObject.set(x, "broadcaster", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBroadcasterNull: Self = StObject.set(x, "broadcaster", null)
      
      @scala.inline
      def setBroadcasterUndefined: Self = StObject.set(x, "broadcaster", js.undefined)
      
      @scala.inline
      def setDefaultHandler(value: /* payload */ js.UndefOr[js.Any] => js.Any): Self = StObject.set(x, "defaultHandler", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDefaultHandlerUndefined: Self = StObject.set(x, "defaultHandler", js.undefined)
      
      @scala.inline
      def setPusher(value: Record[String, _]): Self = StObject.set(x, "pusher", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPusherUndefined: Self = StObject.set(x, "pusher", js.undefined)
    }
  }
  
  /**
    * Type Alias for event handlers
    */
  type EventHandler = Handlers | (Record[String, Handlers])
  
  /**
    * Function type for handling events
    */
  type HandlerFn = js.Function1[/* payload */ js.UndefOr[js.Any], js.Any]
  
  /**
    * This Type is an alias to the multiple
    * parameter types the `registerEvent` method accepts
    */
  type Handlers = String | HandlerFn | js.Array[HandlerFn]
  
  type _To = Burns
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Burns = ^
}
