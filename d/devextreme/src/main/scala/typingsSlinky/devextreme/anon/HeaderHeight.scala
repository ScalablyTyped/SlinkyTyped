package typingsSlinky.devextreme.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HeaderHeight extends js.Object {
  
  var border: js.UndefOr[ColorWidth] = js.native
  
  var color: js.UndefOr[String] = js.native
  
  var headerHeight: js.UndefOr[Double] = js.native
  
  var hoverEnabled: js.UndefOr[Boolean] = js.native
  
  var hoverStyle: js.UndefOr[`30`] = js.native
  
  var label: js.UndefOr[TextOverflow] = js.native
  
  var selectionStyle: js.UndefOr[`30`] = js.native
}
object HeaderHeight {
  
  @scala.inline
  def apply(): HeaderHeight = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HeaderHeight]
  }
  
  @scala.inline
  implicit class HeaderHeightOps[Self <: HeaderHeight] (val x: Self) extends AnyVal {
    
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
    def setBorder(value: ColorWidth): Self = this.set("border", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorder: Self = this.set("border", js.undefined)
    
    @scala.inline
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    
    @scala.inline
    def setHeaderHeight(value: Double): Self = this.set("headerHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaderHeight: Self = this.set("headerHeight", js.undefined)
    
    @scala.inline
    def setHoverEnabled(value: Boolean): Self = this.set("hoverEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHoverEnabled: Self = this.set("hoverEnabled", js.undefined)
    
    @scala.inline
    def setHoverStyle(value: `30`): Self = this.set("hoverStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHoverStyle: Self = this.set("hoverStyle", js.undefined)
    
    @scala.inline
    def setLabel(value: TextOverflow): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    
    @scala.inline
    def setSelectionStyle(value: `30`): Self = this.set("selectionStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectionStyle: Self = this.set("selectionStyle", js.undefined)
  }
}
