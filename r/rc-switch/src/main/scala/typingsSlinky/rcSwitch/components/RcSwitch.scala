package typingsSlinky.rcSwitch.components

import slinky.core.TagMod
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.rcSwitch.mod.Props
import typingsSlinky.rcSwitch.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object RcSwitch {
  @JSImport("rc-switch", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    @scala.inline
    def autoFocus(value: Boolean): this.type = set("autoFocus", value.asInstanceOf[js.Any])
    @scala.inline
    def checked(value: Boolean): this.type = set("checked", value.asInstanceOf[js.Any])
    @scala.inline
    def checkedChildrenReactElement(value: ReactElement): this.type = set("checkedChildren", value.asInstanceOf[js.Any])
    @scala.inline
    def checkedChildren(value: TagMod[Any]): this.type = set("checkedChildren", value.asInstanceOf[js.Any])
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def defaultChecked(value: Boolean): this.type = set("defaultChecked", value.asInstanceOf[js.Any])
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def loadingIconReactElement(value: ReactElement): this.type = set("loadingIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def loadingIcon(value: TagMod[Any]): this.type = set("loadingIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def onChange(value: /* checked */ Boolean => Unit): this.type = set("onChange", js.Any.fromFunction1(value))
    @scala.inline
    def onClick(value: /* checked */ Boolean => Unit): this.type = set("onClick", js.Any.fromFunction1(value))
    @scala.inline
    def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
    @scala.inline
    def tabIndex(value: Double): this.type = set("tabIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def unCheckedChildrenReactElement(value: ReactElement): this.type = set("unCheckedChildren", value.asInstanceOf[js.Any])
    @scala.inline
    def unCheckedChildren(value: TagMod[Any]): this.type = set("unCheckedChildren", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: Props): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: RcSwitch.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

