package typingsSlinky.ejWebAll.ej.Sparkline

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TooltipBorder extends js.Object {
  
  /** Border color of the tooltip.
    * @Default {transparent}
    */
  var color: js.UndefOr[String] = js.native
  
  /** Border width of the tooltip.
    * @Default {1}
    */
  var width: js.UndefOr[Double] = js.native
}
object TooltipBorder {
  
  @scala.inline
  def apply(): TooltipBorder = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TooltipBorder]
  }
  
  @scala.inline
  implicit class TooltipBorderOps[Self <: TooltipBorder] (val x: Self) extends AnyVal {
    
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
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
