package typingsSlinky.es6Shim

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("WeakMap")
@js.native
class WeakMapCls[K /* <: js.Object */, V] () extends WeakMap[K, V] {
  def this(iterable: IterableShim[js.Tuple2[K, V]]) = this()
}

