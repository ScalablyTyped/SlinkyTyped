package typingsSlinky.babylonjs.global.BABYLON

import typingsSlinky.babylonjs.HTMLCanvasElement
import typingsSlinky.std.OffscreenCanvas
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.CanvasGenerator")
@js.native
class CanvasGenerator ()
  extends typingsSlinky.babylonjs.BABYLON.CanvasGenerator
/* static members */
object CanvasGenerator {
  
  /**
    * Create a new canvas (or offscreen canvas depending on the context)
    * @param width defines the expected width
    * @param height defines the expected height
    * @return a new canvas or offscreen canvas
    */
  @JSGlobal("BABYLON.CanvasGenerator.CreateCanvas")
  @js.native
  def CreateCanvas(width: Double, height: Double): HTMLCanvasElement | OffscreenCanvas = js.native
}
