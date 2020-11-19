package typingsSlinky.plottable

import typingsSlinky.plottable.canvasBufferMod.CanvasBuffer
import typingsSlinky.plottable.canvasDrawerMod.CanvasDrawStep
import typingsSlinky.plottable.datasetMod.Dataset
import typingsSlinky.plottable.interfacesMod.IAccessor
import typingsSlinky.plottable.svgDrawerMod.SVGDrawer
import typingsSlinky.plottable.symbolFactoriesMod.SymbolFactory
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("plottable/build/src/drawers/symbolDrawer", JSImport.Namespace)
@js.native
object symbolDrawerMod extends js.Object {
  
  def makeSymbolCanvasDrawStep(
    dataset: Dataset,
    symbolProjector: js.Function0[IAccessor[SymbolFactory]],
    sizeProjector: js.Function0[IAccessor[Double]]
  ): CanvasDrawStep = js.native
  def makeSymbolCanvasDrawStep(
    dataset: Dataset,
    symbolProjector: js.Function0[IAccessor[SymbolFactory]],
    sizeProjector: js.Function0[IAccessor[Double]],
    stepBuffer: CanvasBuffer
  ): CanvasDrawStep = js.native
  
  @js.native
  class SymbolSVGDrawer () extends SVGDrawer
}
