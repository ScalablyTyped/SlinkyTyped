package typingsSlinky.exceljs.mod

import typingsSlinky.exceljs.anon.Col
import typingsSlinky.exceljs.anon.Height
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImagePosition extends js.Object {
  
  var ext: Height = js.native
  
  var tl: Col = js.native
}
object ImagePosition {
  
  @scala.inline
  def apply(ext: Height, tl: Col): ImagePosition = {
    val __obj = js.Dynamic.literal(ext = ext.asInstanceOf[js.Any], tl = tl.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImagePosition]
  }
  
  @scala.inline
  implicit class ImagePositionOps[Self <: ImagePosition] (val x: Self) extends AnyVal {
    
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
    def setExt(value: Height): Self = this.set("ext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTl(value: Col): Self = this.set("tl", value.asInstanceOf[js.Any])
  }
}
