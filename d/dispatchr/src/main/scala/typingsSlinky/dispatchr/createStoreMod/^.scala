package typingsSlinky.dispatchr.createStoreMod

import typingsSlinky.dispatchr.mod.StoreClass
import typingsSlinky.std.ThisType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("dispatchr/addons/createStore", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  def apply[T /* <: StoreOptions */](options: T with ThisType[StoreThis[T]]): StoreClass = js.native
}
