package typingsSlinky.rcGesture.components

import org.scalajs.dom.raw.HTMLElement
import slinky.web.SyntheticTouchEvent
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.rcGesture.mod.IGesture
import typingsSlinky.rcGesture.mod.IGestureStatus
import typingsSlinky.rcGesture.mod.default
import typingsSlinky.rcGesture.rcGestureStrings.all
import typingsSlinky.rcGesture.rcGestureStrings.horizontal
import typingsSlinky.rcGesture.rcGestureStrings.vertical
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object RcGesture {
  
  @JSImport("rc-gesture", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    
    @scala.inline
    def direction(value: all | vertical | horizontal): this.type = set("direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def enablePinch(value: Boolean): this.type = set("enablePinch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def enableRotate(value: Boolean): this.type = set("enableRotate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onPan(value: /* s */ IGestureStatus => Unit): this.type = set("onPan", js.Any.fromFunction1(value))
    
    @scala.inline
    def onPanCancel(value: /* s */ IGestureStatus => Unit): this.type = set("onPanCancel", js.Any.fromFunction1(value))
    
    @scala.inline
    def onPanDown(value: /* s */ IGestureStatus => Unit): this.type = set("onPanDown", js.Any.fromFunction1(value))
    
    @scala.inline
    def onPanEnd(value: /* s */ IGestureStatus => Unit): this.type = set("onPanEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def onPanLeft(value: /* s */ IGestureStatus => Unit): this.type = set("onPanLeft", js.Any.fromFunction1(value))
    
    @scala.inline
    def onPanMove(value: /* s */ IGestureStatus => Unit): this.type = set("onPanMove", js.Any.fromFunction1(value))
    
    @scala.inline
    def onPanRight(value: /* s */ IGestureStatus => Unit): this.type = set("onPanRight", js.Any.fromFunction1(value))
    
    @scala.inline
    def onPanStart(value: /* s */ IGestureStatus => Unit): this.type = set("onPanStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def onPanUp(value: /* s */ IGestureStatus => Unit): this.type = set("onPanUp", js.Any.fromFunction1(value))
    
    @scala.inline
    def onPinch(value: /* s */ IGestureStatus => Unit): this.type = set("onPinch", js.Any.fromFunction1(value))
    
    @scala.inline
    def onPinchCancel(value: /* s */ IGestureStatus => Unit): this.type = set("onPinchCancel", js.Any.fromFunction1(value))
    
    @scala.inline
    def onPinchEnd(value: /* s */ IGestureStatus => Unit): this.type = set("onPinchEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def onPinchIn(value: /* s */ IGestureStatus => Unit): this.type = set("onPinchIn", js.Any.fromFunction1(value))
    
    @scala.inline
    def onPinchMove(value: /* s */ IGestureStatus => Unit): this.type = set("onPinchMove", js.Any.fromFunction1(value))
    
    @scala.inline
    def onPinchOut(value: /* s */ IGestureStatus => Unit): this.type = set("onPinchOut", js.Any.fromFunction1(value))
    
    @scala.inline
    def onPinchStart(value: /* s */ IGestureStatus => Unit): this.type = set("onPinchStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def onPress(value: /* s */ IGestureStatus => Unit): this.type = set("onPress", js.Any.fromFunction1(value))
    
    @scala.inline
    def onPressUp(value: /* s */ IGestureStatus => Unit): this.type = set("onPressUp", js.Any.fromFunction1(value))
    
    @scala.inline
    def onRotate(value: /* s */ IGestureStatus => Unit): this.type = set("onRotate", js.Any.fromFunction1(value))
    
    @scala.inline
    def onRotateCancel(value: /* s */ IGestureStatus => Unit): this.type = set("onRotateCancel", js.Any.fromFunction1(value))
    
    @scala.inline
    def onRotateEnd(value: /* s */ IGestureStatus => Unit): this.type = set("onRotateEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def onRotateMove(value: /* s */ IGestureStatus => Unit): this.type = set("onRotateMove", js.Any.fromFunction1(value))
    
    @scala.inline
    def onRotateStart(value: /* s */ IGestureStatus => Unit): this.type = set("onRotateStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def onSwipe(value: /* s */ IGestureStatus => Unit): this.type = set("onSwipe", js.Any.fromFunction1(value))
    
    @scala.inline
    def onSwipeDown(value: /* s */ IGestureStatus => Unit): this.type = set("onSwipeDown", js.Any.fromFunction1(value))
    
    @scala.inline
    def onSwipeLeft(value: /* s */ IGestureStatus => Unit): this.type = set("onSwipeLeft", js.Any.fromFunction1(value))
    
    @scala.inline
    def onSwipeRight(value: /* s */ IGestureStatus => Unit): this.type = set("onSwipeRight", js.Any.fromFunction1(value))
    
    @scala.inline
    def onSwipeUp(value: /* s */ IGestureStatus => Unit): this.type = set("onSwipeUp", js.Any.fromFunction1(value))
    
    @scala.inline
    def onTap(value: /* s */ IGestureStatus => Unit): this.type = set("onTap", js.Any.fromFunction1(value))
    
    @scala.inline
    def onTouchCancel(value: SyntheticTouchEvent[HTMLElement] => Unit): this.type = set("onTouchCancel", js.Any.fromFunction1(value))
    
    @scala.inline
    def onTouchEnd(value: SyntheticTouchEvent[HTMLElement] => Unit): this.type = set("onTouchEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def onTouchMove(value: SyntheticTouchEvent[HTMLElement] => Unit): this.type = set("onTouchMove", js.Any.fromFunction1(value))
    
    @scala.inline
    def onTouchStart(value: SyntheticTouchEvent[HTMLElement] => Unit): this.type = set("onTouchStart", js.Any.fromFunction1(value))
  }
  
  implicit def make(companion: RcGesture.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: IGesture): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
