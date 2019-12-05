package typingsSlinky.baconjs

import typingsSlinky.baconjs.typesDiffMod.Differ
import typingsSlinky.baconjs.typesObservableMod.Property
import typingsSlinky.baconjs.typesObservableMod.default
import typingsSlinky.baconjs.typesTypesMod.Function2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baconjs/types/diff", JSImport.Namespace)
@js.native
object typesDiffMod extends js.Object {
  def diff[V, V2](src: default[V], start: V, f: Differ[V, V2]): Property[V2] = js.native
  type Differ[V, V2] = Function2[V, V, V2]
}

