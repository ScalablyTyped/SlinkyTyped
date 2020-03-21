package typingsSlinky.reactRelay

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object useLoadMoreFunctionMod {
  type LoadMoreFn = js.Function2[
    /* count */ scala.Double, 
    /* options */ js.UndefOr[typingsSlinky.reactRelay.AnonOnComplete], 
    typingsSlinky.relayRuntime.relayRuntimeTypesMod.Disposable
  ]
}
