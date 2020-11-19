package typingsSlinky.looksSame

import org.scalablytyped.runtime.Instantiable1
import typingsSlinky.looksSame.anon.B
import typingsSlinky.looksSame.anon.Y
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("looks-same/build/src/lib/png/png", JSImport.Namespace)
@js.native
object pngPngMod extends js.Object {
  
  @js.native
  trait PNGImage extends js.Object {
    
    def _getIdx(x: js.Any, y: js.Any): Double = js.native
    
    var _png: js.Any = js.native
    
    def createBuffer(callback: js.Any): Unit = js.native
    
    def getActualCoord(x: Double, y: Double): Y = js.native
    
    def getPixel(x: js.Any, y: js.Any): B = js.native
    
    def height: Double = js.native
    
    def save(path: js.Any, callback: js.Any): Unit = js.native
    
    def setPixel(x: js.Any, y: js.Any, color: js.Any): Unit = js.native
    
    def width: Double = js.native
  }
  
  @js.native
  abstract class default protected () extends PNGImage {
    def this(_png: js.Any) = this()
  }
  /* static members */
  @js.native
  object default extends js.Object {
    
    def create[T /* <: PNGImage */](args: js.Any*): T = js.native
  }
  
  type Constructor[T] = Instantiable1[/* args (repeated) */ js.Any, T]
}
