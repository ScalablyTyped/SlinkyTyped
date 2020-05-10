package typingsSlinky.reactNativeGestureHandler.components

import slinky.core.facade.ReactRef
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.react.mod.Ref
import typingsSlinky.reactNativeGestureHandler.AnonBottom
import typingsSlinky.reactNativeGestureHandler.AnonBottomHeight
import typingsSlinky.reactNativeGestureHandler.AnonHeight
import typingsSlinky.reactNativeGestureHandler.AnonLeft
import typingsSlinky.reactNativeGestureHandler.AnonRight
import typingsSlinky.reactNativeGestureHandler.mod.TapGestureHandlerGestureEvent
import typingsSlinky.reactNativeGestureHandler.mod.TapGestureHandlerProperties
import typingsSlinky.reactNativeGestureHandler.mod.TapGestureHandlerStateChangeEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object TapGestureHandler {
  @JSImport("react-native-gesture-handler", "TapGestureHandler")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactNativeGestureHandler.mod.TapGestureHandler] {
    @scala.inline
    def enabled(value: Boolean): this.type = set("enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def hitSlop(value: Double | AnonBottom | AnonLeft | AnonRight | AnonHeight | AnonBottomHeight): this.type = set("hitSlop", value.asInstanceOf[js.Any])
    @scala.inline
    def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def maxDelayMs(value: Double): this.type = set("maxDelayMs", value.asInstanceOf[js.Any])
    @scala.inline
    def maxDeltaX(value: Double): this.type = set("maxDeltaX", value.asInstanceOf[js.Any])
    @scala.inline
    def maxDeltaY(value: Double): this.type = set("maxDeltaY", value.asInstanceOf[js.Any])
    @scala.inline
    def maxDist(value: Double): this.type = set("maxDist", value.asInstanceOf[js.Any])
    @scala.inline
    def maxDurationMs(value: Double): this.type = set("maxDurationMs", value.asInstanceOf[js.Any])
    @scala.inline
    def minPointers(value: Double): this.type = set("minPointers", value.asInstanceOf[js.Any])
    @scala.inline
    def numberOfTaps(value: Double): this.type = set("numberOfTaps", value.asInstanceOf[js.Any])
    @scala.inline
    def onGestureEvent(value: /* event */ TapGestureHandlerGestureEvent => Unit): this.type = set("onGestureEvent", js.Any.fromFunction1(value))
    @scala.inline
    def onHandlerStateChange(value: /* event */ TapGestureHandlerStateChangeEvent => Unit): this.type = set("onHandlerStateChange", js.Any.fromFunction1(value))
    @scala.inline
    def shouldCancelWhenOutside(value: Boolean): this.type = set("shouldCancelWhenOutside", value.asInstanceOf[js.Any])
    @scala.inline
    def simultaneousHandlersRefObject(value: ReactRef[_]): this.type = set("simultaneousHandlers", value.asInstanceOf[js.Any])
    @scala.inline
    def simultaneousHandlersFunction1(value: /* instance */ _ | Null => Unit): this.type = set("simultaneousHandlers", js.Any.fromFunction1(value))
    @scala.inline
    def simultaneousHandlers(value: Ref[_] | js.Array[Ref[_]]): this.type = set("simultaneousHandlers", value.asInstanceOf[js.Any])
    @scala.inline
    def simultaneousHandlersNull: this.type = set("simultaneousHandlers", null)
    @scala.inline
    def waitForRefObject(value: ReactRef[_]): this.type = set("waitFor", value.asInstanceOf[js.Any])
    @scala.inline
    def waitForFunction1(value: /* instance */ _ | Null => Unit): this.type = set("waitFor", js.Any.fromFunction1(value))
    @scala.inline
    def waitFor(value: Ref[_] | js.Array[Ref[_]]): this.type = set("waitFor", value.asInstanceOf[js.Any])
    @scala.inline
    def waitForNull: this.type = set("waitFor", null)
  }
  
  def withProps(p: TapGestureHandlerProperties): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: TapGestureHandler.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

