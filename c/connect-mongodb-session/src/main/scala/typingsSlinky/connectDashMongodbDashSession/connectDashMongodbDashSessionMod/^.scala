package typingsSlinky.connectDashMongodbDashSession.connectDashMongodbDashSessionMod

import typingsSlinky.connectDashMongodbDashSession.connectDashMongodbDashSessionMod.connectMongodbSession.MongoDBStore
import typingsSlinky.express.expressMod.RequestHandler
import typingsSlinky.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.ParamsDictionary
import typingsSlinky.expressDashSession.expressDashSessionMod.SessionOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("connect-mongodb-session", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(fn: js.Function1[/* options */ js.UndefOr[SessionOptions], RequestHandler[ParamsDictionary]]): MongoDBStore = js.native
}

