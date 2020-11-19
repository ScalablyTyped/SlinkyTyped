package typingsSlinky.mjmlReact.mod

import typingsSlinky.csstype.mod.Property.BackgroundColor
import typingsSlinky.csstype.mod.Property.Color
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MjmlAccordionTextProps extends js.Object {
  
  var backgroundColor: js.UndefOr[BackgroundColor] = js.native
  
  var color: js.UndefOr[Color] = js.native
  
  var fontFamily: js.UndefOr[String] = js.native
  
  var fontSize: js.UndefOr[String | Double] = js.native
}
object MjmlAccordionTextProps {
  
  @scala.inline
  def apply(): MjmlAccordionTextProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MjmlAccordionTextProps]
  }
  
  @scala.inline
  implicit class MjmlAccordionTextPropsOps[Self <: MjmlAccordionTextProps] (val x: Self) extends AnyVal {
    
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
    def setBackgroundColor(value: BackgroundColor): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackgroundColor: Self = this.set("backgroundColor", js.undefined)
    
    @scala.inline
    def setColor(value: Color): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    
    @scala.inline
    def setFontFamily(value: String): Self = this.set("fontFamily", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontFamily: Self = this.set("fontFamily", js.undefined)
    
    @scala.inline
    def setFontSize(value: String | Double): Self = this.set("fontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontSize: Self = this.set("fontSize", js.undefined)
  }
}
