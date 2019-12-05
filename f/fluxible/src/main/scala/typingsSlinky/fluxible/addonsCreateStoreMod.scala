package typingsSlinky.fluxible

import typingsSlinky.dispatchr.addonsCreateStoreMod.StoreOptions
import typingsSlinky.dispatchr.addonsCreateStoreMod.StoreThis
import typingsSlinky.dispatchr.dispatchrMod.StoreClass
import typingsSlinky.std.ThisType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fluxible/addons/createStore", JSImport.Namespace)
@js.native
object addonsCreateStoreMod extends js.Object {
  def apply[T /* <: StoreOptions */](options: T with ThisType[StoreThis[T]]): StoreClass = js.native
}

