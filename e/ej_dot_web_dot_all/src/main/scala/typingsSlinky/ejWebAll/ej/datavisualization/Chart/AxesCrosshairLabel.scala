package typingsSlinky.ejWebAll.ej.datavisualization.Chart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AxesCrosshairLabel extends js.Object {
  
  /** Show/hides the crosshair label associated with this axis.
    * @Default {false}
    */
  var visible: js.UndefOr[Boolean] = js.native
}
object AxesCrosshairLabel {
  
  @scala.inline
  def apply(): AxesCrosshairLabel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AxesCrosshairLabel]
  }
  
  @scala.inline
  implicit class AxesCrosshairLabelOps[Self <: AxesCrosshairLabel] (val x: Self) extends AnyVal {
    
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
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
  }
}
