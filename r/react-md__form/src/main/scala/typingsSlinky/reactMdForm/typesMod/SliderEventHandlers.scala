package typingsSlinky.reactMdForm.typesMod

import org.scalajs.dom.raw.HTMLSpanElement
import slinky.web.SyntheticKeyboardEvent
import slinky.web.SyntheticMouseEvent
import slinky.web.SyntheticTouchEvent
import typingsSlinky.react.mod.KeyboardEventHandler
import typingsSlinky.react.mod.MouseEventHandler
import typingsSlinky.react.mod.TouchEventHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<react.react.HTMLAttributes<std.HTMLSpanElement>, @react-md/form.@react-md/form/types/slider/types.SliderEventHandlerNames> */
@js.native
trait SliderEventHandlers extends StObject {
  
  var onKeyDown: js.UndefOr[KeyboardEventHandler[HTMLSpanElement]] = js.native
  
  var onKeyUp: js.UndefOr[KeyboardEventHandler[HTMLSpanElement]] = js.native
  
  var onMouseDown: js.UndefOr[MouseEventHandler[HTMLSpanElement]] = js.native
  
  var onTouchStart: js.UndefOr[TouchEventHandler[HTMLSpanElement]] = js.native
}
object SliderEventHandlers {
  
  @scala.inline
  def apply(): SliderEventHandlers = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SliderEventHandlers]
  }
  
  @scala.inline
  implicit class SliderEventHandlersMutableBuilder[Self <: SliderEventHandlers] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOnKeyDown(value: SyntheticKeyboardEvent[HTMLSpanElement] => Unit): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
    
    @scala.inline
    def setOnKeyUp(value: SyntheticKeyboardEvent[HTMLSpanElement] => Unit): Self = StObject.set(x, "onKeyUp", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnKeyUpUndefined: Self = StObject.set(x, "onKeyUp", js.undefined)
    
    @scala.inline
    def setOnMouseDown(value: SyntheticMouseEvent[HTMLSpanElement] => Unit): Self = StObject.set(x, "onMouseDown", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnMouseDownUndefined: Self = StObject.set(x, "onMouseDown", js.undefined)
    
    @scala.inline
    def setOnTouchStart(value: SyntheticTouchEvent[HTMLSpanElement] => Unit): Self = StObject.set(x, "onTouchStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnTouchStartUndefined: Self = StObject.set(x, "onTouchStart", js.undefined)
  }
}
