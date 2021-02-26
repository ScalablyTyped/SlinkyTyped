package typingsSlinky.nextServer

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.nextServer.nextServerBooleans.`false`
import typingsSlinky.node.httpMod.IncomingMessage
import typingsSlinky.node.httpMod.ServerResponse
import typingsSlinky.node.urlMod.UrlWithParsedQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object serverRouterMod {
  
  @JSImport("next-server/dist/server/router", JSImport.Default)
  @js.native
  class default () extends Router {
    def this(routes: js.Array[Route_]) = this()
  }
  
  @JSImport("next-server/dist/server/router", "route")
  @js.native
  def route(path: String): js.Function2[/* pathname */ js.UndefOr[String], /* params */ js.UndefOr[js.Any], _] = js.native
  
  type Params = StringDictionary[js.Any]
  
  type RouteMatch = js.Function1[/* pathname */ js.UndefOr[String], `false` | Params]
  
  @js.native
  trait Route_ extends StObject {
    
    def fn(req: IncomingMessage, res: ServerResponse, params: Params, parsedUrl: UrlWithParsedQuery): Unit = js.native
    
    var `match`: RouteMatch = js.native
  }
  object Route_ {
    
    @scala.inline
    def apply(
      fn: (IncomingMessage, ServerResponse, Params, UrlWithParsedQuery) => Unit,
      `match`: /* pathname */ js.UndefOr[String] => `false` | Params
    ): Route_ = {
      val __obj = js.Dynamic.literal(fn = js.Any.fromFunction4(fn))
      __obj.updateDynamic("match")(js.Any.fromFunction1(`match`))
      __obj.asInstanceOf[Route_]
    }
    
    @scala.inline
    implicit class Route_MutableBuilder[Self <: Route_] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFn(value: (IncomingMessage, ServerResponse, Params, UrlWithParsedQuery) => Unit): Self = StObject.set(x, "fn", js.Any.fromFunction4(value))
      
      @scala.inline
      def setMatch(value: /* pathname */ js.UndefOr[String] => `false` | Params): Self = StObject.set(x, "match", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait Router extends StObject {
    
    def add(route: Route_): Unit = js.native
    
    def `match`(req: IncomingMessage, res: ServerResponse, parsedUrl: UrlWithParsedQuery): js.UndefOr[js.Function0[Unit]] = js.native
    
    var routes: js.Array[Route_] = js.native
  }
  object Router {
    
    @scala.inline
    def apply(
      add: Route_ => Unit,
      `match`: (IncomingMessage, ServerResponse, UrlWithParsedQuery) => js.UndefOr[js.Function0[Unit]],
      routes: js.Array[Route_]
    ): Router = {
      val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), routes = routes.asInstanceOf[js.Any])
      __obj.updateDynamic("match")(js.Any.fromFunction3(`match`))
      __obj.asInstanceOf[Router]
    }
    
    @scala.inline
    implicit class RouterMutableBuilder[Self <: Router] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdd(value: Route_ => Unit): Self = StObject.set(x, "add", js.Any.fromFunction1(value))
      
      @scala.inline
      def setMatch(value: (IncomingMessage, ServerResponse, UrlWithParsedQuery) => js.UndefOr[js.Function0[Unit]]): Self = StObject.set(x, "match", js.Any.fromFunction3(value))
      
      @scala.inline
      def setRoutes(value: js.Array[Route_]): Self = StObject.set(x, "routes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoutesVarargs(value: Route_ *): Self = StObject.set(x, "routes", js.Array(value :_*))
    }
  }
}
