package typingsSlinky.reactNavigationStack.components

import slinky.core.facade.ReactRef
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.react.mod.Ref
import typingsSlinky.reactNativeGestureHandler.anon.Bottom
import typingsSlinky.reactNativeGestureHandler.anon.BottomHeight
import typingsSlinky.reactNativeGestureHandler.anon.Height
import typingsSlinky.reactNativeGestureHandler.anon.Left
import typingsSlinky.reactNativeGestureHandler.anon.Right
import typingsSlinky.reactNativeGestureHandler.mod.PanGestureHandlerGestureEvent
import typingsSlinky.reactNativeGestureHandler.mod.PanGestureHandlerProperties
import typingsSlinky.reactNativeGestureHandler.mod.PanGestureHandlerStateChangeEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PanGestureHandler {
  
  @JSImport("react-navigation-stack/lib/typescript/src/vendor/views/GestureHandler", "PanGestureHandler")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def activeOffsetXVarargs(value: Double*): this.type = set("activeOffsetX", js.Array(value :_*))
    
    @scala.inline
    def activeOffsetX(value: Double | js.Array[Double]): this.type = set("activeOffsetX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def activeOffsetYVarargs(value: Double*): this.type = set("activeOffsetY", js.Array(value :_*))
    
    @scala.inline
    def activeOffsetY(value: Double | js.Array[Double]): this.type = set("activeOffsetY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def avgTouches(value: Boolean): this.type = set("avgTouches", value.asInstanceOf[js.Any])
    
    @scala.inline
    def enabled(value: Boolean): this.type = set("enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def failOffsetXVarargs(value: Double*): this.type = set("failOffsetX", js.Array(value :_*))
    
    @scala.inline
    def failOffsetX(value: Double | js.Array[Double]): this.type = set("failOffsetX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def failOffsetYVarargs(value: Double*): this.type = set("failOffsetY", js.Array(value :_*))
    
    @scala.inline
    def failOffsetY(value: Double | js.Array[Double]): this.type = set("failOffsetY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def hitSlop(value: Double | Bottom | Left | Right | Height | BottomHeight): this.type = set("hitSlop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def maxDeltaX(value: Double): this.type = set("maxDeltaX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def maxDeltaY(value: Double): this.type = set("maxDeltaY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def maxPointers(value: Double): this.type = set("maxPointers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def minDeltaX(value: Double): this.type = set("minDeltaX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def minDeltaY(value: Double): this.type = set("minDeltaY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def minDist(value: Double): this.type = set("minDist", value.asInstanceOf[js.Any])
    
    @scala.inline
    def minOffsetX(value: Double): this.type = set("minOffsetX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def minOffsetY(value: Double): this.type = set("minOffsetY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def minPointers(value: Double): this.type = set("minPointers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def minVelocity(value: Double): this.type = set("minVelocity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def minVelocityX(value: Double): this.type = set("minVelocityX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def minVelocityY(value: Double): this.type = set("minVelocityY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onGestureEvent(value: /* event */ PanGestureHandlerGestureEvent => Unit): this.type = set("onGestureEvent", js.Any.fromFunction1(value))
    
    @scala.inline
    def onHandlerStateChange(value: /* event */ PanGestureHandlerStateChangeEvent => Unit): this.type = set("onHandlerStateChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def shouldCancelWhenOutside(value: Boolean): this.type = set("shouldCancelWhenOutside", value.asInstanceOf[js.Any])
    
    @scala.inline
    def simultaneousHandlersVarargs(value: Ref[js.Any]*): this.type = set("simultaneousHandlers", js.Array(value :_*))
    
    @scala.inline
    def simultaneousHandlersRefObject(value: ReactRef[_]): this.type = set("simultaneousHandlers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def simultaneousHandlersFunction1(value: /* instance */ _ | Null => Unit): this.type = set("simultaneousHandlers", js.Any.fromFunction1(value))
    
    @scala.inline
    def simultaneousHandlers(value: Ref[_] | js.Array[Ref[_]]): this.type = set("simultaneousHandlers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def simultaneousHandlersNull: this.type = set("simultaneousHandlers", null)
    
    @scala.inline
    def waitForVarargs(value: Ref[js.Any]*): this.type = set("waitFor", js.Array(value :_*))
    
    @scala.inline
    def waitForRefObject(value: ReactRef[_]): this.type = set("waitFor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def waitForFunction1(value: /* instance */ _ | Null => Unit): this.type = set("waitFor", js.Any.fromFunction1(value))
    
    @scala.inline
    def waitFor(value: Ref[_] | js.Array[Ref[_]]): this.type = set("waitFor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def waitForNull: this.type = set("waitFor", null)
  }
  
  def withProps(p: PanGestureHandlerProperties): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: PanGestureHandler.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
