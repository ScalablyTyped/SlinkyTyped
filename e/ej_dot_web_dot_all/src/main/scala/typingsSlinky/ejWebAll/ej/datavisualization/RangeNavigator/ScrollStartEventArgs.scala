package typingsSlinky.ejWebAll.ej.datavisualization.RangeNavigator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScrollStartEventArgs extends js.Object {
  
  /** if the event should be canceled; otherwise, false.
    */
  var cancel: js.UndefOr[Boolean] = js.native
  
  /** parameters from RangeNavigator
    */
  var data: js.UndefOr[js.Any] = js.native
  
  /** returns the scrollbar position end range value on changing scrollbar
    */
  var dataEndRange: js.UndefOr[String] = js.native
  
  /** returns the scrollbar position starting range value on changing scrollbar
    */
  var dataStartRange: js.UndefOr[String] = js.native
  
  /** returns the RangeNavigator model
    */
  var model: js.UndefOr[js.Any] = js.native
  
  /** returns the name of the event
    */
  var `type`: js.UndefOr[String] = js.native
}
object ScrollStartEventArgs {
  
  @scala.inline
  def apply(): ScrollStartEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScrollStartEventArgs]
  }
  
  @scala.inline
  implicit class ScrollStartEventArgsOps[Self <: ScrollStartEventArgs] (val x: Self) extends AnyVal {
    
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
    def setCancel(value: Boolean): Self = this.set("cancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCancel: Self = this.set("cancel", js.undefined)
    
    @scala.inline
    def setData(value: js.Any): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    
    @scala.inline
    def setDataEndRange(value: String): Self = this.set("dataEndRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataEndRange: Self = this.set("dataEndRange", js.undefined)
    
    @scala.inline
    def setDataStartRange(value: String): Self = this.set("dataStartRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataStartRange: Self = this.set("dataStartRange", js.undefined)
    
    @scala.inline
    def setModel(value: js.Any): Self = this.set("model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModel: Self = this.set("model", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
