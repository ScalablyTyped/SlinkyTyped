package typingsSlinky.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IgTablePropertiesDialogMethods extends js.Object {
  
  def hide(): Unit = js.native
  
  def show(item: js.Object): Unit = js.native
}
object IgTablePropertiesDialogMethods {
  
  @scala.inline
  def apply(hide: () => Unit, show: js.Object => Unit): IgTablePropertiesDialogMethods = {
    val __obj = js.Dynamic.literal(hide = js.Any.fromFunction0(hide), show = js.Any.fromFunction1(show))
    __obj.asInstanceOf[IgTablePropertiesDialogMethods]
  }
  
  @scala.inline
  implicit class IgTablePropertiesDialogMethodsOps[Self <: IgTablePropertiesDialogMethods] (val x: Self) extends AnyVal {
    
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
    def setHide(value: () => Unit): Self = this.set("hide", js.Any.fromFunction0(value))
    
    @scala.inline
    def setShow(value: js.Object => Unit): Self = this.set("show", js.Any.fromFunction1(value))
  }
}
