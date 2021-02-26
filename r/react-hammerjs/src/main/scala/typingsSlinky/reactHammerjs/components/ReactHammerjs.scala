package typingsSlinky.reactHammerjs.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.hammerjs.HammerInput
import typingsSlinky.reactHammerjs.mod.HammerOptionsWithRecognizers
import typingsSlinky.reactHammerjs.mod.ReactHammerProps
import typingsSlinky.reactHammerjs.mod.^
import typingsSlinky.reactHammerjs.reactHammerjsStrings.DIRECTION_ALL
import typingsSlinky.reactHammerjs.reactHammerjsStrings.DIRECTION_DOWN
import typingsSlinky.reactHammerjs.reactHammerjsStrings.DIRECTION_HORIZONTAL
import typingsSlinky.reactHammerjs.reactHammerjsStrings.DIRECTION_LEFT
import typingsSlinky.reactHammerjs.reactHammerjsStrings.DIRECTION_NONE
import typingsSlinky.reactHammerjs.reactHammerjsStrings.DIRECTION_RIGHT
import typingsSlinky.reactHammerjs.reactHammerjsStrings.DIRECTION_UP
import typingsSlinky.reactHammerjs.reactHammerjsStrings.DIRECTION_VERTICAL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactHammerjs {
  
  object ReactHammerjs {
    
    @JSImport("react-hammerjs", JSImport.Namespace)
    @js.native
    val component: js.Object = js.native
    
    @scala.inline
    class Builder (val args: js.Array[js.Any])
      extends AnyVal
         with StBuildingComponent[tag.type, ^] {
      
      @scala.inline
      def action(value: /* event */ HammerInput => Unit): this.type = set("action", js.Any.fromFunction1(value))
      
      @scala.inline
      def direction(
        value: DIRECTION_NONE | DIRECTION_LEFT | DIRECTION_RIGHT | DIRECTION_UP | DIRECTION_DOWN | DIRECTION_HORIZONTAL | DIRECTION_VERTICAL | DIRECTION_ALL
      ): this.type = set("direction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onDoubleTap(value: /* event */ HammerInput => Unit): this.type = set("onDoubleTap", js.Any.fromFunction1(value))
      
      @scala.inline
      def onPan(value: /* event */ HammerInput => Unit): this.type = set("onPan", js.Any.fromFunction1(value))
      
      @scala.inline
      def onPanCancel(value: /* event */ HammerInput => Unit): this.type = set("onPanCancel", js.Any.fromFunction1(value))
      
      @scala.inline
      def onPanEnd(value: /* event */ HammerInput => Unit): this.type = set("onPanEnd", js.Any.fromFunction1(value))
      
      @scala.inline
      def onPanStart(value: /* event */ HammerInput => Unit): this.type = set("onPanStart", js.Any.fromFunction1(value))
      
      @scala.inline
      def onPinch(value: /* event */ HammerInput => Unit): this.type = set("onPinch", js.Any.fromFunction1(value))
      
      @scala.inline
      def onPinchCancel(value: /* event */ HammerInput => Unit): this.type = set("onPinchCancel", js.Any.fromFunction1(value))
      
      @scala.inline
      def onPinchEnd(value: /* event */ HammerInput => Unit): this.type = set("onPinchEnd", js.Any.fromFunction1(value))
      
      @scala.inline
      def onPinchIn(value: /* event */ HammerInput => Unit): this.type = set("onPinchIn", js.Any.fromFunction1(value))
      
      @scala.inline
      def onPinchOut(value: /* event */ HammerInput => Unit): this.type = set("onPinchOut", js.Any.fromFunction1(value))
      
      @scala.inline
      def onPinchStart(value: /* event */ HammerInput => Unit): this.type = set("onPinchStart", js.Any.fromFunction1(value))
      
      @scala.inline
      def onPress(value: /* event */ HammerInput => Unit): this.type = set("onPress", js.Any.fromFunction1(value))
      
      @scala.inline
      def onPressUp(value: /* event */ HammerInput => Unit): this.type = set("onPressUp", js.Any.fromFunction1(value))
      
      @scala.inline
      def onRotate(value: /* event */ HammerInput => Unit): this.type = set("onRotate", js.Any.fromFunction1(value))
      
      @scala.inline
      def onRotateCancel(value: /* event */ HammerInput => Unit): this.type = set("onRotateCancel", js.Any.fromFunction1(value))
      
      @scala.inline
      def onRotateEnd(value: /* event */ HammerInput => Unit): this.type = set("onRotateEnd", js.Any.fromFunction1(value))
      
      @scala.inline
      def onRotateMove(value: /* event */ HammerInput => Unit): this.type = set("onRotateMove", js.Any.fromFunction1(value))
      
      @scala.inline
      def onRotateStart(value: /* event */ HammerInput => Unit): this.type = set("onRotateStart", js.Any.fromFunction1(value))
      
      @scala.inline
      def onSwipe(value: /* event */ HammerInput => Unit): this.type = set("onSwipe", js.Any.fromFunction1(value))
      
      @scala.inline
      def onTap(value: /* event */ HammerInput => Unit): this.type = set("onTap", js.Any.fromFunction1(value))
      
      @scala.inline
      def options(value: HammerOptionsWithRecognizers): this.type = set("options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def vertical(value: Boolean): this.type = set("vertical", value.asInstanceOf[js.Any])
    }
    
    implicit def make(companion: ReactHammerjs.type): typingsSlinky.reactHammerjs.components.ReactHammerjs.ReactHammerjs.Builder = new typingsSlinky.reactHammerjs.components.ReactHammerjs.ReactHammerjs.Builder(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: ReactHammerProps): typingsSlinky.reactHammerjs.components.ReactHammerjs.ReactHammerjs.Builder = new typingsSlinky.reactHammerjs.components.ReactHammerjs.ReactHammerjs.Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  @JSImport("react-hammerjs", JSImport.Namespace)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def action(value: /* event */ HammerInput => Unit): this.type = set("action", js.Any.fromFunction1(value))
    
    @scala.inline
    def direction(
      value: DIRECTION_NONE | DIRECTION_LEFT | DIRECTION_RIGHT | DIRECTION_UP | DIRECTION_DOWN | DIRECTION_HORIZONTAL | DIRECTION_VERTICAL | DIRECTION_ALL
    ): this.type = set("direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onDoubleTap(value: /* event */ HammerInput => Unit): this.type = set("onDoubleTap", js.Any.fromFunction1(value))
    
    @scala.inline
    def onPan(value: /* event */ HammerInput => Unit): this.type = set("onPan", js.Any.fromFunction1(value))
    
    @scala.inline
    def onPanCancel(value: /* event */ HammerInput => Unit): this.type = set("onPanCancel", js.Any.fromFunction1(value))
    
    @scala.inline
    def onPanEnd(value: /* event */ HammerInput => Unit): this.type = set("onPanEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def onPanStart(value: /* event */ HammerInput => Unit): this.type = set("onPanStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def onPinch(value: /* event */ HammerInput => Unit): this.type = set("onPinch", js.Any.fromFunction1(value))
    
    @scala.inline
    def onPinchCancel(value: /* event */ HammerInput => Unit): this.type = set("onPinchCancel", js.Any.fromFunction1(value))
    
    @scala.inline
    def onPinchEnd(value: /* event */ HammerInput => Unit): this.type = set("onPinchEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def onPinchIn(value: /* event */ HammerInput => Unit): this.type = set("onPinchIn", js.Any.fromFunction1(value))
    
    @scala.inline
    def onPinchOut(value: /* event */ HammerInput => Unit): this.type = set("onPinchOut", js.Any.fromFunction1(value))
    
    @scala.inline
    def onPinchStart(value: /* event */ HammerInput => Unit): this.type = set("onPinchStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def onPress(value: /* event */ HammerInput => Unit): this.type = set("onPress", js.Any.fromFunction1(value))
    
    @scala.inline
    def onPressUp(value: /* event */ HammerInput => Unit): this.type = set("onPressUp", js.Any.fromFunction1(value))
    
    @scala.inline
    def onRotate(value: /* event */ HammerInput => Unit): this.type = set("onRotate", js.Any.fromFunction1(value))
    
    @scala.inline
    def onRotateCancel(value: /* event */ HammerInput => Unit): this.type = set("onRotateCancel", js.Any.fromFunction1(value))
    
    @scala.inline
    def onRotateEnd(value: /* event */ HammerInput => Unit): this.type = set("onRotateEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def onRotateMove(value: /* event */ HammerInput => Unit): this.type = set("onRotateMove", js.Any.fromFunction1(value))
    
    @scala.inline
    def onRotateStart(value: /* event */ HammerInput => Unit): this.type = set("onRotateStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def onSwipe(value: /* event */ HammerInput => Unit): this.type = set("onSwipe", js.Any.fromFunction1(value))
    
    @scala.inline
    def onTap(value: /* event */ HammerInput => Unit): this.type = set("onTap", js.Any.fromFunction1(value))
    
    @scala.inline
    def options(value: HammerOptionsWithRecognizers): this.type = set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def vertical(value: Boolean): this.type = set("vertical", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: ReactHammerjs.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ReactHammerProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
