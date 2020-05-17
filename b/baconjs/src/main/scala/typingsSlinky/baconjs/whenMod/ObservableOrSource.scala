package typingsSlinky.baconjs.whenMod

import typingsSlinky.baconjs.sourceMod.Source
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.baconjs.observableMod.default[V]
  - typingsSlinky.baconjs.sourceMod.Source[js.Any, V]
*/
trait ObservableOrSource[V] extends js.Object

object ObservableOrSource {
  @scala.inline
  implicit def apply[V](value: Source[js.Any, V]): ObservableOrSource[V] = value.asInstanceOf[ObservableOrSource[V]]
  @scala.inline
  implicit def apply[V](value: typingsSlinky.baconjs.observableMod.default[V]): ObservableOrSource[V] = value.asInstanceOf[ObservableOrSource[V]]
}

