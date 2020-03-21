package typingsSlinky.ember.mod.Ember

import typingsSlinky.emberObject.typesMod.UnwrapComputedPropertySetters
import typingsSlinky.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ember", "Ember.setProperties")
@js.native
object setProperties extends js.Object {
  def apply[T, K /* <: java.lang.String */](obj: T, hash: Pick[T | UnwrapComputedPropertySetters[T], K]): Pick[T, K] = js.native
}

