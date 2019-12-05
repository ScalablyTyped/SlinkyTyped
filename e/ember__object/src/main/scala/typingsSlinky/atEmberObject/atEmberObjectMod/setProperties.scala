package typingsSlinky.atEmberObject.atEmberObjectMod

import typingsSlinky.atEmberObject.dashPrivateTypesMod.UnwrapComputedPropertyGetters
import typingsSlinky.atEmberObject.dashPrivateTypesMod.UnwrapComputedPropertySetters
import typingsSlinky.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ember/object", "setProperties")
@js.native
object setProperties extends js.Object {
  def apply[T, K /* <: String */](obj: T, hash: Pick[T | UnwrapComputedPropertySetters[T], K]): Pick[UnwrapComputedPropertyGetters[T], K] = js.native
}

