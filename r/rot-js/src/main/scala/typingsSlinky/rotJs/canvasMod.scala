package typingsSlinky.rotJs

import org.scalajs.dom.raw.CanvasRenderingContext2D
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object canvasMod {
  
  @JSImport("rot-js/lib/display/canvas", JSImport.Default)
  @js.native
  abstract class default () extends Canvas
  
  @js.native
  trait Canvas
    extends typingsSlinky.rotJs.backendMod.default {
    
    var _ctx: CanvasRenderingContext2D = js.native
    
    def _normalizedEventToPosition(x: Double, y: Double): js.Tuple2[Double, Double] = js.native
    
    def _updateSize(): Unit = js.native
  }
}
