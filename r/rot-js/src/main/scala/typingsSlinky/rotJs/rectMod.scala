package typingsSlinky.rotJs

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLCanvasElement
import typingsSlinky.rotJs.typesMod.DisplayData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rectMod {
  
  @JSImport("rot-js/lib/display/rect", JSImport.Default)
  @js.native
  class default () extends Rect
  /* static members */
  object default {
    
    @JSImport("rot-js/lib/display/rect", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("rot-js/lib/display/rect", "default.cache")
    @js.native
    def cache: Boolean = js.native
    @scala.inline
    def cache_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cache")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait Rect
    extends typingsSlinky.rotJs.canvasMod.default {
    
    var _canvasCache: StringDictionary[HTMLCanvasElement] = js.native
    
    def _drawNoCache(data: DisplayData, clearBefore: Boolean): Unit = js.native
    
    def _drawWithCache(data: DisplayData): Unit = js.native
    
    var _spacingX: Double = js.native
    
    var _spacingY: Double = js.native
  }
}
