package typingsSlinky.plottable

import typingsSlinky.d3Shape.mod.Area_
import typingsSlinky.d3Shape.mod.Line_
import typingsSlinky.plottable.canvasDrawerMod.CanvasDrawStep
import typingsSlinky.plottable.svgDrawerMod.SVGDrawer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("plottable/build/src/drawers/areaDrawer", JSImport.Namespace)
@js.native
object areaDrawerMod extends js.Object {
  
  def makeAreaCanvasDrawStep(d3AreaFactory: js.Function0[Area_[_]], d3LineFactory: js.Function0[Line_[_]]): CanvasDrawStep = js.native
  
  @js.native
  class AreaSVGDrawer () extends SVGDrawer
}
