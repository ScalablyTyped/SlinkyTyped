package typingsSlinky.expressJwt.anon

import typingsSlinky.express.mod.RequestHandler
import typingsSlinky.express.mod.Request_
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressServeStaticCore.mod.Query
import typingsSlinky.expressUnless.mod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FnCall extends js.Object {
  
  def apply(): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  def apply(options: js.Function1[/* req */ Request_[ParamsDictionary, _, _, Query], Boolean]): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  def apply(options: Options): RequestHandler[ParamsDictionary, _, _, Query] = js.native
}
