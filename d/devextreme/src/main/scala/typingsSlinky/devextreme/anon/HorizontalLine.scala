package typingsSlinky.devextreme.anon

import typingsSlinky.devextreme.devextremeStrings.dash
import typingsSlinky.devextreme.devextremeStrings.dot
import typingsSlinky.devextreme.devextremeStrings.longDash
import typingsSlinky.devextreme.devextremeStrings.solid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HorizontalLine extends js.Object {
  
  var color: js.UndefOr[String] = js.native
  
  var dashStyle: js.UndefOr[dash | dot | longDash | solid] = js.native
  
  var enabled: js.UndefOr[Boolean] = js.native
  
  var horizontalLine: js.UndefOr[DashStyle | Boolean] = js.native
  
  var label: js.UndefOr[BackgroundColorCustomizeText] = js.native
  
  var opacity: js.UndefOr[Double] = js.native
  
  var verticalLine: js.UndefOr[DashStyle | Boolean] = js.native
  
  var width: js.UndefOr[Double] = js.native
}
object HorizontalLine {
  
  @scala.inline
  def apply(): HorizontalLine = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HorizontalLine]
  }
  
  @scala.inline
  implicit class HorizontalLineOps[Self <: HorizontalLine] (val x: Self) extends AnyVal {
    
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
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    
    @scala.inline
    def setDashStyle(value: dash | dot | longDash | solid): Self = this.set("dashStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDashStyle: Self = this.set("dashStyle", js.undefined)
    
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    
    @scala.inline
    def setHorizontalLine(value: DashStyle | Boolean): Self = this.set("horizontalLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHorizontalLine: Self = this.set("horizontalLine", js.undefined)
    
    @scala.inline
    def setLabel(value: BackgroundColorCustomizeText): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    
    @scala.inline
    def setOpacity(value: Double): Self = this.set("opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpacity: Self = this.set("opacity", js.undefined)
    
    @scala.inline
    def setVerticalLine(value: DashStyle | Boolean): Self = this.set("verticalLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVerticalLine: Self = this.set("verticalLine", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
