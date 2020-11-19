package typingsSlinky.plottable.plotsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("plottable/build/src/plots", "ClusteredBar")
@js.native
/**
  * A ClusteredBar Plot groups bars across Datasets based on the primary value of the bars.
  *   On a vertical ClusteredBar Plot, the bars with the same X value are grouped.
  *   On a horizontal ClusteredBar Plot, the bars with the same Y value are grouped.
  *
  * @constructor
  * @param {string} [orientation="vertical"] One of "vertical"/"horizontal".
  */
class ClusteredBar[X, Y] ()
  extends typingsSlinky.plottable.clusteredBarPlotMod.ClusteredBar[X, Y] {
  def this(orientation: typingsSlinky.plottable.barPlotMod.BarOrientation) = this()
}
