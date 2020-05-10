package typingsSlinky.antdMobile.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.antdMobile.pickerPropsTypeMod.PickerData
import typingsSlinky.antdMobile.pickerViewMod.default
import typingsSlinky.antdMobile.pickerViewPickerViewMod.IPickerView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object PickerView {
  @JSImport("antd-mobile/lib/picker-view", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    @scala.inline
    def cascade(value: Boolean): this.type = set("cascade", value.asInstanceOf[js.Any])
    @scala.inline
    def cols(value: Double): this.type = set("cols", value.asInstanceOf[js.Any])
    @scala.inline
    def data(value: js.Array[js.Array[PickerData] | PickerData]): this.type = set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def indicatorStyle(value: js.Any): this.type = set("indicatorStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def itemStyle(value: js.Any): this.type = set("itemStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def onChange(value: /* value */ js.UndefOr[js.Any] => Unit): this.type = set("onChange", js.Any.fromFunction1(value))
    @scala.inline
    def onScrollChange(value: /* value */ js.UndefOr[js.Any] => Unit): this.type = set("onScrollChange", js.Any.fromFunction1(value))
    @scala.inline
    def pickerPrefixCls(value: String): this.type = set("pickerPrefixCls", value.asInstanceOf[js.Any])
    @scala.inline
    def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
    @scala.inline
    def value(value: js.Array[_]): this.type = set("value", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: IPickerView): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: PickerView.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

