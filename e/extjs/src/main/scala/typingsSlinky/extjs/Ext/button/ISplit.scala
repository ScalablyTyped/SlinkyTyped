package typingsSlinky.extjs.Ext.button

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISplit extends IButton {
  
  /** [Config Option] (Function) */
  var arrowHandler: js.UndefOr[js.Any] = js.native
  
  /** [Config Option] (String) */
  var arrowTooltip: js.UndefOr[String] = js.native
  
  /** [Method] Sets this button s arrow click handler
    * @param handler Function The function to call when the arrow is clicked.
    * @param scope Object Scope for the function passed above.
    */
  var setArrowHandler: js.UndefOr[
    js.Function2[/* handler */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], Unit]
  ] = js.native
}
object ISplit {
  
  @scala.inline
  def apply(): ISplit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISplit]
  }
  
  @scala.inline
  implicit class ISplitOps[Self <: ISplit] (val x: Self) extends AnyVal {
    
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
    def setArrowHandler(value: js.Any): Self = this.set("arrowHandler", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArrowHandler: Self = this.set("arrowHandler", js.undefined)
    
    @scala.inline
    def setArrowTooltip(value: String): Self = this.set("arrowTooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArrowTooltip: Self = this.set("arrowTooltip", js.undefined)
    
    @scala.inline
    def setSetArrowHandler(value: (/* handler */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit): Self = this.set("setArrowHandler", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteSetArrowHandler: Self = this.set("setArrowHandler", js.undefined)
  }
}
