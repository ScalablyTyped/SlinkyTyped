package typingsSlinky.feathersjsExpress

import typingsSlinky.bodyParser.mod.OptionsJson
import typingsSlinky.bodyParser.mod.OptionsUrlencoded
import typingsSlinky.connect.mod.NextHandleFunction
import typingsSlinky.express.mod.Application_
import typingsSlinky.express.mod.ErrorRequestHandler
import typingsSlinky.express.mod.IRouterHandler
import typingsSlinky.express.mod.RequestHandler
import typingsSlinky.express.mod.Response_
import typingsSlinky.express.mod.RouterOptions
import typingsSlinky.expressServeStaticCore.mod.Express
import typingsSlinky.expressServeStaticCore.mod.NextFunction
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressServeStaticCore.mod.PathParams
import typingsSlinky.expressServeStaticCore.mod.Query
import typingsSlinky.expressServeStaticCore.mod.Request
import typingsSlinky.expressServeStaticCore.mod.RequestHandlerParams
import typingsSlinky.expressServeStaticCore.mod.Response
import typingsSlinky.feathersjsExpress.anon.Html
import typingsSlinky.feathersjsExpress.anon.PartialServiceMethodsanyS
import typingsSlinky.feathersjsExpress.anon.Typeofself
import typingsSlinky.feathersjsExpress.feathersjsExpressStrings.use
import typingsSlinky.qs.mod.ParsedQs
import typingsSlinky.serveStatic.mod.RequestHandlerConstructor
import typingsSlinky.std.Exclude
import typingsSlinky.std.Pick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@feathersjs/express", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@feathersjs/express", JSImport.Default)
  @js.native
  val default: (js.Function1[/* app */ typingsSlinky.feathersjsFeathers.mod.Application[_], Application[_]]) with Typeofself = js.native
  
  @JSImport("@feathersjs/express", "Router")
  @js.native
  def Router(): typingsSlinky.expressServeStaticCore.mod.Router = js.native
  @JSImport("@feathersjs/express", "Router")
  @js.native
  def Router(options: RouterOptions): typingsSlinky.expressServeStaticCore.mod.Router = js.native
  
  @JSImport("@feathersjs/express", "errorHandler")
  @js.native
  def errorHandler(): ErrorRequestHandler[ParamsDictionary, _, _, Query] = js.native
  @JSImport("@feathersjs/express", "errorHandler")
  @js.native
  def errorHandler(options: Html): ErrorRequestHandler[ParamsDictionary, _, _, Query] = js.native
  
  /**
    * This is a built-in middleware function in Express. It parses incoming requests with JSON payloads and is based on body-parser.
    * @since 4.16.0
    */
  @JSImport("@feathersjs/express", "json")
  @js.native
  def json(): NextHandleFunction = js.native
  /**
    * This is a built-in middleware function in Express. It parses incoming requests with JSON payloads and is based on body-parser.
    * @since 4.16.0
    */
  @JSImport("@feathersjs/express", "json")
  @js.native
  def json(options: OptionsJson): NextHandleFunction = js.native
  
  @JSImport("@feathersjs/express", "notFound")
  @js.native
  def notFound(): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  
  @JSImport("@feathersjs/express", "original")
  @js.native
  val original: js.Function0[Express] = js.native
  
  object rest {
    
    @JSImport("@feathersjs/express", "rest")
    @js.native
    def apply(): js.Function0[Unit] = js.native
    @JSImport("@feathersjs/express", "rest")
    @js.native
    def apply(handler: RequestHandler[ParamsDictionary, _, _, Query]): js.Function0[Unit] = js.native
    @JSImport("@feathersjs/express", "rest")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@feathersjs/express", "rest.formatter")
    @js.native
    def formatter: RequestHandler[ParamsDictionary, js.Any, js.Any, Query] = js.native
    @JSImport("@feathersjs/express", "rest.formatter")
    @js.native
    def formatter(req: Request[ParamsDictionary, _, _, Query], res: Response[_, Double], next: NextFunction): js.Any = js.native
    @scala.inline
    def formatter_=(x: RequestHandler[ParamsDictionary, js.Any, js.Any, Query]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("formatter")(x.asInstanceOf[js.Any])
  }
  
  /**
    * This is a built-in middleware function in Express. It serves static files and is based on serve-static.
    */
  @JSImport("@feathersjs/express", "static")
  @js.native
  def static: RequestHandlerConstructor[Response_[js.Any]] = js.native
  @scala.inline
  def static_=(x: RequestHandlerConstructor[Response_[js.Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("static")(x.asInstanceOf[js.Any])
  
  /**
    * This is a built-in middleware function in Express. It parses incoming requests with urlencoded payloads and is based on body-parser.
    * @since 4.16.0
    */
  @JSImport("@feathersjs/express", "urlencoded")
  @js.native
  def urlencoded(): NextHandleFunction = js.native
  /**
    * This is a built-in middleware function in Express. It parses incoming requests with urlencoded payloads and is based on body-parser.
    * @since 4.16.0
    */
  @JSImport("@feathersjs/express", "urlencoded")
  @js.native
  def urlencoded(options: OptionsUrlencoded): NextHandleFunction = js.native
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof express.express.Application, 'use'> ]: express.express.Application[P]}
  - Dropped {[ P in std.Exclude<keyof @feathersjs/feathers.@feathersjs/feathers.Application<T>, 'use'> ]: @feathersjs/feathers.@feathersjs/feathers.Application<T>[P]} */ @js.native
  trait Application[T] extends StObject {
    
    def use(
      handlers: ((typingsSlinky.expressServeStaticCore.mod.RequestHandler[ParamsDictionary, _, _, ParsedQs]) | (RequestHandlerParams[ParamsDictionary, _, _, ParsedQs]))*
    ): T = js.native
    def use(
      path: PathParams,
      handlers: ((typingsSlinky.expressServeStaticCore.mod.RequestHandler[ParamsDictionary, _, _, ParsedQs]) | (RequestHandlerParams[ParamsDictionary, _, _, ParsedQs]) | PartialServiceMethodsanyS | Application[_])*
    ): T = js.native
    @JSName("use")
    var use_Original: FeathersApplicationRequestHandler[T] = js.native
  }
  
  // TypeScript methods cannot be overloaded with a different signature. Derive two application types without the use methods.
  type ExpressAndFeathersApplicationWithoutUse[T] = (Omit[Application_, use]) with (Omit[typingsSlinky.feathersjsFeathers.mod.Application[T], use])
  
  type FeathersApplicationRequestHandler[T] = IRouterHandler[T] with FeathersRouterMatcher[T] with (js.Function1[/* repeated */ RequestHandlerParams[ParamsDictionary, _, _, ParsedQs], T])
  
  type FeathersRouterMatcher[T] = js.Function2[
    /* path */ PathParams, 
    /* repeated */ (typingsSlinky.expressServeStaticCore.mod.RequestHandler[ParamsDictionary, js.Any, js.Any, ParsedQs]) | (RequestHandlerParams[ParamsDictionary, js.Any, js.Any, ParsedQs]) | PartialServiceMethodsanyS | Application[js.Any], 
    T
  ]
  
  type FeathersServiceOptions = js.Any
  
  type Omit[T, K] = Pick[T, Exclude[/* keyof T */ String, K]]
}
