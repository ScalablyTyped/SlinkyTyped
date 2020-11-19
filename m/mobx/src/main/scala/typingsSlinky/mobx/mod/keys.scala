package typingsSlinky.mobx.mod

import typingsSlinky.mobx.observablearrayMod.IObservableArray
import typingsSlinky.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mobx", "keys")
@js.native
object keys extends js.Object {
  
  def apply[T](ar: IObservableArray[T]): js.Array[Double] = js.native
  def apply[K](map: typingsSlinky.mobx.internalMod.ObservableMap[K, _]): js.Array[K] = js.native
  def apply[T /* <: js.Object */](obj: T): js.Array[PropertyKey] = js.native
  def apply[T](set: typingsSlinky.mobx.internalMod.ObservableSet[T]): js.Array[T] = js.native
}
