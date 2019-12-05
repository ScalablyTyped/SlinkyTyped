package typingsSlinky.connectDashMongo.connectDashMongoMod

import typingsSlinky.express.expressMod.RequestHandler
import typingsSlinky.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.ParamsDictionary
import typingsSlinky.expressDashSession.expressDashSessionMod.SessionOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("connect-mongo", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(connect: js.Function1[/* options */ js.UndefOr[SessionOptions], RequestHandler[ParamsDictionary]]): MongoStoreFactory = js.native
}

