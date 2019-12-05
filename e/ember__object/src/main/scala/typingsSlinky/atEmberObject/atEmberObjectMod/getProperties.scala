package typingsSlinky.atEmberObject.atEmberObjectMod

import typingsSlinky.atEmberObject.dashPrivateTypesMod.UnwrapComputedPropertyGetters
import typingsSlinky.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ember/object", "getProperties")
@js.native
object getProperties extends js.Object {
  def apply[T, K /* <: String */](obj: T, list: K*): Pick[UnwrapComputedPropertyGetters[T], K] = js.native
  def apply[T, K /* <: String */](obj: T, list: js.Array[K]): Pick[UnwrapComputedPropertyGetters[T], K] = js.native
}

