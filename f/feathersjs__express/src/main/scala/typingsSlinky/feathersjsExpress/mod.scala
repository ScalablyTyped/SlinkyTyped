package typingsSlinky.feathersjsExpress

import typingsSlinky.bodyParser.mod.OptionsJson
import typingsSlinky.bodyParser.mod.OptionsUrlencoded
import typingsSlinky.connect.mod.NextHandleFunction
import typingsSlinky.express.Typeofm
import typingsSlinky.express.mod.Application_
import typingsSlinky.express.mod.ErrorRequestHandler
import typingsSlinky.express.mod.IRouterHandler
import typingsSlinky.express.mod.RouterOptions
import typingsSlinky.expressServeStaticCore.mod.Express
import typingsSlinky.expressServeStaticCore.mod.Handler
import typingsSlinky.expressServeStaticCore.mod.NextFunction
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressServeStaticCore.mod.PathParams
import typingsSlinky.expressServeStaticCore.mod.Request
import typingsSlinky.expressServeStaticCore.mod.RequestHandler
import typingsSlinky.expressServeStaticCore.mod.RequestHandlerParams
import typingsSlinky.expressServeStaticCore.mod.Response
import typingsSlinky.feathersjsExpress.feathersjsExpressStrings.use
import typingsSlinky.serveStatic.mod.ServeStaticOptions
import typingsSlinky.std.Exclude
import typingsSlinky.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@feathersjs/express", JSImport.Namespace)
@js.native
object mod extends js.Object {
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof express.express.Application, 'use'> ]: express.express.Application[P]}
  - Dropped {[ P in std.Exclude<keyof @feathersjs/feathers.@feathersjs/feathers.Application<T>, 'use'> ]: @feathersjs/feathers.@feathersjs/feathers.Application<T>[P]} */ @js.native
  trait Application[T] extends js.Object {
    @JSName("use")
    var use_Original: FeathersApplicationRequestHandler[T] = js.native
    def use(
      handlers: ((RequestHandler[ParamsDictionary, _, _]) | (RequestHandlerParams[ParamsDictionary, _, _]))*
    ): T = js.native
    def use(
      path: PathParams,
      handlers: ((RequestHandler[ParamsDictionary, _, _]) | (RequestHandlerParams[ParamsDictionary, _, _]) | PartialServiceMethodsanyS | Application[_])*
    ): T = js.native
  }
  
  val default: (js.Function1[/* app */ typingsSlinky.feathersjsFeathers.mod.Application[_], Application[_]]) with Typeofself = js.native
  val original: js.Function0[Express] with Typeofexpress = js.native
  def Router(): typingsSlinky.expressServeStaticCore.mod.Router = js.native
  def Router(options: RouterOptions): typingsSlinky.expressServeStaticCore.mod.Router = js.native
  def errorHandler(): ErrorRequestHandler[ParamsDictionary] = js.native
  def errorHandler(options: AnonHtml): ErrorRequestHandler[ParamsDictionary] = js.native
  def notFound(): typingsSlinky.express.mod.RequestHandler[ParamsDictionary] = js.native
  /**
    * This is a built-in middleware function in Express. It parses incoming requests with JSON payloads and is based on body-parser.
    * @since 4.16.0
    */
  @js.native
  object json extends js.Object {
    def apply(): NextHandleFunction = js.native
    def apply(options: OptionsJson): NextHandleFunction = js.native
  }
  
  @js.native
  object rest extends js.Object {
    @JSName("formatter")
    var formatter_Original: typingsSlinky.express.mod.RequestHandler[ParamsDictionary] = js.native
    def apply(): js.Function0[Unit] = js.native
    def apply(handler: typingsSlinky.express.mod.RequestHandler[ParamsDictionary]): js.Function0[Unit] = js.native
    def formatter(req: Request[ParamsDictionary, _, _], res: Response[_], next: NextFunction): js.Any = js.native
  }
  
  /**
    * This is a built-in middleware function in Express. It serves static files and is based on serve-static.
    */
  @js.native
  object static extends js.Object {
    var mime: Typeofm = js.native
    def apply(root: String): Handler = js.native
    def apply(root: String, options: ServeStaticOptions): Handler = js.native
    def serveStatic(root: String): Handler = js.native
    def serveStatic(root: String, options: ServeStaticOptions): Handler = js.native
  }
  
  /**
    * This is a built-in middleware function in Express. It parses incoming requests with urlencoded payloads and is based on body-parser.
    * @since 4.16.0
    */
  @js.native
  object urlencoded extends js.Object {
    def apply(): NextHandleFunction = js.native
    def apply(options: OptionsUrlencoded): NextHandleFunction = js.native
  }
  
  // TypeScript methods cannot be overloaded with a different signature. Derive two application types without the use methods.
  type ExpressAndFeathersApplicationWithoutUse[T] = (Omit[Application_, use]) with (Omit[typingsSlinky.feathersjsFeathers.mod.Application[T], use])
  type FeathersApplicationRequestHandler[T] = IRouterHandler[T] with FeathersRouterMatcher[T] with (js.Function1[/* repeated */ RequestHandlerParams[ParamsDictionary, _, _], T])
  type FeathersRouterMatcher[T] = js.Function2[
    /* path */ PathParams, 
    /* repeated */ (RequestHandler[ParamsDictionary, js.Any, js.Any]) | (RequestHandlerParams[ParamsDictionary, js.Any, js.Any]) | PartialServiceMethodsanyS | Application[js.Any], 
    T
  ]
  type FeathersServiceOptions = js.Any
  type Omit[T, K] = Pick[T, Exclude[String, K]]
}

