package typingsSlinky.reactMdForm.typesMod

import org.scalajs.dom.raw.HTMLSpanElement
import slinky.web.SyntheticKeyboardEvent
import slinky.web.SyntheticMouseEvent
import slinky.web.SyntheticTouchEvent
import typingsSlinky.react.mod.KeyboardEventHandler
import typingsSlinky.react.mod.MouseEventHandler
import typingsSlinky.react.mod.RefCallback
import typingsSlinky.react.mod.TouchEventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Required<@react-md/form.@react-md/form/types/slider/types.SliderRangeOptions> */
/* Inlined parent std.Required<@react-md/form.@react-md/form/types/slider/types.SliderEventHandlers> */
/* Inlined parent std.Required<std.Pick<@react-md/form.@react-md/form/types/slider/types.SliderStateOptions, 'dragging'>> */
@js.native
trait SliderBehaviorProps extends js.Object {
  
  var disabled: Boolean = js.native
  
  var dragging: Boolean = js.native
  
  var max: Double = js.native
  
  var min: Double = js.native
  
  var onKeyDown: KeyboardEventHandler[HTMLSpanElement] = js.native
  
  var onKeyUp: KeyboardEventHandler[HTMLSpanElement] = js.native
  
  var onMouseDown: MouseEventHandler[HTMLSpanElement] = js.native
  
  var onTouchStart: TouchEventHandler[HTMLSpanElement] = js.native
  
  /**
    * A ref that should be passed to the `Slider` component to handle calculating
    * the value based on the drag distance.
    */
  var ref: RefCallback[HTMLSpanElement] = js.native
  
  /**
    * The current value of the slider.
    */
  var value: Double = js.native
  
  var vertical: Boolean = js.native
}
object SliderBehaviorProps {
  
  @scala.inline
  def apply(
    disabled: Boolean,
    dragging: Boolean,
    max: Double,
    min: Double,
    onKeyDown: SyntheticKeyboardEvent[HTMLSpanElement] => Unit,
    onKeyUp: SyntheticKeyboardEvent[HTMLSpanElement] => Unit,
    onMouseDown: SyntheticMouseEvent[HTMLSpanElement] => Unit,
    onTouchStart: SyntheticTouchEvent[HTMLSpanElement] => Unit,
    ref: /* instance */ HTMLSpanElement | Null => Unit,
    value: Double,
    vertical: Boolean
  ): SliderBehaviorProps = {
    val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], dragging = dragging.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], onKeyDown = js.Any.fromFunction1(onKeyDown), onKeyUp = js.Any.fromFunction1(onKeyUp), onMouseDown = js.Any.fromFunction1(onMouseDown), onTouchStart = js.Any.fromFunction1(onTouchStart), ref = js.Any.fromFunction1(ref), value = value.asInstanceOf[js.Any], vertical = vertical.asInstanceOf[js.Any])
    __obj.asInstanceOf[SliderBehaviorProps]
  }
  
  @scala.inline
  implicit class SliderBehaviorPropsOps[Self <: SliderBehaviorProps] (val x: Self) extends AnyVal {
    
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
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDragging(value: Boolean): Self = this.set("dragging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMax(value: Double): Self = this.set("max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMin(value: Double): Self = this.set("min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnKeyDown(value: SyntheticKeyboardEvent[HTMLSpanElement] => Unit): Self = this.set("onKeyDown", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnKeyUp(value: SyntheticKeyboardEvent[HTMLSpanElement] => Unit): Self = this.set("onKeyUp", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnMouseDown(value: SyntheticMouseEvent[HTMLSpanElement] => Unit): Self = this.set("onMouseDown", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnTouchStart(value: SyntheticTouchEvent[HTMLSpanElement] => Unit): Self = this.set("onTouchStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRef(value: /* instance */ HTMLSpanElement | Null => Unit): Self = this.set("ref", js.Any.fromFunction1(value))
    
    @scala.inline
    def setValue(value: Double): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVertical(value: Boolean): Self = this.set("vertical", value.asInstanceOf[js.Any])
  }
}
