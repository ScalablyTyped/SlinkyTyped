package typingsSlinky.grammarkdown.coreMod

import typingsSlinky.std.Map
import typingsSlinky.std.WeakMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("grammarkdown/dist/core", "mapSet")
@js.native
object mapSet extends js.Object {
  
  def apply[K, V](map: Map[K, V], key: K, value: V): V = js.native
  def apply[K /* <: js.Object */, V](map: WeakMap[K, V], key: K, value: V): V = js.native
}
