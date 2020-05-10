package typingsSlinky.es6Shim

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("WeakSet")
@js.native
class WeakSetCls[T] () extends WeakSet[T] {
  def this(iterable: IterableShim[T]) = this()
}

