package typingsSlinky.reactRelay.mod

import typingsSlinky.relayRuntime.relayObservableMod.Observer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.relayRuntime.relayObservableMod.Observer[scala.Unit]
  - js.Function1[/ * error * / js.UndefOr[typingsSlinky.std.Error | scala.Null], scala.Unit]
*/
trait ObserverOrCallback extends js.Object

object ObserverOrCallback {
  @scala.inline
  implicit def apply(value: js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit]): ObserverOrCallback = value.asInstanceOf[ObserverOrCallback]
  @scala.inline
  implicit def apply(value: Observer[Unit]): ObserverOrCallback = value.asInstanceOf[ObserverOrCallback]
}

