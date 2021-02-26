package typingsSlinky.rotJs

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLImageElement
import org.scalajs.dom.raw.WebGLProgram
import org.scalajs.dom.raw.WebGLRenderingContext
import org.scalajs.dom.raw.WebGLUniformLocation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tileGlMod {
  
  @JSImport("rot-js/lib/display/tile-gl", JSImport.Default)
  @js.native
  class default () extends TileGL
  /* static members */
  object default {
    
    @JSImport("rot-js/lib/display/tile-gl", "default.isSupported")
    @js.native
    def isSupported(): Boolean = js.native
  }
  
  @js.native
  trait TileGL
    extends typingsSlinky.rotJs.backendMod.default {
    
    var _gl: WebGLRenderingContext = js.native
    
    def _initWebGL(): WebGLRenderingContext = js.native
    
    def _normalizedEventToPosition(x: Double, y: Double): js.Tuple2[Double, Double] = js.native
    
    var _program: WebGLProgram = js.native
    
    var _uniforms: StringDictionary[WebGLUniformLocation | Null] = js.native
    
    def _updateSize(): Unit = js.native
    
    def _updateTexture(tileSet: HTMLImageElement): Unit = js.native
    
    def computeFontSize(): Double = js.native
  }
}
