package typingsSlinky.i18nextDashExpressDashMiddleware.i18nextDashExpressDashMiddlewareMod

import typingsSlinky.express.expressMod.Request
import typingsSlinky.express.expressMod.Response
import typingsSlinky.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.ParamsDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LanguageDetectorInterface extends js.Object {
  var cacheUserLanguage: js.UndefOr[
    js.Function4[
      /* req */ Request[ParamsDictionary], 
      /* res */ Response, 
      /* lng */ String, 
      /* options */ js.UndefOr[js.Object], 
      Unit
    ]
  ] = js.native
  var name: String = js.native
  def lookup(req: Request[ParamsDictionary], res: Response): String | js.Array[String] = js.native
  def lookup(req: Request[ParamsDictionary], res: Response, options: LanguageDetectorInterfaceOptions): String | js.Array[String] = js.native
}

