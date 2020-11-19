package typingsSlinky.colorString.mod

import typingsSlinky.colorString.colorStringStrings.hsl
import typingsSlinky.colorString.colorStringStrings.hwb
import typingsSlinky.colorString.colorStringStrings.rgb
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColorDescriptor extends js.Object {
  
  var model: rgb | hsl | hwb = js.native
  
  var value: Color = js.native
}
object ColorDescriptor {
  
  @scala.inline
  def apply(model: rgb | hsl | hwb, value: Color): ColorDescriptor = {
    val __obj = js.Dynamic.literal(model = model.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColorDescriptor]
  }
  
  @scala.inline
  implicit class ColorDescriptorOps[Self <: ColorDescriptor] (val x: Self) extends AnyVal {
    
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
    def setModel(value: rgb | hsl | hwb): Self = this.set("model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Color): Self = this.set("value", value.asInstanceOf[js.Any])
  }
}
