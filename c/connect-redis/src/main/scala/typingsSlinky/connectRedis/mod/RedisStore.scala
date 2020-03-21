package typingsSlinky.connectRedis.mod

import org.scalablytyped.runtime.Instantiable1
import typingsSlinky.expressSession.mod.Store
import typingsSlinky.ioredis.mod.Redis
import typingsSlinky.redis.mod.RedisClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RedisStore
  extends Store
     with Instantiable1[/* options */ RedisStoreOptions, RedisStore] {
  var client: RedisClient | Redis = js.native
}

