package typingsSlinky.reactSelect.anon

import org.scalajs.dom.raw.HTMLElement
import slinky.web.SyntheticMouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnMouseDown extends js.Object {
  
  def onMouseDown(event: SyntheticMouseEvent[HTMLElement]): Unit = js.native
}
object OnMouseDown {
  
  @scala.inline
  def apply(onMouseDown: SyntheticMouseEvent[HTMLElement] => Unit): OnMouseDown = {
    val __obj = js.Dynamic.literal(onMouseDown = js.Any.fromFunction1(onMouseDown))
    __obj.asInstanceOf[OnMouseDown]
  }
  
  @scala.inline
  implicit class OnMouseDownOps[Self <: OnMouseDown] (val x: Self) extends AnyVal {
    
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
    def setOnMouseDown(value: SyntheticMouseEvent[HTMLElement] => Unit): Self = this.set("onMouseDown", js.Any.fromFunction1(value))
  }
}
