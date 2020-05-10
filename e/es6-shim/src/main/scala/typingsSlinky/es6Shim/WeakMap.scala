package typingsSlinky.es6Shim

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WeakMap[K /* <: js.Object */, V] extends js.Object {
  def delete(key: K): Boolean = js.native
  def get(key: K): js.UndefOr[V] = js.native
  def has(key: K): Boolean = js.native
  def set(key: K, value: V): WeakMap[K, V] = js.native
}

@JSGlobal("WeakMap")
@js.native
object WeakMap extends TopLevel[WeakMapConstructor]

