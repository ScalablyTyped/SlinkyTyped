package typingsSlinky.babylonjs.legacyMod

import typingsSlinky.babylonjs.HTMLCanvasElement
import typingsSlinky.std.OffscreenCanvas
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Legacy/legacy", "CanvasGenerator")
@js.native
class CanvasGenerator ()
  extends typingsSlinky.babylonjs.indexMod.CanvasGenerator
/* static members */
@JSImport("babylonjs/Legacy/legacy", "CanvasGenerator")
@js.native
object CanvasGenerator extends js.Object {
  
  /**
    * Create a new canvas (or offscreen canvas depending on the context)
    * @param width defines the expected width
    * @param height defines the expected height
    * @return a new canvas or offscreen canvas
    */
  def CreateCanvas(width: Double, height: Double): HTMLCanvasElement | OffscreenCanvas = js.native
}
