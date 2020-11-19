package typingsSlinky.baidumapWebSdk.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Point extends js.Object {
  
  var pixel: typingsSlinky.baidumapWebSdk.BMap.Pixel = js.native
  
  var point: typingsSlinky.baidumapWebSdk.BMap.Point = js.native
  
  var target: js.Any = js.native
  
  var `type`: String = js.native
  
  var zoom: Double = js.native
}
object Point {
  
  @scala.inline
  def apply(
    pixel: typingsSlinky.baidumapWebSdk.BMap.Pixel,
    point: typingsSlinky.baidumapWebSdk.BMap.Point,
    target: js.Any,
    `type`: String,
    zoom: Double
  ): Point = {
    val __obj = js.Dynamic.literal(pixel = pixel.asInstanceOf[js.Any], point = point.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], zoom = zoom.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Point]
  }
  
  @scala.inline
  implicit class PointOps[Self <: Point] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setPixel(value: typingsSlinky.baidumapWebSdk.BMap.Pixel): Self = this.set("pixel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPoint(value: typingsSlinky.baidumapWebSdk.BMap.Point): Self = this.set("point", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTarget(value: js.Any): Self = this.set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoom(value: Double): Self = this.set("zoom", value.asInstanceOf[js.Any])
  }
}
