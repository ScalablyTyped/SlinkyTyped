package typingsSlinky.plottable

import typingsSlinky.plottable.anon.X
import typingsSlinky.plottable.interfacesMod.Point
import typingsSlinky.plottable.scaleMod.TransformableScale
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object interactionsMod {
  
  @JSImport("plottable/build/src/interactions", "Click")
  @js.native
  class Click ()
    extends typingsSlinky.plottable.clickInteractionMod.Click
  /* static members */
  object Click {
    
    @JSImport("plottable/build/src/interactions", "Click._pointsEqual")
    @js.native
    def _pointsEqual(p1: js.Any, p2: js.Any): js.Any = js.native
  }
  
  @JSImport("plottable/build/src/interactions", "Drag")
  @js.native
  class Drag ()
    extends typingsSlinky.plottable.dragInteractionMod.Drag {
    def this(mouseButton: Double) = this()
  }
  /* static members */
  object Drag {
    
    @JSImport("plottable/build/src/interactions", "Drag")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("plottable/build/src/interactions", "Drag._DEFAULT_MOUSE_FILTER")
    @js.native
    def _DEFAULT_MOUSE_FILTER: js.Any = js.native
    @scala.inline
    def _DEFAULT_MOUSE_FILTER_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_DEFAULT_MOUSE_FILTER")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("plottable/build/src/interactions", "Key")
  @js.native
  class Key ()
    extends typingsSlinky.plottable.keyInteractionMod.Key
  
  @JSImport("plottable/build/src/interactions", "PanZoom")
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
    extends typingsSlinky.plottable.panZoomInteractionMod.PanZoom {
    def this(xScale: TransformableScale[_, Double]) = this()
    def this(xScale: js.UndefOr[scala.Nothing], yScale: TransformableScale[_, Double]) = this()
    def this(xScale: TransformableScale[_, Double], yScale: TransformableScale[_, Double]) = this()
  }
  /* static members */
  object PanZoom {
    
    @JSImport("plottable/build/src/interactions", "PanZoom")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * The number of pixels occupied in a line.
      */
    @JSImport("plottable/build/src/interactions", "PanZoom._PIXELS_PER_LINE")
    @js.native
    def _PIXELS_PER_LINE: js.Any = js.native
    @scala.inline
    def _PIXELS_PER_LINE_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_PIXELS_PER_LINE")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable/build/src/interactions", "PanZoom._pointDistance")
    @js.native
    def _pointDistance(point1: js.Any, point2: js.Any): js.Any = js.native
    
    @JSImport("plottable/build/src/interactions", "PanZoom.centerPoint")
    @js.native
    def centerPoint(point1: Point, point2: Point): X = js.native
  }
  
  @JSImport("plottable/build/src/interactions", "Pointer")
  @js.native
  class Pointer ()
    extends typingsSlinky.plottable.pointerInteractionMod.Pointer
  
  @JSImport("plottable/build/src/interactions", "zoomOut")
  @js.native
  def zoomOut(value: Double, zoom: Double, center: Double): Double = js.native
}
