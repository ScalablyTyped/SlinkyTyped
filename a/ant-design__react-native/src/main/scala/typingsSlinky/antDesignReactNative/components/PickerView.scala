package typingsSlinky.antDesignReactNative.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.antDesignReactNative.pickerPropsTypeMod.PickerData
import typingsSlinky.antDesignReactNative.pickerViewPickerViewMod.PickerViewProps
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object PickerView {
  @JSImport("@ant-design/react-native", "PickerView")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.antDesignReactNative.mod.PickerView] {
    @scala.inline
    def cascade(value: Boolean): this.type = set("cascade", value.asInstanceOf[js.Any])
    @scala.inline
    def cols(value: Double): this.type = set("cols", value.asInstanceOf[js.Any])
    @scala.inline
    def dataVarargs(value: (js.Array[PickerData] | PickerData)*): this.type = set("data", js.Array(value :_*))
    @scala.inline
    def data(value: js.Array[js.Array[PickerData] | PickerData]): this.type = set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def indicatorStyle(value: StyleProp[ViewStyle]): this.type = set("indicatorStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def indicatorStyleNull: this.type = set("indicatorStyle", null)
    @scala.inline
    def itemStyle(value: StyleProp[ViewStyle]): this.type = set("itemStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def itemStyleNull: this.type = set("itemStyle", null)
    @scala.inline
    def onChange(value: /* value */ js.UndefOr[js.Any] => Unit): this.type = set("onChange", js.Any.fromFunction1(value))
    @scala.inline
    def onScrollChange(value: /* value */ js.UndefOr[js.Any] => Unit): this.type = set("onScrollChange", js.Any.fromFunction1(value))
    @scala.inline
    def styles(value: js.Any): this.type = set("styles", value.asInstanceOf[js.Any])
    @scala.inline
    def valueVarargs(value: js.Any*): this.type = set("value", js.Array(value :_*))
    @scala.inline
    def value(value: js.Array[_]): this.type = set("value", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: PickerViewProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: PickerView.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

