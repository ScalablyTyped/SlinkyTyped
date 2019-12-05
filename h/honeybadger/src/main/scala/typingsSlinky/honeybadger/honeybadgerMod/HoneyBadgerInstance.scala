package typingsSlinky.honeybadger.honeybadgerMod

import typingsSlinky.express.expressMod.ErrorRequestHandler
import typingsSlinky.express.expressMod.RequestHandler
import typingsSlinky.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.NextFunction
import typingsSlinky.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.ParamsDictionary
import typingsSlinky.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.Request
import typingsSlinky.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.Response
import typingsSlinky.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HoneyBadgerInstance extends EventEmitter {
  @JSName("errorHandler")
  var errorHandler_Original: ErrorRequestHandler[ParamsDictionary] = js.native
  @JSName("requestHandler")
  var requestHandler_Original: RequestHandler[ParamsDictionary] = js.native
  def configure(options: ConfigureOptions): Unit = js.native
  def errorHandler(err: js.Any, req: Request[ParamsDictionary, _, _], res: Response[_], next: NextFunction): js.Any = js.native
  def factory(): HoneyBadgerInstance = js.native
  def factory(options: ConfigureOptions): HoneyBadgerInstance = js.native
  def lambdaHandler(handler: LambdaHandler): LambdaHandler = js.native
  def notify(err: js.Any): Unit = js.native
  def notify(err: js.Any, name: js.Any): Unit = js.native
  def notify(err: js.Any, name: js.Any, extra: CallbackFunction): Unit = js.native
  def notify(err: js.Any, name: js.Any, extra: CallbackFunction, callback: CallbackFunction): Unit = js.native
  def notify(err: js.Any, name: js.Any, extra: metadata): Unit = js.native
  def notify(err: js.Any, name: js.Any, extra: metadata, callback: CallbackFunction): Unit = js.native
  def onUncaughtException(func: js.Function1[/* error */ js.Error, Unit]): Unit = js.native
  def requestHandler(req: Request[ParamsDictionary, _, _], res: Response[_], next: NextFunction): js.Any = js.native
  def resetContext(): Unit = js.native
  def resetContext(context: js.Object): Unit = js.native
  def setContext(context: js.Object): Unit = js.native
}

