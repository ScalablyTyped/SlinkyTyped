package typingsSlinky.emberObject.mod

import typingsSlinky.emberObject.typesMod.UnwrapComputedPropertyGetters
import typingsSlinky.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ember/object", "getProperties")
@js.native
object getProperties extends js.Object {
  
  def apply[T, K /* <: /* keyof T */ String */](obj: T, list: K*): Pick[UnwrapComputedPropertyGetters[T], K] = js.native
  def apply[T, K /* <: /* keyof T */ String */](obj: T, list: js.Array[K]): Pick[UnwrapComputedPropertyGetters[T], K] = js.native
}
