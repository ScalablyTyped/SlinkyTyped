package typingsSlinky.plottable.plotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* keyof plottable.anon.Canvas */ /* Rewritten from type alias, can be one of: 
  - typingsSlinky.plottable.plottableStrings.svg
  - typingsSlinky.plottable.plottableStrings.canvas
*/
trait Renderer extends js.Object

@JSImport("plottable/build/src/plots/plot", "Renderer")
@js.native
object Renderer extends js.Object {
  var canvas: typingsSlinky.plottable.plottableStrings.canvas = js.native
  var svg: typingsSlinky.plottable.plottableStrings.svg = js.native
}

