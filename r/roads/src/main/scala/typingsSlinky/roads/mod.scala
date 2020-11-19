package typingsSlinky.roads

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.Window
import typingsSlinky.roads.anon.CacheMaxAge
import typingsSlinky.roads.buildMod.RoadsBuildOptions
import typingsSlinky.roads.responseMod.default
import typingsSlinky.roads.roadMod.ResponseMiddleware
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("roads", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def build(input_file: String, output_file: String, options: RoadsBuildOptions): js.Promise[Unit] = js.native
  
  @js.native
  object Middleware extends js.Object {
    
    def applyToContext(key: String, `val`: js.Any): typingsSlinky.roads.roadMod.Middleware = js.native
    @JSName("applyToContext")
    var applyToContext_Original: js.Function2[/* key */ String, /* val */ js.Any, typingsSlinky.roads.roadMod.Middleware] = js.native
    
    def cookie(
      method: String,
      path: String,
      body: String,
      headers: StringDictionary[js.Any],
      next: ResponseMiddleware
    ): js.Promise[default] = js.native
    @JSName("cookie")
    var cookie_Original: typingsSlinky.roads.roadMod.Middleware = js.native
    
    def cors(options: CacheMaxAge): typingsSlinky.roads.roadMod.Middleware = js.native
    @JSName("cors")
    var cors_Original: js.Function1[/* options */ CacheMaxAge, typingsSlinky.roads.roadMod.Middleware] = js.native
    
    def killSlash(
      method: String,
      path: String,
      body: String,
      headers: StringDictionary[js.Any],
      next: ResponseMiddleware
    ): js.Promise[default] = js.native
    @JSName("killSlash")
    var killSlash_Original: typingsSlinky.roads.roadMod.Middleware = js.native
    
    def parseBody(
      method: String,
      path: String,
      body: String,
      headers: StringDictionary[js.Any],
      next: ResponseMiddleware
    ): js.Promise[default] = js.native
    @JSName("parseBody")
    var parseBody_Original: typingsSlinky.roads.roadMod.Middleware = js.native
    
    def reroute(key: String, road: typingsSlinky.roads.roadMod.default): typingsSlinky.roads.roadMod.Middleware = js.native
    @JSName("reroute")
    var reroute_Original: js.Function2[
        /* key */ String, 
        /* road */ typingsSlinky.roads.roadMod.default, 
        typingsSlinky.roads.roadMod.Middleware
      ] = js.native
    
    def setTitle(
      method: String,
      path: String,
      body: String,
      headers: StringDictionary[js.Any],
      next: ResponseMiddleware
    ): js.Promise[default] = js.native
    @JSName("setTitle")
    var setTitle_Original: typingsSlinky.roads.roadMod.Middleware = js.native
    
    @js.native
    /**
      * @param {Road} [road] - The road that will receive the SimpleRouter middleware
      */
    class SimpleRouter ()
      extends typingsSlinky.roads.simpleRouterMod.default {
      def this(road: typingsSlinky.roads.roadMod.default) = this()
    }
    @js.native
    object SimpleRouter
      extends TopLevel[
              Instantiable1[
                /* road */ js.UndefOr[typingsSlinky.roads.roadMod.default], 
                typingsSlinky.roads.simpleRouterMod.default
              ]
            ]
  }
  
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
  
  @js.native
  class Response protected () extends default {
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
  
  @js.native
  /**
    * Road Constructor
    *
    * Creates a new Road class. This function does not accept any parameters!
    */
  class Road ()
    extends typingsSlinky.roads.roadMod.default
  
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
}
