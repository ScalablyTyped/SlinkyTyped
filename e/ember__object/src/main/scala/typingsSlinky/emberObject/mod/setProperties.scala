package typingsSlinky.emberObject.mod

import typingsSlinky.emberObject.typesMod.UnwrapComputedPropertyGetters
import typingsSlinky.emberObject.typesMod.UnwrapComputedPropertySetters
import typingsSlinky.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ember/object", "setProperties")
@js.native
object setProperties extends js.Object {
  def apply[T, K /* <: String */](obj: T, hash: Pick[T | UnwrapComputedPropertySetters[T], K]): Pick[UnwrapComputedPropertyGetters[T], K] = js.native
}

