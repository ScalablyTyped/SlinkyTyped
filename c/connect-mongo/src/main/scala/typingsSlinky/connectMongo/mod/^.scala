package typingsSlinky.connectMongo.mod

import typingsSlinky.express.mod.RequestHandler
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressServeStaticCore.mod.Query
import typingsSlinky.expressSession.mod.SessionOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("connect-mongo", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  def apply(
    connect: js.Function1[
      /* options */ js.UndefOr[SessionOptions], 
      RequestHandler[ParamsDictionary, _, _, Query]
    ]
  ): MongoStoreFactory = js.native
}
