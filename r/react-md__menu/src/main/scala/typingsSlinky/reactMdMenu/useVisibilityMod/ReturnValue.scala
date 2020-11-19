package typingsSlinky.reactMdMenu.useVisibilityMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReturnValue extends js.Object {
  
  var defaultFocus: FocusType = js.native
  
  def hide(): Unit = js.native
  
  def show(): Unit = js.native
  
  def showWithFocus(defaultFocus: FocusType): Unit = js.native
  
  def toggle(): Unit = js.native
  
  var visible: Boolean = js.native
}
object ReturnValue {
  
  @scala.inline
  def apply(
    defaultFocus: FocusType,
    hide: () => Unit,
    show: () => Unit,
    showWithFocus: FocusType => Unit,
    toggle: () => Unit,
    visible: Boolean
  ): ReturnValue = {
    val __obj = js.Dynamic.literal(defaultFocus = defaultFocus.asInstanceOf[js.Any], hide = js.Any.fromFunction0(hide), show = js.Any.fromFunction0(show), showWithFocus = js.Any.fromFunction1(showWithFocus), toggle = js.Any.fromFunction0(toggle), visible = visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnValue]
  }
  
  @scala.inline
  implicit class ReturnValueOps[Self <: ReturnValue] (val x: Self) extends AnyVal {
    
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
    def setDefaultFocus(value: FocusType): Self = this.set("defaultFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHide(value: () => Unit): Self = this.set("hide", js.Any.fromFunction0(value))
    
    @scala.inline
    def setShow(value: () => Unit): Self = this.set("show", js.Any.fromFunction0(value))
    
    @scala.inline
    def setShowWithFocus(value: FocusType => Unit): Self = this.set("showWithFocus", js.Any.fromFunction1(value))
    
    @scala.inline
    def setToggle(value: () => Unit): Self = this.set("toggle", js.Any.fromFunction0(value))
    
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
  }
}
