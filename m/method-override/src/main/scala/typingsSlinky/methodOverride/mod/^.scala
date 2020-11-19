package typingsSlinky.methodOverride.mod

import typingsSlinky.express.mod.RequestHandler
import typingsSlinky.express.mod.Request_
import typingsSlinky.express.mod.Response_
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressServeStaticCore.mod.Query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("method-override", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  def apply(): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  def apply(getter: js.UndefOr[scala.Nothing], options: MethodOverrideOptions): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  def apply(getter: String): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  def apply(getter: String, options: MethodOverrideOptions): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  def apply(
    getter: js.Function2[/* req */ Request_[ParamsDictionary, _, _, Query], /* res */ Response_[_], String]
  ): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  def apply(
    getter: js.Function2[/* req */ Request_[ParamsDictionary, _, _, Query], /* res */ Response_[_], String],
    options: MethodOverrideOptions
  ): RequestHandler[ParamsDictionary, _, _, Query] = js.native
}
