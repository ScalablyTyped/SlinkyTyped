package typingsSlinky.antdMobile.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.antdMobile.anon.OnPress
import typingsSlinky.antdMobile.swipeActionMod.SwipeActionProps
import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object SwipeAction {
  @JSImport("antd-mobile", "SwipeAction")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.antdMobile.mod.SwipeAction] {
    @scala.inline
    def autoClose(value: Boolean): this.type = set("autoClose", value.asInstanceOf[js.Any])
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def leftVarargs(value: OnPress[CSSProperties]*): this.type = set("left", js.Array(value :_*))
    @scala.inline
    def left(value: js.Array[OnPress[CSSProperties]]): this.type = set("left", value.asInstanceOf[js.Any])
    @scala.inline
    def onClose(value: () => Unit): this.type = set("onClose", js.Any.fromFunction0(value))
    @scala.inline
    def onOpen(value: () => Unit): this.type = set("onOpen", js.Any.fromFunction0(value))
    @scala.inline
    def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
    @scala.inline
    def rightVarargs(value: OnPress[CSSProperties]*): this.type = set("right", js.Array(value :_*))
    @scala.inline
    def right(value: js.Array[OnPress[CSSProperties]]): this.type = set("right", value.asInstanceOf[js.Any])
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def title(value: String): this.type = set("title", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: SwipeActionProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: SwipeAction.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

