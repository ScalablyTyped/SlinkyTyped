package typingsSlinky.feathersjsExpress.anon

import typingsSlinky.bodyParser.mod.OptionsJson
import typingsSlinky.bodyParser.mod.OptionsUrlencoded
import typingsSlinky.connect.mod.NextHandleFunction
import typingsSlinky.express.mod.ErrorRequestHandler
import typingsSlinky.express.mod.RequestHandler
import typingsSlinky.express.mod.RouterOptions
import typingsSlinky.expressServeStaticCore.mod.Handler
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressServeStaticCore.mod.Query
import typingsSlinky.feathersjsFeathers.mod.Application
import typingsSlinky.serveStatic.mod.ServeStaticOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofself extends js.Object {
  /**
    * This is a built-in middleware function in Express. It parses incoming requests with JSON payloads and is based on body-parser.
    * @since 4.16.0
    */
  @JSName("json")
  var json_Original: FnCall = js.native
  @JSName("rest")
  val rest_Original: Call = js.native
  /**
    * This is a built-in middleware function in Express. It serves static files and is based on serve-static.
    */
  @JSName("static")
  var static_Original: Mime = js.native
  /**
    * This is a built-in middleware function in Express. It parses incoming requests with urlencoded payloads and is based on body-parser.
    * @since 4.16.0
    */
  @JSName("urlencoded")
  var urlencoded_Original: FnCallOptions = js.native
  def Router(): typingsSlinky.expressServeStaticCore.mod.Router = js.native
  def Router(options: RouterOptions): typingsSlinky.expressServeStaticCore.mod.Router = js.native
  def default[T](app: Application[T]): typingsSlinky.feathersjsExpress.mod.Application[T] = js.native
  def errorHandler(): ErrorRequestHandler[ParamsDictionary, _, _, Query] = js.native
  def errorHandler(options: Html): ErrorRequestHandler[ParamsDictionary, _, _, Query] = js.native
  /**
    * This is a built-in middleware function in Express. It parses incoming requests with JSON payloads and is based on body-parser.
    * @since 4.16.0
    */
  def json(): NextHandleFunction = js.native
  /**
    * This is a built-in middleware function in Express. It parses incoming requests with JSON payloads and is based on body-parser.
    * @since 4.16.0
    */
  def json(options: OptionsJson): NextHandleFunction = js.native
  def notFound(): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  def rest(): js.Function0[Unit] = js.native
  def rest(handler: RequestHandler[ParamsDictionary, _, _, Query]): js.Function0[Unit] = js.native
  /**
    * This is a built-in middleware function in Express. It serves static files and is based on serve-static.
    */
  def static(root: String): Handler = js.native
  /**
    * This is a built-in middleware function in Express. It serves static files and is based on serve-static.
    */
  def static(root: String, options: ServeStaticOptions): Handler = js.native
  /**
    * This is a built-in middleware function in Express. It parses incoming requests with urlencoded payloads and is based on body-parser.
    * @since 4.16.0
    */
  def urlencoded(): NextHandleFunction = js.native
  /**
    * This is a built-in middleware function in Express. It parses incoming requests with urlencoded payloads and is based on body-parser.
    * @since 4.16.0
    */
  def urlencoded(options: OptionsUrlencoded): NextHandleFunction = js.native
}

