package typingsSlinky.reactNativeGestureHandler.components

import slinky.core.facade.ReactRef
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.react.mod.Ref
import typingsSlinky.reactNativeGestureHandler.anon.Bottom
import typingsSlinky.reactNativeGestureHandler.anon.BottomHeight
import typingsSlinky.reactNativeGestureHandler.anon.Height
import typingsSlinky.reactNativeGestureHandler.anon.Left
import typingsSlinky.reactNativeGestureHandler.anon.Right
import typingsSlinky.reactNativeGestureHandler.mod.ForceTouchGestureHandlerGestureEvent
import typingsSlinky.reactNativeGestureHandler.mod.ForceTouchGestureHandlerProperties
import typingsSlinky.reactNativeGestureHandler.mod.ForceTouchGestureHandlerStateChangeEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ForceTouchGestureHandler {
  
  @JSImport("react-native-gesture-handler", "ForceTouchGestureHandler")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactNativeGestureHandler.mod.ForceTouchGestureHandler] {
    
    @scala.inline
    def enabled(value: Boolean): this.type = set("enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def feedbackOnActivation(value: Boolean): this.type = set("feedbackOnActivation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def hitSlop(value: Double | Bottom | Left | Right | Height | BottomHeight): this.type = set("hitSlop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def maxForce(value: Double): this.type = set("maxForce", value.asInstanceOf[js.Any])
    
    @scala.inline
    def minForce(value: Double): this.type = set("minForce", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onGestureEvent(value: /* event */ ForceTouchGestureHandlerGestureEvent => Unit): this.type = set("onGestureEvent", js.Any.fromFunction1(value))
    
    @scala.inline
    def onHandlerStateChange(value: /* event */ ForceTouchGestureHandlerStateChangeEvent => Unit): this.type = set("onHandlerStateChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def shouldCancelWhenOutside(value: Boolean): this.type = set("shouldCancelWhenOutside", value.asInstanceOf[js.Any])
    
    @scala.inline
    def simultaneousHandlers(value: Ref[_] | js.Array[Ref[_]]): this.type = set("simultaneousHandlers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def simultaneousHandlersFunction1(value: /* instance */ _ | Null => Unit): this.type = set("simultaneousHandlers", js.Any.fromFunction1(value))
    
    @scala.inline
    def simultaneousHandlersNull: this.type = set("simultaneousHandlers", null)
    
    @scala.inline
    def simultaneousHandlersRefObject(value: ReactRef[_]): this.type = set("simultaneousHandlers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def simultaneousHandlersVarargs(value: Ref[js.Any]*): this.type = set("simultaneousHandlers", js.Array(value :_*))
    
    @scala.inline
    def waitFor(value: Ref[_] | js.Array[Ref[_]]): this.type = set("waitFor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def waitForFunction1(value: /* instance */ _ | Null => Unit): this.type = set("waitFor", js.Any.fromFunction1(value))
    
    @scala.inline
    def waitForNull: this.type = set("waitFor", null)
    
    @scala.inline
    def waitForRefObject(value: ReactRef[_]): this.type = set("waitFor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def waitForVarargs(value: Ref[js.Any]*): this.type = set("waitFor", js.Array(value :_*))
  }
  
  implicit def make(companion: ForceTouchGestureHandler.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ForceTouchGestureHandlerProperties): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
