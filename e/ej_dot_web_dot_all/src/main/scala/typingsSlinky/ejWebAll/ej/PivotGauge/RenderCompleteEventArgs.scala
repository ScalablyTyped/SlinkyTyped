package typingsSlinky.ejWebAll.ej.PivotGauge

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RenderCompleteEventArgs extends js.Object {
  
  /** returns the custom object bound with PivotGauge control.
    */
  var customObject: js.UndefOr[js.Any] = js.native
  
  /** returns the HTML element of PivotGauge control.
    */
  var element: js.UndefOr[js.Any] = js.native
}
object RenderCompleteEventArgs {
  
  @scala.inline
  def apply(): RenderCompleteEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RenderCompleteEventArgs]
  }
  
  @scala.inline
  implicit class RenderCompleteEventArgsOps[Self <: RenderCompleteEventArgs] (val x: Self) extends AnyVal {
    
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
    def setCustomObject(value: js.Any): Self = this.set("customObject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomObject: Self = this.set("customObject", js.undefined)
    
    @scala.inline
    def setElement(value: js.Any): Self = this.set("element", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteElement: Self = this.set("element", js.undefined)
  }
}
