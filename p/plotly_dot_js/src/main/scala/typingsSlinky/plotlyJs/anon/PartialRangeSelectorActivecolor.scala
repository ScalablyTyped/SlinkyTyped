package typingsSlinky.plotlyJs.anon

import typingsSlinky.plotlyJs.plotlyJsStrings.auto
import typingsSlinky.plotlyJs.plotlyJsStrings.bottom
import typingsSlinky.plotlyJs.plotlyJsStrings.center
import typingsSlinky.plotlyJs.plotlyJsStrings.left
import typingsSlinky.plotlyJs.plotlyJsStrings.middle
import typingsSlinky.plotlyJs.plotlyJsStrings.right
import typingsSlinky.plotlyJs.plotlyJsStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<plotly.js.plotly.js.RangeSelector> */
@js.native
trait PartialRangeSelectorActivecolor extends js.Object {
  
  var activecolor: js.UndefOr[String] = js.native
  
  var bgcolor: js.UndefOr[String] = js.native
  
  var bordercolor: js.UndefOr[String] = js.native
  
  var borderwidth: js.UndefOr[Double] = js.native
  
  var buttons: js.UndefOr[js.Array[PartialRangeSelectorButto]] = js.native
  
  var font: js.UndefOr[PartialFont] = js.native
  
  var visible: js.UndefOr[Boolean] = js.native
  
  var x: js.UndefOr[Double] = js.native
  
  var xanchor: js.UndefOr[auto | left | center | right] = js.native
  
  var y: js.UndefOr[Double] = js.native
  
  var yanchor: js.UndefOr[auto | top | middle | bottom] = js.native
}
object PartialRangeSelectorActivecolor {
  
  @scala.inline
  def apply(): PartialRangeSelectorActivecolor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialRangeSelectorActivecolor]
  }
  
  @scala.inline
  implicit class PartialRangeSelectorActivecolorOps[Self <: PartialRangeSelectorActivecolor] (val x: Self) extends AnyVal {
    
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
    def setActivecolor(value: String): Self = this.set("activecolor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActivecolor: Self = this.set("activecolor", js.undefined)
    
    @scala.inline
    def setBgcolor(value: String): Self = this.set("bgcolor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBgcolor: Self = this.set("bgcolor", js.undefined)
    
    @scala.inline
    def setBordercolor(value: String): Self = this.set("bordercolor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBordercolor: Self = this.set("bordercolor", js.undefined)
    
    @scala.inline
    def setBorderwidth(value: Double): Self = this.set("borderwidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorderwidth: Self = this.set("borderwidth", js.undefined)
    
    @scala.inline
    def setButtonsVarargs(value: PartialRangeSelectorButto*): Self = this.set("buttons", js.Array(value :_*))
    
    @scala.inline
    def setButtons(value: js.Array[PartialRangeSelectorButto]): Self = this.set("buttons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteButtons: Self = this.set("buttons", js.undefined)
    
    @scala.inline
    def setFont(value: PartialFont): Self = this.set("font", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFont: Self = this.set("font", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
    
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteX: Self = this.set("x", js.undefined)
    
    @scala.inline
    def setXanchor(value: auto | left | center | right): Self = this.set("xanchor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXanchor: Self = this.set("xanchor", js.undefined)
    
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteY: Self = this.set("y", js.undefined)
    
    @scala.inline
    def setYanchor(value: auto | top | middle | bottom): Self = this.set("yanchor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteYanchor: Self = this.set("yanchor", js.undefined)
  }
}
