package typingsSlinky.redisRateLimiter.mod

import typingsSlinky.express.mod.RequestHandler
import typingsSlinky.express.mod.Request_
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressServeStaticCore.mod.Query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redis-rate-limiter", JSImport.Namespace)
@js.native
class ^ () extends RedisRateLimiter

@JSImport("redis-rate-limiter", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def create(options: Options): js.Function2[
    /* req */ Request_[ParamsDictionary, _, _, Query], 
    /* callback */ js.Function2[/* err */ js.Error, /* res */ Response, Unit], 
    Unit
  ] = js.native
  def middleware(options: Options): RequestHandler[ParamsDictionary, _, _, Query] = js.native
}

