package typingsSlinky.connectRedis.mod

import typingsSlinky.express.mod.RequestHandler
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressServeStaticCore.mod.Query
import typingsSlinky.expressSession.mod.SessionOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("connect-redis", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  def apply(
    options: js.Function1[
      /* options */ js.UndefOr[SessionOptions], 
      RequestHandler[ParamsDictionary, _, _, Query]
    ]
  ): RedisStore = js.native
}
