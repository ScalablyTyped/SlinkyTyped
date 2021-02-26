package typingsSlinky.rotJs

import org.scalajs.dom.raw.HTMLCanvasElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tileMod {
  
  @JSImport("rot-js/lib/display/tile", JSImport.Default)
  @js.native
  class default () extends Tile
  
  @js.native
  trait Tile
    extends typingsSlinky.rotJs.canvasMod.default {
    
    var _colorCanvas: HTMLCanvasElement = js.native
    
    def computeFontSize(): Double = js.native
  }
}
