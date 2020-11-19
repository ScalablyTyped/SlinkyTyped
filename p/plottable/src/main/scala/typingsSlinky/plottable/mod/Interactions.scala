package typingsSlinky.plottable.mod

import typingsSlinky.plottable.anon.X
import typingsSlinky.plottable.interfacesMod.Point
import typingsSlinky.plottable.scaleMod.TransformableScale
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("plottable", "Interactions")
@js.native
object Interactions extends js.Object {
  
  def zoomOut(value: Double, zoom: Double, center: Double): Double = js.native
  
  @js.native
  class Click ()
    extends typingsSlinky.plottable.interactionsMod.Click
  /* static members */
  @js.native
  object Click extends js.Object {
    
    /* private */ def _pointsEqual(p1: js.Any, p2: js.Any): js.Any = js.native
  }
  
  @js.native
  class Drag ()
    extends typingsSlinky.plottable.interactionsMod.Drag {
    def this(mouseButton: Double) = this()
  }
  /* static members */
  @js.native
  object Drag extends js.Object {
    
    var _DEFAULT_MOUSE_FILTER: js.Any = js.native
  }
  
  @js.native
  class Key ()
    extends typingsSlinky.plottable.keyInteractionMod.Key
  
  @js.native
  /**
    * A PanZoom Interaction updates the domains of an x-scale and/or a y-scale
    * in response to the user panning or zooming.
    *
    * @constructor
    * @param {TransformableScale} [xScale] The x-scale to update on panning/zooming.
    * @param {TransformableScale} [yScale] The y-scale to update on panning/zooming.
    */
  class PanZoom ()
    extends typingsSlinky.plottable.interactionsMod.PanZoom {
    def this(xScale: TransformableScale[_, Double]) = this()
    def this(xScale: js.UndefOr[scala.Nothing], yScale: TransformableScale[_, Double]) = this()
    def this(xScale: TransformableScale[_, Double], yScale: TransformableScale[_, Double]) = this()
  }
  /* static members */
  @js.native
  object PanZoom extends js.Object {
    
    /**
      * The number of pixels occupied in a line.
      */
    var _PIXELS_PER_LINE: js.Any = js.native
    
    /* private */ def _pointDistance(point1: js.Any, point2: js.Any): js.Any = js.native
    
    def centerPoint(point1: Point, point2: Point): X = js.native
  }
  
  @js.native
  class Pointer ()
    extends typingsSlinky.plottable.pointerInteractionMod.Pointer
}
