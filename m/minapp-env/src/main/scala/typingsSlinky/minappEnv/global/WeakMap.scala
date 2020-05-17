package typingsSlinky.minappEnv.global

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.minappEnv.Iterable
import typingsSlinky.minappEnv.WeakMapConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("WeakMap")
@js.native
class WeakMap[K /* <: js.Object */, V] ()
  extends typingsSlinky.minappEnv.WeakMap[K, V] {
  def this(entries: typingsSlinky.minappEnv.Array[js.Tuple2[K, V]]) = this()
  def this(iterable: Iterable[js.Tuple2[K, V]]) = this()
}

@JSGlobal("WeakMap")
@js.native
object WeakMap extends TopLevel[WeakMapConstructor]

