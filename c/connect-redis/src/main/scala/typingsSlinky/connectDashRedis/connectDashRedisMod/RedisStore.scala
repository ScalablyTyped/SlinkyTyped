package typingsSlinky.connectDashRedis.connectDashRedisMod

import org.scalablytyped.runtime.Instantiable1
import typingsSlinky.expressDashSession.expressDashSessionMod.Store
import typingsSlinky.ioredis.ioredisMod.Redis
import typingsSlinky.redis.redisMod.RedisClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RedisStore
  extends Store
     with Instantiable1[/* options */ RedisStoreOptions, RedisStore] {
  var client: RedisClient | Redis = js.native
}

