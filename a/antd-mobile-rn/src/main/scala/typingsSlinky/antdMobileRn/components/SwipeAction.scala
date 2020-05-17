package typingsSlinky.antdMobileRn.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.antdMobileRn.anon.ClassName
import typingsSlinky.antdMobileRn.swipeActionIndexNativeMod.SwipeActionProps
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.TextStyle
import typingsSlinky.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object SwipeAction {
  @JSImport("antd-mobile-rn", "SwipeAction")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.antdMobileRn.mod.SwipeAction] {
    @scala.inline
    def autoClose(value: Boolean): this.type = set("autoClose", value.asInstanceOf[js.Any])
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def left(value: js.Array[ClassName[TextStyle]]): this.type = set("left", value.asInstanceOf[js.Any])
    @scala.inline
    def onClose(value: () => Unit): this.type = set("onClose", js.Any.fromFunction0(value))
    @scala.inline
    def onOpen(value: () => Unit): this.type = set("onOpen", js.Any.fromFunction0(value))
    @scala.inline
    def right(value: js.Array[ClassName[TextStyle]]): this.type = set("right", value.asInstanceOf[js.Any])
    @scala.inline
    def style(value: StyleProp[ViewStyle]): this.type = set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def styleNull: this.type = set("style", null)
    @scala.inline
    def styles(value: js.Any): this.type = set("styles", value.asInstanceOf[js.Any])
    @scala.inline
    def title(value: String): this.type = set("title", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: SwipeActionProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: SwipeAction.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

