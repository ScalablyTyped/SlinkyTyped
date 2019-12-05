package typingsSlinky.popmotion

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libActionTypesMod {
  import typingsSlinky.popmotion.Anon_Init
  import typingsSlinky.popmotion.libObserverTypesMod.IObserver
  import typingsSlinky.popmotion.libObserverTypesMod.ObserverProps
  import typingsSlinky.std.Partial

  type ActionInit = js.Function1[/* observer */ IObserver, Partial[ColdSubscription] | Unit]
  type ActionProps = ObserverProps with Anon_Init
}
