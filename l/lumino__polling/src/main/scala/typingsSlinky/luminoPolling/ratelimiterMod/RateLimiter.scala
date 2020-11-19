package typingsSlinky.luminoPolling.ratelimiterMod

import typingsSlinky.luminoCoreutils.mod.PromiseDelegate
import typingsSlinky.luminoPolling.luminoPollingStrings.invoked
import typingsSlinky.luminoPolling.mod.IRateLimiter
import typingsSlinky.luminoPolling.pollMod.Poll
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@lumino/polling/types/ratelimiter", "RateLimiter")
@js.native
abstract class RateLimiter[T, U] protected () extends IRateLimiter[T, U] {
  /**
    * Instantiate a rate limiter.
    *
    * @param fn - The function to rate limit.
    *
    * @param limit - The rate limit; defaults to 500ms.
    */
  def this(fn: js.Function0[T | js.Promise[T]]) = this()
  def this(fn: js.Function0[T | js.Promise[T]], limit: Double) = this()
  
  /**
    * A promise that resolves on each successful invocation.
    */
  var payload: PromiseDelegate[T] | Null = js.native
  
  /**
    * The underlying poll instance used by the rate limiter.
    */
  var poll: Poll[T, U, invoked] = js.native
}
