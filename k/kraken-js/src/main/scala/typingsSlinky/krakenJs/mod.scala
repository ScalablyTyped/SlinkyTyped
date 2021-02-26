package typingsSlinky.krakenJs

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.express.mod.Express
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressServeStaticCore.mod.Request
import typingsSlinky.expressServeStaticCore.mod.Response
import typingsSlinky.node.httpMod.IncomingMessage
import typingsSlinky.node.httpMod.ServerResponse
import typingsSlinky.qs.mod.ParsedQs
import typingsSlinky.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("kraken-js", JSImport.Namespace)
  @js.native
  def apply(): Express = js.native
  @JSImport("kraken-js", JSImport.Namespace)
  @js.native
  def apply(options: String): Express = js.native
  @JSImport("kraken-js", JSImport.Namespace)
  @js.native
  def apply(options: Options): Express = js.native
  
  @js.native
  trait Kraken
    extends typingsSlinky.expressServeStaticCore.mod.Express {
    
    /**
      * Express instance itself is a request handler, which could be invoked without
      * third argument.
      */
    def kraken(req: Request[ParamsDictionary, _, _, ParsedQs], res: Response[_, Double]): js.Any = js.native
    def kraken(req: Request[ParamsDictionary, _, _, ParsedQs], res: ServerResponse): js.Any = js.native
    def kraken(req: IncomingMessage, res: Response[_, Double]): js.Any = js.native
    def kraken(req: IncomingMessage, res: ServerResponse): js.Any = js.native
    @JSName("kraken")
    var kraken_Original: Kraken = js.native
  }
  
  @js.native
  trait Options extends StObject {
    
    var basedir: js.UndefOr[String] = js.native
    
    var configdir: js.UndefOr[String] = js.native
    
    var inheritViews: js.UndefOr[Boolean] = js.native
    
    var mountpath: js.UndefOr[String] = js.native
    
    var onconfig: js.UndefOr[
        js.Function2[
          /* config */ Map[String, _], 
          /* next */ js.Function2[/* err */ js.Error | Null, /* config */ js.UndefOr[js.Object], _], 
          _
        ]
      ] = js.native
    
    var protocols: js.UndefOr[js.Object] = js.native
    
    var startupHeaders: js.UndefOr[StringDictionary[String]] = js.native
    
    var uncaughtException: js.UndefOr[js.Function1[/* err */ js.Error, _]] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBasedir(value: String): Self = StObject.set(x, "basedir", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBasedirUndefined: Self = StObject.set(x, "basedir", js.undefined)
      
      @scala.inline
      def setConfigdir(value: String): Self = StObject.set(x, "configdir", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConfigdirUndefined: Self = StObject.set(x, "configdir", js.undefined)
      
      @scala.inline
      def setInheritViews(value: Boolean): Self = StObject.set(x, "inheritViews", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInheritViewsUndefined: Self = StObject.set(x, "inheritViews", js.undefined)
      
      @scala.inline
      def setMountpath(value: String): Self = StObject.set(x, "mountpath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMountpathUndefined: Self = StObject.set(x, "mountpath", js.undefined)
      
      @scala.inline
      def setOnconfig(
        value: (/* config */ Map[String, _], /* next */ js.Function2[/* err */ js.Error | Null, /* config */ js.UndefOr[js.Object], _]) => _
      ): Self = StObject.set(x, "onconfig", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnconfigUndefined: Self = StObject.set(x, "onconfig", js.undefined)
      
      @scala.inline
      def setProtocols(value: js.Object): Self = StObject.set(x, "protocols", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProtocolsUndefined: Self = StObject.set(x, "protocols", js.undefined)
      
      @scala.inline
      def setStartupHeaders(value: StringDictionary[String]): Self = StObject.set(x, "startupHeaders", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartupHeadersUndefined: Self = StObject.set(x, "startupHeaders", js.undefined)
      
      @scala.inline
      def setUncaughtException(value: /* err */ js.Error => _): Self = StObject.set(x, "uncaughtException", js.Any.fromFunction1(value))
      
      @scala.inline
      def setUncaughtExceptionUndefined: Self = StObject.set(x, "uncaughtException", js.undefined)
    }
  }
}
