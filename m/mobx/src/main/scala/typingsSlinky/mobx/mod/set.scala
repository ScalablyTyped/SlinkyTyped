package typingsSlinky.mobx.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.mobx.observablearrayMod.IObservableArray
import typingsSlinky.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mobx", "set")
@js.native
object set extends js.Object {
  
  def apply[T /* <: js.Object */](obj: T, key: PropertyKey, value: js.Any): js.Any = js.native
  def apply[T /* <: js.Object */](obj: T, values: StringDictionary[js.Any]): js.Any = js.native
  def apply[V](obj: typingsSlinky.mobx.internalMod.ObservableMap[PropertyKey, V], values: StringDictionary[V]): js.Any = js.native
  def apply[T](obj: typingsSlinky.mobx.internalMod.ObservableSet[T], value: T): js.Any = js.native
  def apply[T](obj: IObservableArray[T], index: Double, value: T): js.Any = js.native
  def apply[K, V](obj: typingsSlinky.mobx.internalMod.ObservableMap[K, V], key: K, value: V): js.Any = js.native
}
