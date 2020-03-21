package typingsSlinky.rollingRateLimiter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type AsyncLimiter = typingsSlinky.rollingRateLimiter.mod.AsyncLimiterWithToken
  type AsyncLimiterCallback = js.Function3[
    /* err */ js.Any, 
    /* timeLeft */ scala.Double, 
    /* actionsLeft */ scala.Double, 
    scala.Unit
  ]
  type AsyncLimiterWithToken = js.Function2[
    /* token */ java.lang.String, 
    /* callback */ typingsSlinky.rollingRateLimiter.mod.AsyncLimiterCallback, 
    scala.Unit
  ]
  type AsyncLimiterWithoutToken = js.Function1[
    /* callback */ typingsSlinky.rollingRateLimiter.mod.AsyncLimiterCallback, 
    scala.Unit
  ]
  type InMemoryOptions = typingsSlinky.rollingRateLimiter.mod.GeneralOptions
  type SyncLimiter = js.Function1[/* token */ js.UndefOr[java.lang.String], scala.Double]
  type SyncOrAsyncLimiter = typingsSlinky.rollingRateLimiter.mod.SyncLimiter with typingsSlinky.rollingRateLimiter.mod.AsyncLimiter
}
