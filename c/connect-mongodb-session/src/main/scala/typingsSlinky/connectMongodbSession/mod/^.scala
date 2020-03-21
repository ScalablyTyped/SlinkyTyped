package typingsSlinky.connectMongodbSession.mod

import typingsSlinky.connectMongodbSession.mod.connectMongodbSession.MongoDBStore
import typingsSlinky.express.mod.RequestHandler
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressSession.mod.SessionOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("connect-mongodb-session", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(fn: js.Function1[/* options */ js.UndefOr[SessionOptions], RequestHandler[ParamsDictionary]]): MongoDBStore = js.native
}

