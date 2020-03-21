package typingsSlinky.coreJs.core

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.std.WeakMapConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("core.WeakMap")
@js.native
class WeakMap[K /* <: js.Object */, V] ()
  extends typingsSlinky.std.WeakMap[K, V] {
  def this(entries: js.Array[js.Tuple2[K, V]]) = this()
}

@JSGlobal("core.WeakMap")
@js.native
object WeakMap extends TopLevel[WeakMapConstructor]

