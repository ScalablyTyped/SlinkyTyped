package typingsSlinky.ejWebAll.ej.SunburstChart

import typingsSlinky.ejWebAll.ej.datavisualization.Sunburst.FontStyle
import typingsSlinky.ejWebAll.ej.datavisualization.Sunburst.FontWeight
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TooltipFont extends js.Object {
  
  /** Font color of the text in the tooltip.
    * @Default {null}
    */
  var color: js.UndefOr[String] = js.native
  
  /** Font Family for the tooltip.
    * @Default {Segoe UI}
    */
  var fontFamily: js.UndefOr[String] = js.native
  
  /** Specifies the font Style for the tooltip.
    * @Default {Normal}
    */
  var fontStyle: js.UndefOr[FontStyle | String] = js.native
  
  /** Specifies the font weight for the tooltip.
    * @Default {Regular}
    */
  var fontWeight: js.UndefOr[FontWeight | String] = js.native
  
  /** Opacity for text in the tooltip.
    * @Default {1}
    */
  var opacity: js.UndefOr[Double] = js.native
  
  /** Font size for text in the tooltip.
    * @Default {12px}
    */
  var size: js.UndefOr[String] = js.native
}
object TooltipFont {
  
  @scala.inline
  def apply(): TooltipFont = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TooltipFont]
  }
  
  @scala.inline
  implicit class TooltipFontOps[Self <: TooltipFont] (val x: Self) extends AnyVal {
    
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
    def setFontFamily(value: String): Self = this.set("fontFamily", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontFamily: Self = this.set("fontFamily", js.undefined)
    
    @scala.inline
    def setFontStyle(value: FontStyle | String): Self = this.set("fontStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontStyle: Self = this.set("fontStyle", js.undefined)
    
    @scala.inline
    def setFontWeight(value: FontWeight | String): Self = this.set("fontWeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontWeight: Self = this.set("fontWeight", js.undefined)
    
    @scala.inline
    def setOpacity(value: Double): Self = this.set("opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpacity: Self = this.set("opacity", js.undefined)
    
    @scala.inline
    def setSize(value: String): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
  }
}
