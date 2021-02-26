package typingsSlinky.roads

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.Window
import typingsSlinky.roads.anon.CacheMaxAge
import typingsSlinky.roads.buildMod.RoadsBuildOptions
import typingsSlinky.roads.roadMod.ResponseMiddleware
import typingsSlinky.roads.simpleRouterMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object Middleware {
    
    @JSImport("roads", "Middleware")
    @js.native
    val ^ : js.Any = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("roads", "Middleware.SimpleRouter")
    @js.native
    /**
      * @param {Road} [road] - The road that will receive the SimpleRouter middleware
      */
    class SimpleRouter () extends default {
      def this(road: typingsSlinky.roads.roadMod.default) = this()
    }
    @JSImport("roads", "Middleware.SimpleRouter")
    @js.native
    def SimpleRouter: Instantiable1[/* road */ js.UndefOr[typingsSlinky.roads.roadMod.default], default] = js.native
    @scala.inline
    def SimpleRouter_=(x: Instantiable1[/* road */ js.UndefOr[typingsSlinky.roads.roadMod.default], default]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SimpleRouter")(x.asInstanceOf[js.Any])
    
    @JSImport("roads", "Middleware.applyToContext")
    @js.native
    def applyToContext: js.Function2[/* key */ String, /* val */ js.Any, typingsSlinky.roads.roadMod.Middleware] = js.native
    @JSImport("roads", "Middleware.applyToContext")
    @js.native
    def applyToContext(key: String, `val`: js.Any): typingsSlinky.roads.roadMod.Middleware = js.native
    @scala.inline
    def applyToContext_=(x: js.Function2[/* key */ String, /* val */ js.Any, typingsSlinky.roads.roadMod.Middleware]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("applyToContext")(x.asInstanceOf[js.Any])
    
    @JSImport("roads", "Middleware.cookie")
    @js.native
    def cookie: typingsSlinky.roads.roadMod.Middleware = js.native
    @JSImport("roads", "Middleware.cookie")
    @js.native
    def cookie(
      method: String,
      path: String,
      body: String,
      headers: StringDictionary[js.Any],
      next: ResponseMiddleware
    ): js.Promise[typingsSlinky.roads.responseMod.default] = js.native
    @scala.inline
    def cookie_=(x: typingsSlinky.roads.roadMod.Middleware): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cookie")(x.asInstanceOf[js.Any])
    
    @JSImport("roads", "Middleware.cors")
    @js.native
    def cors: js.Function1[/* options */ CacheMaxAge, typingsSlinky.roads.roadMod.Middleware] = js.native
    @JSImport("roads", "Middleware.cors")
    @js.native
    def cors(options: CacheMaxAge): typingsSlinky.roads.roadMod.Middleware = js.native
    @scala.inline
    def cors_=(x: js.Function1[/* options */ CacheMaxAge, typingsSlinky.roads.roadMod.Middleware]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cors")(x.asInstanceOf[js.Any])
    
    @JSImport("roads", "Middleware.killSlash")
    @js.native
    def killSlash: typingsSlinky.roads.roadMod.Middleware = js.native
    @JSImport("roads", "Middleware.killSlash")
    @js.native
    def killSlash(
      method: String,
      path: String,
      body: String,
      headers: StringDictionary[js.Any],
      next: ResponseMiddleware
    ): js.Promise[typingsSlinky.roads.responseMod.default] = js.native
    @scala.inline
    def killSlash_=(x: typingsSlinky.roads.roadMod.Middleware): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("killSlash")(x.asInstanceOf[js.Any])
    
    @JSImport("roads", "Middleware.parseBody")
    @js.native
    def parseBody: typingsSlinky.roads.roadMod.Middleware = js.native
    @JSImport("roads", "Middleware.parseBody")
    @js.native
    def parseBody(
      method: String,
      path: String,
      body: String,
      headers: StringDictionary[js.Any],
      next: ResponseMiddleware
    ): js.Promise[typingsSlinky.roads.responseMod.default] = js.native
    @scala.inline
    def parseBody_=(x: typingsSlinky.roads.roadMod.Middleware): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("parseBody")(x.asInstanceOf[js.Any])
    
    @JSImport("roads", "Middleware.reroute")
    @js.native
    def reroute: js.Function2[
        /* key */ String, 
        /* road */ typingsSlinky.roads.roadMod.default, 
        typingsSlinky.roads.roadMod.Middleware
      ] = js.native
    @JSImport("roads", "Middleware.reroute")
    @js.native
    def reroute(key: String, road: typingsSlinky.roads.roadMod.default): typingsSlinky.roads.roadMod.Middleware = js.native
    @scala.inline
    def reroute_=(
      x: js.Function2[
          /* key */ String, 
          /* road */ typingsSlinky.roads.roadMod.default, 
          typingsSlinky.roads.roadMod.Middleware
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("reroute")(x.asInstanceOf[js.Any])
    
    @JSImport("roads", "Middleware.setTitle")
    @js.native
    def setTitle: typingsSlinky.roads.roadMod.Middleware = js.native
    @JSImport("roads", "Middleware.setTitle")
    @js.native
    def setTitle(
      method: String,
      path: String,
      body: String,
      headers: StringDictionary[js.Any],
      next: ResponseMiddleware
    ): js.Promise[typingsSlinky.roads.responseMod.default] = js.native
    @scala.inline
    def setTitle_=(x: typingsSlinky.roads.roadMod.Middleware): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("setTitle")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("roads", "Request")
  @js.native
  class Request protected ()
    extends typingsSlinky.roads.requestMod.default {
    /**
      * @todo: port should just be part of the host
      *
      * @param {boolean} secure - Whether or not this request should use HTTPS
      * @param {string} host - The hostname of all requests made by this function
      * @param {number} port - The post of all requests made by this function
      */
    def this(secure: Boolean, host: String, port: Double) = this()
  }
  
  @JSImport("roads", "Response")
  @js.native
  class Response protected ()
    extends typingsSlinky.roads.responseMod.default {
    /**
      * Creates a new Response object.
      *
      * @param {string} body - Your response body
      * @param {number} [status] - Your response status
      * @param {object} [headers] - Your response headers
      */
    def this(body: String) = this()
    def this(body: String, status: Double) = this()
    def this(body: String, status: js.UndefOr[scala.Nothing], headers: js.Object) = this()
    def this(body: String, status: Double, headers: js.Object) = this()
  }
  
  @JSImport("roads", "Road")
  @js.native
  /**
    * Road Constructor
    *
    * Creates a new Road class. This function does not accept any parameters!
    */
  class Road ()
    extends typingsSlinky.roads.roadMod.default
  
  @JSImport("roads", "RoadsPJAX")
  @js.native
  class RoadsPJAX protected ()
    extends typingsSlinky.roads.pjaxMod.default {
    /**
      * Creates a new RoadsPjax instance. The road provided to this constructor will be the backbone of your PJAX requests.
      *
      * @param {Road} road - The road that will turn your pjax requests into HTML
      * @param {HTMLElement} container_element - The element that will be filled with your roads output
      * @param {Window} window - The pages window object to help set page title and other items
      */
    def this(road: typingsSlinky.roads.roadMod.default, container_element: HTMLElement, window: Window) = this()
  }
  
  @JSImport("roads", "build")
  @js.native
  def build(input_file: String, output_file: String, options: RoadsBuildOptions): js.Promise[Unit] = js.native
}
