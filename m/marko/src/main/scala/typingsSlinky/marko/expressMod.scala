package typingsSlinky.marko

import typingsSlinky.bodyParser.mod.Options
import typingsSlinky.bodyParser.mod.OptionsJson
import typingsSlinky.bodyParser.mod.OptionsText
import typingsSlinky.bodyParser.mod.OptionsUrlencoded
import typingsSlinky.connect.mod.NextHandleFunction
import typingsSlinky.express.anon.FnCall
import typingsSlinky.express.mod.Application_
import typingsSlinky.express.mod.Handler
import typingsSlinky.express.mod.Request_
import typingsSlinky.express.mod.Response_
import typingsSlinky.express.mod.RouterOptions
import typingsSlinky.expressServeStaticCore.mod.Express
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressServeStaticCore.mod.Query
import typingsSlinky.marko.templateMod.Template
import typingsSlinky.qs.mod.IParseOptions
import typingsSlinky.serveStatic.mod.RequestHandlerConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object expressMod {
  
  /**
    * Creates an Express application. The express() function is a top-level function exported by the express module.
    */
  @JSImport("marko/express", JSImport.Namespace)
  @js.native
  def apply(): Express = js.native
  
  @JSImport("marko/express", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("marko/express", "Router")
  @js.native
  def Router(): typingsSlinky.expressServeStaticCore.mod.Router = js.native
  @JSImport("marko/express", "Router")
  @js.native
  def Router(options: RouterOptions): typingsSlinky.expressServeStaticCore.mod.Router = js.native
  
  /**
    * These are the exposed prototypes.
    */
  @JSImport("marko/express", "application")
  @js.native
  def application: Application_ = js.native
  @scala.inline
  def application_=(x: Application_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("application")(x.asInstanceOf[js.Any])
  
  /**
    * This is a built-in middleware function in Express. It parses incoming requests with JSON payloads and is based on body-parser.
    * @since 4.16.0
    */
  @JSImport("marko/express", "json")
  @js.native
  def json(): NextHandleFunction = js.native
  /**
    * This is a built-in middleware function in Express. It parses incoming requests with JSON payloads and is based on body-parser.
    * @since 4.16.0
    */
  @JSImport("marko/express", "json")
  @js.native
  def json(options: OptionsJson): NextHandleFunction = js.native
  
  @JSImport("marko/express", "query")
  @js.native
  def query(options: FnCall): Handler = js.native
  @JSImport("marko/express", "query")
  @js.native
  def query(options: IParseOptions): Handler = js.native
  
  /**
    * This is a built-in middleware function in Express. It parses incoming requests with Buffer payloads and is based on body-parser.
    * @since 4.17.0
    */
  @JSImport("marko/express", "raw")
  @js.native
  def raw(): NextHandleFunction = js.native
  /**
    * This is a built-in middleware function in Express. It parses incoming requests with Buffer payloads and is based on body-parser.
    * @since 4.17.0
    */
  @JSImport("marko/express", "raw")
  @js.native
  def raw(options: Options): NextHandleFunction = js.native
  
  @JSImport("marko/express", "request")
  @js.native
  def request: Request_[ParamsDictionary, js.Any, js.Any, Query] = js.native
  @scala.inline
  def request_=(x: Request_[ParamsDictionary, js.Any, js.Any, Query]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("request")(x.asInstanceOf[js.Any])
  
  @JSImport("marko/express", "response")
  @js.native
  def response: Response_[js.Any] = js.native
  @scala.inline
  def response_=(x: Response_[js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("response")(x.asInstanceOf[js.Any])
  
  /**
    * This is a built-in middleware function in Express. It serves static files and is based on serve-static.
    */
  @JSImport("marko/express", "static")
  @js.native
  def static: RequestHandlerConstructor[Response_[js.Any]] = js.native
  @scala.inline
  def static_=(x: RequestHandlerConstructor[Response_[js.Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("static")(x.asInstanceOf[js.Any])
  
  /**
    * This is a built-in middleware function in Express. It parses incoming requests with text payloads and is based on body-parser.
    * @since 4.17.0
    */
  @JSImport("marko/express", "text")
  @js.native
  def text(): NextHandleFunction = js.native
  /**
    * This is a built-in middleware function in Express. It parses incoming requests with text payloads and is based on body-parser.
    * @since 4.17.0
    */
  @JSImport("marko/express", "text")
  @js.native
  def text(options: OptionsText): NextHandleFunction = js.native
  
  /**
    * This is a built-in middleware function in Express. It parses incoming requests with urlencoded payloads and is based on body-parser.
    * @since 4.16.0
    */
  @JSImport("marko/express", "urlencoded")
  @js.native
  def urlencoded(): NextHandleFunction = js.native
  /**
    * This is a built-in middleware function in Express. It parses incoming requests with urlencoded payloads and is based on body-parser.
    * @since 4.16.0
    */
  @JSImport("marko/express", "urlencoded")
  @js.native
  def urlencoded(options: OptionsUrlencoded): NextHandleFunction = js.native
  
  object expressServeStaticCoreAugmentingMod {
    
    @js.native
    trait Response extends StObject {
      
      def marko(template: Template): Unit = js.native
      def marko(template: Template, data: js.Any): Unit = js.native
    }
  }
}
