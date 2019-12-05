package typingsSlinky.oauthDashShim.oauthDashShimMod

import typingsSlinky.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.NextFunction
import typingsSlinky.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.ParamsDictionary
import typingsSlinky.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.RequestHandler
import typingsSlinky.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.Response
import typingsSlinky.oauthDashShim.Anon_Cb
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Handler
  extends RequestHandler[ParamsDictionary, js.Any, js.Any] {
  var credentials: Anon_Cb = js.native
  @JSName("interpret")
  var interpret_Original: typingsSlinky.express.expressMod.RequestHandler[ParamsDictionary] = js.native
  @JSName("proxy")
  var proxy_Original: typingsSlinky.express.expressMod.RequestHandler[ParamsDictionary] = js.native
  @JSName("redirect")
  var redirect_Original: typingsSlinky.express.expressMod.RequestHandler[ParamsDictionary] = js.native
  @JSName("unhandled")
  var unhandled_Original: typingsSlinky.express.expressMod.RequestHandler[ParamsDictionary] = js.native
  def init(configs: js.Array[Config]): Unit = js.native
  def interpret(
    req: typingsSlinky.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.Request[ParamsDictionary, _, _],
    res: Response[_],
    next: NextFunction
  ): js.Any = js.native
  def proxy(
    req: typingsSlinky.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.Request[ParamsDictionary, _, _],
    res: Response[_],
    next: NextFunction
  ): js.Any = js.native
  def redirect(
    req: typingsSlinky.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.Request[ParamsDictionary, _, _],
    res: Response[_],
    next: NextFunction
  ): js.Any = js.native
  def unhandled(
    req: typingsSlinky.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.Request[ParamsDictionary, _, _],
    res: Response[_],
    next: NextFunction
  ): js.Any = js.native
}

