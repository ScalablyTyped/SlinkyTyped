package typingsSlinky.blueimpLoadImage.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImageHead extends js.Object {
  
  var imageHead: js.UndefOr[js.typedarray.ArrayBuffer | js.typedarray.Uint8Array] = js.native
}
object ImageHead {
  
  @scala.inline
  def apply(): ImageHead = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImageHead]
  }
  
  @scala.inline
  implicit class ImageHeadOps[Self <: ImageHead] (val x: Self) extends AnyVal {
    
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
    def setImageHeadUint8Array(value: js.typedarray.Uint8Array): Self = this.set("imageHead", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageHeadArrayBuffer(value: js.typedarray.ArrayBuffer): Self = this.set("imageHead", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageHead(value: js.typedarray.ArrayBuffer | js.typedarray.Uint8Array): Self = this.set("imageHead", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImageHead: Self = this.set("imageHead", js.undefined)
  }
}
