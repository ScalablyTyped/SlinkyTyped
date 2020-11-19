package typingsSlinky.inboxsdk.mod.Common

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.inboxsdk.inboxsdkStrings.destroy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SimpleElementView extends js.Object {
  
  def destroy(): Unit = js.native
  
  var destroyed: Boolean = js.native
  
  var el: HTMLElement = js.native
  
  @JSName("on")
  def on_destroy(name: destroy, cb: js.Function0[Unit]): Unit = js.native
}
object SimpleElementView {
  
  @scala.inline
  def apply(
    destroy: () => Unit,
    destroyed: Boolean,
    el: HTMLElement,
    on: (destroy, js.Function0[Unit]) => Unit
  ): SimpleElementView = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), destroyed = destroyed.asInstanceOf[js.Any], el = el.asInstanceOf[js.Any], on = js.Any.fromFunction2(on))
    __obj.asInstanceOf[SimpleElementView]
  }
  
  @scala.inline
  implicit class SimpleElementViewOps[Self <: SimpleElementView] (val x: Self) extends AnyVal {
    
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
    def setDestroyed(value: Boolean): Self = this.set("destroyed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEl(value: HTMLElement): Self = this.set("el", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOn(value: (destroy, js.Function0[Unit]) => Unit): Self = this.set("on", js.Any.fromFunction2(value))
  }
}
