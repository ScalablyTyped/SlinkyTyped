package typingsSlinky.koa2Ratelimit.memoryStoreMod

import typingsSlinky.koa2Ratelimit.anon.Counter
import typingsSlinky.koa2Ratelimit.anon.RateLimitOptionskeystring
import typingsSlinky.koa2Ratelimit.mod.RateLimitOptions
import typingsSlinky.koa2Ratelimit.storeMod.Store
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MemoryStore extends Store
object MemoryStore {
  
  @scala.inline
  def apply(
    decrement: (String, RateLimitOptions, Double) => js.Promise[Unit],
    incr: (String, RateLimitOptions, Double) => js.Promise[Counter],
    saveAbuse: RateLimitOptionskeystring => js.Promise[Unit] | Unit
  ): MemoryStore = {
    val __obj = js.Dynamic.literal(decrement = js.Any.fromFunction3(decrement), incr = js.Any.fromFunction3(incr), saveAbuse = js.Any.fromFunction1(saveAbuse))
    __obj.asInstanceOf[MemoryStore]
  }
}
