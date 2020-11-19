package typingsSlinky.babylonjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TranscodedPixels extends js.Object {
  
  var height: Double = js.native
  
  var transcodedPixels: js.typedarray.ArrayBufferView = js.native
  
  var width: Double = js.native
}
object TranscodedPixels {
  
  @scala.inline
  def apply(height: Double, transcodedPixels: js.typedarray.ArrayBufferView, width: Double): TranscodedPixels = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], transcodedPixels = transcodedPixels.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[TranscodedPixels]
  }
  
  @scala.inline
  implicit class TranscodedPixelsOps[Self <: TranscodedPixels] (val x: Self) extends AnyVal {
    
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
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTranscodedPixels(value: js.typedarray.ArrayBufferView): Self = this.set("transcodedPixels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
  }
}
