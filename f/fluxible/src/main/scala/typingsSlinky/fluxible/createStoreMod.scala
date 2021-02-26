package typingsSlinky.fluxible

import typingsSlinky.dispatchr.createStoreMod.StoreOptions
import typingsSlinky.dispatchr.createStoreMod.StoreThis
import typingsSlinky.dispatchr.mod.StoreClass
import typingsSlinky.std.ThisType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object createStoreMod {
  
  @JSImport("fluxible/addons/createStore", JSImport.Namespace)
  @js.native
  def apply[T /* <: StoreOptions */](options: T with ThisType[StoreThis[T]]): StoreClass = js.native
}
