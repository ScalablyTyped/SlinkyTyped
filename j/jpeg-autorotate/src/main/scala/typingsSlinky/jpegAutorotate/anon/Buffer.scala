package typingsSlinky.jpegAutorotate.anon

import typingsSlinky.jpegAutorotate.mod.RotateDimensions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Buffer extends js.Object {
  
  var buffer: typingsSlinky.node.Buffer = js.native
  
  var dimensions: RotateDimensions = js.native
  
  var orientation: Double = js.native
  
  var quality: Double = js.native
}
object Buffer {
  
  @scala.inline
  def apply(
    buffer: typingsSlinky.node.Buffer,
    dimensions: RotateDimensions,
    orientation: Double,
    quality: Double
  ): Buffer = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], dimensions = dimensions.asInstanceOf[js.Any], orientation = orientation.asInstanceOf[js.Any], quality = quality.asInstanceOf[js.Any])
    __obj.asInstanceOf[Buffer]
  }
  
  @scala.inline
  implicit class BufferOps[Self <: Buffer] (val x: Self) extends AnyVal {
    
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
    def setBuffer(value: typingsSlinky.node.Buffer): Self = this.set("buffer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDimensions(value: RotateDimensions): Self = this.set("dimensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrientation(value: Double): Self = this.set("orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuality(value: Double): Self = this.set("quality", value.asInstanceOf[js.Any])
  }
}
