package typingsSlinky.materialUi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ButtonFilterColor extends js.Object {
  
  var buttonFilterColor: js.UndefOr[String] = js.native
  
  var color: js.UndefOr[String] = js.native
  
  var disabledTextColor: js.UndefOr[String] = js.native
  
  var fontSize: js.UndefOr[Double] = js.native
  
  var fontWeight: js.UndefOr[Double] = js.native
  
  var primaryTextColor: js.UndefOr[String] = js.native
  
  var secondaryTextColor: js.UndefOr[String] = js.native
  
  var textColor: js.UndefOr[String] = js.native
}
object ButtonFilterColor {
  
  @scala.inline
  def apply(): ButtonFilterColor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ButtonFilterColor]
  }
  
  @scala.inline
  implicit class ButtonFilterColorOps[Self <: ButtonFilterColor] (val x: Self) extends AnyVal {
    
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
    def setButtonFilterColor(value: String): Self = this.set("buttonFilterColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteButtonFilterColor: Self = this.set("buttonFilterColor", js.undefined)
    
    @scala.inline
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    
    @scala.inline
    def setDisabledTextColor(value: String): Self = this.set("disabledTextColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabledTextColor: Self = this.set("disabledTextColor", js.undefined)
    
    @scala.inline
    def setFontSize(value: Double): Self = this.set("fontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontSize: Self = this.set("fontSize", js.undefined)
    
    @scala.inline
    def setFontWeight(value: Double): Self = this.set("fontWeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontWeight: Self = this.set("fontWeight", js.undefined)
    
    @scala.inline
    def setPrimaryTextColor(value: String): Self = this.set("primaryTextColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrimaryTextColor: Self = this.set("primaryTextColor", js.undefined)
    
    @scala.inline
    def setSecondaryTextColor(value: String): Self = this.set("secondaryTextColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecondaryTextColor: Self = this.set("secondaryTextColor", js.undefined)
    
    @scala.inline
    def setTextColor(value: String): Self = this.set("textColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextColor: Self = this.set("textColor", js.undefined)
  }
}
