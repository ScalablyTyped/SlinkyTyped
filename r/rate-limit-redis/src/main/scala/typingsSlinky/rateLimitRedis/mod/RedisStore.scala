package typingsSlinky.rateLimitRedis.mod

import typingsSlinky.expressRateLimit.mod.Store
import typingsSlinky.expressRateLimit.mod.StoreIncrementCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RedisStore extends Store
object RedisStore {
  
  @scala.inline
  def apply(
    decrement: String => Unit,
    incr: (String, StoreIncrementCallback) => Unit,
    resetAll: () => Unit,
    resetKey: String => Unit
  ): RedisStore = {
    val __obj = js.Dynamic.literal(decrement = js.Any.fromFunction1(decrement), incr = js.Any.fromFunction2(incr), resetAll = js.Any.fromFunction0(resetAll), resetKey = js.Any.fromFunction1(resetKey))
    __obj.asInstanceOf[RedisStore]
  }
}
