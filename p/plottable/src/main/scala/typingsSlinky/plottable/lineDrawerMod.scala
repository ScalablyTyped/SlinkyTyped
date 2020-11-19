package typingsSlinky.plottable

import typingsSlinky.d3Shape.mod.Line_
import typingsSlinky.plottable.canvasDrawerMod.CanvasDrawStep
import typingsSlinky.plottable.svgDrawerMod.SVGDrawer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("plottable/build/src/drawers/lineDrawer", JSImport.Namespace)
@js.native
object lineDrawerMod extends js.Object {
  
  def makeLineCanvasDrawStep(d3LineFactory: js.Function0[Line_[_]]): CanvasDrawStep = js.native
  
  @js.native
  class LineSVGDrawer () extends SVGDrawer
}
