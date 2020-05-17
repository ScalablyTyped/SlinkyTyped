package typingsSlinky.relayRuntime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object relayObservableMod {
  type Source[T] = js.Function1[
    /* sink */ typingsSlinky.relayRuntime.relayObservableMod.Sink[T], 
    scala.Unit | typingsSlinky.relayRuntime.relayObservableMod.Subscription | js.Function0[js.Any]
  ]
}
