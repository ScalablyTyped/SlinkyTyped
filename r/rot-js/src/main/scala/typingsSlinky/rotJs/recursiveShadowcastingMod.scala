package typingsSlinky.rotJs

import typingsSlinky.rotJs.fovFovMod.VisibilityCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object recursiveShadowcastingMod {
  
  @JSImport("rot-js/lib/fov/recursive-shadowcasting", JSImport.Default)
  @js.native
  class default () extends RecursiveShadowcasting
  
  @js.native
  trait RecursiveShadowcasting
    extends typingsSlinky.rotJs.fovFovMod.default {
    
    /**
      * Actually calculates the visibility
      * @param {int} startX The starting X coordinate
      * @param {int} startY The starting Y coordinate
      * @param {int} row The row to render
      * @param {float} visSlopeStart The slope to start at
      * @param {float} visSlopeEnd The slope to end at
      * @param {int} radius The radius to reach out to
      * @param {int} xx
      * @param {int} xy
      * @param {int} yx
      * @param {int} yy
      * @param {function} callback The callback to use when we hit a block that is visible
      */
    def _castVisibility(
      startX: Double,
      startY: Double,
      row: Double,
      visSlopeStart: Double,
      visSlopeEnd: Double,
      radius: Double,
      xx: Double,
      xy: Double,
      yx: Double,
      yy: Double,
      callback: VisibilityCallback
    ): Unit = js.native
    
    /**
      * Render one octant (45-degree arc) of the viewshed
      * @param {int} x
      * @param {int} y
      * @param {int} octant Octant to be rendered
      * @param {int} R Maximum visibility radius
      * @param {function} callback
      */
    def _renderOctant(x: Double, y: Double, octant: js.Array[Double], R: Double, callback: VisibilityCallback): Unit = js.native
    
    /**
      * Compute visibility for a 180-degree arc
      * @param {int} x
      * @param {int} y
      * @param {int} R Maximum visibility radius
      * @param {int} dir Direction to look in (expressed in a ROT.DIRS value);
      * @param {function} callback
      */
    def compute180(x: Double, y: Double, R: Double, dir: Double, callback: VisibilityCallback): Unit = js.native
    
    /**
      * Compute visibility for a 90-degree arc
      * @param {int} x
      * @param {int} y
      * @param {int} R Maximum visibility radius
      * @param {int} dir Direction to look in (expressed in a ROT.DIRS value);
      * @param {function} callback
      */
    def compute90(x: Double, y: Double, R: Double, dir: Double, callback: VisibilityCallback): Unit = js.native
  }
}
