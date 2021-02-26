package typingsSlinky.baidumapWebSdk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Overlay extends StObject {
  
  var overlay: typingsSlinky.baidumapWebSdk.BMap.Overlay = js.native
  
  var pixel: typingsSlinky.baidumapWebSdk.BMap.Pixel = js.native
  
  var point: typingsSlinky.baidumapWebSdk.BMap.Point = js.native
  
  var target: js.Any = js.native
  
  var `type`: String = js.native
}
object Overlay {
  
  @scala.inline
  def apply(
    overlay: typingsSlinky.baidumapWebSdk.BMap.Overlay,
    pixel: typingsSlinky.baidumapWebSdk.BMap.Pixel,
    point: typingsSlinky.baidumapWebSdk.BMap.Point,
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
    def setOverlay(value: typingsSlinky.baidumapWebSdk.BMap.Overlay): Self = StObject.set(x, "overlay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPixel(value: typingsSlinky.baidumapWebSdk.BMap.Pixel): Self = StObject.set(x, "pixel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPoint(value: typingsSlinky.baidumapWebSdk.BMap.Point): Self = StObject.set(x, "point", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTarget(value: js.Any): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
