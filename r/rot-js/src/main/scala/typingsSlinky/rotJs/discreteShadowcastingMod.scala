package typingsSlinky.rotJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rot-js/lib/fov/discrete-shadowcasting", JSImport.Namespace)
@js.native
object discreteShadowcastingMod extends js.Object {
  
  @js.native
  trait DiscreteShadowcasting
    extends typingsSlinky.rotJs.fovFovMod.default {
    
    /**
      * @param {int} A start angle
      * @param {int} B end angle
      * @param {bool} blocks Does current cell block visibility?
      * @param {int[][]} DATA shadowed angle pairs
      */
    def _visibleCoords(A: Double, B: Double, blocks: Boolean, DATA: js.Array[Double]): Boolean = js.native
  }
  
  @js.native
  class default () extends DiscreteShadowcasting
}
