package typingsSlinky.plottable

import typingsSlinky.plottable.canvasBufferMod.CanvasBuffer
import typingsSlinky.plottable.canvasDrawerMod.CanvasDrawStep
import typingsSlinky.plottable.datasetMod.Dataset
import typingsSlinky.plottable.interfacesMod.IAccessor
import typingsSlinky.plottable.svgDrawerMod.SVGDrawer
import typingsSlinky.plottable.symbolFactoriesMod.SymbolFactory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object symbolDrawerMod {
  
  @JSImport("plottable/build/src/drawers/symbolDrawer", "SymbolSVGDrawer")
  @js.native
  class SymbolSVGDrawer () extends SVGDrawer
  
  @JSImport("plottable/build/src/drawers/symbolDrawer", "makeSymbolCanvasDrawStep")
  @js.native
  def makeSymbolCanvasDrawStep(
    dataset: Dataset,
    symbolProjector: js.Function0[IAccessor[SymbolFactory]],
    sizeProjector: js.Function0[IAccessor[Double]]
  ): CanvasDrawStep = js.native
  @JSImport("plottable/build/src/drawers/symbolDrawer", "makeSymbolCanvasDrawStep")
  @js.native
  def makeSymbolCanvasDrawStep(
    dataset: Dataset,
    symbolProjector: js.Function0[IAccessor[SymbolFactory]],
    sizeProjector: js.Function0[IAccessor[Double]],
    stepBuffer: CanvasBuffer
  ): CanvasDrawStep = js.native
}
