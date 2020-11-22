package typingsSlinky.honeybadger.mod

import typingsSlinky.express.mod.ErrorRequestHandler
import typingsSlinky.express.mod.RequestHandler
import typingsSlinky.expressServeStaticCore.mod.NextFunction
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressServeStaticCore.mod.Query
import typingsSlinky.expressServeStaticCore.mod.Request
import typingsSlinky.expressServeStaticCore.mod.Response
import typingsSlinky.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HoneyBadgerInstance extends EventEmitter {
  
  def configure(options: ConfigureOptions): Unit = js.native
  
  def errorHandler(
    err: js.Any,
    req: Request[ParamsDictionary, _, _, Query],
    res: Response[_, Double],
    next: NextFunction
  ): js.Any = js.native
  @JSName("errorHandler")
  var errorHandler_Original: ErrorRequestHandler[ParamsDictionary, _, _, Query] = js.native
  
  def factory(): HoneyBadgerInstance = js.native
  def factory(options: ConfigureOptions): HoneyBadgerInstance = js.native
  
  def lambdaHandler(handler: LambdaHandler): LambdaHandler = js.native
  
  def notify(
    err: js.UndefOr[scala.Nothing],
    name: js.UndefOr[scala.Nothing],
    extra: js.UndefOr[scala.Nothing],
    callback: CallbackFunction
  ): Unit = js.native
  def notify(err: js.UndefOr[scala.Nothing], name: js.UndefOr[scala.Nothing], extra: CallbackFunction): Unit = js.native
  def notify(
    err: js.UndefOr[scala.Nothing],
    name: js.UndefOr[scala.Nothing],
    extra: CallbackFunction,
    callback: CallbackFunction
  ): Unit = js.native
  def notify(err: js.UndefOr[scala.Nothing], name: js.UndefOr[scala.Nothing], extra: metadata): Unit = js.native
  def notify(
    err: js.UndefOr[scala.Nothing],
    name: js.UndefOr[scala.Nothing],
    extra: metadata,
    callback: CallbackFunction
  ): Unit = js.native
  def notify(err: js.UndefOr[scala.Nothing], name: js.Any): Unit = js.native
  def notify(
    err: js.UndefOr[scala.Nothing],
    name: js.Any,
    extra: js.UndefOr[scala.Nothing],
    callback: CallbackFunction
  ): Unit = js.native
  def notify(err: js.UndefOr[scala.Nothing], name: js.Any, extra: CallbackFunction): Unit = js.native
  def notify(err: js.UndefOr[scala.Nothing], name: js.Any, extra: CallbackFunction, callback: CallbackFunction): Unit = js.native
  def notify(err: js.UndefOr[scala.Nothing], name: js.Any, extra: metadata): Unit = js.native
  def notify(err: js.UndefOr[scala.Nothing], name: js.Any, extra: metadata, callback: CallbackFunction): Unit = js.native
  def notify(err: js.Any): Unit = js.native
  def notify(
    err: js.Any,
    name: js.UndefOr[scala.Nothing],
    extra: js.UndefOr[scala.Nothing],
    callback: CallbackFunction
  ): Unit = js.native
  def notify(err: js.Any, name: js.UndefOr[scala.Nothing], extra: CallbackFunction): Unit = js.native
  def notify(err: js.Any, name: js.UndefOr[scala.Nothing], extra: CallbackFunction, callback: CallbackFunction): Unit = js.native
  def notify(err: js.Any, name: js.UndefOr[scala.Nothing], extra: metadata): Unit = js.native
  def notify(err: js.Any, name: js.UndefOr[scala.Nothing], extra: metadata, callback: CallbackFunction): Unit = js.native
  def notify(err: js.Any, name: js.Any): Unit = js.native
  def notify(err: js.Any, name: js.Any, extra: js.UndefOr[scala.Nothing], callback: CallbackFunction): Unit = js.native
  def notify(err: js.Any, name: js.Any, extra: CallbackFunction): Unit = js.native
  def notify(err: js.Any, name: js.Any, extra: CallbackFunction, callback: CallbackFunction): Unit = js.native
  def notify(err: js.Any, name: js.Any, extra: metadata): Unit = js.native
  def notify(err: js.Any, name: js.Any, extra: metadata, callback: CallbackFunction): Unit = js.native
  
  def onUncaughtException(func: js.Function1[/* error */ js.Error, Unit]): Unit = js.native
  
  def requestHandler(req: Request[ParamsDictionary, _, _, Query], res: Response[_, Double], next: NextFunction): js.Any = js.native
  @JSName("requestHandler")
  var requestHandler_Original: RequestHandler[ParamsDictionary, _, _, Query] = js.native
  
  def resetContext(): Unit = js.native
  def resetContext(context: js.Object): Unit = js.native
  
  def setContext(context: js.Object): Unit = js.native
}
