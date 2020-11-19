package typingsSlinky.ejWebAll.ej.Ribbon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TabCreateEventArgs extends js.Object {
  
  /** Set to true when the event has to be canceled, else false.
    */
  var cancel: js.UndefOr[Boolean] = js.native
  
  /** returns current ribbon tab item index
    */
  var deleteIndex: js.UndefOr[Double] = js.native
  
  /** returns the ribbon model.
    */
  var model: js.UndefOr[js.Any] = js.native
  
  /** returns the name of the event.
    */
  var `type`: js.UndefOr[String] = js.native
}
object TabCreateEventArgs {
  
  @scala.inline
  def apply(): TabCreateEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TabCreateEventArgs]
  }
  
  @scala.inline
  implicit class TabCreateEventArgsOps[Self <: TabCreateEventArgs] (val x: Self) extends AnyVal {
    
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
    def setDeleteIndex(value: Double): Self = this.set("deleteIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeleteIndex: Self = this.set("deleteIndex", js.undefined)
    
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
