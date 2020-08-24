package typingsSlinky.antDesignReactNative.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.antDesignReactNative.cascaderMod.default
import typingsSlinky.antDesignReactNative.cascaderTypesMod.CascaderDataItem
import typingsSlinky.antDesignReactNative.cascaderTypesMod.CascaderOneValue
import typingsSlinky.antDesignReactNative.cascaderTypesMod.CascaderProps
import typingsSlinky.antDesignReactNative.cascaderTypesMod.CascaderValue
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Cascader {
  @JSImport("@ant-design/react-native/lib/picker/cascader", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    @scala.inline
    def cols(value: Double): this.type = set("cols", value.asInstanceOf[js.Any])
    @scala.inline
    def defaultValueVarargs(value: CascaderOneValue*): this.type = set("defaultValue", js.Array(value :_*))
    @scala.inline
    def defaultValue(value: CascaderValue): this.type = set("defaultValue", value.asInstanceOf[js.Any])
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def indicatorStyle(value: StyleProp[ViewStyle]): this.type = set("indicatorStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def indicatorStyleNull: this.type = set("indicatorStyle", null)
    @scala.inline
    def onChange(value: /* value */ CascaderValue => Unit): this.type = set("onChange", js.Any.fromFunction1(value))
    @scala.inline
    def onScrollChange(value: /* value */ CascaderValue => Unit): this.type = set("onScrollChange", js.Any.fromFunction1(value))
    @scala.inline
    def pickerItemStyle(value: StyleProp[ViewStyle]): this.type = set("pickerItemStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def pickerItemStyleNull: this.type = set("pickerItemStyle", null)
    @scala.inline
    def rootNativeProps(value: js.Object): this.type = set("rootNativeProps", value.asInstanceOf[js.Any])
    @scala.inline
    def style(value: StyleProp[ViewStyle]): this.type = set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def styleNull: this.type = set("style", null)
    @scala.inline
    def valueVarargs(value: CascaderOneValue*): this.type = set("value", js.Array(value :_*))
    @scala.inline
    def value(value: CascaderValue): this.type = set("value", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: CascaderProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(data: js.Array[CascaderDataItem]): Builder = {
    val __props = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[CascaderProps]))
  }
}

