package typingsSlinky.plottable.mod

import org.scalajs.dom.raw.CanvasRenderingContext2D
import typingsSlinky.plottable.canvasDrawerMod.CanvasDrawer
import typingsSlinky.plottable.svgDrawerMod.SVGDrawer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("plottable", "ProxyDrawer")
@js.native
class ProxyDrawer protected ()
  extends typingsSlinky.plottable.drawerMod.ProxyDrawer {
  /**
    * A Drawer draws svg elements based on the input Dataset.
    *
    * @constructor
    * @param _svgDrawerFactory A factory that will be invoked to create an SVGDrawer whenever useSVG is called
    * @param _canvasDrawStep The DrawStep to be fed into a new CanvasDrawer whenever useCanvas is called
    */
  def this(
    _svgDrawerFactory: js.Function0[SVGDrawer],
    _canvasDrawerFactory: js.Function1[/* ctx */ CanvasRenderingContext2D, CanvasDrawer]
  ) = this()
}
