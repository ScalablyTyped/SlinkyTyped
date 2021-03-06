package typingsSlinky.roads

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.node.querystringMod.ParsedUrlQuery
import typingsSlinky.node.urlMod.UrlWithParsedQuery
import typingsSlinky.roads.roadMod.Context
import typingsSlinky.roads.roadMod.ResponseMiddleware
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object simpleRouterMod {
  
  @JSImport("roads/types/middleware/simpleRouter", JSImport.Default)
  @js.native
  /**
    * @param {Road} [road] - The road that will receive the SimpleRouter middleware
    */
  class default () extends SimpleRouter {
    def this(road: typingsSlinky.roads.roadMod.default) = this()
  }
  
  type Route = js.ThisFunction4[
    /* this */ Context, 
    /* path */ SimpleRouterURL, 
    /* body */ String, 
    /* headers */ StringDictionary[js.Any], 
    /* next */ ResponseMiddleware, 
    js.Promise[typingsSlinky.roads.responseMod.default]
  ]
  
  @js.native
  trait RouteDetails extends StObject {
    
    var method: String = js.native
    
    var path: String = js.native
    
    def route(path: SimpleRouterURL, body: String, headers: StringDictionary[js.Any], next: ResponseMiddleware): js.Promise[typingsSlinky.roads.responseMod.default] = js.native
    @JSName("route")
    var route_Original: Route = js.native
  }
  
  @js.native
  trait SimpleRouter extends StObject {
    
    /**
      * Slightly non-standar roads middleware to execute the functions in this router when requests are received by the road
      * The first method is the routes to ensure that we can properly use this router once we loose the "this" value
      * from the roads context
      *
      * @todo there might be a better way to do this
      */
    /* protected */ def _middleware(
      routes: js.Array[RouteDetails],
      request_method: String,
      request_url: String,
      request_body: String,
      request_headers: js.Object,
      next: ResponseMiddleware
    ): js.Promise[typingsSlinky.roads.responseMod.default] = js.native
    
    var _routes: js.Array[RouteDetails] = js.native
    
    /**
      * Adds a route to this router. The route is a function that will match the standard roads request signature.
      * It will be associated with one HTTP method, and one or many HTTP paths
      *
      * @param {string} method - The HTTP method that will trigger the provided function
      * @param {(string|array)} paths - One or many URL paths that will trigger the provided function
      * @param {function} fn - The function containing all of your route logic
      */
    def addRoute(method: String, paths: String, fn: Route): Unit = js.native
    def addRoute(method: String, paths: js.Array[String], fn: Route): Unit = js.native
    
    /**
      * Add an entire file worth of routes.
      *
      * The file should be a node module that exposes an object.
      * Each key should be an HTTP path, each value should be an object.
      * In that object, each key should be an HTTP method, and the value should be your route function.
      *
      * @param {string} file_path - The file path
      * @param {string} [prefix] - A string that will help namespace this file. e.g. if you call this on a file with a route of "/posts", and the prefix "/users", the route will be assigned to "/users/posts"
      */
    def addRouteFile(file_path: String): js.Promise[Unit] = js.native
    def addRouteFile(file_path: String, prefix: String): js.Promise[Unit] = js.native
    
    /**
      * Assigns the middleware to the provided road
      *
      * @param  {Road} road - The road that will receive the SimpleRouter middleware
      */
    def applyMiddleware(road: typingsSlinky.roads.roadMod.default): Unit = js.native
  }
  
  @js.native
  trait SimpleRouterURL extends UrlWithParsedQuery {
    
    var args: js.UndefOr[StringDictionary[js.Any]] = js.native
  }
  object SimpleRouterURL {
    
    @scala.inline
    def apply(href: String, query: ParsedUrlQuery): SimpleRouterURL = {
      val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
      __obj.asInstanceOf[SimpleRouterURL]
    }
    
    @scala.inline
    implicit class SimpleRouterURLMutableBuilder[Self <: SimpleRouterURL] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArgs(value: StringDictionary[js.Any]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
    }
  }
}
