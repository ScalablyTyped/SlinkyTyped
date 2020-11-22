package typingsSlinky.bmapgl.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Overlay extends js.Object {
  
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
  implicit class OverlayOps[Self <: Overlay] (val x: Self) extends AnyVal {
    
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
    def setOverlay(value: typingsSlinky.bmapgl.BMapGL.Overlay): Self = this.set("overlay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPixel(value: typingsSlinky.bmapgl.BMapGL.Pixel): Self = this.set("pixel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPoint(value: typingsSlinky.bmapgl.BMapGL.Point): Self = this.set("point", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTarget(value: js.Any): Self = this.set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
