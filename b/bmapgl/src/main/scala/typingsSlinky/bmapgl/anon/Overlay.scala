package typingsSlinky.bmapgl.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Overlay extends StObject {
  
  var overlay: typingsSlinky.bmapgl.BMapGL.Overlay = js.native
  
  var pixel: typingsSlinky.bmapgl.BMapGL.Pixel = js.native
  
  var point: typingsSlinky.bmapgl.BMapGL.Point = js.native
  
  var target: js.Any = js.native
  
  var `type`: String = js.native
}
object Overlay {
  
  @scala.inline
  def apply(
    overlay: typingsSlinky.bmapgl.BMapGL.Overlay,
    pixel: typingsSlinky.bmapgl.BMapGL.Pixel,
    point: typingsSlinky.bmapgl.BMapGL.Point,
    target: js.Any,
    `type`: String
  ): Overlay = {
    val __obj = js.Dynamic.literal(overlay = overlay.asInstanceOf[js.Any], pixel = pixel.asInstanceOf[js.Any], point = point.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Overlay]
  }
  
  @scala.inline
  implicit class OverlayMutableBuilder[Self <: Overlay] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOverlay(value: typingsSlinky.bmapgl.BMapGL.Overlay): Self = StObject.set(x, "overlay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPixel(value: typingsSlinky.bmapgl.BMapGL.Pixel): Self = StObject.set(x, "pixel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPoint(value: typingsSlinky.bmapgl.BMapGL.Point): Self = StObject.set(x, "point", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTarget(value: js.Any): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
