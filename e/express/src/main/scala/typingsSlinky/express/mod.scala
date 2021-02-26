package typingsSlinky.express

import typingsSlinky.bodyParser.mod.Options
import typingsSlinky.bodyParser.mod.OptionsJson
import typingsSlinky.bodyParser.mod.OptionsText
import typingsSlinky.bodyParser.mod.OptionsUrlencoded
import typingsSlinky.connect.mod.NextHandleFunction
import typingsSlinky.express.anon.FnCall
import typingsSlinky.expressServeStaticCore.mod.Application
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressServeStaticCore.mod.Query
import typingsSlinky.expressServeStaticCore.mod.Request
import typingsSlinky.expressServeStaticCore.mod.Response
import typingsSlinky.qs.mod.IParseOptions
import typingsSlinky.serveStatic.mod.RequestHandlerConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Creates an Express application. The express() function is a top-level function exported by the express module.
    */
  @JSImport("express", JSImport.Namespace)
  @js.native
  def apply(): typingsSlinky.expressServeStaticCore.mod.Express = js.native
  
  @JSImport("express", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("express", "Router")
  @js.native
  def Router(): typingsSlinky.expressServeStaticCore.mod.Router = js.native
  @JSImport("express", "Router")
  @js.native
  def Router(options: RouterOptions): typingsSlinky.expressServeStaticCore.mod.Router = js.native
  type Router = typingsSlinky.expressServeStaticCore.mod.Router
  
  /**
    * These are the exposed prototypes.
    */
  @JSImport("express", "application")
  @js.native
  def application: Application_ = js.native
  @scala.inline
  def application_=(x: Application_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("application")(x.asInstanceOf[js.Any])
  
  /**
    * This is a built-in middleware function in Express. It parses incoming requests with JSON payloads and is based on body-parser.
    * @since 4.16.0
    */
  @JSImport("express", "json")
  @js.native
  def json(): NextHandleFunction = js.native
  /**
    * This is a built-in middleware function in Express. It parses incoming requests with JSON payloads and is based on body-parser.
    * @since 4.16.0
    */
  @JSImport("express", "json")
  @js.native
  def json(options: OptionsJson): NextHandleFunction = js.native
  
  @JSImport("express", "query")
  @js.native
  def query(options: FnCall): Handler = js.native
  @JSImport("express", "query")
  @js.native
  def query(options: IParseOptions): Handler = js.native
  
  /**
    * This is a built-in middleware function in Express. It parses incoming requests with Buffer payloads and is based on body-parser.
    * @since 4.17.0
    */
  @JSImport("express", "raw")
  @js.native
  def raw(): NextHandleFunction = js.native
  /**
    * This is a built-in middleware function in Express. It parses incoming requests with Buffer payloads and is based on body-parser.
    * @since 4.17.0
    */
  @JSImport("express", "raw")
  @js.native
  def raw(options: Options): NextHandleFunction = js.native
  
  @JSImport("express", "request")
  @js.native
  def request: Request_[ParamsDictionary, js.Any, js.Any, Query] = js.native
  @scala.inline
  def request_=(x: Request_[ParamsDictionary, js.Any, js.Any, Query]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("request")(x.asInstanceOf[js.Any])
  
  @JSImport("express", "response")
  @js.native
  def response: Response_[js.Any] = js.native
  @scala.inline
  def response_=(x: Response_[js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("response")(x.asInstanceOf[js.Any])
  
  /**
    * This is a built-in middleware function in Express. It serves static files and is based on serve-static.
    */
  @JSImport("express", "static")
  @js.native
  def static: RequestHandlerConstructor[Response_[js.Any]] = js.native
  @scala.inline
  def static_=(x: RequestHandlerConstructor[Response_[js.Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("static")(x.asInstanceOf[js.Any])
  
  /**
    * This is a built-in middleware function in Express. It parses incoming requests with text payloads and is based on body-parser.
    * @since 4.17.0
    */
  @JSImport("express", "text")
  @js.native
  def text(): NextHandleFunction = js.native
  /**
    * This is a built-in middleware function in Express. It parses incoming requests with text payloads and is based on body-parser.
    * @since 4.17.0
    */
  @JSImport("express", "text")
  @js.native
  def text(options: OptionsText): NextHandleFunction = js.native
  
  /**
    * This is a built-in middleware function in Express. It parses incoming requests with urlencoded payloads and is based on body-parser.
    * @since 4.16.0
    */
  @JSImport("express", "urlencoded")
  @js.native
  def urlencoded(): NextHandleFunction = js.native
  /**
    * This is a built-in middleware function in Express. It parses incoming requests with urlencoded payloads and is based on body-parser.
    * @since 4.16.0
    */
  @JSImport("express", "urlencoded")
  @js.native
  def urlencoded(options: OptionsUrlencoded): NextHandleFunction = js.native
  
  type Application_ = Application
  
  type CookieOptions = typingsSlinky.expressServeStaticCore.mod.CookieOptions
  
  type Errback = typingsSlinky.expressServeStaticCore.mod.Errback
  
  type ErrorRequestHandler[P, ResBody, ReqBody, ReqQuery] = typingsSlinky.expressServeStaticCore.mod.ErrorRequestHandler[P, ResBody, ReqBody, ReqQuery]
  
  type Express = typingsSlinky.expressServeStaticCore.mod.Express
  
  type Handler = typingsSlinky.expressServeStaticCore.mod.Handler
  
  type IRoute = typingsSlinky.expressServeStaticCore.mod.IRoute
  
  type IRouter = typingsSlinky.expressServeStaticCore.mod.IRouter
  
  type IRouterHandler[T] = typingsSlinky.expressServeStaticCore.mod.IRouterHandler[T]
  
  type IRouterMatcher[T] = typingsSlinky.expressServeStaticCore.mod.IRouterMatcher[T, js.Any]
  
  type MediaType = typingsSlinky.expressServeStaticCore.mod.MediaType
  
  type NextFunction = typingsSlinky.expressServeStaticCore.mod.NextFunction
  
  type RequestHandler[P, ResBody, ReqBody, ReqQuery] = typingsSlinky.expressServeStaticCore.mod.RequestHandler[P, ResBody, ReqBody, ReqQuery]
  
  type RequestParamHandler = typingsSlinky.expressServeStaticCore.mod.RequestParamHandler
  
  type Request_[P, ResBody, ReqBody, ReqQuery] = Request[P, ResBody, ReqBody, ReqQuery]
  
  type Response_[ResBody] = Response[ResBody, Double]
  
  @js.native
  trait RouterOptions extends StObject {
    
    /**
      * Enable case sensitivity.
      */
    var caseSensitive: js.UndefOr[Boolean] = js.native
    
    /**
      * Preserve the req.params values from the parent router.
      * If the parent and the child have conflicting param names, the child’s value take precedence.
      *
      * @default false
      * @since 4.5.0
      */
    var mergeParams: js.UndefOr[Boolean] = js.native
    
    /**
      * Enable strict routing.
      */
    var strict: js.UndefOr[Boolean] = js.native
  }
  object RouterOptions {
    
    @scala.inline
    def apply(): RouterOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RouterOptions]
    }
    
    @scala.inline
    implicit class RouterOptionsMutableBuilder[Self <: RouterOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCaseSensitive(value: Boolean): Self = StObject.set(x, "caseSensitive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCaseSensitiveUndefined: Self = StObject.set(x, "caseSensitive", js.undefined)
      
      @scala.inline
      def setMergeParams(value: Boolean): Self = StObject.set(x, "mergeParams", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMergeParamsUndefined: Self = StObject.set(x, "mergeParams", js.undefined)
      
      @scala.inline
      def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
    }
  }
  
  type Send = typingsSlinky.expressServeStaticCore.mod.Send[js.Any, Response[js.Any, Double]]
}
