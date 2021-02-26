package typingsSlinky.bmapgl.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Pixel extends StObject {
  
  var pixel: typingsSlinky.bmapgl.BMapGL.Pixel = js.native
  
  var point: typingsSlinky.bmapgl.BMapGL.Point = js.native
  
  var target: js.Any = js.native
  
  var `type`: String = js.native
}
object Pixel {
  
  @scala.inline
  def apply(
    pixel: typingsSlinky.bmapgl.BMapGL.Pixel,
    point: typingsSlinky.bmapgl.BMapGL.Point,
    target: js.Any,
    `type`: String
  ): Pixel = {
    val __obj = js.Dynamic.literal(pixel = pixel.asInstanceOf[js.Any], point = point.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pixel]
  }
  
  @scala.inline
  implicit class PixelMutableBuilder[Self <: Pixel] (val x: Self) extends AnyVal {
    
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
