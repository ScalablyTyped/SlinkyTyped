package typingsSlinky.playable.liveIndicatorTypesMod

import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ILiveIndicator extends js.Object {
  
  def destroy(): Unit = js.native
  
  def getElement(): HTMLElement = js.native
  
  def hide(): Unit = js.native
  
  var isActive: Boolean = js.native
  
  var isHidden: Boolean = js.native
  
  def show(): Unit = js.native
}
object ILiveIndicator {
  
  @scala.inline
  def apply(
    destroy: () => Unit,
    getElement: () => HTMLElement,
    hide: () => Unit,
    isActive: Boolean,
    isHidden: Boolean,
    show: () => Unit
  ): ILiveIndicator = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), getElement = js.Any.fromFunction0(getElement), hide = js.Any.fromFunction0(hide), isActive = isActive.asInstanceOf[js.Any], isHidden = isHidden.asInstanceOf[js.Any], show = js.Any.fromFunction0(show))
    __obj.asInstanceOf[ILiveIndicator]
  }
  
  @scala.inline
  implicit class ILiveIndicatorOps[Self <: ILiveIndicator] (val x: Self) extends AnyVal {
    
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
    def setDestroy(value: () => Unit): Self = this.set("destroy", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetElement(value: () => HTMLElement): Self = this.set("getElement", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHide(value: () => Unit): Self = this.set("hide", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsActive(value: Boolean): Self = this.set("isActive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsHidden(value: Boolean): Self = this.set("isHidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShow(value: () => Unit): Self = this.set("show", js.Any.fromFunction0(value))
  }
}
