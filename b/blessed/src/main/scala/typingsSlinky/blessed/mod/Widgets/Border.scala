package typingsSlinky.blessed.mod.Widgets

import typingsSlinky.blessed.blessedStrings.bg
import typingsSlinky.blessed.blessedStrings.line
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Border extends js.Object {
  
  /**
    * Border foreground and background, must be numbers (-1 for default).
    */
  var bg: js.UndefOr[Double] = js.native
  
  /**
    * Border attributes.
    */
  var bold: js.UndefOr[String] = js.native
  
  /**
    * Character to use if bg type, default is space.
    */
  var ch: js.UndefOr[String] = js.native
  
  var fg: js.UndefOr[Double] = js.native
  
  /**
    * Type of border (line or bg). bg by default.
    */
  var `type`: js.UndefOr[line | bg] = js.native
  
  var underline: js.UndefOr[String] = js.native
}
object Border {
  
  @scala.inline
  def apply(): Border = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Border]
  }
  
  @scala.inline
  implicit class BorderOps[Self <: Border] (val x: Self) extends AnyVal {
    
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
    def setBg(value: Double): Self = this.set("bg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBg: Self = this.set("bg", js.undefined)
    
    @scala.inline
    def setBold(value: String): Self = this.set("bold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBold: Self = this.set("bold", js.undefined)
    
    @scala.inline
    def setCh(value: String): Self = this.set("ch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCh: Self = this.set("ch", js.undefined)
    
    @scala.inline
    def setFg(value: Double): Self = this.set("fg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFg: Self = this.set("fg", js.undefined)
    
    @scala.inline
    def setType(value: line | bg): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setUnderline(value: String): Self = this.set("underline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnderline: Self = this.set("underline", js.undefined)
  }
}
