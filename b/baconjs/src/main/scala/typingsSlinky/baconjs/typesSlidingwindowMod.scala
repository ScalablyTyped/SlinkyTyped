package typingsSlinky.baconjs

import typingsSlinky.baconjs.typesObservableMod.Observable
import typingsSlinky.baconjs.typesObservableMod.Property
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baconjs/types/slidingwindow", JSImport.Namespace)
@js.native
object typesSlidingwindowMod extends js.Object {
  def slidingWindow[V](src: Observable[V], maxValues: Double): Property[js.Array[V]] = js.native
  def slidingWindow[V](src: Observable[V], maxValues: Double, minValues: Double): Property[js.Array[V]] = js.native
}

