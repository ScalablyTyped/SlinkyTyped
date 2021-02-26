package typingsSlinky.expressFrappe

import typingsSlinky.bodyParser.mod.OptionsJson
import typingsSlinky.bodyParser.mod.OptionsUrlencoded
import typingsSlinky.node.httpMod.ServerResponse
import typingsSlinky.serveStatic.mod.ServeStaticOptions
import typingsSlinky.socketIo.mod.Server
import typingsSlinky.socketIo.mod.Socket
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Json extends StObject {
    
    var json: js.UndefOr[Boolean | OptionsJson] = js.native
    
    var urlencoded: js.UndefOr[Boolean | OptionsUrlencoded] = js.native
  }
  object Json {
    
    @scala.inline
    def apply(): Json = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Json]
    }
    
    @scala.inline
    implicit class JsonMutableBuilder[Self <: Json] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setJson(value: Boolean | OptionsJson): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJsonUndefined: Self = StObject.set(x, "json", js.undefined)
      
      @scala.inline
      def setUrlencoded(value: Boolean | OptionsUrlencoded): Self = StObject.set(x, "urlencoded", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlencodedUndefined: Self = StObject.set(x, "urlencoded", js.undefined)
    }
  }
  
  @js.native
  trait Options extends StObject {
    
    var options: js.UndefOr[ServeStaticOptions[ServerResponse]] = js.native
    
    var root: String = js.native
  }
  object Options {
    
    @scala.inline
    def apply(root: String): Options = {
      val __obj = js.Dynamic.literal(root = root.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOptions(value: ServeStaticOptions[ServerResponse]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      @scala.inline
      def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<{use (io : socket.io.socket.io.Server, socket : socket.io.socket.io.Socket, next : (err : any | undefined): void): void, onConnect (io : socket.io.socket.io.Server, socket : socket.io.socket.io.Socket): void, onDisconnect (io : socket.io.socket.io.Server, socket : socket.io.socket.io.Socket): void, [eventHandler: string] : (io : socket.io.socket.io.Server, socket : socket.io.socket.io.Socket, data : any, cb : std.Function): void}> */
  @js.native
  trait PartialuseioServersocketS extends StObject {
    
    var onConnect: js.UndefOr[js.Function2[/* io */ Server, /* socket */ Socket, Unit]] = js.native
    
    var onDisconnect: js.UndefOr[js.Function2[/* io */ Server, /* socket */ Socket, Unit]] = js.native
    
    var use: js.UndefOr[
        js.Function3[
          /* io */ Server, 
          /* socket */ Socket, 
          /* next */ js.Function1[/* err */ js.UndefOr[js.Any], Unit], 
          Unit
        ]
      ] = js.native
  }
  object PartialuseioServersocketS {
    
    @scala.inline
    def apply(): PartialuseioServersocketS = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialuseioServersocketS]
    }
    
    @scala.inline
    implicit class PartialuseioServersocketSMutableBuilder[Self <: PartialuseioServersocketS] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOnConnect(value: (/* io */ Server, /* socket */ Socket) => Unit): Self = StObject.set(x, "onConnect", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnConnectUndefined: Self = StObject.set(x, "onConnect", js.undefined)
      
      @scala.inline
      def setOnDisconnect(value: (/* io */ Server, /* socket */ Socket) => Unit): Self = StObject.set(x, "onDisconnect", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnDisconnectUndefined: Self = StObject.set(x, "onDisconnect", js.undefined)
      
      @scala.inline
      def setUse(
        value: (/* io */ Server, /* socket */ Socket, /* next */ js.Function1[/* err */ js.UndefOr[js.Any], Unit]) => Unit
      ): Self = StObject.set(x, "use", js.Any.fromFunction3(value))
      
      @scala.inline
      def setUseUndefined: Self = StObject.set(x, "use", js.undefined)
    }
  }
}
