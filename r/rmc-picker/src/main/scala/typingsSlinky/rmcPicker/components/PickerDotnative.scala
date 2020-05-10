package typingsSlinky.rmcPicker.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.rmcPicker.pickerNativeMod.default
import typingsSlinky.rmcPicker.pickerTypesMod.IPickerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object PickerDotnative {
  @JSImport("rmc-picker/lib/Picker.native", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def defaultSelectedValue(value: js.Any): this.type = set("defaultSelectedValue", value.asInstanceOf[js.Any])
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def indicatorClassName(value: String): this.type = set("indicatorClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def indicatorStyle(value: js.Any): this.type = set("indicatorStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def itemStyle(value: js.Any): this.type = set("itemStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def noAnimate(value: Boolean): this.type = set("noAnimate", value.asInstanceOf[js.Any])
    @scala.inline
    def onScrollChange(value: /* value */ js.Any => Unit): this.type = set("onScrollChange", js.Any.fromFunction1(value))
    @scala.inline
    def onValueChange(value: /* value */ js.Any => Unit): this.type = set("onValueChange", js.Any.fromFunction1(value))
    @scala.inline
    def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
    @scala.inline
    def selectedValue(value: js.Any): this.type = set("selectedValue", value.asInstanceOf[js.Any])
    @scala.inline
    def style(value: js.Any): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: IPickerProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: PickerDotnative.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

