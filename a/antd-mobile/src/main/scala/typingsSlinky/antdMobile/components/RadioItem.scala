package typingsSlinky.antdMobile.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.antdMobile.anon.Target
import typingsSlinky.antdMobile.radioItemMod.RadioItemProps
import typingsSlinky.antdMobile.radioItemMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object RadioItem {
  @JSImport("antd-mobile/lib/radio/RadioItem", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    @scala.inline
    def checked(value: Boolean): this.type = set("checked", value.asInstanceOf[js.Any])
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def defaultChecked(value: Boolean): this.type = set("defaultChecked", value.asInstanceOf[js.Any])
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def listPrefixCls(value: String): this.type = set("listPrefixCls", value.asInstanceOf[js.Any])
    @scala.inline
    def name(value: String): this.type = set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def onChange(value: /* e */ Target => Unit): this.type = set("onChange", js.Any.fromFunction1(value))
    @scala.inline
    def onClick(value: () => _): this.type = set("onClick", js.Any.fromFunction0(value))
    @scala.inline
    def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
    @scala.inline
    def radioProps(value: js.Object): this.type = set("radioProps", value.asInstanceOf[js.Any])
    @scala.inline
    def wrapLabel(value: Boolean): this.type = set("wrapLabel", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: RadioItemProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: RadioItem.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

