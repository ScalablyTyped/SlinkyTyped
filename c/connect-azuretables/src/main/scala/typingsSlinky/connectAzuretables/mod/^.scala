package typingsSlinky.connectAzuretables.mod

import typingsSlinky.express.mod.RequestHandler
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressSession.mod.SessionOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("connect-azuretables", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(session: js.Function1[/* options */ js.UndefOr[SessionOptions], RequestHandler[ParamsDictionary]]): AzureTableStoreFactory = js.native
}

