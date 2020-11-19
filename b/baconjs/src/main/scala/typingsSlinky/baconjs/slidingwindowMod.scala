package typingsSlinky.baconjs

import typingsSlinky.baconjs.observableMod.Observable
import typingsSlinky.baconjs.observableMod.Property
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("baconjs/types/slidingwindow", JSImport.Namespace)
@js.native
object slidingwindowMod extends js.Object {
  
  def slidingWindow[V](src: Observable[V], maxValues: Double): Property[js.Array[V]] = js.native
  def slidingWindow[V](src: Observable[V], maxValues: Double, minValues: Double): Property[js.Array[V]] = js.native
}
