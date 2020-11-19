package typingsSlinky.d3Collection.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.d3Collection.anon.Key
import typingsSlinky.d3Collection.anon.Value
import typingsSlinky.std.ArrayLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("d3-collection", "entries")
@js.native
object entries extends js.Object {
  
  def apply(obj: js.Object): js.Array[Value] = js.native
  def apply[T](obj: StringDictionary[T]): js.Array[Key[T]] = js.native
  def apply[T](obj: ArrayLike[T]): js.Array[Key[T]] = js.native
}
