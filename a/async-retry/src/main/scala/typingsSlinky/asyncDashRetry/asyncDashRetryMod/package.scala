package typingsSlinky.asyncDashRetry

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object asyncDashRetryMod {
  type RetryFunction[A] = js.Function2[
    /* bail */ js.Function1[/* e */ js.Error, Unit], 
    /* attempt */ Double, 
    A | js.Promise[A]
  ]
}
