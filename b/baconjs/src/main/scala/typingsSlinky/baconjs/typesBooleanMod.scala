package typingsSlinky.baconjs

import typingsSlinky.baconjs.typesObservableMod.Property
import typingsSlinky.baconjs.typesObservableMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baconjs/types/boolean", JSImport.Namespace)
@js.native
object typesBooleanMod extends js.Object {
  def and(left: Property[_], right: Property[_]): Property[Boolean] = js.native
  def not(src: default[_]): default[Boolean] = js.native
  def or(left: Property[_], right: Property[_]): Property[Boolean] = js.native
}

