package typingsSlinky.reactDragtastic.anon

import org.scalajs.dom.raw.Element
import slinky.web.SyntheticMouseEvent
import slinky.web.SyntheticTouchEvent
import typingsSlinky.react.mod.MouseEventHandler
import typingsSlinky.react.mod.TouchEventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnMouseDown extends js.Object {
  
  var onMouseDown: MouseEventHandler[Element] = js.native
  
  var onTouchStart: TouchEventHandler[Element] = js.native
}
object OnMouseDown {
  
  @scala.inline
  def apply(
    onMouseDown: SyntheticMouseEvent[Element] => Unit,
    onTouchStart: SyntheticTouchEvent[Element] => Unit
  ): OnMouseDown = {
    val __obj = js.Dynamic.literal(onMouseDown = js.Any.fromFunction1(onMouseDown), onTouchStart = js.Any.fromFunction1(onTouchStart))
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
    def setOnMouseDown(value: SyntheticMouseEvent[Element] => Unit): Self = this.set("onMouseDown", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnTouchStart(value: SyntheticTouchEvent[Element] => Unit): Self = this.set("onTouchStart", js.Any.fromFunction1(value))
  }
}
