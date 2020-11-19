package typingsSlinky.rotJs

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLCanvasElement
import typingsSlinky.rotJs.typesMod.DisplayData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rot-js/lib/display/rect", JSImport.Namespace)
@js.native
object rectMod extends js.Object {
  
  @js.native
  trait Rect
    extends typingsSlinky.rotJs.canvasMod.default {
    
    var _canvasCache: StringDictionary[HTMLCanvasElement] = js.native
    
    def _drawNoCache(data: DisplayData, clearBefore: Boolean): Unit = js.native
    
    def _drawWithCache(data: DisplayData): Unit = js.native
    
    var _spacingX: Double = js.native
    
    var _spacingY: Double = js.native
  }
  
  @js.native
  class default () extends Rect
  /* static members */
  @js.native
  object default extends js.Object {
    
    var cache: Boolean = js.native
  }
}
