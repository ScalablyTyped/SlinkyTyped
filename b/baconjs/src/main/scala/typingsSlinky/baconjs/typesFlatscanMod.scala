package typingsSlinky.baconjs

import typingsSlinky.baconjs.typesObservableMod.Observable
import typingsSlinky.baconjs.typesObservableMod.Property
import typingsSlinky.baconjs.typesTypesMod.Function2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baconjs/types/flatscan", JSImport.Namespace)
@js.native
object typesFlatscanMod extends js.Object {
  def flatScan[In, Out](src: Observable[In], seed: Out, f: Function2[Out, In, Observable[Out] | Out]): Property[Out] = js.native
}

