package typingsSlinky.baconjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesInternalUpdatebarrierMod {
  import typingsSlinky.baconjs.typesEventMod.Event

  type Call = js.Function0[js.Any]
  type EventSink[V] = Sink[Event[V]]
  type Sink[V] = js.Function1[/* value */ V, js.Any]
}
