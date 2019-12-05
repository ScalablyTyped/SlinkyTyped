package typingsSlinky.baconjs

import typingsSlinky.baconjs.typesObservableMod.Property
import typingsSlinky.baconjs.typesScanMod.Accumulator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baconjs/types/fold", JSImport.Namespace)
@js.native
object typesFoldMod extends js.Object {
  def default[In, Out](src: typingsSlinky.baconjs.typesObservableMod.default[In], seed: Out, f: Accumulator[In, Out]): Property[Out] = js.native
}

