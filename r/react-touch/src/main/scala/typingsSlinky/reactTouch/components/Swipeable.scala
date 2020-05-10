package typingsSlinky.reactTouch.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactTouch.mod.SwipeableConfig
import typingsSlinky.reactTouch.mod.SwipeableProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Swipeable {
  @JSImport("react-touch", "Swipeable")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactTouch.mod.Swipeable] {
    @scala.inline
    def config(value: SwipeableConfig): this.type = set("config", value.asInstanceOf[js.Any])
    @scala.inline
    def onMouseDown(value: () => Unit): this.type = set("onMouseDown", js.Any.fromFunction0(value))
    @scala.inline
    def onSwipeDown(value: () => Unit): this.type = set("onSwipeDown", js.Any.fromFunction0(value))
    @scala.inline
    def onSwipeLeft(value: () => Unit): this.type = set("onSwipeLeft", js.Any.fromFunction0(value))
    @scala.inline
    def onSwipeRight(value: () => Unit): this.type = set("onSwipeRight", js.Any.fromFunction0(value))
    @scala.inline
    def onSwipeUp(value: () => Unit): this.type = set("onSwipeUp", js.Any.fromFunction0(value))
    @scala.inline
    def onTouchStart(value: () => Unit): this.type = set("onTouchStart", js.Any.fromFunction0(value))
  }
  
  def withProps(p: SwipeableProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Swipeable.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

