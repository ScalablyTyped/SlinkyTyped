package typingsSlinky.fluxible

import typingsSlinky.dispatchr.createStoreMod.StoreOptions
import typingsSlinky.dispatchr.createStoreMod.StoreThis
import typingsSlinky.dispatchr.mod.StoreClass
import typingsSlinky.std.ThisType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fluxible/addons/createStore", JSImport.Namespace)
@js.native
object createStoreMod extends js.Object {
  def apply[T /* <: StoreOptions */](options: T with ThisType[StoreThis[T]]): StoreClass = js.native
}

