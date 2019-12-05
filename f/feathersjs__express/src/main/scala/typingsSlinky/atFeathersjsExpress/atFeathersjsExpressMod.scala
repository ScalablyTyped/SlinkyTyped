package typingsSlinky.atFeathersjsExpress

import typingsSlinky.atFeathersjsExpress.atFeathersjsExpressMod.Application
import typingsSlinky.atFeathersjsExpress.atFeathersjsExpressMod.FeathersApplicationRequestHandler
import typingsSlinky.atFeathersjsExpress.atFeathersjsExpressMod.FeathersRouterMatcher
import typingsSlinky.atFeathersjsExpress.atFeathersjsExpressMod.Omit
import typingsSlinky.atFeathersjsExpress.atFeathersjsExpressStrings.use
import typingsSlinky.atFeathersjsFeathers.atFeathersjsFeathersMod.ServiceMethods
import typingsSlinky.atFeathersjsFeathers.atFeathersjsFeathersMod.SetupMethod
import typingsSlinky.bodyDashParser.bodyDashParserMod.OptionsJson
import typingsSlinky.bodyDashParser.bodyDashParserMod.OptionsUrlencoded
import typingsSlinky.connect.connectMod.NextHandleFunction
import typingsSlinky.express.Typeofm
import typingsSlinky.express.expressMod.ErrorRequestHandler
import typingsSlinky.express.expressMod.IRouterHandler
import typingsSlinky.express.expressMod.RouterOptions
import typingsSlinky.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.Express
import typingsSlinky.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.Handler
import typingsSlinky.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.NextFunction
import typingsSlinky.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.ParamsDictionary
import typingsSlinky.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.PathParams
import typingsSlinky.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.Request
import typingsSlinky.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.RequestHandler
import typingsSlinky.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.RequestHandlerParams
import typingsSlinky.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.Response
import typingsSlinky.serveDashStatic.serveDashStaticMod.ServeStaticOptions
import typingsSlinky.std.Exclude
import typingsSlinky.std.Partial
import typingsSlinky.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@feathersjs/express", JSImport.Namespace)
@js.native
object atFeathersjsExpressMod extends js.Object {
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
      handlers: ((RequestHandler[ParamsDictionary, _, _]) | (RequestHandlerParams[ParamsDictionary, _, _]) | (Partial[ServiceMethods[_] with SetupMethod]) | Application[_])*
    ): T = js.native
  }
  
  val default: (js.Function1[
    /* app */ typingsSlinky.atFeathersjsFeathers.atFeathersjsFeathersMod.Application[_], 
    Application[_]
  ]) with Typeofself = js.native
  val original: js.Function0[Express] with Typeofexpress = js.native
  def Router(): typingsSlinky.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.Router = js.native
  def Router(options: RouterOptions): typingsSlinky.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.Router = js.native
  def errorHandler(): ErrorRequestHandler[ParamsDictionary] = js.native
  def errorHandler(options: Anon_Html): ErrorRequestHandler[ParamsDictionary] = js.native
  def notFound(): typingsSlinky.express.expressMod.RequestHandler[ParamsDictionary] = js.native
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
    var formatter_Original: typingsSlinky.express.expressMod.RequestHandler[ParamsDictionary] = js.native
    def apply(): js.Function0[Unit] = js.native
    def apply(handler: typingsSlinky.express.expressMod.RequestHandler[ParamsDictionary]): js.Function0[Unit] = js.native
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
  type ExpressAndFeathersApplicationWithoutUse[T] = (Omit[typingsSlinky.express.expressMod.Application, use]) with (Omit[typingsSlinky.atFeathersjsFeathers.atFeathersjsFeathersMod.Application[T], use])
  type FeathersApplicationRequestHandler[T] = IRouterHandler[T] with FeathersRouterMatcher[T] with (js.Function1[/* repeated */ RequestHandlerParams[ParamsDictionary, _, _], T])
  type FeathersRouterMatcher[T] = js.Function2[
    /* path */ PathParams, 
    /* repeated */ (RequestHandler[ParamsDictionary, js.Any, js.Any]) | (RequestHandlerParams[ParamsDictionary, js.Any, js.Any]) | (Partial[ServiceMethods[_] with SetupMethod]) | Application[js.Any], 
    T
  ]
  type FeathersServiceOptions = js.Any
  type Omit[T, K] = Pick[T, Exclude[String, K]]
}

