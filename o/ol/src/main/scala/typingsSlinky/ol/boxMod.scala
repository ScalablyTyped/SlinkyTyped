package typingsSlinky.ol

import typingsSlinky.ol.pixelMod.Pixel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ol/render/Box", JSImport.Namespace)
@js.native
object boxMod extends js.Object {
  
  @js.native
  trait RenderBox
    extends typingsSlinky.ol.disposableMod.default {
    
    /**
      * Creates or updates the cached geometry.
      */
    def createOrUpdateGeometry(): Unit = js.native
    
    def getGeometry(): typingsSlinky.ol.polygonMod.default = js.native
    
    def setMap(map: typingsSlinky.ol.pluggableMapMod.default): Unit = js.native
    
    def setPixels(startPixel: Pixel, endPixel: Pixel): Unit = js.native
  }
  
  @js.native
  class default protected () extends RenderBox {
    def this(className: String) = this()
  }
}
