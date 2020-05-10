package typingsSlinky.jupyterlabCoreutils

import typingsSlinky.jupyterlabCoreutils.interfacesMod.IRateLimiter
import typingsSlinky.jupyterlabCoreutils.jupyterlabCoreutilsStrings.invoked
import typingsSlinky.jupyterlabCoreutils.pollMod.Poll
import typingsSlinky.phosphorCoreutils.mod.PromiseDelegate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/coreutils/lib/ratelimiter", JSImport.Namespace)
@js.native
object ratelimiterMod extends js.Object {
  @js.native
  class Debouncer[T, U] () extends RateLimiter[T, U]
  
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
  
  @js.native
  class Throttler[T, U] () extends RateLimiter[T, U]
  
}

