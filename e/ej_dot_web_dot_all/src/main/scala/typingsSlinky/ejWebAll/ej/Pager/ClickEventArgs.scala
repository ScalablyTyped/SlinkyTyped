package typingsSlinky.ejWebAll.ej.Pager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClickEventArgs extends js.Object {
  
  /** Returns the cancel option value.
    */
  var cancel: js.UndefOr[Boolean] = js.native
  
  /** Returns the current page index.
    */
  var currentPage: js.UndefOr[Double] = js.native
  
  /** Returns current action event type and its target.
    */
  var event: js.UndefOr[js.Any] = js.native
  
  /** Returns the pager model.
    */
  var model: js.UndefOr[js.Any] = js.native
  
  /** Returns the name of event
    */
  var `type`: js.UndefOr[String] = js.native
}
object ClickEventArgs {
  
  @scala.inline
  def apply(): ClickEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClickEventArgs]
  }
  
  @scala.inline
  implicit class ClickEventArgsOps[Self <: ClickEventArgs] (val x: Self) extends AnyVal {
    
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
    def setCurrentPage(value: Double): Self = this.set("currentPage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCurrentPage: Self = this.set("currentPage", js.undefined)
    
    @scala.inline
    def setEvent(value: js.Any): Self = this.set("event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEvent: Self = this.set("event", js.undefined)
    
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
