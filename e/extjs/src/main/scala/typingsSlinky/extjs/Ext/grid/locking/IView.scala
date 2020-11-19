package typingsSlinky.extjs.Ext.grid.locking

import typingsSlinky.extjs.Ext.util.IObservable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IView extends IObservable {
  
  /** [Property] (Boolean) */
  var isLockingView: js.UndefOr[Boolean] = js.native
}
object IView {
  
  @scala.inline
  def apply(): IView = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IView]
  }
  
  @scala.inline
  implicit class IViewOps[Self <: IView] (val x: Self) extends AnyVal {
    
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
    def setIsLockingView(value: Boolean): Self = this.set("isLockingView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsLockingView: Self = this.set("isLockingView", js.undefined)
  }
}
