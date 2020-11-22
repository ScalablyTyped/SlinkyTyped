package typingsSlinky.ember.mod.default

import typingsSlinky.emberObject.typesMod.UnwrapComputedPropertyGetters
import typingsSlinky.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ember", "getProperties")
@js.native
object getProperties extends js.Object {
  
  def apply[T, K /* <: /* keyof T */ java.lang.String */](obj: T, list: K*): Pick[UnwrapComputedPropertyGetters[T], K] = js.native
  def apply[T, K /* <: /* keyof T */ java.lang.String */](obj: T, list: js.Array[K]): Pick[UnwrapComputedPropertyGetters[T], K] = js.native
}
