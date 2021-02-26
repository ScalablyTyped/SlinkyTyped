package typingsSlinky.rotJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hexMod {
  
  @JSImport("rot-js/lib/display/hex", JSImport.Default)
  @js.native
  class default () extends Hex
  
  @js.native
  trait Hex
    extends typingsSlinky.rotJs.canvasMod.default {
    
    /**
      * Arguments are pixel values. If "transposed" mode is enabled, then these two are already swapped.
      */
    def _fill(cx: Double, cy: Double): Unit = js.native
    
    var _hexSize: Double = js.native
    
    var _spacingX: Double = js.native
    
    var _spacingY: Double = js.native
  }
}
