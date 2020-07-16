package typingsSlinky.antd.components

import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.MouseEvent
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.antd.switchMod.SwitchProps
import typingsSlinky.antd.switchMod.SwitchSize
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.RefAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Switch {
  @JSImport("antd/lib/switch", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, HTMLElement] {
    @scala.inline
    def autoFocus(value: Boolean): this.type = set("autoFocus", value.asInstanceOf[js.Any])
    @scala.inline
    def checked(value: Boolean): this.type = set("checked", value.asInstanceOf[js.Any])
    @scala.inline
    def checkedChildrenReactElement(value: ReactElement): this.type = set("checkedChildren", value.asInstanceOf[js.Any])
    @scala.inline
    def checkedChildren(value: ReactElement): this.type = set("checkedChildren", value.asInstanceOf[js.Any])
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def defaultChecked(value: Boolean): this.type = set("defaultChecked", value.asInstanceOf[js.Any])
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def loading(value: Boolean): this.type = set("loading", value.asInstanceOf[js.Any])
    @scala.inline
    def onChange(value: (/* checked */ Boolean, /* event */ MouseEvent) => Unit): this.type = set("onChange", js.Any.fromFunction2(value))
    @scala.inline
    def onClick(value: (/* checked */ Boolean, /* event */ MouseEvent) => Unit): this.type = set("onClick", js.Any.fromFunction2(value))
    @scala.inline
    def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
    @scala.inline
    def size(value: SwitchSize): this.type = set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def title(value: String): this.type = set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def unCheckedChildrenReactElement(value: ReactElement): this.type = set("unCheckedChildren", value.asInstanceOf[js.Any])
    @scala.inline
    def unCheckedChildren(value: ReactElement): this.type = set("unCheckedChildren", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: SwitchProps with RefAttributes[HTMLElement]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Switch.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

