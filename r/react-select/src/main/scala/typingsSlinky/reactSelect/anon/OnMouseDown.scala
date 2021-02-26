package typingsSlinky.reactSelect.anon

import org.scalajs.dom.raw.HTMLElement
import slinky.web.SyntheticMouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnMouseDown extends StObject {
  
  def onMouseDown(event: SyntheticMouseEvent[HTMLElement]): Unit = js.native
}
object OnMouseDown {
  
  @scala.inline
  def apply(onMouseDown: SyntheticMouseEvent[HTMLElement] => Unit): OnMouseDown = {
    val __obj = js.Dynamic.literal(onMouseDown = js.Any.fromFunction1(onMouseDown))
    __obj.asInstanceOf[OnMouseDown]
  }
  
  @scala.inline
  implicit class OnMouseDownMutableBuilder[Self <: OnMouseDown] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOnMouseDown(value: SyntheticMouseEvent[HTMLElement] => Unit): Self = StObject.set(x, "onMouseDown", js.Any.fromFunction1(value))
  }
}
