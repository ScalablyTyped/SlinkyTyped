package typingsSlinky.ejWebAll.ej.Grid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContextOpenEventArgs extends js.Object {
  
  /** Returns the cancel option value.
    */
  var cancel: js.UndefOr[Boolean] = js.native
  
  /** Returns the current item.
    */
  var currentTarget: js.UndefOr[js.Any] = js.native
  
  /** Returns the grid model.
    */
  var model: js.UndefOr[js.Any] = js.native
  
  /** Returns the status of contextmenu item which denotes its enabled state
    */
  var status: js.UndefOr[Boolean] = js.native
  
  /** Returns the target item.
    */
  var target: js.UndefOr[js.Any] = js.native
  
  /** Returns the name of the event.
    */
  var `type`: js.UndefOr[String] = js.native
}
object ContextOpenEventArgs {
  
  @scala.inline
  def apply(): ContextOpenEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContextOpenEventArgs]
  }
  
  @scala.inline
  implicit class ContextOpenEventArgsOps[Self <: ContextOpenEventArgs] (val x: Self) extends AnyVal {
    
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
    def setCurrentTarget(value: js.Any): Self = this.set("currentTarget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCurrentTarget: Self = this.set("currentTarget", js.undefined)
    
    @scala.inline
    def setModel(value: js.Any): Self = this.set("model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModel: Self = this.set("model", js.undefined)
    
    @scala.inline
    def setStatus(value: Boolean): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    
    @scala.inline
    def setTarget(value: js.Any): Self = this.set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
