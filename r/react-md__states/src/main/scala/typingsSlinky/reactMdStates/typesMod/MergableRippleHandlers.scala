package typingsSlinky.reactMdStates.typesMod

import org.scalajs.dom.raw.HTMLElement
import slinky.web.SyntheticKeyboardEvent
import slinky.web.SyntheticMouseEvent
import slinky.web.SyntheticTouchEvent
import typingsSlinky.react.mod.KeyboardEventHandler
import typingsSlinky.react.mod.MouseEventHandler
import typingsSlinky.react.mod.TouchEventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<react.react.HTMLAttributes<E>, 'onKeyDown' | 'onKeyUp' | 'onMouseDown' | 'onMouseUp' | 'onMouseLeave' | 'onClick' | 'onTouchStart' | 'onTouchMove' | 'onTouchEnd'> */
@js.native
trait MergableRippleHandlers[E /* <: HTMLElement */] extends js.Object {
  
  var onClick: js.UndefOr[MouseEventHandler[E]] = js.native
  
  var onKeyDown: js.UndefOr[KeyboardEventHandler[E]] = js.native
  
  var onKeyUp: js.UndefOr[KeyboardEventHandler[E]] = js.native
  
  var onMouseDown: js.UndefOr[MouseEventHandler[E]] = js.native
  
  var onMouseLeave: js.UndefOr[MouseEventHandler[E]] = js.native
  
  var onMouseUp: js.UndefOr[MouseEventHandler[E]] = js.native
  
  var onTouchEnd: js.UndefOr[TouchEventHandler[E]] = js.native
  
  var onTouchMove: js.UndefOr[TouchEventHandler[E]] = js.native
  
  var onTouchStart: js.UndefOr[TouchEventHandler[E]] = js.native
}
object MergableRippleHandlers {
  
  @scala.inline
  def apply[E /* <: HTMLElement */](): MergableRippleHandlers[E] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MergableRippleHandlers[E]]
  }
  
  @scala.inline
  implicit class MergableRippleHandlersOps[Self <: MergableRippleHandlers[_], E /* <: HTMLElement */] (val x: Self with MergableRippleHandlers[E]) extends AnyVal {
    
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
    def setOnClick(value: SyntheticMouseEvent[E] => Unit): Self = this.set("onClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnClick: Self = this.set("onClick", js.undefined)
    
    @scala.inline
    def setOnKeyDown(value: SyntheticKeyboardEvent[E] => Unit): Self = this.set("onKeyDown", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnKeyDown: Self = this.set("onKeyDown", js.undefined)
    
    @scala.inline
    def setOnKeyUp(value: SyntheticKeyboardEvent[E] => Unit): Self = this.set("onKeyUp", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnKeyUp: Self = this.set("onKeyUp", js.undefined)
    
    @scala.inline
    def setOnMouseDown(value: SyntheticMouseEvent[E] => Unit): Self = this.set("onMouseDown", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnMouseDown: Self = this.set("onMouseDown", js.undefined)
    
    @scala.inline
    def setOnMouseLeave(value: SyntheticMouseEvent[E] => Unit): Self = this.set("onMouseLeave", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnMouseLeave: Self = this.set("onMouseLeave", js.undefined)
    
    @scala.inline
    def setOnMouseUp(value: SyntheticMouseEvent[E] => Unit): Self = this.set("onMouseUp", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnMouseUp: Self = this.set("onMouseUp", js.undefined)
    
    @scala.inline
    def setOnTouchEnd(value: SyntheticTouchEvent[E] => Unit): Self = this.set("onTouchEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnTouchEnd: Self = this.set("onTouchEnd", js.undefined)
    
    @scala.inline
    def setOnTouchMove(value: SyntheticTouchEvent[E] => Unit): Self = this.set("onTouchMove", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnTouchMove: Self = this.set("onTouchMove", js.undefined)
    
    @scala.inline
    def setOnTouchStart(value: SyntheticTouchEvent[E] => Unit): Self = this.set("onTouchStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnTouchStart: Self = this.set("onTouchStart", js.undefined)
  }
}
