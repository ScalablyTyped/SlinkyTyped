package typingsSlinky.docxTemplates.typesMod

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Image extends js.Object {
  
  var data: Buffer | js.typedarray.ArrayBuffer | String = js.native
  
  var extension: ImageExtension = js.native
}
object Image {
  
  @scala.inline
  def apply(data: Buffer | js.typedarray.ArrayBuffer | String, extension: ImageExtension): Image = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], extension = extension.asInstanceOf[js.Any])
    __obj.asInstanceOf[Image]
  }
  
  @scala.inline
  implicit class ImageOps[Self <: Image] (val x: Self) extends AnyVal {
    
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
    def setDataArrayBuffer(value: js.typedarray.ArrayBuffer): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setData(value: Buffer | js.typedarray.ArrayBuffer | String): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtension(value: ImageExtension): Self = this.set("extension", value.asInstanceOf[js.Any])
  }
}
