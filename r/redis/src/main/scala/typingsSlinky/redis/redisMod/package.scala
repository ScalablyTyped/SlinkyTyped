package typingsSlinky.redis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object redisMod {
  type Callback[T] = js.Function2[/* err */ js.Error | Null, /* reply */ T, Unit]
  type RetryStrategy = js.Function1[/* options */ RetryStrategyOptions, Double | js.Error]
}
