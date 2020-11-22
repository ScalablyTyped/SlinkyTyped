package typingsSlinky.emberObject.mod

import typingsSlinky.emberObject.typesMod.UnwrapComputedPropertyGetters
import typingsSlinky.emberObject.typesMod.UnwrapComputedPropertySetters
import typingsSlinky.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ember/object", "setProperties")
@js.native
object setProperties extends js.Object {
  
  def apply[T, K /* <: /* keyof T */ String */](obj: T, hash: Pick[T | UnwrapComputedPropertySetters[T], K]): Pick[UnwrapComputedPropertyGetters[T], K] = js.native
}
