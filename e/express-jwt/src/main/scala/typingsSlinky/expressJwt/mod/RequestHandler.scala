package typingsSlinky.expressJwt.mod

import typingsSlinky.express.mod.Request_
import typingsSlinky.expressJwt.anon.FnCall
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressServeStaticCore.mod.Query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RequestHandler
  extends typingsSlinky.expressServeStaticCore.mod.RequestHandler[ParamsDictionary, js.Any, js.Any, Query] {
  
  def unless(): typingsSlinky.express.mod.RequestHandler[ParamsDictionary, _, _, Query] = js.native
  def unless(options: js.Function1[/* req */ Request_[ParamsDictionary, _, _, Query], Boolean]): typingsSlinky.express.mod.RequestHandler[ParamsDictionary, _, _, Query] = js.native
  def unless(options: typingsSlinky.expressUnless.mod.Options): typingsSlinky.express.mod.RequestHandler[ParamsDictionary, _, _, Query] = js.native
  @JSName("unless")
  var unless_Original: FnCall = js.native
}
