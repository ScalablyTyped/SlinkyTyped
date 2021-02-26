package typingsSlinky.antDesignReactNative.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.antDesignReactNative.cascaderTypesMod.CascaderValue
import typingsSlinky.antDesignReactNative.pickerMod.PickerProps
import typingsSlinky.antDesignReactNative.pickerPropsTypeMod.PickerData
import typingsSlinky.antDesignReactNative.pickerStyleMod.PickerStyle
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Picker {
  
  @scala.inline
  def apply(data: js.Array[js.Array[PickerData] | PickerData]): Builder = {
    val __props = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[PickerProps]))
  }
  
  @JSImport("@ant-design/react-native", "Picker")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.antDesignReactNative.mod.Picker] {
    
    @scala.inline
    def WrapComponent(value: js.Any): this.type = set("WrapComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def actionTextActiveOpacity(value: Double): this.type = set("actionTextActiveOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def actionTextUnderlayColor(value: String): this.type = set("actionTextUnderlayColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def cascade(value: Boolean): this.type = set("cascade", value.asInstanceOf[js.Any])
    
    @scala.inline
    def cols(value: Double): this.type = set("cols", value.asInstanceOf[js.Any])
    
    @scala.inline
    def content(value: ReactElement | String): this.type = set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def contentReactElement(value: ReactElement): this.type = set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def dismissText(value: String | ReactElement): this.type = set("dismissText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def dismissTextReactElement(value: ReactElement): this.type = set("dismissText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def extra(value: String): this.type = set("extra", value.asInstanceOf[js.Any])
    
    @scala.inline
    def format(value: /* values */ js.Array[String] => String): this.type = set("format", js.Any.fromFunction1(value))
    
    @scala.inline
    def indicatorStyle(value: StyleProp[ViewStyle]): this.type = set("indicatorStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def indicatorStyleNull: this.type = set("indicatorStyle", null)
    
    @scala.inline
    def itemStyle(value: StyleProp[ViewStyle]): this.type = set("itemStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def itemStyleNull: this.type = set("itemStyle", null)
    
    @scala.inline
    def maskTransitionName(value: String): this.type = set("maskTransitionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def okText(value: String | ReactElement): this.type = set("okText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def okTextReactElement(value: ReactElement): this.type = set("okText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onChange(value: /* date */ js.UndefOr[CascaderValue] => Unit): this.type = set("onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def onDismiss(value: () => Unit): this.type = set("onDismiss", js.Any.fromFunction0(value))
    
    @scala.inline
    def onOk(value: /* value */ js.UndefOr[js.Any] => Unit): this.type = set("onOk", js.Any.fromFunction1(value))
    
    @scala.inline
    def onPickerChange(value: /* value */ CascaderValue => Unit): this.type = set("onPickerChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def onVisibleChange(value: /* visible */ Boolean => Unit): this.type = set("onVisibleChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def picker(value: js.Any): this.type = set("picker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def pickerPrefixCls(value: String): this.type = set("pickerPrefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def pickerValueChangeProp(value: String): this.type = set("pickerValueChangeProp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def pickerValueProp(value: String): this.type = set("pickerValueProp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def popupPrefixCls(value: String): this.type = set("popupPrefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def popupTransitionName(value: String): this.type = set("popupTransitionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: js.Any): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def styles(value: Partial[PickerStyle]): this.type = set("styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def title(value: String | ReactElement): this.type = set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def titleReactElement(value: ReactElement): this.type = set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def transitionName(value: String): this.type = set("transitionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def triggerType(value: String): this.type = set("triggerType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def value(value: js.Array[String | Double]): this.type = set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def valueVarargs(value: (String | Double)*): this.type = set("value", js.Array(value :_*))
    
    @scala.inline
    def visible(value: Boolean): this.type = set("visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def wrapStyle(value: CSSProperties): this.type = set("wrapStyle", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: PickerProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
