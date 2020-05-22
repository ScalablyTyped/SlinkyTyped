package typingsSlinky.relayRuntime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object relayObservableMod {
  type ObservableFromValue[T] = typingsSlinky.relayRuntime.relayObservableMod.Subscribable[T] | js.Promise[T] | T
  type Source[T] = js.Function1[
    /* sink */ typingsSlinky.relayRuntime.relayObservableMod.Sink[T], 
    scala.Unit | typingsSlinky.relayRuntime.relayObservableMod.Subscription | js.Function0[js.Any]
  ]
}
