package typingsSlinky.methodDashOverride.methodDashOverrideMod

import typingsSlinky.express.expressMod.Request
import typingsSlinky.express.expressMod.RequestHandler
import typingsSlinky.express.expressMod.Response
import typingsSlinky.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.ParamsDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("method-override", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(): RequestHandler[ParamsDictionary] = js.native
  def apply(getter: String): RequestHandler[ParamsDictionary] = js.native
  def apply(getter: String, options: MethodOverrideOptions): RequestHandler[ParamsDictionary] = js.native
  def apply(getter: js.Function2[/* req */ Request[ParamsDictionary], /* res */ Response, String]): RequestHandler[ParamsDictionary] = js.native
  def apply(
    getter: js.Function2[/* req */ Request[ParamsDictionary], /* res */ Response, String],
    options: MethodOverrideOptions
  ): RequestHandler[ParamsDictionary] = js.native
}

