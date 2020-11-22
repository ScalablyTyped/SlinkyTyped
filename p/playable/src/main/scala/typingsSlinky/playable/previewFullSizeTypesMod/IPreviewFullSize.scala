package typingsSlinky.playable.previewFullSizeTypesMod

import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPreviewFullSize extends js.Object {
  
  def destroy(): Unit = js.native
  
  def getElement(): HTMLElement = js.native
  
  def hide(): Unit = js.native
  
  def showAt(second: Double): Unit = js.native
}
object IPreviewFullSize {
  
  @scala.inline
  def apply(destroy: () => Unit, getElement: () => HTMLElement, hide: () => Unit, showAt: Double => Unit): IPreviewFullSize = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), getElement = js.Any.fromFunction0(getElement), hide = js.Any.fromFunction0(hide), showAt = js.Any.fromFunction1(showAt))
    __obj.asInstanceOf[IPreviewFullSize]
  }
  
  @scala.inline
  implicit class IPreviewFullSizeOps[Self <: IPreviewFullSize] (val x: Self) extends AnyVal {
    
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
    def setShowAt(value: Double => Unit): Self = this.set("showAt", js.Any.fromFunction1(value))
  }
}
