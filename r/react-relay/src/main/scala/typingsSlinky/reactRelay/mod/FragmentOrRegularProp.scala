package typingsSlinky.reactRelay.mod

import typingsSlinky.relayRuntime.mod._FragmentRefs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - T
  - js.Array[typingsSlinky.relayRuntime.mod._FragmentRefs[js.Any]]
  - typingsSlinky.relayRuntime.mod._FragmentRefs[js.Any]
*/
trait FragmentOrRegularProp[T] extends js.Object

object FragmentOrRegularProp {
  @scala.inline
  implicit def apply[T](value: js.Array[_FragmentRefs[js.Any]]): FragmentOrRegularProp[T] = value.asInstanceOf[FragmentOrRegularProp[T]]
  @scala.inline
  implicit def apply[T](value: T): FragmentOrRegularProp[T] = value.asInstanceOf[FragmentOrRegularProp[T]]
  @scala.inline
  implicit def apply[T](value: _FragmentRefs[js.Any]): FragmentOrRegularProp[T] = value.asInstanceOf[FragmentOrRegularProp[T]]
}

