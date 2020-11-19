package typingsSlinky.materialLinearProgress.adapterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MDCLinearProgressAdapter extends js.Object {
  
  def addClass(className: String): Unit = js.native
  
  def forceLayout(): Unit = js.native
  
  def hasClass(className: String): Boolean = js.native
  
  def removeAttribute(name: String): Unit = js.native
  
  def removeClass(className: String): Unit = js.native
  
  def setAttribute(name: String, value: String): Unit = js.native
  
  def setBufferBarStyle(styleProperty: String, value: String): Unit = js.native
  
  def setPrimaryBarStyle(styleProperty: String, value: String): Unit = js.native
}
object MDCLinearProgressAdapter {
  
  @scala.inline
  def apply(
    addClass: String => Unit,
    forceLayout: () => Unit,
    hasClass: String => Boolean,
    removeAttribute: String => Unit,
    removeClass: String => Unit,
    setAttribute: (String, String) => Unit,
    setBufferBarStyle: (String, String) => Unit,
    setPrimaryBarStyle: (String, String) => Unit
  ): MDCLinearProgressAdapter = {
    val __obj = js.Dynamic.literal(addClass = js.Any.fromFunction1(addClass), forceLayout = js.Any.fromFunction0(forceLayout), hasClass = js.Any.fromFunction1(hasClass), removeAttribute = js.Any.fromFunction1(removeAttribute), removeClass = js.Any.fromFunction1(removeClass), setAttribute = js.Any.fromFunction2(setAttribute), setBufferBarStyle = js.Any.fromFunction2(setBufferBarStyle), setPrimaryBarStyle = js.Any.fromFunction2(setPrimaryBarStyle))
    __obj.asInstanceOf[MDCLinearProgressAdapter]
  }
  
  @scala.inline
  implicit class MDCLinearProgressAdapterOps[Self <: MDCLinearProgressAdapter] (val x: Self) extends AnyVal {
    
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
    def setAddClass(value: String => Unit): Self = this.set("addClass", js.Any.fromFunction1(value))
    
    @scala.inline
    def setForceLayout(value: () => Unit): Self = this.set("forceLayout", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHasClass(value: String => Boolean): Self = this.set("hasClass", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveAttribute(value: String => Unit): Self = this.set("removeAttribute", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveClass(value: String => Unit): Self = this.set("removeClass", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetAttribute(value: (String, String) => Unit): Self = this.set("setAttribute", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetBufferBarStyle(value: (String, String) => Unit): Self = this.set("setBufferBarStyle", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetPrimaryBarStyle(value: (String, String) => Unit): Self = this.set("setPrimaryBarStyle", js.Any.fromFunction2(value))
  }
}
