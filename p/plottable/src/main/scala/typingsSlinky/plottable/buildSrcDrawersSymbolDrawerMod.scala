package typingsSlinky.plottable

import typingsSlinky.plottable.buildSrcCoreDatasetMod.Dataset
import typingsSlinky.plottable.buildSrcCoreInterfacesMod.IAccessor
import typingsSlinky.plottable.buildSrcCoreSymbolFactoriesMod.SymbolFactory
import typingsSlinky.plottable.buildSrcDrawersCanvasBufferMod.CanvasBuffer
import typingsSlinky.plottable.buildSrcDrawersCanvasDrawerMod.CanvasDrawStep
import typingsSlinky.plottable.buildSrcDrawersSvgDrawerMod.SVGDrawer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("plottable/build/src/drawers/symbolDrawer", JSImport.Namespace)
@js.native
object buildSrcDrawersSymbolDrawerMod extends js.Object {
  @js.native
  class SymbolSVGDrawer () extends SVGDrawer
  
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
}

