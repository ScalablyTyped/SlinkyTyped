package typingsSlinky.reactSelect.anon

import org.scalajs.dom.raw.HTMLElement
import slinky.web.SyntheticKeyboardEvent
import typingsSlinky.reactSelect.typesMod.KeyboardEventHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnKeyDown extends StObject {
  
  var onKeyDown: KeyboardEventHandler = js.native
}
object OnKeyDown {
  
  @scala.inline
  def apply(onKeyDown: /* event */ SyntheticKeyboardEvent[HTMLElement] => Unit): OnKeyDown = {
    val __obj = js.Dynamic.literal(onKeyDown = js.Any.fromFunction1(onKeyDown))
    __obj.asInstanceOf[OnKeyDown]
  }
  
  @scala.inline
  implicit class OnKeyDownMutableBuilder[Self <: OnKeyDown] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOnKeyDown(value: /* event */ SyntheticKeyboardEvent[HTMLElement] => Unit): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1(value))
  }
}
